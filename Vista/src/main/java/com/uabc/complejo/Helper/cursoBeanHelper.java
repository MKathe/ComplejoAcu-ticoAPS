 package com.uabc.complejo.Helper;

import complejo.entidad.Curso;
import com.uabc.complejo.negocio.integracion.ServiceFacadeLocator;
import java.io.Serializable;
import java.util.List;

/** 
 * @author Axel Valenzuela - Complejo Acuatico 2018
 */
public class cursoBeanHelper implements Serializable{
    /**
     * Metodo para guardar un Cursos 
     * @param cursos
     */
    public void agregarNuevoCursos(Curso cursos){ 
        ServiceFacadeLocator.getInstanceCursosFacade().saveCursos(cursos);
    }
    /**
     * Metodo para buscar un Cursos por ID
     * @param id 
     * @return  
     */
    public Curso consultarCursosByID(int id){ 
     return ServiceFacadeLocator.getInstanceCursosFacade().findByID(id);
    }
    
    /**
     * Metodo para buscar todos los Cursos 
     * @param id 
     * @return  
     */
    public List<Curso> consultarTodosLosCursos(int id){ 
     return ServiceFacadeLocator.getInstanceCursosFacade().findAll();
    }
    /**
     * Metodo para eliminar un Cursos mediante un id 
     * @param id
     */
    public void eliminarCurso(int id) {
        ServiceFacadeLocator.getInstanceCursosFacade().eliminarCurso(id);
    }
    /**
     * Metodo para modificar un  Cursos 
     * @param cursos
     */
    public void updateCurso(Curso cursos){
        ServiceFacadeLocator.getInstanceCursosFacade().updateCursos(cursos);
    }    
}
