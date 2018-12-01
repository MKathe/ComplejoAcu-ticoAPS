package com.uabc.complejo.negocio.facade;

import complejo.entidad.Curso;
import com.uabc.negocio.delegate.delegateCurso;
import java.util.List;

/**
 * @author Axel Valenzuela - Complejo Acuático 2018
 */
public class cursoFacade {

    delegateCurso delegateCurso = new delegateCurso();

    /**
     * Metodo para guardar una Cursos
     *
     * @param cursos
     */
    public void saveCursos(Curso cursos) {
        delegateCurso.saveCursos(cursos);
    }

    /**
     *
     * @return Lista de Cursos encontradas
     */
    public List<Curso> findAll() {
        return delegateCurso.findCursos();
    }

    /**
     *
     * @param id ID de la Cursos a buscar
     * @return Cursos encontrada
     */
    public Curso findByID(int id) {
        return delegateCurso.findByID(id);
    }

    public void updateCursos(Curso cursos) {
        delegateCurso.updateCursos(cursos);
    }

    public void eliminarCurso(int id) {
        delegateCurso.eliminarCursos(id);
    }

}
