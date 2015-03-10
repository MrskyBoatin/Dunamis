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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kuseh
 */
@Entity
@Table(name = "company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "Company.findByCompanyId", query = "SELECT c FROM Company c WHERE c.companyId = :companyId"),
    @NamedQuery(name = "Company.findByCompanyName", query = "SELECT c FROM Company c WHERE c.companyName = :companyName"),
    @NamedQuery(name = "Company.findByAddress", query = "SELECT c FROM Company c WHERE c.address = :address"),
    @NamedQuery(name = "Company.findByCompanyType", query = "SELECT c FROM Company c WHERE c.companyType = :companyType"),
    @NamedQuery(name = "Company.findByCountry", query = "SELECT c FROM Company c WHERE c.country = :country"),
    @NamedQuery(name = "Company.findByWebsite", query = "SELECT c FROM Company c WHERE c.website = :website"),
    @NamedQuery(name = "Company.findByCity", query = "SELECT c FROM Company c WHERE c.city = :city")})
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Company_Id")
    private Integer companyId;
    @Basic(optional = false)
    @Column(name = "Company_Name")
    private String companyName;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Column(name = "Company_Type")
    private String companyType;
    @Lob
    @Column(name = "Logo")
    private byte[] logo;
    @Basic(optional = false)
    @Column(name = "Country")
    private String country;
    @Column(name = "Website")
    private String website;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;

    public Company() {
    }

    public Company(Integer companyId) {
        this.companyId = companyId;
    }

    public Company(Integer companyId, String companyName, String address, String country, String city) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.address = address;
        this.country = country;
        this.city = city;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyId != null ? companyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyId == null && other.companyId != null) || (this.companyId != null && !this.companyId.equals(other.companyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Company[ companyId=" + companyId + " ]";
    }
    
}
