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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "crendencial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Crendencial.findAll", query = "SELECT c FROM Crendencial c")
    , @NamedQuery(name = "Crendencial.findByIdcrendencial", query = "SELECT c FROM Crendencial c WHERE c.idcrendencial = :idcrendencial")
    , @NamedQuery(name = "Crendencial.findByNombreUsuario", query = "SELECT c FROM Crendencial c WHERE c.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Crendencial.findByApellidoPaterno", query = "SELECT c FROM Crendencial c WHERE c.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Crendencial.findByApellidoMaterno", query = "SELECT c FROM Crendencial c WHERE c.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "Crendencial.findByCorreo", query = "SELECT c FROM Crendencial c WHERE c.correo = :correo")
    , @NamedQuery(name = "Crendencial.findByNumeroEmergencia", query = "SELECT c FROM Crendencial c WHERE c.numeroEmergencia = :numeroEmergencia")
    , @NamedQuery(name = "Crendencial.findByNombreEmergencia", query = "SELECT c FROM Crendencial c WHERE c.nombreEmergencia = :nombreEmergencia")
    , @NamedQuery(name = "Crendencial.findByFechaExpiracion", query = "SELECT c FROM Crendencial c WHERE c.fechaExpiracion = :fechaExpiracion")
    , @NamedQuery(name = "Crendencial.findByTipoCredencial", query = "SELECT c FROM Crendencial c WHERE c.tipoCredencial = :tipoCredencial")
    , @NamedQuery(name = "Crendencial.findByHorasDisponibles", query = "SELECT c FROM Crendencial c WHERE c.horasDisponibles = :horasDisponibles")})
public class Crendencial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcrendencial")
    private Integer idcrendencial;
    @Basic(optional = false)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Basic(optional = false)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "numero_emergencia")
    private String numeroEmergencia;
    @Basic(optional = false)
    @Column(name = "nombre_emergencia")
    private String nombreEmergencia;
    @Basic(optional = false)
    @Column(name = "fecha_expiracion")
    private String fechaExpiracion;
    @Basic(optional = false)
    @Column(name = "tipo_credencial")
    private String tipoCredencial;
    @Basic(optional = false)
    @Column(name = "horas_disponibles")
    private int horasDisponibles;
    @JoinColumn(name = "idseguro", referencedColumnName = "idseguro")
    @ManyToOne(optional = false)
    private Seguro idseguro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcredencial")
    private List<Visitas> visitasList;

    public Crendencial() {
    }

    public Crendencial(Integer idcrendencial) {
        this.idcrendencial = idcrendencial;
    }

    public Crendencial(Integer idcrendencial, String nombreUsuario, String apellidoPaterno, String apellidoMaterno, String correo, String numeroEmergencia, String nombreEmergencia, String fechaExpiracion, String tipoCredencial, int horasDisponibles) {
        this.idcrendencial = idcrendencial;
        this.nombreUsuario = nombreUsuario;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.numeroEmergencia = numeroEmergencia;
        this.nombreEmergencia = nombreEmergencia;
        this.fechaExpiracion = fechaExpiracion;
        this.tipoCredencial = tipoCredencial;
        this.horasDisponibles = horasDisponibles;
    }

    public Integer getIdcrendencial() {
        return idcrendencial;
    }

    public void setIdcrendencial(Integer idcrendencial) {
        this.idcrendencial = idcrendencial;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getNombreEmergencia() {
        return nombreEmergencia;
    }

    public void setNombreEmergencia(String nombreEmergencia) {
        this.nombreEmergencia = nombreEmergencia;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getTipoCredencial() {
        return tipoCredencial;
    }

    public void setTipoCredencial(String tipoCredencial) {
        this.tipoCredencial = tipoCredencial;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    public Seguro getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(Seguro idseguro) {
        this.idseguro = idseguro;
    }

    @XmlTransient
    public List<Visitas> getVisitasList() {
        return visitasList;
    }

    public void setVisitasList(List<Visitas> visitasList) {
        this.visitasList = visitasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcrendencial != null ? idcrendencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crendencial)) {
            return false;
        }
        Crendencial other = (Crendencial) object;
        if ((this.idcrendencial == null && other.idcrendencial != null) || (this.idcrendencial != null && !this.idcrendencial.equals(other.idcrendencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "complejo.entidad.Crendencial[ idcrendencial=" + idcrendencial + " ]";
    }
    
}
