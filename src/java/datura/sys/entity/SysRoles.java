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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lfz
 */
@Entity
@Table(name = "Sys_Roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysRoles.findAll", query = "SELECT s FROM SysRoles s"),
    @NamedQuery(name = "SysRoles.findById", query = "SELECT s FROM SysRoles s WHERE s.id = :id"),
    @NamedQuery(name = "SysRoles.findByName", query = "SELECT s FROM SysRoles s WHERE s.name = :name"),
    @NamedQuery(name = "SysRoles.findByDescription", query = "SELECT s FROM SysRoles s WHERE s.description = :description"),
    @NamedQuery(name = "SysRoles.findByIsSystemRole", query = "SELECT s FROM SysRoles s WHERE s.isSystemRole = :isSystemRole"),
    @NamedQuery(name = "SysRoles.findBySystemName", query = "SELECT s FROM SysRoles s WHERE s.systemName = :systemName"),
    @NamedQuery(name = "SysRoles.findByActive", query = "SELECT s FROM SysRoles s WHERE s.active = :active"),
    @NamedQuery(name = "SysRoles.findByAreaCode", query = "SELECT s FROM SysRoles s WHERE s.areaCode = :areaCode")})
public class SysRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "IsSystemRole")
    private Short isSystemRole;
    @Column(name = "SystemName")
    private String systemName;
    @Column(name = "Active")
    private Short active;
    @Column(name = "AreaCode")
    private String areaCode;
    @Lob
    @Column(name = "ExtCode")
    private String extCode;

    public SysRoles() {
    }

    public SysRoles(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getIsSystemRole() {
        return isSystemRole;
    }

    public void setIsSystemRole(Short isSystemRole) {
        this.isSystemRole = isSystemRole;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getExtCode() {
        return extCode;
    }

    public void setExtCode(String extCode) {
        this.extCode = extCode;
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
        if (!(object instanceof SysRoles)) {
            return false;
        }
        SysRoles other = (SysRoles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysRoles[ id=" + id + " ]";
    }
    
}
