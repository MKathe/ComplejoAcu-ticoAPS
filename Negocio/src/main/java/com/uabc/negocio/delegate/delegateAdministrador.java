package com.uabc.negocio.delegate;

import complejo.entidad.Administrador;
import com.uabc.complejo.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Axel Valenzuela - Complejo Acuático 2018
 */
public class delegateAdministrador {

    /**
     *
     * @param Administrador que se va a guardar
     */
    public void saveAdministrador(Administrador administrador) {
        Administrador result = null;
        if (administrador.getIdadministrador() != 0) {
            result = ServiceLocator.getInstanceAdminDAO().findByAdminId(administrador.getIdadministrador());
        }
        if (result != null) {
            ServiceLocator.getInstanceAdminDAO().updateAdmin(administrador);
        } else {
            ServiceLocator.getInstanceAdminDAO().addAdmin(administrador);
        }
    }

    /**
     * @param id de la Administrador que se va a buscar
     * @return Administrador encontrada
     */
    public Administrador findByID(int id) {
        return ServiceLocator.getInstanceAdminDAO().findByAdminId(id);
    }

    /**
     * @return Todos los Administrador encontrados
     */
    public List<Administrador> findAdministrador() {
        return ServiceLocator.getInstanceAdminDAO().findAllAdmin();
    }

    /**
     * @param administrador para actualizar
     */
    public void updateAdministrador(Administrador administrador) {
        ServiceLocator.getInstanceAdminDAO().updateAdmin(administrador);
    }

    /**
     * @param administrador para eliminar
     */
    public void eliminarAdministrador(int id) {
        ServiceLocator.getInstanceAdminDAO().deleteAdmin(id);
    }

}
