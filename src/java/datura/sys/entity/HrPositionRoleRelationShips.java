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
@Table(name = "Hr_PositionRoleRelationShips")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HrPositionRoleRelationShips.findAll", query = "SELECT h FROM HrPositionRoleRelationShips h"),
    @NamedQuery(name = "HrPositionRoleRelationShips.findById", query = "SELECT h FROM HrPositionRoleRelationShips h WHERE h.id = :id"),
    @NamedQuery(name = "HrPositionRoleRelationShips.findByPositionID", query = "SELECT h FROM HrPositionRoleRelationShips h WHERE h.positionID = :positionID"),
    @NamedQuery(name = "HrPositionRoleRelationShips.findByRoleId", query = "SELECT h FROM HrPositionRoleRelationShips h WHERE h.roleId = :roleId")})
public class HrPositionRoleRelationShips implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Basic(optional = false)
    @Column(name = "PositionID")
    private String positionID;
    @Basic(optional = false)
    @Column(name = "RoleId")
    private String roleId;

    public HrPositionRoleRelationShips() {
    }

    public HrPositionRoleRelationShips(String id) {
        this.id = id;
    }

    public HrPositionRoleRelationShips(String id, String positionID, String roleId) {
        this.id = id;
        this.positionID = positionID;
        this.roleId = roleId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPositionID() {
        return positionID;
    }

    public void setPositionID(String positionID) {
        this.positionID = positionID;
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
        if (!(object instanceof HrPositionRoleRelationShips)) {
            return false;
        }
        HrPositionRoleRelationShips other = (HrPositionRoleRelationShips) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.HrPositionRoleRelationShips[ id=" + id + " ]";
    }
    
}
