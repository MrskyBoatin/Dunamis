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
@Table(name = "payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findByPaymentId", query = "SELECT p FROM Payment p WHERE p.paymentId = :paymentId"),
    @NamedQuery(name = "Payment.findByPaymentname", query = "SELECT p FROM Payment p WHERE p.paymentname = :paymentname"),
    @NamedQuery(name = "Payment.findByPaymentType", query = "SELECT p FROM Payment p WHERE p.paymentType = :paymentType"),
    @NamedQuery(name = "Payment.findByPaymentDate", query = "SELECT p FROM Payment p WHERE p.paymentDate = :paymentDate"),
    @NamedQuery(name = "Payment.findByAmount", query = "SELECT p FROM Payment p WHERE p.amount = :amount"),
    @NamedQuery(name = "Payment.findByBankname", query = "SELECT p FROM Payment p WHERE p.bankname = :bankname"),
    @NamedQuery(name = "Payment.findByBranch", query = "SELECT p FROM Payment p WHERE p.branch = :branch"),
    @NamedQuery(name = "Payment.findByAcountName", query = "SELECT p FROM Payment p WHERE p.acountName = :acountName"),
    @NamedQuery(name = "Payment.findByAccountNumber", query = "SELECT p FROM Payment p WHERE p.accountNumber = :accountNumber"),
    @NamedQuery(name = "Payment.findByAcounttype", query = "SELECT p FROM Payment p WHERE p.acounttype = :acounttype"),
    @NamedQuery(name = "Payment.findByRemarks", query = "SELECT p FROM Payment p WHERE p.remarks = :remarks")})
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Payment_Id")
    private Integer paymentId;
    @Basic(optional = false)
    @Column(name = "Payment_name")
    private String paymentname;
    @Column(name = "Payment_Type")
    private String paymentType;
    @Column(name = "Payment_Date")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;
    @Basic(optional = false)
    @Column(name = "Amount")
    private int amount;
    @Basic(optional = false)
    @Column(name = "Bank_name")
    private String bankname;
    @Basic(optional = false)
    @Column(name = "Branch")
    private String branch;
    @Column(name = "Acount_Name")
    private String acountName;
    @Column(name = "Account_Number")
    private Integer accountNumber;
    @Column(name = "Acount_type")
    private String acounttype;
    @Column(name = "Remarks")
    private String remarks;

    public Payment() {
    }

    public Payment(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Payment(Integer paymentId, String paymentname, int amount, String bankname, String branch) {
        this.paymentId = paymentId;
        this.paymentname = paymentname;
        this.amount = amount;
        this.bankname = bankname;
        this.branch = branch;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentname() {
        return paymentname;
    }

    public void setPaymentname(String paymentname) {
        this.paymentname = paymentname;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAcountName() {
        return acountName;
    }

    public void setAcountName(String acountName) {
        this.acountName = acountName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAcounttype() {
        return acounttype;
    }

    public void setAcounttype(String acounttype) {
        this.acounttype = acounttype;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Payment[ paymentId=" + paymentId + " ]";
    }
    
}
