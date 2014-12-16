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
@Table(name = "WF_Test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WFTest.findAll", query = "SELECT w FROM WFTest w"),
    @NamedQuery(name = "WFTest.findById", query = "SELECT w FROM WFTest w WHERE w.id = :id"),
    @NamedQuery(name = "WFTest.findByName", query = "SELECT w FROM WFTest w WHERE w.name = :name"),
    @NamedQuery(name = "WFTest.findByCreateDate", query = "SELECT w FROM WFTest w WHERE w.createDate = :createDate"),
    @NamedQuery(name = "WFTest.findByFlowStep", query = "SELECT w FROM WFTest w WHERE w.flowStep = :flowStep")})
public class WFTest implements Serializable {
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
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "FlowStep")
    private String flowStep;

    public WFTest() {
    }

    public WFTest(String id) {
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFlowStep() {
        return flowStep;
    }

    public void setFlowStep(String flowStep) {
        this.flowStep = flowStep;
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
        if (!(object instanceof WFTest)) {
            return false;
        }
        WFTest other = (WFTest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.WFTest[ id=" + id + " ]";
    }
    
}
