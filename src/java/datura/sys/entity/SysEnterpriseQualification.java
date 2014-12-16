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
@Table(name = "Sys_EnterpriseQualification")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysEnterpriseQualification.findAll", query = "SELECT s FROM SysEnterpriseQualification s"),
    @NamedQuery(name = "SysEnterpriseQualification.findById", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.id = :id"),
    @NamedQuery(name = "SysEnterpriseQualification.findByDescription", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.description = :description"),
    @NamedQuery(name = "SysEnterpriseQualification.findByRootId", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.rootId = :rootId"),
    @NamedQuery(name = "SysEnterpriseQualification.findByParentId", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.parentId = :parentId"),
    @NamedQuery(name = "SysEnterpriseQualification.findByDataSort", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.dataSort = :dataSort"),
    @NamedQuery(name = "SysEnterpriseQualification.findByDelFlag", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.delFlag = :delFlag"),
    @NamedQuery(name = "SysEnterpriseQualification.findByVisitLevel", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.visitLevel = :visitLevel"),
    @NamedQuery(name = "SysEnterpriseQualification.findByName", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.name = :name"),
    @NamedQuery(name = "SysEnterpriseQualification.findByShortName", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.shortName = :shortName"),
    @NamedQuery(name = "SysEnterpriseQualification.findByCode", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.code = :code"),
    @NamedQuery(name = "SysEnterpriseQualification.findByCustomField1", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.customField1 = :customField1"),
    @NamedQuery(name = "SysEnterpriseQualification.findByCustomField2", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.customField2 = :customField2"),
    @NamedQuery(name = "SysEnterpriseQualification.findByHasChild", query = "SELECT s FROM SysEnterpriseQualification s WHERE s.hasChild = :hasChild")})
public class SysEnterpriseQualification implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Description")
    private String description;
    @Column(name = "RootId")
    private String rootId;
    @Column(name = "ParentId")
    private String parentId;
    @Column(name = "DataSort")
    private Integer dataSort;
    @Column(name = "DelFlag")
    private Short delFlag;
    @Column(name = "VisitLevel")
    private Integer visitLevel;
    @Lob
    @Column(name = "VisitPath")
    private String visitPath;
    @Column(name = "Name")
    private String name;
    @Column(name = "ShortName")
    private String shortName;
    @Column(name = "Code")
    private String code;
    @Lob
    @Column(name = "RuleExpression")
    private String ruleExpression;
    @Column(name = "CustomField1")
    private Integer customField1;
    @Column(name = "CustomField2")
    private String customField2;
    @Lob
    @Column(name = "CustomField3")
    private String customField3;
    @Column(name = "HasChild")
    private Short hasChild;

    public SysEnterpriseQualification() {
    }

    public SysEnterpriseQualification(String id) {
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

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRuleExpression() {
        return ruleExpression;
    }

    public void setRuleExpression(String ruleExpression) {
        this.ruleExpression = ruleExpression;
    }

    public Integer getCustomField1() {
        return customField1;
    }

    public void setCustomField1(Integer customField1) {
        this.customField1 = customField1;
    }

    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    public String getCustomField3() {
        return customField3;
    }

    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }

    public Short getHasChild() {
        return hasChild;
    }

    public void setHasChild(Short hasChild) {
        this.hasChild = hasChild;
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
        if (!(object instanceof SysEnterpriseQualification)) {
            return false;
        }
        SysEnterpriseQualification other = (SysEnterpriseQualification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysEnterpriseQualification[ id=" + id + " ]";
    }
    
}
