package com.uabc.negocio.delegate;

import complejo.entidad.Seguro;
import com.uabc.complejo.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Axel Valenzuela - Complejo Acuático 2018
 */
public class delegateSeguro {

    /**
     *
     * @param Seguro que se va a guardar
     */
    public void saveSeguro(Seguro seguro) {
        Seguro result = null;
        if (seguro.getIdseguro() != 0) {
            result = ServiceLocator.getInstanceSeguroDAO().findBySeguroId(seguro.getIdseguro());
        }
        if (result != null) {
            ServiceLocator.getInstanceSeguroDAO().updateSeguro(seguro);
        } else {
            ServiceLocator.getInstanceSeguroDAO().addSeguro(seguro);
        }
    }

    /**
     * @param id de la Seguro que se va a buscar
     * @return Seguro encontrada
     */
    public Seguro findByID(int id) {
        return ServiceLocator.getInstanceSeguroDAO().findBySeguroId(id);
    }

    /**
     * @return Todos los Seguro encontrados
     */
    public List<Seguro> findSeguro() {
        return ServiceLocator.getInstanceSeguroDAO().findAllSeguro();
    }

    /**
     * @param Seguro para actualizar
     */
    public void updateSeguro(Seguro seguro) {
        ServiceLocator.getInstanceSeguroDAO().updateSeguro(seguro);
    }

    /**
     * @param id para eliminar
     */
    public void eliminarSeguro(int id) {
        ServiceLocator.getInstanceSeguroDAO().deleteSeguro(id);
    }

}
