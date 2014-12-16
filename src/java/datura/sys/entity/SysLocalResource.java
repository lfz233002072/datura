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
@Table(name = "Sys_LocalResource")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysLocalResource.findAll", query = "SELECT s FROM SysLocalResource s"),
    @NamedQuery(name = "SysLocalResource.findById", query = "SELECT s FROM SysLocalResource s WHERE s.id = :id"),
    @NamedQuery(name = "SysLocalResource.findByName", query = "SELECT s FROM SysLocalResource s WHERE s.name = :name"),
    @NamedQuery(name = "SysLocalResource.findByDescription", query = "SELECT s FROM SysLocalResource s WHERE s.description = :description"),
    @NamedQuery(name = "SysLocalResource.findByCode", query = "SELECT s FROM SysLocalResource s WHERE s.code = :code"),
    @NamedQuery(name = "SysLocalResource.findByAttachmentSavePath", query = "SELECT s FROM SysLocalResource s WHERE s.attachmentSavePath = :attachmentSavePath"),
    @NamedQuery(name = "SysLocalResource.findByRootId", query = "SELECT s FROM SysLocalResource s WHERE s.rootId = :rootId"),
    @NamedQuery(name = "SysLocalResource.findByParentId", query = "SELECT s FROM SysLocalResource s WHERE s.parentId = :parentId"),
    @NamedQuery(name = "SysLocalResource.findByVisitLevel", query = "SELECT s FROM SysLocalResource s WHERE s.visitLevel = :visitLevel")})
public class SysLocalResource implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Lob
    @Column(name = "Content")
    private String content;
    @Column(name = "Code")
    private String code;
    @Column(name = "AttachmentSavePath")
    private String attachmentSavePath;
    @Column(name = "RootId")
    private String rootId;
    @Column(name = "ParentId")
    private String parentId;
    @Column(name = "VisitLevel")
    private Integer visitLevel;
    @Lob
    @Column(name = "VisitPath")
    private String visitPath;

    public SysLocalResource() {
    }

    public SysLocalResource(String id) {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAttachmentSavePath() {
        return attachmentSavePath;
    }

    public void setAttachmentSavePath(String attachmentSavePath) {
        this.attachmentSavePath = attachmentSavePath;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysLocalResource)) {
            return false;
        }
        SysLocalResource other = (SysLocalResource) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysLocalResource[ id=" + id + " ]";
    }
    
}
