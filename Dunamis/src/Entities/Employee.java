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
import javax.persistence.Lob;
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
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByEmployeeId", query = "SELECT e FROM Employee e WHERE e.employeeId = :employeeId"),
    @NamedQuery(name = "Employee.findByFirstName", query = "SELECT e FROM Employee e WHERE e.firstName = :firstName"),
    @NamedQuery(name = "Employee.findByMiddleName", query = "SELECT e FROM Employee e WHERE e.middleName = :middleName"),
    @NamedQuery(name = "Employee.findByLastName", query = "SELECT e FROM Employee e WHERE e.lastName = :lastName"),
    @NamedQuery(name = "Employee.findByDateOfBirth", query = "SELECT e FROM Employee e WHERE e.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "Employee.findByNationality", query = "SELECT e FROM Employee e WHERE e.nationality = :nationality"),
    @NamedQuery(name = "Employee.findByDateEmplyed", query = "SELECT e FROM Employee e WHERE e.dateEmplyed = :dateEmplyed"),
    @NamedQuery(name = "Employee.findByNextofKing", query = "SELECT e FROM Employee e WHERE e.nextofKing = :nextofKing"),
    @NamedQuery(name = "Employee.findByFkDepartment", query = "SELECT e FROM Employee e WHERE e.fkDepartment = :fkDepartment")})
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Employee_Id")
    private Integer employeeId;
    @Basic(optional = false)
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Middle_Name")
    private String middleName;
    @Basic(optional = false)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Date_Of_Birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Basic(optional = false)
    @Column(name = "Nationality")
    private String nationality;
    @Basic(optional = false)
    @Column(name = "Date_Emplyed")
    @Temporal(TemporalType.DATE)
    private Date dateEmplyed;
    @Lob
    @Column(name = "Photo")
    private byte[] photo;
    @Column(name = "Next_of_King")
    private String nextofKing;
    @Basic(optional = false)
    @Column(name = "fk_Department")
    private int fkDepartment;

    public Employee() {
    }

    public Employee(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(Integer employeeId, String firstName, String lastName, Date dateOfBirth, String nationality, Date dateEmplyed, int fkDepartment) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.dateEmplyed = dateEmplyed;
        this.fkDepartment = fkDepartment;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateEmplyed() {
        return dateEmplyed;
    }

    public void setDateEmplyed(Date dateEmplyed) {
        this.dateEmplyed = dateEmplyed;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNextofKing() {
        return nextofKing;
    }

    public void setNextofKing(String nextofKing) {
        this.nextofKing = nextofKing;
    }

    public int getFkDepartment() {
        return fkDepartment;
    }

    public void setFkDepartment(int fkDepartment) {
        this.fkDepartment = fkDepartment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Employee[ employeeId=" + employeeId + " ]";
    }
    
}
