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
@Table(name = "Sys_UserRoleRelationShips")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysUserRoleRelationShips.findAll", query = "SELECT s FROM SysUserRoleRelationShips s"),
    @NamedQuery(name = "SysUserRoleRelationShips.findById", query = "SELECT s FROM SysUserRoleRelationShips s WHERE s.id = :id"),
    @NamedQuery(name = "SysUserRoleRelationShips.findByUserId", query = "SELECT s FROM SysUserRoleRelationShips s WHERE s.userId = :userId"),
    @NamedQuery(name = "SysUserRoleRelationShips.findByRoleId", query = "SELECT s FROM SysUserRoleRelationShips s WHERE s.roleId = :roleId")})
public class SysUserRoleRelationShips implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Basic(optional = false)
    @Column(name = "UserId")
    private String userId;
    @Basic(optional = false)
    @Column(name = "RoleId")
    private String roleId;

    public SysUserRoleRelationShips() {
    }

    public SysUserRoleRelationShips(String id) {
        this.id = id;
    }

    public SysUserRoleRelationShips(String id, String userId, String roleId) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
        if (!(object instanceof SysUserRoleRelationShips)) {
            return false;
        }
        SysUserRoleRelationShips other = (SysUserRoleRelationShips) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysUserRoleRelationShips[ id=" + id + " ]";
    }
    
}
