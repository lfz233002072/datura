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
@Table(name = "Sys_ConfigCategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysConfigCategory.findAll", query = "SELECT s FROM SysConfigCategory s"),
    @NamedQuery(name = "SysConfigCategory.findById", query = "SELECT s FROM SysConfigCategory s WHERE s.id = :id"),
    @NamedQuery(name = "SysConfigCategory.findByName", query = "SELECT s FROM SysConfigCategory s WHERE s.name = :name"),
    @NamedQuery(name = "SysConfigCategory.findByDescription", query = "SELECT s FROM SysConfigCategory s WHERE s.description = :description"),
    @NamedQuery(name = "SysConfigCategory.findByDataSort", query = "SELECT s FROM SysConfigCategory s WHERE s.dataSort = :dataSort")})
public class SysConfigCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @Column(name = "DataSort")
    private int dataSort;

    public SysConfigCategory() {
    }

    public SysConfigCategory(String id) {
        this.id = id;
    }

    public SysConfigCategory(String id, int dataSort) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDataSort() {
        return dataSort;
    }

    public void setDataSort(int dataSort) {
        this.dataSort = dataSort;
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
        if (!(object instanceof SysConfigCategory)) {
            return false;
        }
        SysConfigCategory other = (SysConfigCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysConfigCategory[ id=" + id + " ]";
    }
    
}
