package com.uabc.negocio.delegate;

import complejo.entidad.Crendencial;
import com.uabc.complejo.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Axel Valenzuela - Complejo Acuático 2018
 */
public class delegateCredencial {

    /**
     *
     * @param credencial que se va a guardar
     */
    public void saveCredencial(Crendencial credencial) {
        Crendencial result = null;
        if (credencial.getIdcrendencial() != 0) {
            result = ServiceLocator.getInstanceCredencialDAO().findByCredencialId(credencial.getIdcrendencial());
        }
        if (result != null) {
            ServiceLocator.getInstanceCredencialDAO().updateCredencial(credencial);
        } else {
            ServiceLocator.getInstanceCredencialDAO().addCredencial(credencial);
        }
    }

    /**
     * @param id de la Credencial que se va a buscar
     * @return Credencial encontrada
     */
    public Crendencial findByID(int id) {
        return ServiceLocator.getInstanceCredencialDAO().findByCredencialId(id);
    }

    /**
     * @return Todos los Credencial encontrados
     */
    public List<Crendencial> findCredencial() {
        return ServiceLocator.getInstanceCredencialDAO().findAllCredencial();
    }

    /**
     * @param credencial para actualizar
     */
    public void updateCredencial(Crendencial credencial) {
        ServiceLocator.getInstanceCredencialDAO().updateCredencial(credencial);
    }

    /**
     * @param id para eliminar
     */
    public void eliminarCredencial(int id) {
        ServiceLocator.getInstanceCredencialDAO().deleteCredencial(id);
    }

}
