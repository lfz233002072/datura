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
@Table(name = "Sys_ModuleGroup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysModuleGroup.findAll", query = "SELECT s FROM SysModuleGroup s"),
    @NamedQuery(name = "SysModuleGroup.findById", query = "SELECT s FROM SysModuleGroup s WHERE s.id = :id"),
    @NamedQuery(name = "SysModuleGroup.findByDescription", query = "SELECT s FROM SysModuleGroup s WHERE s.description = :description"),
    @NamedQuery(name = "SysModuleGroup.findByDisplayName", query = "SELECT s FROM SysModuleGroup s WHERE s.displayName = :displayName"),
    @NamedQuery(name = "SysModuleGroup.findByEnglishName", query = "SELECT s FROM SysModuleGroup s WHERE s.englishName = :englishName"),
    @NamedQuery(name = "SysModuleGroup.findByImgUrl", query = "SELECT s FROM SysModuleGroup s WHERE s.imgUrl = :imgUrl"),
    @NamedQuery(name = "SysModuleGroup.findByVisitLevel", query = "SELECT s FROM SysModuleGroup s WHERE s.visitLevel = :visitLevel"),
    @NamedQuery(name = "SysModuleGroup.findByVisitPath", query = "SELECT s FROM SysModuleGroup s WHERE s.visitPath = :visitPath"),
    @NamedQuery(name = "SysModuleGroup.findByRootId", query = "SELECT s FROM SysModuleGroup s WHERE s.rootId = :rootId"),
    @NamedQuery(name = "SysModuleGroup.findByParentId", query = "SELECT s FROM SysModuleGroup s WHERE s.parentId = :parentId"),
    @NamedQuery(name = "SysModuleGroup.findByDataSort", query = "SELECT s FROM SysModuleGroup s WHERE s.dataSort = :dataSort"),
    @NamedQuery(name = "SysModuleGroup.findByDataStatus", query = "SELECT s FROM SysModuleGroup s WHERE s.dataStatus = :dataStatus"),
    @NamedQuery(name = "SysModuleGroup.findByDelFlag", query = "SELECT s FROM SysModuleGroup s WHERE s.delFlag = :delFlag"),
    @NamedQuery(name = "SysModuleGroup.findByCreateTime", query = "SELECT s FROM SysModuleGroup s WHERE s.createTime = :createTime"),
    @NamedQuery(name = "SysModuleGroup.findByCreateUserId", query = "SELECT s FROM SysModuleGroup s WHERE s.createUserId = :createUserId"),
    @NamedQuery(name = "SysModuleGroup.findByLastUpdateTime", query = "SELECT s FROM SysModuleGroup s WHERE s.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "SysModuleGroup.findByLastUpdateUserId", query = "SELECT s FROM SysModuleGroup s WHERE s.lastUpdateUserId = :lastUpdateUserId")})
public class SysModuleGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Description")
    private String description;
    @Column(name = "DisplayName")
    private String displayName;
    @Column(name = "EnglishName")
    private String englishName;
    @Column(name = "ImgUrl")
    private String imgUrl;
    @Column(name = "VisitLevel")
    private Integer visitLevel;
    @Column(name = "VisitPath")
    private String visitPath;
    @Column(name = "RootId")
    private String rootId;
    @Column(name = "ParentId")
    private String parentId;
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

    public SysModuleGroup() {
    }

    public SysModuleGroup(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getVisitLevel() {
        return visitLevel;
    }

    public void setVisitLevel(Integer visitLevel) {
        this.visitLevel = visitLevel;
    }

    public String getVisitPath() {
        return visitPath;
    }

    public void setVisitPath(String visitPath) {
        this.visitPath = visitPath;
    }

    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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
        if (!(object instanceof SysModuleGroup)) {
            return false;
        }
        SysModuleGroup other = (SysModuleGroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysModuleGroup[ id=" + id + " ]";
    }
    
}
