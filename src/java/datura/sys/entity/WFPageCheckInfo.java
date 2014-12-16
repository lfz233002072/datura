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
@Table(name = "WF_PageCheckInfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WFPageCheckInfo.findAll", query = "SELECT w FROM WFPageCheckInfo w"),
    @NamedQuery(name = "WFPageCheckInfo.findById", query = "SELECT w FROM WFPageCheckInfo w WHERE w.id = :id"),
    @NamedQuery(name = "WFPageCheckInfo.findByEntityId", query = "SELECT w FROM WFPageCheckInfo w WHERE w.entityId = :entityId"),
    @NamedQuery(name = "WFPageCheckInfo.findByFlowId", query = "SELECT w FROM WFPageCheckInfo w WHERE w.flowId = :flowId"),
    @NamedQuery(name = "WFPageCheckInfo.findByNodeId", query = "SELECT w FROM WFPageCheckInfo w WHERE w.nodeId = :nodeId"),
    @NamedQuery(name = "WFPageCheckInfo.findByNodeCode", query = "SELECT w FROM WFPageCheckInfo w WHERE w.nodeCode = :nodeCode"),
    @NamedQuery(name = "WFPageCheckInfo.findByCheckStatu", query = "SELECT w FROM WFPageCheckInfo w WHERE w.checkStatu = :checkStatu"),
    @NamedQuery(name = "WFPageCheckInfo.findByCheckTime", query = "SELECT w FROM WFPageCheckInfo w WHERE w.checkTime = :checkTime"),
    @NamedQuery(name = "WFPageCheckInfo.findByCheckUserId", query = "SELECT w FROM WFPageCheckInfo w WHERE w.checkUserId = :checkUserId"),
    @NamedQuery(name = "WFPageCheckInfo.findBySystemName", query = "SELECT w FROM WFPageCheckInfo w WHERE w.systemName = :systemName"),
    @NamedQuery(name = "WFPageCheckInfo.findByChildProcessId", query = "SELECT w FROM WFPageCheckInfo w WHERE w.childProcessId = :childProcessId"),
    @NamedQuery(name = "WFPageCheckInfo.findByCheckFileId", query = "SELECT w FROM WFPageCheckInfo w WHERE w.checkFileId = :checkFileId")})
public class WFPageCheckInfo implements Serializable {
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
    @Column(name = "NodeCode")
    private String nodeCode;
    @Lob
    @Column(name = "CheckInfo")
    private String checkInfo;
    @Column(name = "CheckStatu")
    private String checkStatu;
    @Column(name = "CheckTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkTime;
    @Column(name = "CheckUserId")
    private String checkUserId;
    @Lob
    @Column(name = "CheckUserName")
    private String checkUserName;
    @Column(name = "SystemName")
    private String systemName;
    @Column(name = "ChildProcessId")
    private String childProcessId;
    @Column(name = "CheckFileId")
    private String checkFileId;

    public WFPageCheckInfo() {
    }

    public WFPageCheckInfo(String id) {
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

    public String getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(String checkInfo) {
        this.checkInfo = checkInfo;
    }

    public String getCheckStatu() {
        return checkStatu;
    }

    public void setCheckStatu(String checkStatu) {
        this.checkStatu = checkStatu;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getChildProcessId() {
        return childProcessId;
    }

    public void setChildProcessId(String childProcessId) {
        this.childProcessId = childProcessId;
    }

    public String getCheckFileId() {
        return checkFileId;
    }

    public void setCheckFileId(String checkFileId) {
        this.checkFileId = checkFileId;
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
        if (!(object instanceof WFPageCheckInfo)) {
            return false;
        }
        WFPageCheckInfo other = (WFPageCheckInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.WFPageCheckInfo[ id=" + id + " ]";
    }
    
}
