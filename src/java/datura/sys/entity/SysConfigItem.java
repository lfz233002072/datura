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
@Table(name = "Sys_ConfigItem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysConfigItem.findAll", query = "SELECT s FROM SysConfigItem s"),
    @NamedQuery(name = "SysConfigItem.findById", query = "SELECT s FROM SysConfigItem s WHERE s.id = :id"),
    @NamedQuery(name = "SysConfigItem.findByName", query = "SELECT s FROM SysConfigItem s WHERE s.name = :name"),
    @NamedQuery(name = "SysConfigItem.findByDisplayName", query = "SELECT s FROM SysConfigItem s WHERE s.displayName = :displayName"),
    @NamedQuery(name = "SysConfigItem.findByItemType", query = "SELECT s FROM SysConfigItem s WHERE s.itemType = :itemType"),
    @NamedQuery(name = "SysConfigItem.findByDataSourseType", query = "SELECT s FROM SysConfigItem s WHERE s.dataSourseType = :dataSourseType"),
    @NamedQuery(name = "SysConfigItem.findByDataSort", query = "SELECT s FROM SysConfigItem s WHERE s.dataSort = :dataSort"),
    @NamedQuery(name = "SysConfigItem.findByDataPrecision", query = "SELECT s FROM SysConfigItem s WHERE s.dataPrecision = :dataPrecision")})
public class SysConfigItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "DisplayName")
    private String displayName;
    @Lob
    @Column(name = "Value")
    private String value;
    @Column(name = "ItemType")
    private String itemType;
    @Column(name = "DataSourseType")
    private String dataSourseType;
    @Lob
    @Column(name = "DataSourseJsonData")
    private String dataSourseJsonData;
    @Basic(optional = false)
    @Column(name = "DataSort")
    private int dataSort;
    @Lob
    @Column(name = "CustomField")
    private String customField;
    @Column(name = "DataPrecision")
    private Integer dataPrecision;

    public SysConfigItem() {
    }

    public SysConfigItem(String id) {
        this.id = id;
    }

    public SysConfigItem(String id, int dataSort) {
        this.id = id;
        this.dataSort = dataSort;
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getDataSourseType() {
        return dataSourseType;
    }

    public void setDataSourseType(String dataSourseType) {
        this.dataSourseType = dataSourseType;
    }

    public String getDataSourseJsonData() {
        return dataSourseJsonData;
    }

    public void setDataSourseJsonData(String dataSourseJsonData) {
        this.dataSourseJsonData = dataSourseJsonData;
    }

    public int getDataSort() {
        return dataSort;
    }

    public void setDataSort(int dataSort) {
        this.dataSort = dataSort;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public Integer getDataPrecision() {
        return dataPrecision;
    }

    public void setDataPrecision(Integer dataPrecision) {
        this.dataPrecision = dataPrecision;
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
        if (!(object instanceof SysConfigItem)) {
            return false;
        }
        SysConfigItem other = (SysConfigItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysConfigItem[ id=" + id + " ]";
    }
    
}
