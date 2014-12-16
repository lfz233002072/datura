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
@Table(name = "HelpCategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HelpCategory.findAll", query = "SELECT h FROM HelpCategory h"),
    @NamedQuery(name = "HelpCategory.findById", query = "SELECT h FROM HelpCategory h WHERE h.id = :id"),
    @NamedQuery(name = "HelpCategory.findByCategoryName", query = "SELECT h FROM HelpCategory h WHERE h.categoryName = :categoryName"),
    @NamedQuery(name = "HelpCategory.findByUrl", query = "SELECT h FROM HelpCategory h WHERE h.url = :url"),
    @NamedQuery(name = "HelpCategory.findByTitle", query = "SELECT h FROM HelpCategory h WHERE h.title = :title"),
    @NamedQuery(name = "HelpCategory.findByIcon", query = "SELECT h FROM HelpCategory h WHERE h.icon = :icon"),
    @NamedQuery(name = "HelpCategory.findByDataSort", query = "SELECT h FROM HelpCategory h WHERE h.dataSort = :dataSort"),
    @NamedQuery(name = "HelpCategory.findByParentId", query = "SELECT h FROM HelpCategory h WHERE h.parentId = :parentId")})
public class HelpCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "CategoryName")
    private String categoryName;
    @Column(name = "Url")
    private String url;
    @Column(name = "Title")
    private String title;
    @Lob
    @Column(name = "ShortDescrption")
    private String shortDescrption;
    @Lob
    @Column(name = "Descrption")
    private String descrption;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "DataSort")
    private Integer dataSort;
    @Column(name = "ParentId")
    private String parentId;

    public HelpCategory() {
    }

    public HelpCategory(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescrption() {
        return shortDescrption;
    }

    public void setShortDescrption(String shortDescrption) {
        this.shortDescrption = shortDescrption;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getDataSort() {
        return dataSort;
    }

    public void setDataSort(Integer dataSort) {
        this.dataSort = dataSort;
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
        if (!(object instanceof HelpCategory)) {
            return false;
        }
        HelpCategory other = (HelpCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.HelpCategory[ id=" + id + " ]";
    }
    
}
