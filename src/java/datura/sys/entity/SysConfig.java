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
@Table(name = "Sys_Config")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysConfig.findAll", query = "SELECT s FROM SysConfig s"),
    @NamedQuery(name = "SysConfig.findById", query = "SELECT s FROM SysConfig s WHERE s.id = :id"),
    @NamedQuery(name = "SysConfig.findByModuleGroupId", query = "SELECT s FROM SysConfig s WHERE s.moduleGroupId = :moduleGroupId"),
    @NamedQuery(name = "SysConfig.findByName", query = "SELECT s FROM SysConfig s WHERE s.name = :name"),
    @NamedQuery(name = "SysConfig.findByStyle", query = "SELECT s FROM SysConfig s WHERE s.style = :style"),
    @NamedQuery(name = "SysConfig.findByCanAddOrDelete", query = "SELECT s FROM SysConfig s WHERE s.canAddOrDelete = :canAddOrDelete"),
    @NamedQuery(name = "SysConfig.findByCustomCategoryId", query = "SELECT s FROM SysConfig s WHERE s.customCategoryId = :customCategoryId"),
    @NamedQuery(name = "SysConfig.findByDescription", query = "SELECT s FROM SysConfig s WHERE s.description = :description"),
    @NamedQuery(name = "SysConfig.findByGroupName", query = "SELECT s FROM SysConfig s WHERE s.groupName = :groupName")})
public class SysConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "ModuleGroupId")
    private String moduleGroupId;
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Style")
    private int style;
    @Basic(optional = false)
    @Column(name = "CanAddOrDelete")
    private short canAddOrDelete;
    @Column(name = "CustomCategoryId")
    private String customCategoryId;
    @Lob
    @Column(name = "JsonData")
    private String jsonData;
    @Column(name = "Description")
    private String description;
    @Column(name = "GroupName")
    private String groupName;

    public SysConfig() {
    }

    public SysConfig(String id) {
        this.id = id;
    }

    public SysConfig(String id, int style, short canAddOrDelete) {
        this.id = id;
        this.style = style;
        this.canAddOrDelete = canAddOrDelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleGroupId() {
        return moduleGroupId;
    }

    public void setModuleGroupId(String moduleGroupId) {
        this.moduleGroupId = moduleGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public short getCanAddOrDelete() {
        return canAddOrDelete;
    }

    public void setCanAddOrDelete(short canAddOrDelete) {
        this.canAddOrDelete = canAddOrDelete;
    }

    public String getCustomCategoryId() {
        return customCategoryId;
    }

    public void setCustomCategoryId(String customCategoryId) {
        this.customCategoryId = customCategoryId;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
        if (!(object instanceof SysConfig)) {
            return false;
        }
        SysConfig other = (SysConfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysConfig[ id=" + id + " ]";
    }
    
}
