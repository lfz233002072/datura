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
@Table(name = "T_HW_Condition")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWCondition.findAll", query = "SELECT t FROM THWCondition t"),
    @NamedQuery(name = "THWCondition.findById", query = "SELECT t FROM THWCondition t WHERE t.id = :id"),
    @NamedQuery(name = "THWCondition.findByProCode", query = "SELECT t FROM THWCondition t WHERE t.proCode = :proCode"),
    @NamedQuery(name = "THWCondition.findBySpeciality", query = "SELECT t FROM THWCondition t WHERE t.speciality = :speciality"),
    @NamedQuery(name = "THWCondition.findByExtractPersons", query = "SELECT t FROM THWCondition t WHERE t.extractPersons = :extractPersons"),
    @NamedQuery(name = "THWCondition.findByJoinPersons", query = "SELECT t FROM THWCondition t WHERE t.joinPersons = :joinPersons"),
    @NamedQuery(name = "THWCondition.findByActualPersons", query = "SELECT t FROM THWCondition t WHERE t.actualPersons = :actualPersons"),
    @NamedQuery(name = "THWCondition.findByCreateDate", query = "SELECT t FROM THWCondition t WHERE t.createDate = :createDate")})
public class THWCondition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "ProCode")
    private Integer proCode;
    @Column(name = "Speciality")
    private String speciality;
    @Column(name = "ExtractPersons")
    private Integer extractPersons;
    @Column(name = "JoinPersons")
    private Integer joinPersons;
    @Column(name = "ActualPersons")
    private Integer actualPersons;
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public THWCondition() {
    }

    public THWCondition(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProCode() {
        return proCode;
    }

    public void setProCode(Integer proCode) {
        this.proCode = proCode;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getExtractPersons() {
        return extractPersons;
    }

    public void setExtractPersons(Integer extractPersons) {
        this.extractPersons = extractPersons;
    }

    public Integer getJoinPersons() {
        return joinPersons;
    }

    public void setJoinPersons(Integer joinPersons) {
        this.joinPersons = joinPersons;
    }

    public Integer getActualPersons() {
        return actualPersons;
    }

    public void setActualPersons(Integer actualPersons) {
        this.actualPersons = actualPersons;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        if (!(object instanceof THWCondition)) {
            return false;
        }
        THWCondition other = (THWCondition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWCondition[ id=" + id + " ]";
    }
    
}
