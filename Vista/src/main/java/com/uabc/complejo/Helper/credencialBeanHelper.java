package com.uabc.complejo.Helper;

import complejo.entidad.Crendencial;
import com.uabc.complejo.negocio.integracion.ServiceFacadeLocator;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Axel Valenzuela - Complejo Acuatico 2018
 */
public class credencialBeanHelper implements Serializable {

    /**
     * Metodo para guardar un Credencial
     *
     * @param credencial
     */
    public void agregarNuevoCredencial(Crendencial credencial) {
        ServiceFacadeLocator.getInstanceCredencialFacade().saveCredencial(credencial);
    }

    /**
     * Metodo para buscar un Credencial por ID
     *
     * @param id
     * @return
     */
    public Crendencial consultarCredencialByID(int id) {
        return ServiceFacadeLocator.getInstanceCredencialFacade().findByID(id);
    }

    /**
     * Metodo para buscar todos los Credencial
     *
     * @param id
     * @return
     */
    public List<Crendencial> consultarTodosLosCredencial(int id) {
        return ServiceFacadeLocator.getInstanceCredencialFacade().findAll();
    }

    /**
     * Metodo para eliminar un Credencial mediante un id
     *
     * @param id
     */
    public void eliminarCredencial(int id) {
        ServiceFacadeLocator.getInstanceCredencialFacade().eliminarCredencial(id);
    }

    /**
     * Metodo para modificar un Credencial
     *
     * @param credencial
     */
    public void updateCredencial(Crendencial credencial) {
        ServiceFacadeLocator.getInstanceCredencialFacade().updateCredencial(credencial);
    }
}
