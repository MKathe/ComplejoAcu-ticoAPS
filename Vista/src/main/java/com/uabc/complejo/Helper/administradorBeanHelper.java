package com.uabc.complejo.Helper;

import complejo.entidad.Administrador;
import com.uabc.complejo.negocio.integracion.ServiceFacadeLocator;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Axel Valenzuela - Complejo Acuatico 2018
 */
public class administradorBeanHelper implements Serializable{
    /**
     * Metodo para guardar un administrador 
     * @param administrador
     */
    public void agregarNuevoAdministrador(Administrador administrador){ 
        ServiceFacadeLocator.getInstanceAdministradorFacade().saveAdministrador(administrador);
    }
    /**
     * Metodo para buscar un administrador por ID
     * @param id 
     * @return  
     */
    public Administrador consultarAdministradorByID(int id){ 
     return ServiceFacadeLocator.getInstanceAdministradorFacade().findByID(id);
    }
    
    /**
     * Metodo para buscar todos los administrador 
     * @param id 
     * @return  
     */
    public List<Administrador> consultarTodosLosAdministrador(int id){ 
     return ServiceFacadeLocator.getInstanceAdministradorFacade().findAll();
    }
    /**
     * Metodo para eliminar un administrador mediante un id 
     * @param id
     */
    public void eliminarAdministrador(int id) {
        ServiceFacadeLocator.getInstanceAdministradorFacade().eliminarAdministrador(id);
    }
    /**
     * Metodo para modificar un  administrador 
     * @param administrador
     */
    public void updateAdministrador(Administrador administrador){
        ServiceFacadeLocator.getInstanceAdministradorFacade().updateAdministrador(administrador);
    }    
}
