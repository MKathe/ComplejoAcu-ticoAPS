package com.uabc.complejo.dao;
import  complejo.entidad.Curso; 
import com.uabc.complejo.persistencia.AbstractDAO;
import java.util.List;
/**
 *
 * @author Carlos Arellano - Complejo Acuatico 2018
 */
public class cursoDAO extends AbstractDAO<Integer, Curso> {

    public void addCursos(Curso cursos) {
        this.save(cursos);
    }

    public void updateCursos(Curso cursos) {
        this.update(cursos);
    }

    public void deleteCursos(int id) {
        Curso u = this.find(id);
        if (u != null) {
            this.delete(u);
        }
    }

    public List<Curso> findAllCursos() {
        return this.findAll();
    }

    public Curso findByCursosId(int id) {
        return this.find(id);
    }

    
}

    
