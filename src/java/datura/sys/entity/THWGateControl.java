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
@Table(name = "T_HW_GateControl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWGateControl.findAll", query = "SELECT t FROM THWGateControl t"),
    @NamedQuery(name = "THWGateControl.findByControlID", query = "SELECT t FROM THWGateControl t WHERE t.controlID = :controlID"),
    @NamedQuery(name = "THWGateControl.findByGateID", query = "SELECT t FROM THWGateControl t WHERE t.gateID = :gateID"),
    @NamedQuery(name = "THWGateControl.findByControlKey", query = "SELECT t FROM THWGateControl t WHERE t.controlKey = :controlKey"),
    @NamedQuery(name = "THWGateControl.findByControlNo", query = "SELECT t FROM THWGateControl t WHERE t.controlNo = :controlNo"),
    @NamedQuery(name = "THWGateControl.findByCreatetime", query = "SELECT t FROM THWGateControl t WHERE t.createtime = :createtime"),
    @NamedQuery(name = "THWGateControl.findByCreator", query = "SELECT t FROM THWGateControl t WHERE t.creator = :creator")})
public class THWGateControl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ControlID")
    private String controlID;
    @Basic(optional = false)
    @Column(name = "GateID")
    private String gateID;
    @Basic(optional = false)
    @Column(name = "ControlKey")
    private String controlKey;
    @Basic(optional = false)
    @Column(name = "ControlNo")
    private String controlNo;
    @Basic(optional = false)
    @Lob
    @Column(name = "ControlLoc")
    private String controlLoc;
    @Basic(optional = false)
    @Lob
    @Column(name = "ControlType")
    private String controlType;
    @Basic(optional = false)
    @Column(name = "Createtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Basic(optional = false)
    @Column(name = "Creator")
    private String creator;

    public THWGateControl() {
    }

    public THWGateControl(String controlID) {
        this.controlID = controlID;
    }

    public THWGateControl(String controlID, String gateID, String controlKey, String controlNo, String controlLoc, String controlType, Date createtime, String creator) {
        this.controlID = controlID;
        this.gateID = gateID;
        this.controlKey = controlKey;
        this.controlNo = controlNo;
        this.controlLoc = controlLoc;
        this.controlType = controlType;
        this.createtime = createtime;
        this.creator = creator;
    }

    public String getControlID() {
        return controlID;
    }

    public void setControlID(String controlID) {
        this.controlID = controlID;
    }

    public String getGateID() {
        return gateID;
    }

    public void setGateID(String gateID) {
        this.gateID = gateID;
    }

    public String getControlKey() {
        return controlKey;
    }

    public void setControlKey(String controlKey) {
        this.controlKey = controlKey;
    }

    public String getControlNo() {
        return controlNo;
    }

    public void setControlNo(String controlNo) {
        this.controlNo = controlNo;
    }

    public String getControlLoc() {
        return controlLoc;
    }

    public void setControlLoc(String controlLoc) {
        this.controlLoc = controlLoc;
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (controlID != null ? controlID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof THWGateControl)) {
            return false;
        }
        THWGateControl other = (THWGateControl) object;
        if ((this.controlID == null && other.controlID != null) || (this.controlID != null && !this.controlID.equals(other.controlID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWGateControl[ controlID=" + controlID + " ]";
    }
    
}
