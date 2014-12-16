/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.sys.entity;

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
 * @author lfz
 */
@Entity
@Table(name = "Sys_AdministrativeRegion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysAdministrativeRegion.findAll", query = "SELECT s FROM SysAdministrativeRegion s"),
    @NamedQuery(name = "SysAdministrativeRegion.findById", query = "SELECT s FROM SysAdministrativeRegion s WHERE s.id = :id"),
    @NamedQuery(name = "SysAdministrativeRegion.findByRegionCode", query = "SELECT s FROM SysAdministrativeRegion s WHERE s.regionCode = :regionCode"),
    @NamedQuery(name = "SysAdministrativeRegion.findByRegionName", query = "SELECT s FROM SysAdministrativeRegion s WHERE s.regionName = :regionName"),
    @NamedQuery(name = "SysAdministrativeRegion.findByParentCode", query = "SELECT s FROM SysAdministrativeRegion s WHERE s.parentCode = :parentCode"),
    @NamedQuery(name = "SysAdministrativeRegion.findByLongitude", query = "SELECT s FROM SysAdministrativeRegion s WHERE s.longitude = :longitude"),
    @NamedQuery(name = "SysAdministrativeRegion.findByLatitude", query = "SELECT s FROM SysAdministrativeRegion s WHERE s.latitude = :latitude"),
    @NamedQuery(name = "SysAdministrativeRegion.findByCompatibleCode", query = "SELECT s FROM SysAdministrativeRegion s WHERE s.compatibleCode = :compatibleCode")})
public class SysAdministrativeRegion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Basic(optional = false)
    @Column(name = "RegionCode")
    private String regionCode;
    @Column(name = "RegionName")
    private String regionName;
    @Column(name = "ParentCode")
    private String parentCode;
    @Column(name = "Longitude")
    private String longitude;
    @Column(name = "Latitude")
    private String latitude;
    @Column(name = "CompatibleCode")
    private String compatibleCode;

    public SysAdministrativeRegion() {
    }

    public SysAdministrativeRegion(String id) {
        this.id = id;
    }

    public SysAdministrativeRegion(String id, String regionCode) {
        this.id = id;
        this.regionCode = regionCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCompatibleCode() {
        return compatibleCode;
    }

    public void setCompatibleCode(String compatibleCode) {
        this.compatibleCode = compatibleCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysAdministrativeRegion)) {
            return false;
        }
        SysAdministrativeRegion other = (SysAdministrativeRegion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysAdministrativeRegion[ id=" + id + " ]";
    }
    
}
