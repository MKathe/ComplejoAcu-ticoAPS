package com.uabc.negocio.delegate;

import complejo.entidad.Curso;
import com.uabc.complejo.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Axel Valenzuela - Complejo Acuático 2018
 */
public class delegateCurso {

    /**
     *
     * @param cursos que se va a guardar
     */
    public void saveCursos(Curso cursos) {
        Curso result = null;
        if (cursos.getIdcurso() != 0) {
            result = ServiceLocator.getInstanceCursoDAO().findByCursosId(cursos.getIdcurso());
        }
        if (result != null) {
            ServiceLocator.getInstanceCursoDAO().updateCursos(cursos);
        } else {
            ServiceLocator.getInstanceCursoDAO().addCursos(cursos);
        }
    }

    /**
     * @param id de la Cursos que se va a buscar
     * @return Cursos encontrada
     */
    public Curso findByID(int id) {
        return ServiceLocator.getInstanceCursoDAO().findByCursosId(id);
    }

    /**
     * @return Todos los Cursos encontrados
     */
    public List<Curso> findCursos() {
        return ServiceLocator.getInstanceCursoDAO().findAllCursos();
    }

    /**
     * @param cursos para actualizar
     */
    public void updateCursos(Curso cursos) {
        ServiceLocator.getInstanceCursoDAO().updateCursos(cursos);
    }

    /**
     * @param id para eliminar
     */
    public void eliminarCursos(int id) {
        ServiceLocator.getInstanceCursoDAO().deleteCursos(id);
    }

}
