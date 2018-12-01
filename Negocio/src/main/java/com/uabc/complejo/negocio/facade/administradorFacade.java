package com.uabc.complejo.negocio.facade;

import complejo.entidad.Administrador;
import com.uabc.negocio.delegate.delegateAdministrador;
import java.util.List;

/**
 * @author Axel Valenzuela - Complejo Acuático 2018
 */
public class administradorFacade {

    delegateAdministrador delegateAdministrador = new delegateAdministrador();

    /**
     * Metodo para guardar una Administrador
     *
     * @param administrador
     */
    public void saveAdministrador(Administrador administrador) {
        delegateAdministrador.saveAdministrador(administrador);
    }

    /**
     *
     * @return Lista de Administradors encontradas
     */
    public List<Administrador> findAll() {
        return delegateAdministrador.findAdministrador();
    }

    /**
     *
     * @param id ID de la Administrador a buscar
     * @return Administrador encontrada
     */
    public Administrador findByID(int id) {
        return delegateAdministrador.findByID(id);
    }

    public void updateAdministrador(Administrador administrador) {
        delegateAdministrador.updateAdministrador(administrador);
    }

    public void eliminarAdministrador(int id) {
        delegateAdministrador.eliminarAdministrador(id);
    }

}
