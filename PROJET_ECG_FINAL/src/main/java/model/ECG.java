/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 */
@Entity
@Table(name = "bpm")
@NamedQueries({
    @NamedQuery(name = "bpm.findAll", query = "SELECT b FROM bpm b"),
    @NamedQuery(name = "bpm.findByidecg", query = "SELECT b FROM bpm b WHERE b.idecg = :idecg"),
    @NamedQuery(name = "bpm.findBybpm", query = "SELECT b FROM bpm b WHERE b.bpm = :bpm"),
    @NamedQuery(name = "bpm.findByRegisterDateTime", query = "SELECT b FROM bpm b WHERE b.registerDateTime = :registerDateTime")})
public class ECG implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idecg")
    private Integer idecg;
    @Basic(optional = false)
    @Column(name = "bpm")
    private float bpm;
    @Basic(optional = false)
    @Column(name = "registerDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private String registerDateTime;
    @JoinColumn(name = "idPatient", referencedColumnName = "idPatient")
    @ManyToOne(optional = false)
    private Patient idPatient;

    public ECG() {
    }

    public ECG(Integer idecg) {
        this.idecg = idecg;
    }

    public ECG(Integer idecg, float bpm, String registerDateTime) {
        this.idecg = idecg;
        this.bpm = bpm;
        this.registerDateTime = registerDateTime;
    }

    public Integer getidecg() {
        return idecg;
    }

    public void setidecg(Integer idecg) {
        this.idecg = idecg;
    }

    public float getbpm() {
        return bpm;
    }

    public void setbpm(float bpm) {
        this.bpm = bpm;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Patient getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Patient idPatient) {
        this.idPatient = idPatient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idecg != null ? idecg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ECG)) {
            return false;
        }
        ECG other = (ECG) object;
        if ((this.idecg == null && other.idecg != null) || (this.idecg != null && !this.idecg.equals(other.idecg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + registerDateTime + " " + bpm + " ";
    }
    
    
    
}
