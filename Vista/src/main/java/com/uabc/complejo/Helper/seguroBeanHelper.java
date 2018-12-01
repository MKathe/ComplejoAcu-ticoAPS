 package com.uabc.complejo.Helper;

import complejo.entidad.Seguro;
import com.uabc.complejo.negocio.integracion.ServiceFacadeLocator;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Axel Valenzuela - Complejo Acuatico 2018
 */
public class seguroBeanHelper implements Serializable{
    /**
     * Metodo para guardar un Seguro 
     * @param seguro
     */
    public void agregarNuevoSeguro(Seguro seguro){ 
        ServiceFacadeLocator.getInstanceSeguroFacade().saveSeguro(seguro);
    }
    /**
     * Metodo para buscar un Seguro por ID
     * @param id 
     * @return  
     */
    public Seguro consultarSeguroByID(int id){ 
     return ServiceFacadeLocator.getInstanceSeguroFacade().findByID(id);
    }
    
    /**
     * Metodo para buscar todos los Seguro 
     * @param id 
     * @return  
     */
    public List<Seguro> consultarTodosLosSeguro(int id){ 
     return ServiceFacadeLocator.getInstanceSeguroFacade().findAll();
    }
    /**
     * Metodo para eliminar un Seguro mediante un id 
     * @param id
     */
    public void eliminarSeguro(int id) {
        ServiceFacadeLocator.getInstanceSeguroFacade().eliminarSeguro(id);
    }
    /**
     * Metodo para modificar un  Seguro 
     * @param seguro
     */
    public void updateSeguro(Seguro seguro){
        ServiceFacadeLocator.getInstanceSeguroFacade().updateSeguro(seguro);
    }    
}
