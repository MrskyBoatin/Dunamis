/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kuseh
 */
@Entity
@Table(name = "department")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d"),
    @NamedQuery(name = "Department.findByDepartmentId", query = "SELECT d FROM Department d WHERE d.departmentId = :departmentId"),
    @NamedQuery(name = "Department.findByDepartmentName", query = "SELECT d FROM Department d WHERE d.departmentName = :departmentName"),
    @NamedQuery(name = "Department.findByRemarks", query = "SELECT d FROM Department d WHERE d.remarks = :remarks"),
    @NamedQuery(name = "Department.findByFkBranch", query = "SELECT d FROM Department d WHERE d.fkBranch = :fkBranch")})
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Department_Id")
    private Integer departmentId;
    @Basic(optional = false)
    @Column(name = "Department_Name")
    private String departmentName;
    @Column(name = "Remarks")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "fk_Branch")
    private int fkBranch;

    public Department() {
    }

    public Department(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Department(Integer departmentId, String departmentName, int fkBranch) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.fkBranch = fkBranch;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getFkBranch() {
        return fkBranch;
    }

    public void setFkBranch(int fkBranch) {
        this.fkBranch = fkBranch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departmentId != null ? departmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.departmentId == null && other.departmentId != null) || (this.departmentId != null && !this.departmentId.equals(other.departmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Department[ departmentId=" + departmentId + " ]";
    }
    
}
