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
@Table(name = "salary")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salary.findAll", query = "SELECT s FROM Salary s"),
    @NamedQuery(name = "Salary.findBySalaryId", query = "SELECT s FROM Salary s WHERE s.salaryId = :salaryId"),
    @NamedQuery(name = "Salary.findByBasic", query = "SELECT s FROM Salary s WHERE s.basic = :basic"),
    @NamedQuery(name = "Salary.findByHouseRent", query = "SELECT s FROM Salary s WHERE s.houseRent = :houseRent"),
    @NamedQuery(name = "Salary.findByTransportation", query = "SELECT s FROM Salary s WHERE s.transportation = :transportation"),
    @NamedQuery(name = "Salary.findByBonus", query = "SELECT s FROM Salary s WHERE s.bonus = :bonus"),
    @NamedQuery(name = "Salary.findByOvertime", query = "SELECT s FROM Salary s WHERE s.overtime = :overtime"),
    @NamedQuery(name = "Salary.findByProvidencefunds", query = "SELECT s FROM Salary s WHERE s.providencefunds = :providencefunds"),
    @NamedQuery(name = "Salary.findByInsurance", query = "SELECT s FROM Salary s WHERE s.insurance = :insurance"),
    @NamedQuery(name = "Salary.findByIncomeTax", query = "SELECT s FROM Salary s WHERE s.incomeTax = :incomeTax"),
    @NamedQuery(name = "Salary.findByFkEmployee", query = "SELECT s FROM Salary s WHERE s.fkEmployee = :fkEmployee"),
    @NamedQuery(name = "Salary.findByFkPayment", query = "SELECT s FROM Salary s WHERE s.fkPayment = :fkPayment")})
public class Salary implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Salary_Id")
    private Integer salaryId;
    @Basic(optional = false)
    @Column(name = "Basic")
    private int basic;
    @Column(name = "House_Rent")
    private Integer houseRent;
    @Column(name = "Transportation")
    private Integer transportation;
    @Column(name = "Bonus")
    private Integer bonus;
    @Column(name = "Overtime")
    private Integer overtime;
    @Column(name = "Providence_funds")
    private Integer providencefunds;
    @Column(name = "insurance")
    private Integer insurance;
    @Column(name = "Income_Tax")
    private Integer incomeTax;
    @Basic(optional = false)
    @Column(name = "fk_Employee")
    private int fkEmployee;
    @Basic(optional = false)
    @Column(name = "fk_Payment")
    private int fkPayment;

    public Salary() {
    }

    public Salary(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Salary(Integer salaryId, int basic, int fkEmployee, int fkPayment) {
        this.salaryId = salaryId;
        this.basic = basic;
        this.fkEmployee = fkEmployee;
        this.fkPayment = fkPayment;
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public Integer getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(Integer houseRent) {
        this.houseRent = houseRent;
    }

    public Integer getTransportation() {
        return transportation;
    }

    public void setTransportation(Integer transportation) {
        this.transportation = transportation;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }

    public Integer getProvidencefunds() {
        return providencefunds;
    }

    public void setProvidencefunds(Integer providencefunds) {
        this.providencefunds = providencefunds;
    }

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
    }

    public Integer getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(Integer incomeTax) {
        this.incomeTax = incomeTax;
    }

    public int getFkEmployee() {
        return fkEmployee;
    }

    public void setFkEmployee(int fkEmployee) {
        this.fkEmployee = fkEmployee;
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
        hash += (salaryId != null ? salaryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salary)) {
            return false;
        }
        Salary other = (Salary) object;
        if ((this.salaryId == null && other.salaryId != null) || (this.salaryId != null && !this.salaryId.equals(other.salaryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Salary[ salaryId=" + salaryId + " ]";
    }
    
}
