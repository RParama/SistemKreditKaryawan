/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * @author SAMSUNG
 */
@Entity
@Table(name = "STATUSLOAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statusloan.findAll", query = "SELECT s FROM Statusloan s")
    , @NamedQuery(name = "Statusloan.findById", query = "SELECT s FROM Statusloan s WHERE s.id = :id")
    , @NamedQuery(name = "Statusloan.findByDateTime", query = "SELECT s FROM Statusloan s WHERE s.dateTime = :dateTime")})
public class Statusloan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    @JoinColumn(name = "ID_LOAN", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Loan idLoan;
    @JoinColumn(name = "ID_STATUS", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Status idStatus;

    public Statusloan() {
    }

    public Statusloan(String id) {
        this.id = id;
    }

    public Statusloan(String id, Date dateTime) {
        this.id = id;
        this.dateTime = dateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Loan getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(Loan idLoan) {
        this.idLoan = idLoan;
    }

    public Status getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Status idStatus) {
        this.idStatus = idStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statusloan)) {
            return false;
        }
        Statusloan other = (Statusloan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Statusloan[ id=" + id + " ]";
    }
    
}
