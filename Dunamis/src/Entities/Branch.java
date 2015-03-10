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
@Table(name = "branch")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Branch.findAll", query = "SELECT b FROM Branch b"),
    @NamedQuery(name = "Branch.findByBranchId", query = "SELECT b FROM Branch b WHERE b.branchId = :branchId"),
    @NamedQuery(name = "Branch.findByBranchName", query = "SELECT b FROM Branch b WHERE b.branchName = :branchName"),
    @NamedQuery(name = "Branch.findByBranchinfor", query = "SELECT b FROM Branch b WHERE b.branchinfor = :branchinfor"),
    @NamedQuery(name = "Branch.findByTelephone", query = "SELECT b FROM Branch b WHERE b.telephone = :telephone"),
    @NamedQuery(name = "Branch.findByCity", query = "SELECT b FROM Branch b WHERE b.city = :city"),
    @NamedQuery(name = "Branch.findByFkCompany", query = "SELECT b FROM Branch b WHERE b.fkCompany = :fkCompany")})
public class Branch implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Branch_Id")
    private Integer branchId;
    @Basic(optional = false)
    @Column(name = "Branch_Name")
    private String branchName;
    @Basic(optional = false)
    @Column(name = "Branch_infor")
    private String branchinfor;
    @Column(name = "Telephone")
    private String telephone;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "fk_Company")
    private int fkCompany;

    public Branch() {
    }

    public Branch(Integer branchId) {
        this.branchId = branchId;
    }

    public Branch(Integer branchId, String branchName, String branchinfor, String city, int fkCompany) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchinfor = branchinfor;
        this.city = city;
        this.fkCompany = fkCompany;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchinfor() {
        return branchinfor;
    }

    public void setBranchinfor(String branchinfor) {
        this.branchinfor = branchinfor;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFkCompany() {
        return fkCompany;
    }

    public void setFkCompany(int fkCompany) {
        this.fkCompany = fkCompany;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (branchId != null ? branchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Branch)) {
            return false;
        }
        Branch other = (Branch) object;
        if ((this.branchId == null && other.branchId != null) || (this.branchId != null && !this.branchId.equals(other.branchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Branch[ branchId=" + branchId + " ]";
    }
    
}
