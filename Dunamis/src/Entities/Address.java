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
@Table(name = "address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
    @NamedQuery(name = "Address.findByAddressId", query = "SELECT a FROM Address a WHERE a.addressId = :addressId"),
    @NamedQuery(name = "Address.findByAddress", query = "SELECT a FROM Address a WHERE a.address = :address"),
    @NamedQuery(name = "Address.findByAddress1", query = "SELECT a FROM Address a WHERE a.address1 = :address1"),
    @NamedQuery(name = "Address.findByAddress2", query = "SELECT a FROM Address a WHERE a.address2 = :address2"),
    @NamedQuery(name = "Address.findByAddress3", query = "SELECT a FROM Address a WHERE a.address3 = :address3"),
    @NamedQuery(name = "Address.findByCity", query = "SELECT a FROM Address a WHERE a.city = :city"),
    @NamedQuery(name = "Address.findByRegion", query = "SELECT a FROM Address a WHERE a.region = :region"),
    @NamedQuery(name = "Address.findByCountry", query = "SELECT a FROM Address a WHERE a.country = :country"),
    @NamedQuery(name = "Address.findByFkBranch", query = "SELECT a FROM Address a WHERE a.fkBranch = :fkBranch")})
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Address_Id")
    private Integer addressId;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Column(name = "Address_1")
    private String address1;
    @Column(name = "Address_2")
    private String address2;
    @Column(name = "Address_3")
    private String address3;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "Region")
    private String region;
    @Column(name = "Country")
    private String country;
    @Basic(optional = false)
    @Column(name = "fk_Branch")
    private int fkBranch;

    public Address() {
    }

    public Address(Integer addressId) {
        this.addressId = addressId;
    }

    public Address(Integer addressId, String address, String city, String region, int fkBranch) {
        this.addressId = addressId;
        this.address = address;
        this.city = city;
        this.region = region;
        this.fkBranch = fkBranch;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
        hash += (addressId != null ? addressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.addressId == null && other.addressId != null) || (this.addressId != null && !this.addressId.equals(other.addressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Address[ addressId=" + addressId + " ]";
    }
    
}
