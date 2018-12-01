package com.uabc.complejo.dao;
import complejo.entidad.Administrador;
import com.uabc.complejo.persistencia.AbstractDAO;
import java.util.List;
/**
 *
 * @author Axel Valenzuela - Complejo Acuatico 2018
 */
public class adminDAO extends AbstractDAO<Integer, Administrador> {

    public void addAdmin(Administrador admin) {
        this.save(admin);
    }

    public void updateAdmin(Administrador admin) {
        this.update(admin);
    }

    public void deleteAdmin(int id) {
        Administrador u = this.find(id);
        if (u != null) {
            this.delete(u);
        }
    }

    public List<Administrador> findAllAdmin() {
        return this.findAll();
    }

    public Administrador findByAdminId(int id) {
        return this.find(id);
    }

    
}

    
