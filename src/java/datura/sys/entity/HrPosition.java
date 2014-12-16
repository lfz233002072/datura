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
import javax.persistence.Lob;
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
@Table(name = "Hr_Position")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HrPosition.findAll", query = "SELECT h FROM HrPosition h"),
    @NamedQuery(name = "HrPosition.findById", query = "SELECT h FROM HrPosition h WHERE h.id = :id"),
    @NamedQuery(name = "HrPosition.findByPositionName", query = "SELECT h FROM HrPosition h WHERE h.positionName = :positionName"),
    @NamedQuery(name = "HrPosition.findByDataStatus", query = "SELECT h FROM HrPosition h WHERE h.dataStatus = :dataStatus"),
    @NamedQuery(name = "HrPosition.findByLevelId", query = "SELECT h FROM HrPosition h WHERE h.levelId = :levelId"),
    @NamedQuery(name = "HrPosition.findByCreateTime", query = "SELECT h FROM HrPosition h WHERE h.createTime = :createTime"),
    @NamedQuery(name = "HrPosition.findByCreateUserId", query = "SELECT h FROM HrPosition h WHERE h.createUserId = :createUserId"),
    @NamedQuery(name = "HrPosition.findByLastUpdateTime", query = "SELECT h FROM HrPosition h WHERE h.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "HrPosition.findByLastUpdateUserId", query = "SELECT h FROM HrPosition h WHERE h.lastUpdateUserId = :lastUpdateUserId")})
public class HrPosition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "PositionName")
    private String positionName;
    @Lob
    @Column(name = "Description")
    private String description;
    @Column(name = "DataStatus")
    private Integer dataStatus;
    @Column(name = "LevelId")
    private Integer levelId;
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

    public HrPosition() {
    }

    public HrPosition(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
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
        if (!(object instanceof HrPosition)) {
            return false;
        }
        HrPosition other = (HrPosition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.HrPosition[ id=" + id + " ]";
    }
    
}
