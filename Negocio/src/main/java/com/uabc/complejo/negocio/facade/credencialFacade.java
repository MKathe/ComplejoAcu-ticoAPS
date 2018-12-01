package com.uabc.complejo.negocio.facade;

import complejo.entidad.Crendencial;
import com.uabc.negocio.delegate.delegateCredencial;
import java.util.List;

/**
 * @author Axel Valenzuela - Complejo Acuático 2018
 */
public class credencialFacade {

    delegateCredencial delegateCredencial = new delegateCredencial();

    /**
     * Metodo para guardar una Credencial
     *
     * @param credencial
     */
    public void saveCredencial(Crendencial credencial) {
        delegateCredencial.saveCredencial(credencial);
    }

    /**
     *
     * @return Lista de Credencial encontradas
     */
    public List<Crendencial> findAll() {
        return delegateCredencial.findCredencial();
    }

    /**
     *
     * @param id ID de la Credencial a buscar
     * @return Credencial encontrada
     */
    public Crendencial findByID(int id) {
        return delegateCredencial.findByID(id);
    }

    /**
     *
     * @param credencial
     */
    public void updateCredencial(Crendencial credencial) {
        delegateCredencial.updateCredencial(credencial);
    }

    /**
     *
     * @param id
     */
    public void eliminarCredencial(int id) {
        delegateCredencial.eliminarCredencial(id);
    }

}
