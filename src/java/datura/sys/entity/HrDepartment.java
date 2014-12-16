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
@Table(name = "Hr_Department")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HrDepartment.findAll", query = "SELECT h FROM HrDepartment h"),
    @NamedQuery(name = "HrDepartment.findById", query = "SELECT h FROM HrDepartment h WHERE h.id = :id"),
    @NamedQuery(name = "HrDepartment.findByName", query = "SELECT h FROM HrDepartment h WHERE h.name = :name"),
    @NamedQuery(name = "HrDepartment.findByDeptmentType", query = "SELECT h FROM HrDepartment h WHERE h.deptmentType = :deptmentType"),
    @NamedQuery(name = "HrDepartment.findByAreaCode", query = "SELECT h FROM HrDepartment h WHERE h.areaCode = :areaCode"),
    @NamedQuery(name = "HrDepartment.findByRootId", query = "SELECT h FROM HrDepartment h WHERE h.rootId = :rootId"),
    @NamedQuery(name = "HrDepartment.findByParentId", query = "SELECT h FROM HrDepartment h WHERE h.parentId = :parentId"),
    @NamedQuery(name = "HrDepartment.findByVisitLevel", query = "SELECT h FROM HrDepartment h WHERE h.visitLevel = :visitLevel"),
    @NamedQuery(name = "HrDepartment.findByDelFlag", query = "SELECT h FROM HrDepartment h WHERE h.delFlag = :delFlag")})
public class HrDepartment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @Lob
    @Column(name = "Description")
    private String description;
    @Column(name = "DeptmentType")
    private Integer deptmentType;
    @Column(name = "AreaCode")
    private String areaCode;
    @Column(name = "RootId")
    private String rootId;
    @Column(name = "ParentId")
    private String parentId;
    @Column(name = "VisitLevel")
    private Integer visitLevel;
    @Lob
    @Column(name = "VisitPath")
    private String visitPath;
    @Column(name = "DelFlag")
    private Short delFlag;

    public HrDepartment() {
    }

    public HrDepartment(String id) {
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

    public Integer getDeptmentType() {
        return deptmentType;
    }

    public void setDeptmentType(Integer deptmentType) {
        this.deptmentType = deptmentType;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
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
        if (!(object instanceof HrDepartment)) {
            return false;
        }
        HrDepartment other = (HrDepartment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.HrDepartment[ id=" + id + " ]";
    }
    
}
