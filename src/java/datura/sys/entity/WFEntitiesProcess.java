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
@Table(name = "WF_EntitiesProcess")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WFEntitiesProcess.findAll", query = "SELECT w FROM WFEntitiesProcess w"),
    @NamedQuery(name = "WFEntitiesProcess.findById", query = "SELECT w FROM WFEntitiesProcess w WHERE w.id = :id"),
    @NamedQuery(name = "WFEntitiesProcess.findByEntityId", query = "SELECT w FROM WFEntitiesProcess w WHERE w.entityId = :entityId"),
    @NamedQuery(name = "WFEntitiesProcess.findByFlowId", query = "SELECT w FROM WFEntitiesProcess w WHERE w.flowId = :flowId"),
    @NamedQuery(name = "WFEntitiesProcess.findByNodeId", query = "SELECT w FROM WFEntitiesProcess w WHERE w.nodeId = :nodeId"),
    @NamedQuery(name = "WFEntitiesProcess.findBySender", query = "SELECT w FROM WFEntitiesProcess w WHERE w.sender = :sender"),
    @NamedQuery(name = "WFEntitiesProcess.findBySubmitOrReturn", query = "SELECT w FROM WFEntitiesProcess w WHERE w.submitOrReturn = :submitOrReturn"),
    @NamedQuery(name = "WFEntitiesProcess.findBySendTime", query = "SELECT w FROM WFEntitiesProcess w WHERE w.sendTime = :sendTime"),
    @NamedQuery(name = "WFEntitiesProcess.findByParentNodeId", query = "SELECT w FROM WFEntitiesProcess w WHERE w.parentNodeId = :parentNodeId"),
    @NamedQuery(name = "WFEntitiesProcess.findBySystemName", query = "SELECT w FROM WFEntitiesProcess w WHERE w.systemName = :systemName")})
public class WFEntitiesProcess implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "EntityId")
    private String entityId;
    @Column(name = "FlowId")
    private String flowId;
    @Column(name = "NodeId")
    private String nodeId;
    @Lob
    @Column(name = "NodeCode")
    private String nodeCode;
    @Lob
    @Column(name = "NodeName")
    private String nodeName;
    @Column(name = "Sender")
    private String sender;
    @Lob
    @Column(name = "SenderName")
    private String senderName;
    @Column(name = "SubmitOrReturn")
    private Short submitOrReturn;
    @Column(name = "SendTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendTime;
    @Column(name = "ParentNodeId")
    private String parentNodeId;
    @Lob
    @Column(name = "EntitiesType")
    private String entitiesType;
    @Column(name = "SystemName")
    private String systemName;

    public WFEntitiesProcess() {
    }

    public WFEntitiesProcess(String id) {
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

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Short getSubmitOrReturn() {
        return submitOrReturn;
    }

    public void setSubmitOrReturn(Short submitOrReturn) {
        this.submitOrReturn = submitOrReturn;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public String getEntitiesType() {
        return entitiesType;
    }

    public void setEntitiesType(String entitiesType) {
        this.entitiesType = entitiesType;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
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
        if (!(object instanceof WFEntitiesProcess)) {
            return false;
        }
        WFEntitiesProcess other = (WFEntitiesProcess) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.WFEntitiesProcess[ id=" + id + " ]";
    }
    
}
