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
@Table(name = "Sys_ModuleRights")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysModuleRights.findAll", query = "SELECT s FROM SysModuleRights s"),
    @NamedQuery(name = "SysModuleRights.findById", query = "SELECT s FROM SysModuleRights s WHERE s.id = :id"),
    @NamedQuery(name = "SysModuleRights.findByModuleId", query = "SELECT s FROM SysModuleRights s WHERE s.moduleId = :moduleId"),
    @NamedQuery(name = "SysModuleRights.findByDescription", query = "SELECT s FROM SysModuleRights s WHERE s.description = :description"),
    @NamedQuery(name = "SysModuleRights.findByRightName", query = "SELECT s FROM SysModuleRights s WHERE s.rightName = :rightName"),
    @NamedQuery(name = "SysModuleRights.findByRightValue", query = "SELECT s FROM SysModuleRights s WHERE s.rightValue = :rightValue"),
    @NamedQuery(name = "SysModuleRights.findByRightType", query = "SELECT s FROM SysModuleRights s WHERE s.rightType = :rightType"),
    @NamedQuery(name = "SysModuleRights.findByDataStatus", query = "SELECT s FROM SysModuleRights s WHERE s.dataStatus = :dataStatus"),
    @NamedQuery(name = "SysModuleRights.findByCreateTime", query = "SELECT s FROM SysModuleRights s WHERE s.createTime = :createTime"),
    @NamedQuery(name = "SysModuleRights.findByCreateUserId", query = "SELECT s FROM SysModuleRights s WHERE s.createUserId = :createUserId"),
    @NamedQuery(name = "SysModuleRights.findByLastUpdateTime", query = "SELECT s FROM SysModuleRights s WHERE s.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "SysModuleRights.findByLastUpdateUserId", query = "SELECT s FROM SysModuleRights s WHERE s.lastUpdateUserId = :lastUpdateUserId"),
    @NamedQuery(name = "SysModuleRights.findByGroupId", query = "SELECT s FROM SysModuleRights s WHERE s.groupId = :groupId")})
public class SysModuleRights implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "ModuleId")
    private String moduleId;
    @Column(name = "Description")
    private String description;
    @Column(name = "RightName")
    private String rightName;
    @Column(name = "RightValue")
    private Integer rightValue;
    @Column(name = "RightType")
    private Integer rightType;
    @Column(name = "DataStatus")
    private Integer dataStatus;
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
    @Column(name = "GroupId")
    private String groupId;

    public SysModuleRights() {
    }

    public SysModuleRights(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public Integer getRightValue() {
        return rightValue;
    }

    public void setRightValue(Integer rightValue) {
        this.rightValue = rightValue;
    }

    public Integer getRightType() {
        return rightType;
    }

    public void setRightType(Integer rightType) {
        this.rightType = rightType;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
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
        if (!(object instanceof SysModuleRights)) {
            return false;
        }
        SysModuleRights other = (SysModuleRights) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysModuleRights[ id=" + id + " ]";
    }
    
}
