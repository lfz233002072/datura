/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.sys.entity;

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
 * @author lfz
 */
@Entity
@Table(name = "Sys_Rights")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysRights.findAll", query = "SELECT s FROM SysRights s"),
    @NamedQuery(name = "SysRights.findById", query = "SELECT s FROM SysRights s WHERE s.id = :id"),
    @NamedQuery(name = "SysRights.findByModuleRightsId", query = "SELECT s FROM SysRights s WHERE s.moduleRightsId = :moduleRightsId"),
    @NamedQuery(name = "SysRights.findByRoleId", query = "SELECT s FROM SysRights s WHERE s.roleId = :roleId"),
    @NamedQuery(name = "SysRights.findByHrId", query = "SELECT s FROM SysRights s WHERE s.hrId = :hrId"),
    @NamedQuery(name = "SysRights.findByHrType", query = "SELECT s FROM SysRights s WHERE s.hrType = :hrType"),
    @NamedQuery(name = "SysRights.findByFromDate", query = "SELECT s FROM SysRights s WHERE s.fromDate = :fromDate"),
    @NamedQuery(name = "SysRights.findByEndDate", query = "SELECT s FROM SysRights s WHERE s.endDate = :endDate"),
    @NamedQuery(name = "SysRights.findByModuleId", query = "SELECT s FROM SysRights s WHERE s.moduleId = :moduleId"),
    @NamedQuery(name = "SysRights.findByGroupId", query = "SELECT s FROM SysRights s WHERE s.groupId = :groupId")})
public class SysRights implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Basic(optional = false)
    @Column(name = "ModuleRightsId")
    private String moduleRightsId;
    @Basic(optional = false)
    @Column(name = "RoleId")
    private String roleId;
    @Column(name = "HrId")
    private String hrId;
    @Column(name = "HrType")
    private Integer hrType;
    @Column(name = "FromDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "ModuleId")
    private String moduleId;
    @Column(name = "GroupId")
    private String groupId;

    public SysRights() {
    }

    public SysRights(String id) {
        this.id = id;
    }

    public SysRights(String id, String moduleRightsId, String roleId) {
        this.id = id;
        this.moduleRightsId = moduleRightsId;
        this.roleId = roleId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleRightsId() {
        return moduleRightsId;
    }

    public void setModuleRightsId(String moduleRightsId) {
        this.moduleRightsId = moduleRightsId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    public Integer getHrType() {
        return hrType;
    }

    public void setHrType(Integer hrType) {
        this.hrType = hrType;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
        if (!(object instanceof SysRights)) {
            return false;
        }
        SysRights other = (SysRights) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysRights[ id=" + id + " ]";
    }
    
}
