/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejo.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author revy
 */
@Entity
@Table(name = "corte_turno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CorteTurno.findAll", query = "SELECT c FROM CorteTurno c")
    , @NamedQuery(name = "CorteTurno.findByIdcorteTurno", query = "SELECT c FROM CorteTurno c WHERE c.idcorteTurno = :idcorteTurno")
    , @NamedQuery(name = "CorteTurno.findByFecha", query = "SELECT c FROM CorteTurno c WHERE c.fecha = :fecha")})
public class CorteTurno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcorte_turno")
    private Integer idcorteTurno;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "id_administrador", referencedColumnName = "idadministrador")
    @ManyToOne(optional = false)
    private Administrador idAdministrador;
    @JoinColumn(name = "idvisita", referencedColumnName = "idvisitas")
    @ManyToOne(optional = false)
    private Visitas idvisita;

    public CorteTurno() {
    }

    public CorteTurno(Integer idcorteTurno) {
        this.idcorteTurno = idcorteTurno;
    }

    public CorteTurno(Integer idcorteTurno, Date fecha) {
        this.idcorteTurno = idcorteTurno;
        this.fecha = fecha;
    }

    public Integer getIdcorteTurno() {
        return idcorteTurno;
    }

    public void setIdcorteTurno(Integer idcorteTurno) {
        this.idcorteTurno = idcorteTurno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Administrador getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administrador idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Visitas getIdvisita() {
        return idvisita;
    }

    public void setIdvisita(Visitas idvisita) {
        this.idvisita = idvisita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcorteTurno != null ? idcorteTurno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorteTurno)) {
            return false;
        }
        CorteTurno other = (CorteTurno) object;
        if ((this.idcorteTurno == null && other.idcorteTurno != null) || (this.idcorteTurno != null && !this.idcorteTurno.equals(other.idcorteTurno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "complejo.entidad.CorteTurno[ idcorteTurno=" + idcorteTurno + " ]";
    }
    
}
