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
@Table(name = "employee_leave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeLeave.findAll", query = "SELECT e FROM EmployeeLeave e"),
    @NamedQuery(name = "EmployeeLeave.findByLeaveId", query = "SELECT e FROM EmployeeLeave e WHERE e.leaveId = :leaveId"),
    @NamedQuery(name = "EmployeeLeave.findByApplicationDate", query = "SELECT e FROM EmployeeLeave e WHERE e.applicationDate = :applicationDate"),
    @NamedQuery(name = "EmployeeLeave.findByStartDate", query = "SELECT e FROM EmployeeLeave e WHERE e.startDate = :startDate"),
    @NamedQuery(name = "EmployeeLeave.findByEndDate", query = "SELECT e FROM EmployeeLeave e WHERE e.endDate = :endDate"),
    @NamedQuery(name = "EmployeeLeave.findByNumberofDays", query = "SELECT e FROM EmployeeLeave e WHERE e.numberofDays = :numberofDays"),
    @NamedQuery(name = "EmployeeLeave.findByRemarks", query = "SELECT e FROM EmployeeLeave e WHERE e.remarks = :remarks"),
    @NamedQuery(name = "EmployeeLeave.findByFkEmployee", query = "SELECT e FROM EmployeeLeave e WHERE e.fkEmployee = :fkEmployee")})
public class EmployeeLeave implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Leave_Id")
    private Integer leaveId;
    @Basic(optional = false)
    @Column(name = "Application_Date")
    @Temporal(TemporalType.DATE)
    private Date applicationDate;
    @Column(name = "Start_Date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "End_Date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Basic(optional = false)
    @Column(name = "Number_of_Days")
    private int numberofDays;
    @Column(name = "Remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "fk_Employee")
    private int fkEmployee;

    public EmployeeLeave() {
    }

    public EmployeeLeave(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public EmployeeLeave(Integer leaveId, Date applicationDate, int numberofDays, int fkEmployee) {
        this.leaveId = leaveId;
        this.applicationDate = applicationDate;
        this.numberofDays = numberofDays;
        this.fkEmployee = fkEmployee;
    }

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getNumberofDays() {
        return numberofDays;
    }

    public void setNumberofDays(int numberofDays) {
        this.numberofDays = numberofDays;
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
        hash += (leaveId != null ? leaveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeLeave)) {
            return false;
        }
        EmployeeLeave other = (EmployeeLeave) object;
        if ((this.leaveId == null && other.leaveId != null) || (this.leaveId != null && !this.leaveId.equals(other.leaveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.EmployeeLeave[ leaveId=" + leaveId + " ]";
    }
    
}
