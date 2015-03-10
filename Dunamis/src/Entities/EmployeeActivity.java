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
@Table(name = "employee_activity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeActivity.findAll", query = "SELECT e FROM EmployeeActivity e"),
    @NamedQuery(name = "EmployeeActivity.findByActivityId", query = "SELECT e FROM EmployeeActivity e WHERE e.activityId = :activityId"),
    @NamedQuery(name = "EmployeeActivity.findByActivityType", query = "SELECT e FROM EmployeeActivity e WHERE e.activityType = :activityType"),
    @NamedQuery(name = "EmployeeActivity.findByStartDate", query = "SELECT e FROM EmployeeActivity e WHERE e.startDate = :startDate"),
    @NamedQuery(name = "EmployeeActivity.findByEndDate", query = "SELECT e FROM EmployeeActivity e WHERE e.endDate = :endDate"),
    @NamedQuery(name = "EmployeeActivity.findByRemarks", query = "SELECT e FROM EmployeeActivity e WHERE e.remarks = :remarks"),
    @NamedQuery(name = "EmployeeActivity.findByFkEmployee", query = "SELECT e FROM EmployeeActivity e WHERE e.fkEmployee = :fkEmployee")})
public class EmployeeActivity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Activity_Id")
    private Integer activityId;
    @Column(name = "Activity_Type")
    private String activityType;
    @Basic(optional = false)
    @Column(name = "Start_Date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "End_Date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "Remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "fk_Employee")
    private int fkEmployee;

    public EmployeeActivity() {
    }

    public EmployeeActivity(Integer activityId) {
        this.activityId = activityId;
    }

    public EmployeeActivity(Integer activityId, Date startDate, int fkEmployee) {
        this.activityId = activityId;
        this.startDate = startDate;
        this.fkEmployee = fkEmployee;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
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
        hash += (activityId != null ? activityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeActivity)) {
            return false;
        }
        EmployeeActivity other = (EmployeeActivity) object;
        if ((this.activityId == null && other.activityId != null) || (this.activityId != null && !this.activityId.equals(other.activityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.EmployeeActivity[ activityId=" + activityId + " ]";
    }
    
}
