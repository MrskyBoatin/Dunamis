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
@Table(name = "advance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Advance.findAll", query = "SELECT a FROM Advance a"),
    @NamedQuery(name = "Advance.findByAdvaceId", query = "SELECT a FROM Advance a WHERE a.advaceId = :advaceId"),
    @NamedQuery(name = "Advance.findByApprovedDate", query = "SELECT a FROM Advance a WHERE a.approvedDate = :approvedDate"),
    @NamedQuery(name = "Advance.findByApprovedConditions", query = "SELECT a FROM Advance a WHERE a.approvedConditions = :approvedConditions"),
    @NamedQuery(name = "Advance.findByAmount", query = "SELECT a FROM Advance a WHERE a.amount = :amount"),
    @NamedQuery(name = "Advance.findByRemarks", query = "SELECT a FROM Advance a WHERE a.remarks = :remarks"),
    @NamedQuery(name = "Advance.findByFkPayment", query = "SELECT a FROM Advance a WHERE a.fkPayment = :fkPayment")})
public class Advance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Advace_Id")
    private Integer advaceId;
    @Column(name = "Approved_Date")
    @Temporal(TemporalType.DATE)
    private Date approvedDate;
    @Basic(optional = false)
    @Column(name = "Approved_Conditions")
    private String approvedConditions;
    @Column(name = "Amount")
    private Integer amount;
    @Column(name = "Remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "fk_Payment")
    private int fkPayment;

    public Advance() {
    }

    public Advance(Integer advaceId) {
        this.advaceId = advaceId;
    }

    public Advance(Integer advaceId, String approvedConditions, int fkPayment) {
        this.advaceId = advaceId;
        this.approvedConditions = approvedConditions;
        this.fkPayment = fkPayment;
    }

    public Integer getAdvaceId() {
        return advaceId;
    }

    public void setAdvaceId(Integer advaceId) {
        this.advaceId = advaceId;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getApprovedConditions() {
        return approvedConditions;
    }

    public void setApprovedConditions(String approvedConditions) {
        this.approvedConditions = approvedConditions;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getFkPayment() {
        return fkPayment;
    }

    public void setFkPayment(int fkPayment) {
        this.fkPayment = fkPayment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (advaceId != null ? advaceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Advance)) {
            return false;
        }
        Advance other = (Advance) object;
        if ((this.advaceId == null && other.advaceId != null) || (this.advaceId != null && !this.advaceId.equals(other.advaceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Advance[ advaceId=" + advaceId + " ]";
    }
    
}
