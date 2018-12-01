package com.uabc.complejo.negocio.facade;

import complejo.entidad.Seguro;
import com.uabc.negocio.delegate.delegateSeguro;
import java.util.List;

/**
 * @author Axel Valenzuela - Complejo Acuático 2018
 */
public class seguroFacade {

    delegateSeguro delegateSeguro = new delegateSeguro();

    /**
     * Metodo para guardar una Seguro
     *
     * @param Seguro
     */
    public void saveSeguro(Seguro seguro) {
        delegateSeguro.saveSeguro(seguro);
    }

    /**
     *
     * @return Lista de Seguro encontradas
     */
    public List<Seguro> findAll() {
        return delegateSeguro.findSeguro();
    }

    /**
     *
     * @param id ID de la Seguro a buscar
     * @return Seguro encontrada
     */
    public Seguro findByID(int id) {
        return delegateSeguro.findByID(id);
    }

    public void updateSeguro(Seguro seguro) {
        delegateSeguro.updateSeguro(seguro);
    }

    public void eliminarSeguro(int id) {
        delegateSeguro.eliminarSeguro(id);
    }

}
