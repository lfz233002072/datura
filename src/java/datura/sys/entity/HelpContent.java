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
import javax.persistence.Lob;
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
@Table(name = "HelpContent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HelpContent.findAll", query = "SELECT h FROM HelpContent h"),
    @NamedQuery(name = "HelpContent.findById", query = "SELECT h FROM HelpContent h WHERE h.id = :id"),
    @NamedQuery(name = "HelpContent.findByName", query = "SELECT h FROM HelpContent h WHERE h.name = :name"),
    @NamedQuery(name = "HelpContent.findByUrl", query = "SELECT h FROM HelpContent h WHERE h.url = :url"),
    @NamedQuery(name = "HelpContent.findByTitle", query = "SELECT h FROM HelpContent h WHERE h.title = :title"),
    @NamedQuery(name = "HelpContent.findByIcon", query = "SELECT h FROM HelpContent h WHERE h.icon = :icon"),
    @NamedQuery(name = "HelpContent.findByDataSort", query = "SELECT h FROM HelpContent h WHERE h.dataSort = :dataSort"),
    @NamedQuery(name = "HelpContent.findByCreateTime", query = "SELECT h FROM HelpContent h WHERE h.createTime = :createTime"),
    @NamedQuery(name = "HelpContent.findByCategoryId", query = "SELECT h FROM HelpContent h WHERE h.categoryId = :categoryId")})
public class HelpContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
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
    @Column(name = "CreateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "CategoryId")
    private String categoryId;

    public HelpContent() {
    }

    public HelpContent(String id) {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
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
        if (!(object instanceof HelpContent)) {
            return false;
        }
        HelpContent other = (HelpContent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.HelpContent[ id=" + id + " ]";
    }
    
}
