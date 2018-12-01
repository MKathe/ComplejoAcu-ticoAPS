/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejo.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author revy
 */
@Entity
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
    , @NamedQuery(name = "Curso.findByIdcurso", query = "SELECT c FROM Curso c WHERE c.idcurso = :idcurso")
    , @NamedQuery(name = "Curso.findByNombreCurso", query = "SELECT c FROM Curso c WHERE c.nombreCurso = :nombreCurso")
    , @NamedQuery(name = "Curso.findByInstructor", query = "SELECT c FROM Curso c WHERE c.instructor = :instructor")
    , @NamedQuery(name = "Curso.findByDiasImpartido", query = "SELECT c FROM Curso c WHERE c.diasImpartido = :diasImpartido")
    , @NamedQuery(name = "Curso.findByHoraCurso", query = "SELECT c FROM Curso c WHERE c.horaCurso = :horaCurso")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcurso")
    private Integer idcurso;
    @Basic(optional = false)
    @Column(name = "nombre_curso")
    private String nombreCurso;
    @Basic(optional = false)
    @Column(name = "instructor")
    private String instructor;
    @Basic(optional = false)
    @Column(name = "dias_impartido")
    private String diasImpartido;
    @Basic(optional = false)
    @Column(name = "hora_curso")
    private String horaCurso;

    public Curso() {
    }

    public Curso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public Curso(Integer idcurso, String nombreCurso, String instructor, String diasImpartido, String horaCurso) {
        this.idcurso = idcurso;
        this.nombreCurso = nombreCurso;
        this.instructor = instructor;
        this.diasImpartido = diasImpartido;
        this.horaCurso = horaCurso;
    }

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDiasImpartido() {
        return diasImpartido;
    }

    public void setDiasImpartido(String diasImpartido) {
        this.diasImpartido = diasImpartido;
    }

    public String getHoraCurso() {
        return horaCurso;
    }

    public void setHoraCurso(String horaCurso) {
        this.horaCurso = horaCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcurso != null ? idcurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.idcurso == null && other.idcurso != null) || (this.idcurso != null && !this.idcurso.equals(other.idcurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "complejo.entidad.Curso[ idcurso=" + idcurso + " ]";
    }
    
}
