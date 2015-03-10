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
@Table(name = "employee_retirement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeRetirement.findAll", query = "SELECT e FROM EmployeeRetirement e"),
    @NamedQuery(name = "EmployeeRetirement.findByRetirementId", query = "SELECT e FROM EmployeeRetirement e WHERE e.retirementId = :retirementId"),
    @NamedQuery(name = "EmployeeRetirement.findByApplicationDate", query = "SELECT e FROM EmployeeRetirement e WHERE e.applicationDate = :applicationDate"),
    @NamedQuery(name = "EmployeeRetirement.findByApprovedDate", query = "SELECT e FROM EmployeeRetirement e WHERE e.approvedDate = :approvedDate"),
    @NamedQuery(name = "EmployeeRetirement.findByRetirementDate", query = "SELECT e FROM EmployeeRetirement e WHERE e.retirementDate = :retirementDate"),
    @NamedQuery(name = "EmployeeRetirement.findByActualRetirementDate", query = "SELECT e FROM EmployeeRetirement e WHERE e.actualRetirementDate = :actualRetirementDate"),
    @NamedQuery(name = "EmployeeRetirement.findByRemarks", query = "SELECT e FROM EmployeeRetirement e WHERE e.remarks = :remarks"),
    @NamedQuery(name = "EmployeeRetirement.findByFkEmployee", query = "SELECT e FROM EmployeeRetirement e WHERE e.fkEmployee = :fkEmployee")})
public class EmployeeRetirement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Retirement_Id")
    private Integer retirementId;
    @Basic(optional = false)
    @Column(name = "Application_Date")
    @Temporal(TemporalType.DATE)
    private Date applicationDate;
    @Basic(optional = false)
    @Column(name = "Approved_Date")
    @Temporal(TemporalType.DATE)
    private Date approvedDate;
    @Column(name = "Retirement_Date")
    @Temporal(TemporalType.DATE)
    private Date retirementDate;
    @Basic(optional = false)
    @Column(name = "Actual_Retirement_Date")
    @Temporal(TemporalType.DATE)
    private Date actualRetirementDate;
    @Column(name = "Remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "fk_Employee")
    private int fkEmployee;

    public EmployeeRetirement() {
    }

    public EmployeeRetirement(Integer retirementId) {
        this.retirementId = retirementId;
    }

    public EmployeeRetirement(Integer retirementId, Date applicationDate, Date approvedDate, Date actualRetirementDate, int fkEmployee) {
        this.retirementId = retirementId;
        this.applicationDate = applicationDate;
        this.approvedDate = approvedDate;
        this.actualRetirementDate = actualRetirementDate;
        this.fkEmployee = fkEmployee;
    }

    public Integer getRetirementId() {
        return retirementId;
    }

    public void setRetirementId(Integer retirementId) {
        this.retirementId = retirementId;
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

    public Date getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(Date retirementDate) {
        this.retirementDate = retirementDate;
    }

    public Date getActualRetirementDate() {
        return actualRetirementDate;
    }

    public void setActualRetirementDate(Date actualRetirementDate) {
        this.actualRetirementDate = actualRetirementDate;
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
        hash += (retirementId != null ? retirementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeRetirement)) {
            return false;
        }
        EmployeeRetirement other = (EmployeeRetirement) object;
        if ((this.retirementId == null && other.retirementId != null) || (this.retirementId != null && !this.retirementId.equals(other.retirementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.EmployeeRetirement[ retirementId=" + retirementId + " ]";
    }
    
}
