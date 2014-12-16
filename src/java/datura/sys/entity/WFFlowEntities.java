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
@Table(name = "WF_FlowEntities")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WFFlowEntities.findAll", query = "SELECT w FROM WFFlowEntities w"),
    @NamedQuery(name = "WFFlowEntities.findById", query = "SELECT w FROM WFFlowEntities w WHERE w.id = :id"),
    @NamedQuery(name = "WFFlowEntities.findByEntityId", query = "SELECT w FROM WFFlowEntities w WHERE w.entityId = :entityId"),
    @NamedQuery(name = "WFFlowEntities.findByFlowId", query = "SELECT w FROM WFFlowEntities w WHERE w.flowId = :flowId"),
    @NamedQuery(name = "WFFlowEntities.findByFlowTypeCode", query = "SELECT w FROM WFFlowEntities w WHERE w.flowTypeCode = :flowTypeCode"),
    @NamedQuery(name = "WFFlowEntities.findBySystemName", query = "SELECT w FROM WFFlowEntities w WHERE w.systemName = :systemName"),
    @NamedQuery(name = "WFFlowEntities.findByCreateUserId", query = "SELECT w FROM WFFlowEntities w WHERE w.createUserId = :createUserId"),
    @NamedQuery(name = "WFFlowEntities.findByCreateDataTime", query = "SELECT w FROM WFFlowEntities w WHERE w.createDataTime = :createDataTime")})
public class WFFlowEntities implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "EntityId")
    private String entityId;
    @Column(name = "FlowId")
    private String flowId;
    @Lob
    @Column(name = "FlowTypeName")
    private String flowTypeName;
    @Column(name = "FlowTypeCode")
    private String flowTypeCode;
    @Column(name = "SystemName")
    private String systemName;
    @Column(name = "CreateUserId")
    private String createUserId;
    @Column(name = "CreateDataTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDataTime;
    @Lob
    @Column(name = "FlowModelName")
    private String flowModelName;

    public WFFlowEntities() {
    }

    public WFFlowEntities(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getFlowTypeName() {
        return flowTypeName;
    }

    public void setFlowTypeName(String flowTypeName) {
        this.flowTypeName = flowTypeName;
    }

    public String getFlowTypeCode() {
        return flowTypeCode;
    }

    public void setFlowTypeCode(String flowTypeCode) {
        this.flowTypeCode = flowTypeCode;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateDataTime() {
        return createDataTime;
    }

    public void setCreateDataTime(Date createDataTime) {
        this.createDataTime = createDataTime;
    }

    public String getFlowModelName() {
        return flowModelName;
    }

    public void setFlowModelName(String flowModelName) {
        this.flowModelName = flowModelName;
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
        if (!(object instanceof WFFlowEntities)) {
            return false;
        }
        WFFlowEntities other = (WFFlowEntities) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.WFFlowEntities[ id=" + id + " ]";
    }
    
}
