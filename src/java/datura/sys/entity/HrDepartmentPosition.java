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
@Table(name = "Hr_DepartmentPosition")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HrDepartmentPosition.findAll", query = "SELECT h FROM HrDepartmentPosition h"),
    @NamedQuery(name = "HrDepartmentPosition.findById", query = "SELECT h FROM HrDepartmentPosition h WHERE h.id = :id"),
    @NamedQuery(name = "HrDepartmentPosition.findByPositionId", query = "SELECT h FROM HrDepartmentPosition h WHERE h.positionId = :positionId"),
    @NamedQuery(name = "HrDepartmentPosition.findByDepartmentId", query = "SELECT h FROM HrDepartmentPosition h WHERE h.departmentId = :departmentId"),
    @NamedQuery(name = "HrDepartmentPosition.findByImmediateSuperiorId", query = "SELECT h FROM HrDepartmentPosition h WHERE h.immediateSuperiorId = :immediateSuperiorId"),
    @NamedQuery(name = "HrDepartmentPosition.findByCreateTime", query = "SELECT h FROM HrDepartmentPosition h WHERE h.createTime = :createTime"),
    @NamedQuery(name = "HrDepartmentPosition.findByCreateUserId", query = "SELECT h FROM HrDepartmentPosition h WHERE h.createUserId = :createUserId"),
    @NamedQuery(name = "HrDepartmentPosition.findByLastUpdateTime", query = "SELECT h FROM HrDepartmentPosition h WHERE h.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "HrDepartmentPosition.findByLastUpdateUserId", query = "SELECT h FROM HrDepartmentPosition h WHERE h.lastUpdateUserId = :lastUpdateUserId")})
public class HrDepartmentPosition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "PositionId")
    private String positionId;
    @Column(name = "DepartmentId")
    private String departmentId;
    @Column(name = "ImmediateSuperiorId")
    private String immediateSuperiorId;
    @Column(name = "CreateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "CreateUserId")
    private String createUserId;
    @Column(name = "LastUpdateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateTime;
    @Column(name = "LastUpdateUserId")
    private String lastUpdateUserId;

    public HrDepartmentPosition() {
    }

    public HrDepartmentPosition(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getImmediateSuperiorId() {
        return immediateSuperiorId;
    }

    public void setImmediateSuperiorId(String immediateSuperiorId) {
        this.immediateSuperiorId = immediateSuperiorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
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
        if (!(object instanceof HrDepartmentPosition)) {
            return false;
        }
        HrDepartmentPosition other = (HrDepartmentPosition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.HrDepartmentPosition[ id=" + id + " ]";
    }
    
}
