package com.uabc.complejo.dao;
import complejo.entidad.Crendencial; 
import com.uabc.complejo.persistencia.AbstractDAO;
import java.util.List;
/**
 *
 * @author Carlos Arellano - Complejo Acuatico 2018
 */
public class credencialDAO extends AbstractDAO<Integer, Crendencial> {

    public void addCredencial(Crendencial credencial) {
        this.save(credencial);
    }

    public void updateCredencial(Crendencial credencial) {
        this.update(credencial);
    }

    public void deleteCredencial(int id) {
        Crendencial u = this.find(id);
        if (u != null) {
            this.delete(u);
        }
    }

    public List<Crendencial> findAllCredencial() {
        return this.findAll();
    }

    public Crendencial findByCredencialId(int id) {
        return this.find(id);
    }
 
}

    
