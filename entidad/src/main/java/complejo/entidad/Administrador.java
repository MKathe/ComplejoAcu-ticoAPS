/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author revy
 */
@Entity
@Table(name = "administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a")
    , @NamedQuery(name = "Administrador.findByIdadministrador", query = "SELECT a FROM Administrador a WHERE a.idadministrador = :idadministrador")
    , @NamedQuery(name = "Administrador.findByCuenta", query = "SELECT a FROM Administrador a WHERE a.cuenta = :cuenta")
    , @NamedQuery(name = "Administrador.findByNombre", query = "SELECT a FROM Administrador a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Administrador.findByApellidoPaterno", query = "SELECT a FROM Administrador a WHERE a.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Administrador.findByApellidoMaterno", query = "SELECT a FROM Administrador a WHERE a.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "Administrador.findByPuesto", query = "SELECT a FROM Administrador a WHERE a.puesto = :puesto")})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idadministrador")
    private Integer idadministrador;
    @Basic(optional = false)
    @Column(name = "cuenta")
    private String cuenta;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Basic(optional = false)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Basic(optional = false)
    @Column(name = "puesto")
    private String puesto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAdministrador")
    private List<CorteTurno> corteTurnoList;

    public Administrador() {
    }

    public Administrador(Integer idadministrador) {
        this.idadministrador = idadministrador;
    }

    public Administrador(Integer idadministrador, String cuenta, String nombre, String apellidoPaterno, String apellidoMaterno, String puesto) {
        this.idadministrador = idadministrador;
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.puesto = puesto;
    }

    public Integer getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(Integer idadministrador) {
        this.idadministrador = idadministrador;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @XmlTransient
    public List<CorteTurno> getCorteTurnoList() {
        return corteTurnoList;
    }

    public void setCorteTurnoList(List<CorteTurno> corteTurnoList) {
        this.corteTurnoList = corteTurnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadministrador != null ? idadministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.idadministrador == null && other.idadministrador != null) || (this.idadministrador != null && !this.idadministrador.equals(other.idadministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "complejo.entidad.Administrador[ idadministrador=" + idadministrador + " ]";
    }
    
}
