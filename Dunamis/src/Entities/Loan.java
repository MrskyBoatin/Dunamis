/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kuseh
 */
@Entity
@Table(name = "loan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loan.findAll", query = "SELECT l FROM Loan l"),
    @NamedQuery(name = "Loan.findByLoanId", query = "SELECT l FROM Loan l WHERE l.loanId = :loanId"),
    @NamedQuery(name = "Loan.findByApplicationDate", query = "SELECT l FROM Loan l WHERE l.applicationDate = :applicationDate"),
    @NamedQuery(name = "Loan.findByApprovedDate", query = "SELECT l FROM Loan l WHERE l.approvedDate = :approvedDate"),
    @NamedQuery(name = "Loan.findByAmount", query = "SELECT l FROM Loan l WHERE l.amount = :amount"),
    @NamedQuery(name = "Loan.findByApprovedConditions", query = "SELECT l FROM Loan l WHERE l.approvedConditions = :approvedConditions"),
    @NamedQuery(name = "Loan.findByRemarks", query = "SELECT l FROM Loan l WHERE l.remarks = :remarks"),
    @NamedQuery(name = "Loan.findByEmployee", query = "SELECT l FROM Loan l WHERE l.employee = :employee"),
    @NamedQuery(name = "Loan.findByPayment", query = "SELECT l FROM Loan l WHERE l.payment = :payment")})
public class Loan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Loan_Id")
    private Integer loanId;
    @Basic(optional = false)
    @Column(name = "Application_Date")
    @Temporal(TemporalType.DATE)
    private Date applicationDate;
    @Column(name = "Approved_Date")
    @Temporal(TemporalType.DATE)
    private Date approvedDate;
    @Column(name = "Amount")
    private Integer amount;
    @Column(name = "Approved_Conditions")
    private String approvedConditions;
    @Column(name = "Remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "Employee")
    private int employee;
    @Basic(optional = false)
    @Column(name = "Payment")
    private int payment;

    public Loan() {
    }

    public Loan(Integer loanId) {
        this.loanId = loanId;
    }

    public Loan(Integer loanId, Date applicationDate, int employee, int payment) {
        this.loanId = loanId;
        this.applicationDate = applicationDate;
        this.employee = employee;
        this.payment = payment;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getApprovedConditions() {
        return approvedConditions;
    }

    public void setApprovedConditions(String approvedConditions) {
        this.approvedConditions = approvedConditions;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loanId != null ? loanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loan)) {
            return false;
        }
        Loan other = (Loan) object;
        if ((this.loanId == null && other.loanId != null) || (this.loanId != null && !this.loanId.equals(other.loanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Loan[ loanId=" + loanId + " ]";
    }
    
}
