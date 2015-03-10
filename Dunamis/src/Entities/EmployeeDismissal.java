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
@Table(name = "employee_dismissal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeDismissal.findAll", query = "SELECT e FROM EmployeeDismissal e"),
    @NamedQuery(name = "EmployeeDismissal.findByDismissalId", query = "SELECT e FROM EmployeeDismissal e WHERE e.dismissalId = :dismissalId"),
    @NamedQuery(name = "EmployeeDismissal.findByDismissalDate", query = "SELECT e FROM EmployeeDismissal e WHERE e.dismissalDate = :dismissalDate"),
    @NamedQuery(name = "EmployeeDismissal.findByIntermnetDate", query = "SELECT e FROM EmployeeDismissal e WHERE e.intermnetDate = :intermnetDate"),
    @NamedQuery(name = "EmployeeDismissal.findByRemarks", query = "SELECT e FROM EmployeeDismissal e WHERE e.remarks = :remarks"),
    @NamedQuery(name = "EmployeeDismissal.findByFkEmployee", query = "SELECT e FROM EmployeeDismissal e WHERE e.fkEmployee = :fkEmployee")})
public class EmployeeDismissal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Dismissal_Id")
    private Integer dismissalId;
    @Basic(optional = false)
    @Column(name = "Dismissal_Date")
    @Temporal(TemporalType.DATE)
    private Date dismissalDate;
    @Column(name = "Intermnet_Date")
    @Temporal(TemporalType.DATE)
    private Date intermnetDate;
    @Column(name = "Remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "fk_Employee")
    private int fkEmployee;

    public EmployeeDismissal() {
    }

    public EmployeeDismissal(Integer dismissalId) {
        this.dismissalId = dismissalId;
    }

    public EmployeeDismissal(Integer dismissalId, Date dismissalDate, int fkEmployee) {
        this.dismissalId = dismissalId;
        this.dismissalDate = dismissalDate;
        this.fkEmployee = fkEmployee;
    }

    public Integer getDismissalId() {
        return dismissalId;
    }

    public void setDismissalId(Integer dismissalId) {
        this.dismissalId = dismissalId;
    }

    public Date getDismissalDate() {
        return dismissalDate;
    }

    public void setDismissalDate(Date dismissalDate) {
        this.dismissalDate = dismissalDate;
    }

    public Date getIntermnetDate() {
        return intermnetDate;
    }

    public void setIntermnetDate(Date intermnetDate) {
        this.intermnetDate = intermnetDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getFkEmployee() {
        return fkEmployee;
    }

    public void setFkEmployee(int fkEmployee) {
        this.fkEmployee = fkEmployee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dismissalId != null ? dismissalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeDismissal)) {
            return false;
        }
        EmployeeDismissal other = (EmployeeDismissal) object;
        if ((this.dismissalId == null && other.dismissalId != null) || (this.dismissalId != null && !this.dismissalId.equals(other.dismissalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.EmployeeDismissal[ dismissalId=" + dismissalId + " ]";
    }
    
}
