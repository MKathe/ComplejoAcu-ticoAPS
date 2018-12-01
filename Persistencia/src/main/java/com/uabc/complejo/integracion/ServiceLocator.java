package com.uabc.complejo.integracion;

import com.uabc.complejo.dao.adminDAO;
import com.uabc.complejo.dao.cursoDAO;
import com.uabc.complejo.dao.credencialDAO;
import com.uabc.complejo.dao.seguroDAO;

/**
 *
 * @author Carlos Arellano
 */
public class ServiceLocator {

    private static adminDAO adminDAO;
    private static credencialDAO credencialDAO;
    private static cursoDAO cursoDAO;
    private static seguroDAO seguroDAO;

    public static adminDAO getInstanceAdminDAO() {
        if (adminDAO == null) {
            adminDAO = new adminDAO();
            return adminDAO;
        } else {
            return adminDAO;
        }
    }
    public static seguroDAO getInstanceSeguroDAO() {
        if (seguroDAO == null) {
            seguroDAO = new seguroDAO();
            return seguroDAO;
        } else {
            return seguroDAO;
        }
    } 
    
    public static cursoDAO getInstanceCursoDAO() {
        if (cursoDAO == null) {
            cursoDAO = new cursoDAO();
            return cursoDAO;
        } else {
            return cursoDAO;
        }
    }
    
     public static credencialDAO getInstanceCredencialDAO() {
        if (credencialDAO == null) {
            credencialDAO = new credencialDAO();
            return credencialDAO;
        } else {
            return credencialDAO;
        }
    }

}
