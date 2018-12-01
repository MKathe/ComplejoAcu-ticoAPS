package com.uabc.complejo.dao;
import complejo.entidad.Seguro; 
import com.uabc.complejo.persistencia.AbstractDAO;
import java.util.List;
/**
 *
 * @author Carlos Arellano - Complejo Acuatico 2018
 */
public class seguroDAO extends AbstractDAO<Integer, Seguro> {

    public void addSeguro(Seguro seguro) {
        this.save(seguro);
    }

    public void updateSeguro(Seguro seguro) {
        this.update(seguro);
    }

    public void deleteSeguro(int id) {
        Seguro u = this.find(id);
        if (u != null) {
            this.delete(u);
        }
    }

    public List<Seguro> findAllSeguro() {
        return this.findAll();
    }

    public Seguro findBySeguroId(int id) {
        return this.find(id);
    }

    
}

    
