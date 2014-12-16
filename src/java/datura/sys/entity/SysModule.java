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
@Table(name = "Sys_Module")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysModule.findAll", query = "SELECT s FROM SysModule s"),
    @NamedQuery(name = "SysModule.findById", query = "SELECT s FROM SysModule s WHERE s.id = :id"),
    @NamedQuery(name = "SysModule.findByUrl", query = "SELECT s FROM SysModule s WHERE s.url = :url"),
    @NamedQuery(name = "SysModule.findByDescription", query = "SELECT s FROM SysModule s WHERE s.description = :description"),
    @NamedQuery(name = "SysModule.findByDisplayName", query = "SELECT s FROM SysModule s WHERE s.displayName = :displayName"),
    @NamedQuery(name = "SysModule.findByEnglishName", query = "SELECT s FROM SysModule s WHERE s.englishName = :englishName"),
    @NamedQuery(name = "SysModule.findByImgUrl", query = "SELECT s FROM SysModule s WHERE s.imgUrl = :imgUrl"),
    @NamedQuery(name = "SysModule.findByGroupId", query = "SELECT s FROM SysModule s WHERE s.groupId = :groupId"),
    @NamedQuery(name = "SysModule.findByDataSort", query = "SELECT s FROM SysModule s WHERE s.dataSort = :dataSort"),
    @NamedQuery(name = "SysModule.findByDataStatus", query = "SELECT s FROM SysModule s WHERE s.dataStatus = :dataStatus"),
    @NamedQuery(name = "SysModule.findByDelFlag", query = "SELECT s FROM SysModule s WHERE s.delFlag = :delFlag"),
    @NamedQuery(name = "SysModule.findByCreateTime", query = "SELECT s FROM SysModule s WHERE s.createTime = :createTime"),
    @NamedQuery(name = "SysModule.findByCreateUserId", query = "SELECT s FROM SysModule s WHERE s.createUserId = :createUserId"),
    @NamedQuery(name = "SysModule.findByLastUpdateTime", query = "SELECT s FROM SysModule s WHERE s.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "SysModule.findByLastUpdateUserId", query = "SELECT s FROM SysModule s WHERE s.lastUpdateUserId = :lastUpdateUserId")})
public class SysModule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Url")
    private String url;
    @Column(name = "Description")
    private String description;
    @Column(name = "DisplayName")
    private String displayName;
    @Column(name = "EnglishName")
    private String englishName;
    @Column(name = "ImgUrl")
    private String imgUrl;
    @Column(name = "GroupId")
    private String groupId;
    @Column(name = "DataSort")
    private Integer dataSort;
    @Column(name = "DataStatus")
    private Integer dataStatus;
    @Column(name = "DelFlag")
    private Short delFlag;
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

    public SysModule() {
    }

    public SysModule(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getDataSort() {
        return dataSort;
    }

    public void setDataSort(Integer dataSort) {
        this.dataSort = dataSort;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
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
        if (!(object instanceof SysModule)) {
            return false;
        }
        SysModule other = (SysModule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysModule[ id=" + id + " ]";
    }
    
}
