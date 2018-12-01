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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "visitas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitas.findAll", query = "SELECT v FROM Visitas v")
    , @NamedQuery(name = "Visitas.findByIdvisitas", query = "SELECT v FROM Visitas v WHERE v.idvisitas = :idvisitas")
    , @NamedQuery(name = "Visitas.findByHoraEntrada", query = "SELECT v FROM Visitas v WHERE v.horaEntrada = :horaEntrada")
    , @NamedQuery(name = "Visitas.findByHoraSalida", query = "SELECT v FROM Visitas v WHERE v.horaSalida = :horaSalida")
    , @NamedQuery(name = "Visitas.findByTipoPago", query = "SELECT v FROM Visitas v WHERE v.tipoPago = :tipoPago")})
public class Visitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idvisitas")
    private Integer idvisitas;
    @Basic(optional = false)
    @Column(name = "hora_entrada")
    private int horaEntrada;
    @Basic(optional = false)
    @Column(name = "hora_salida")
    private int horaSalida;
    @Basic(optional = false)
    @Column(name = "tipo_pago")
    private String tipoPago;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvisita")
    private List<CorteTurno> corteTurnoList;
    @JoinColumn(name = "idcredencial", referencedColumnName = "idcrendencial")
    @ManyToOne(optional = false)
    private Crendencial idcredencial;

    public Visitas() {
    }

    public Visitas(Integer idvisitas) {
        this.idvisitas = idvisitas;
    }

    public Visitas(Integer idvisitas, int horaEntrada, int horaSalida, String tipoPago) {
        this.idvisitas = idvisitas;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tipoPago = tipoPago;
    }

    public Integer getIdvisitas() {
        return idvisitas;
    }

    public void setIdvisitas(Integer idvisitas) {
        this.idvisitas = idvisitas;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @XmlTransient
    public List<CorteTurno> getCorteTurnoList() {
        return corteTurnoList;
    }

    public void setCorteTurnoList(List<CorteTurno> corteTurnoList) {
        this.corteTurnoList = corteTurnoList;
    }

    public Crendencial getIdcredencial() {
        return idcredencial;
    }

    public void setIdcredencial(Crendencial idcredencial) {
        this.idcredencial = idcredencial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvisitas != null ? idvisitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitas)) {
            return false;
        }
        Visitas other = (Visitas) object;
        if ((this.idvisitas == null && other.idvisitas != null) || (this.idvisitas != null && !this.idvisitas.equals(other.idvisitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "complejo.entidad.Visitas[ idvisitas=" + idvisitas + " ]";
    }
    
}
