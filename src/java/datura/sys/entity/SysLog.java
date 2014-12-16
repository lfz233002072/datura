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
@Table(name = "Sys_Log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysLog.findAll", query = "SELECT s FROM SysLog s"),
    @NamedQuery(name = "SysLog.findById", query = "SELECT s FROM SysLog s WHERE s.id = :id"),
    @NamedQuery(name = "SysLog.findByLogType", query = "SELECT s FROM SysLog s WHERE s.logType = :logType"),
    @NamedQuery(name = "SysLog.findByName", query = "SELECT s FROM SysLog s WHERE s.name = :name"),
    @NamedQuery(name = "SysLog.findByReferrerUrl", query = "SELECT s FROM SysLog s WHERE s.referrerUrl = :referrerUrl"),
    @NamedQuery(name = "SysLog.findByRequestUrl", query = "SELECT s FROM SysLog s WHERE s.requestUrl = :requestUrl"),
    @NamedQuery(name = "SysLog.findByMac", query = "SELECT s FROM SysLog s WHERE s.mac = :mac"),
    @NamedQuery(name = "SysLog.findByIp", query = "SELECT s FROM SysLog s WHERE s.ip = :ip"),
    @NamedQuery(name = "SysLog.findByCreateTime", query = "SELECT s FROM SysLog s WHERE s.createTime = :createTime"),
    @NamedQuery(name = "SysLog.findByCreateUserId", query = "SELECT s FROM SysLog s WHERE s.createUserId = :createUserId")})
public class SysLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "LogType")
    private Integer logType;
    @Column(name = "Name")
    private String name;
    @Lob
    @Column(name = "ShortMessage")
    private String shortMessage;
    @Lob
    @Column(name = "FullMessage")
    private String fullMessage;
    @Column(name = "ReferrerUrl")
    private String referrerUrl;
    @Column(name = "RequestUrl")
    private String requestUrl;
    @Column(name = "MAC")
    private String mac;
    @Column(name = "IP")
    private String ip;
    @Column(name = "CreateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "CreateUserId")
    private String createUserId;

    public SysLog() {
    }

    public SysLog(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public String getFullMessage() {
        return fullMessage;
    }

    public void setFullMessage(String fullMessage) {
        this.fullMessage = fullMessage;
    }

    public String getReferrerUrl() {
        return referrerUrl;
    }

    public void setReferrerUrl(String referrerUrl) {
        this.referrerUrl = referrerUrl;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
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
        if (!(object instanceof SysLog)) {
            return false;
        }
        SysLog other = (SysLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysLog[ id=" + id + " ]";
    }
    
}
