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
@Table(name = "Sys_LogData")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysLogData.findAll", query = "SELECT s FROM SysLogData s"),
    @NamedQuery(name = "SysLogData.findById", query = "SELECT s FROM SysLogData s WHERE s.id = :id"),
    @NamedQuery(name = "SysLogData.findByLogId", query = "SELECT s FROM SysLogData s WHERE s.logId = :logId"),
    @NamedQuery(name = "SysLogData.findByDisplayName", query = "SELECT s FROM SysLogData s WHERE s.displayName = :displayName"),
    @NamedQuery(name = "SysLogData.findByEntityID", query = "SELECT s FROM SysLogData s WHERE s.entityID = :entityID"),
    @NamedQuery(name = "SysLogData.findByTableDisplayName", query = "SELECT s FROM SysLogData s WHERE s.tableDisplayName = :tableDisplayName"),
    @NamedQuery(name = "SysLogData.findByTableName", query = "SELECT s FROM SysLogData s WHERE s.tableName = :tableName"),
    @NamedQuery(name = "SysLogData.findByOperationType", query = "SELECT s FROM SysLogData s WHERE s.operationType = :operationType"),
    @NamedQuery(name = "SysLogData.findByAssemblyQualifiedName", query = "SELECT s FROM SysLogData s WHERE s.assemblyQualifiedName = :assemblyQualifiedName")})
public class SysLogData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "LogId")
    private String logId;
    @Column(name = "DisplayName")
    private String displayName;
    @Column(name = "EntityID")
    private String entityID;
    @Column(name = "TableDisplayName")
    private String tableDisplayName;
    @Column(name = "TableName")
    private String tableName;
    @Lob
    @Column(name = "OldData")
    private String oldData;
    @Lob
    @Column(name = "NewData")
    private String newData;
    @Column(name = "OperationType")
    private Integer operationType;
    @Column(name = "AssemblyQualifiedName")
    private String assemblyQualifiedName;

    public SysLogData() {
    }

    public SysLogData(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getTableDisplayName() {
        return tableDisplayName;
    }

    public void setTableDisplayName(String tableDisplayName) {
        this.tableDisplayName = tableDisplayName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getOldData() {
        return oldData;
    }

    public void setOldData(String oldData) {
        this.oldData = oldData;
    }

    public String getNewData() {
        return newData;
    }

    public void setNewData(String newData) {
        this.newData = newData;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public String getAssemblyQualifiedName() {
        return assemblyQualifiedName;
    }

    public void setAssemblyQualifiedName(String assemblyQualifiedName) {
        this.assemblyQualifiedName = assemblyQualifiedName;
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
        if (!(object instanceof SysLogData)) {
            return false;
        }
        SysLogData other = (SysLogData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysLogData[ id=" + id + " ]";
    }
    
}
