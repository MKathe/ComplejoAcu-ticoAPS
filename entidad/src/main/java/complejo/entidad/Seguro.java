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
@Table(name = "seguro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seguro.findAll", query = "SELECT s FROM Seguro s")
    , @NamedQuery(name = "Seguro.findByIdseguro", query = "SELECT s FROM Seguro s WHERE s.idseguro = :idseguro")
    , @NamedQuery(name = "Seguro.findBySeguro", query = "SELECT s FROM Seguro s WHERE s.seguro = :seguro")
    , @NamedQuery(name = "Seguro.findByEstado", query = "SELECT s FROM Seguro s WHERE s.estado = :estado")})
public class Seguro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idseguro")
    private Integer idseguro;
    @Basic(optional = false)
    @Column(name = "seguro")
    private String seguro;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idseguro")
    private List<Crendencial> crendencialList;

    public Seguro() {
    }

    public Seguro(Integer idseguro) {
        this.idseguro = idseguro;
    }

    public Seguro(Integer idseguro, String seguro, String estado) {
        this.idseguro = idseguro;
        this.seguro = seguro;
        this.estado = estado;
    }

    public Integer getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(Integer idseguro) {
        this.idseguro = idseguro;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Crendencial> getCrendencialList() {
        return crendencialList;
    }

    public void setCrendencialList(List<Crendencial> crendencialList) {
        this.crendencialList = crendencialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idseguro != null ? idseguro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seguro)) {
            return false;
        }
        Seguro other = (Seguro) object;
        if ((this.idseguro == null && other.idseguro != null) || (this.idseguro != null && !this.idseguro.equals(other.idseguro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "complejo.entidad.Seguro[ idseguro=" + idseguro + " ]";
    }
    
}
