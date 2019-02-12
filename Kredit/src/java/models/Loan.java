/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * @author SAMSUNG
 */
@Entity
@Table(name = "LOAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loan.findAll", query = "SELECT l FROM Loan l")
    , @NamedQuery(name = "Loan.findById", query = "SELECT l FROM Loan l WHERE l.id = :id")
    , @NamedQuery(name = "Loan.findByNominal", query = "SELECT l FROM Loan l WHERE l.nominal = :nominal")
    , @NamedQuery(name = "Loan.findByLoanDuration", query = "SELECT l FROM Loan l WHERE l.loanDuration = :loanDuration")
    , @NamedQuery(name = "Loan.findByMonthlyPayment", query = "SELECT l FROM Loan l WHERE l.monthlyPayment = :monthlyPayment")
    , @NamedQuery(name = "Loan.findByStatus", query = "SELECT l FROM Loan l WHERE l.status = :status")})
public class Loan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NOMINAL")
    private long nominal;
    @Basic(optional = false)
    @Column(name = "LOAN_DURATION")
    private int loanDuration;
    @Basic(optional = false)
    @Column(name = "MONTHLY_PAYMENT")
    private long monthlyPayment;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "NIK", referencedColumnName = "NIK")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee nik;
    @JoinColumn(name = "ADMIN", referencedColumnName = "NIK")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee admin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLoan", fetch = FetchType.LAZY)
    private List<Statusloan> statusloanList;

    public Loan() {
    }

    public Loan(String id) {
        this.id = id;
    }

    public Loan(String id, long nominal, int loanDuration, long monthlyPayment, String status) {
        this.id = id;
        this.nominal = nominal;
        this.loanDuration = loanDuration;
        this.monthlyPayment = monthlyPayment;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getNominal() {
        return nominal;
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public long getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(long monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getNik() {
        return nik;
    }

    public void setNik(Employee nik) {
        this.nik = nik;
    }

    public Employee getAdmin() {
        return admin;
    }

    public void setAdmin(Employee admin) {
        this.admin = admin;
    }

    @XmlTransient
    public List<Statusloan> getStatusloanList() {
        return statusloanList;
    }

    public void setStatusloanList(List<Statusloan> statusloanList) {
        this.statusloanList = statusloanList;
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
        if (!(object instanceof Loan)) {
            return false;
        }
        Loan other = (Loan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Loan[ id=" + id + " ]";
    }
    
}
