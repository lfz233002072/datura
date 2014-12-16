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
@Table(name = "Sys_ConfigAttachment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysConfigAttachment.findAll", query = "SELECT s FROM SysConfigAttachment s"),
    @NamedQuery(name = "SysConfigAttachment.findById", query = "SELECT s FROM SysConfigAttachment s WHERE s.id = :id"),
    @NamedQuery(name = "SysConfigAttachment.findByDescription", query = "SELECT s FROM SysConfigAttachment s WHERE s.description = :description"),
    @NamedQuery(name = "SysConfigAttachment.findByName", query = "SELECT s FROM SysConfigAttachment s WHERE s.name = :name"),
    @NamedQuery(name = "SysConfigAttachment.findByCode", query = "SELECT s FROM SysConfigAttachment s WHERE s.code = :code"),
    @NamedQuery(name = "SysConfigAttachment.findByFileExtensions", query = "SELECT s FROM SysConfigAttachment s WHERE s.fileExtensions = :fileExtensions"),
    @NamedQuery(name = "SysConfigAttachment.findByMaxSize", query = "SELECT s FROM SysConfigAttachment s WHERE s.maxSize = :maxSize"),
    @NamedQuery(name = "SysConfigAttachment.findBySingleOrMulti", query = "SELECT s FROM SysConfigAttachment s WHERE s.singleOrMulti = :singleOrMulti"),
    @NamedQuery(name = "SysConfigAttachment.findByDataSort", query = "SELECT s FROM SysConfigAttachment s WHERE s.dataSort = :dataSort"),
    @NamedQuery(name = "SysConfigAttachment.findByVisitLevel", query = "SELECT s FROM SysConfigAttachment s WHERE s.visitLevel = :visitLevel"),
    @NamedQuery(name = "SysConfigAttachment.findByVisitPath", query = "SELECT s FROM SysConfigAttachment s WHERE s.visitPath = :visitPath"),
    @NamedQuery(name = "SysConfigAttachment.findByRootId", query = "SELECT s FROM SysConfigAttachment s WHERE s.rootId = :rootId"),
    @NamedQuery(name = "SysConfigAttachment.findByParentId", query = "SELECT s FROM SysConfigAttachment s WHERE s.parentId = :parentId")})
public class SysConfigAttachment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Description")
    private String description;
    @Column(name = "Name")
    private String name;
    @Column(name = "Code")
    private String code;
    @Column(name = "FileExtensions")
    private String fileExtensions;
    @Column(name = "MaxSize")
    private String maxSize;
    @Column(name = "SingleOrMulti")
    private Short singleOrMulti;
    @Column(name = "DataSort")
    private Integer dataSort;
    @Column(name = "VisitLevel")
    private Integer visitLevel;
    @Column(name = "VisitPath")
    private String visitPath;
    @Column(name = "RootId")
    private String rootId;
    @Column(name = "ParentId")
    private String parentId;

    public SysConfigAttachment() {
    }

    public SysConfigAttachment(String id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFileExtensions() {
        return fileExtensions;
    }

    public void setFileExtensions(String fileExtensions) {
        this.fileExtensions = fileExtensions;
    }

    public String getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    public Short getSingleOrMulti() {
        return singleOrMulti;
    }

    public void setSingleOrMulti(Short singleOrMulti) {
        this.singleOrMulti = singleOrMulti;
    }

    public Integer getDataSort() {
        return dataSort;
    }

    public void setDataSort(Integer dataSort) {
        this.dataSort = dataSort;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysConfigAttachment)) {
            return false;
        }
        SysConfigAttachment other = (SysConfigAttachment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysConfigAttachment[ id=" + id + " ]";
    }
    
}
