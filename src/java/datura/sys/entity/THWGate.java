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
@Table(name = "T_HW_Gate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWGate.findAll", query = "SELECT t FROM THWGate t"),
    @NamedQuery(name = "THWGate.findByGateID", query = "SELECT t FROM THWGate t WHERE t.gateID = :gateID"),
    @NamedQuery(name = "THWGate.findByGateKey", query = "SELECT t FROM THWGate t WHERE t.gateKey = :gateKey"),
    @NamedQuery(name = "THWGate.findByCreatetime", query = "SELECT t FROM THWGate t WHERE t.createtime = :createtime"),
    @NamedQuery(name = "THWGate.findByCreator", query = "SELECT t FROM THWGate t WHERE t.creator = :creator"),
    @NamedQuery(name = "THWGate.findByIsdel", query = "SELECT t FROM THWGate t WHERE t.isdel = :isdel"),
    @NamedQuery(name = "THWGate.findByGateSN", query = "SELECT t FROM THWGate t WHERE t.gateSN = :gateSN"),
    @NamedQuery(name = "THWGate.findByGatePort", query = "SELECT t FROM THWGate t WHERE t.gatePort = :gatePort"),
    @NamedQuery(name = "THWGate.findByGateNum", query = "SELECT t FROM THWGate t WHERE t.gateNum = :gateNum")})
public class THWGate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GateID")
    private String gateID;
    @Basic(optional = false)
    @Column(name = "GateKey")
    private String gateKey;
    @Basic(optional = false)
    @Lob
    @Column(name = "GateAddress")
    private String gateAddress;
    @Basic(optional = false)
    @Lob
    @Column(name = "GateType")
    private String gateType;
    @Basic(optional = false)
    @Lob
    @Column(name = "GateLoc")
    private String gateLoc;
    @Basic(optional = false)
    @Column(name = "Createtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Basic(optional = false)
    @Column(name = "Creator")
    private String creator;
    @Basic(optional = false)
    @Column(name = "Isdel")
    private int isdel;
    @Basic(optional = false)
    @Column(name = "GateSN")
    private String gateSN;
    @Basic(optional = false)
    @Column(name = "GatePort")
    private int gatePort;
    @Basic(optional = false)
    @Column(name = "GateNum")
    private int gateNum;

    public THWGate() {
    }

    public THWGate(String gateID) {
        this.gateID = gateID;
    }

    public THWGate(String gateID, String gateKey, String gateAddress, String gateType, String gateLoc, Date createtime, String creator, int isdel, String gateSN, int gatePort, int gateNum) {
        this.gateID = gateID;
        this.gateKey = gateKey;
        this.gateAddress = gateAddress;
        this.gateType = gateType;
        this.gateLoc = gateLoc;
        this.createtime = createtime;
        this.creator = creator;
        this.isdel = isdel;
        this.gateSN = gateSN;
        this.gatePort = gatePort;
        this.gateNum = gateNum;
    }

    public String getGateID() {
        return gateID;
    }

    public void setGateID(String gateID) {
        this.gateID = gateID;
    }

    public String getGateKey() {
        return gateKey;
    }

    public void setGateKey(String gateKey) {
        this.gateKey = gateKey;
    }

    public String getGateAddress() {
        return gateAddress;
    }

    public void setGateAddress(String gateAddress) {
        this.gateAddress = gateAddress;
    }

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType;
    }

    public String getGateLoc() {
        return gateLoc;
    }

    public void setGateLoc(String gateLoc) {
        this.gateLoc = gateLoc;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getIsdel() {
        return isdel;
    }

    public void setIsdel(int isdel) {
        this.isdel = isdel;
    }

    public String getGateSN() {
        return gateSN;
    }

    public void setGateSN(String gateSN) {
        this.gateSN = gateSN;
    }

    public int getGatePort() {
        return gatePort;
    }

    public void setGatePort(int gatePort) {
        this.gatePort = gatePort;
    }

    public int getGateNum() {
        return gateNum;
    }

    public void setGateNum(int gateNum) {
        this.gateNum = gateNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gateID != null ? gateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof THWGate)) {
            return false;
        }
        THWGate other = (THWGate) object;
        if ((this.gateID == null && other.gateID != null) || (this.gateID != null && !this.gateID.equals(other.gateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWGate[ gateID=" + gateID + " ]";
    }
    
}
