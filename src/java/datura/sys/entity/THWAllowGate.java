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
@Table(name = "T_HW_AllowGate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWAllowGate.findAll", query = "SELECT t FROM THWAllowGate t"),
    @NamedQuery(name = "THWAllowGate.findByAllowGateID", query = "SELECT t FROM THWAllowGate t WHERE t.allowGateID = :allowGateID"),
    @NamedQuery(name = "THWAllowGate.findByUserID", query = "SELECT t FROM THWAllowGate t WHERE t.userID = :userID"),
    @NamedQuery(name = "THWAllowGate.findByGateID", query = "SELECT t FROM THWAllowGate t WHERE t.gateID = :gateID"),
    @NamedQuery(name = "THWAllowGate.findByIsPermanent", query = "SELECT t FROM THWAllowGate t WHERE t.isPermanent = :isPermanent"),
    @NamedQuery(name = "THWAllowGate.findByStartTime", query = "SELECT t FROM THWAllowGate t WHERE t.startTime = :startTime"),
    @NamedQuery(name = "THWAllowGate.findByEndTime", query = "SELECT t FROM THWAllowGate t WHERE t.endTime = :endTime"),
    @NamedQuery(name = "THWAllowGate.findByIsdel", query = "SELECT t FROM THWAllowGate t WHERE t.isdel = :isdel")})
public class THWAllowGate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AllowGateID")
    private String allowGateID;
    @Basic(optional = false)
    @Column(name = "UserID")
    private String userID;
    @Basic(optional = false)
    @Column(name = "GateID")
    private String gateID;
    @Basic(optional = false)
    @Column(name = "IsPermanent")
    private int isPermanent;
    @Basic(optional = false)
    @Column(name = "StartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @Column(name = "EndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "Isdel")
    private Integer isdel;

    public THWAllowGate() {
    }

    public THWAllowGate(String allowGateID) {
        this.allowGateID = allowGateID;
    }

    public THWAllowGate(String allowGateID, String userID, String gateID, int isPermanent, Date startTime, Date endTime) {
        this.allowGateID = allowGateID;
        this.userID = userID;
        this.gateID = gateID;
        this.isPermanent = isPermanent;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getAllowGateID() {
        return allowGateID;
    }

    public void setAllowGateID(String allowGateID) {
        this.allowGateID = allowGateID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getGateID() {
        return gateID;
    }

    public void setGateID(String gateID) {
        this.gateID = gateID;
    }

    public int getIsPermanent() {
        return isPermanent;
    }

    public void setIsPermanent(int isPermanent) {
        this.isPermanent = isPermanent;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (allowGateID != null ? allowGateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof THWAllowGate)) {
            return false;
        }
        THWAllowGate other = (THWAllowGate) object;
        if ((this.allowGateID == null && other.allowGateID != null) || (this.allowGateID != null && !this.allowGateID.equals(other.allowGateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWAllowGate[ allowGateID=" + allowGateID + " ]";
    }
    
}
