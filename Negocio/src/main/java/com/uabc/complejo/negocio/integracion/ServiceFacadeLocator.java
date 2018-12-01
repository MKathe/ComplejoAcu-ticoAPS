package com.uabc.complejo.negocio.integracion;

import com.uabc.complejo.negocio.facade.administradorFacade;
import com.uabc.complejo.negocio.facade.credencialFacade;
import com.uabc.complejo.negocio.facade.cursoFacade;
import com.uabc.complejo.negocio.facade.seguroFacade;

/**
 *
 * @author Carlos Arellano - Complejo Acuatico 2018
 */
public class ServiceFacadeLocator {

    private static administradorFacade administradorFacade;
    private static credencialFacade credencialFacade;
    private static cursoFacade cursoFacade;
    private static seguroFacade seguroFacade;

    /**
     *
     * @return administradorFacade
     */ 
    public static administradorFacade getInstanceAdministradorFacade() {
        if (administradorFacade == null) {
            administradorFacade = new administradorFacade();
            return administradorFacade;
        } else {
            return administradorFacade;
        }
    }

    /**
     *
     * @return credencialFacade
     */
    public static credencialFacade getInstanceCredencialFacade() {
        if (credencialFacade == null) {
            credencialFacade = new credencialFacade();
            return credencialFacade;
        } else {
            return credencialFacade;
        }
    }

    /**
     *
     * @return cursoFacade
     */
    public static cursoFacade getInstanceCursosFacade() {
        if (cursoFacade == null) {
            cursoFacade = new cursoFacade();
            return cursoFacade;
        } else {
            return cursoFacade;
        }
    }

    /**
     *
     * @return seguroFacade
     */
    public static seguroFacade getInstanceSeguroFacade() {
        if (seguroFacade == null) {
            seguroFacade = new seguroFacade();
            return seguroFacade;
        } else {
            return seguroFacade;
        }
    }

}
