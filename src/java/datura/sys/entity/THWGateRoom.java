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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lfz
 */
@Entity
@Table(name = "T_HW_GateRoom")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWGateRoom.findAll", query = "SELECT t FROM THWGateRoom t"),
    @NamedQuery(name = "THWGateRoom.findByGateRoomID", query = "SELECT t FROM THWGateRoom t WHERE t.gateRoomID = :gateRoomID"),
    @NamedQuery(name = "THWGateRoom.findByGateID", query = "SELECT t FROM THWGateRoom t WHERE t.gateID = :gateID"),
    @NamedQuery(name = "THWGateRoom.findByRoomID", query = "SELECT t FROM THWGateRoom t WHERE t.roomID = :roomID"),
    @NamedQuery(name = "THWGateRoom.findByIsdel", query = "SELECT t FROM THWGateRoom t WHERE t.isdel = :isdel"),
    @NamedQuery(name = "THWGateRoom.findByRoomName", query = "SELECT t FROM THWGateRoom t WHERE t.roomName = :roomName"),
    @NamedQuery(name = "THWGateRoom.findByRoomCode", query = "SELECT t FROM THWGateRoom t WHERE t.roomCode = :roomCode")})
public class THWGateRoom implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GateRoomID")
    private String gateRoomID;
    @Basic(optional = false)
    @Column(name = "GateID")
    private String gateID;
    @Basic(optional = false)
    @Column(name = "RoomID")
    private String roomID;
    @Basic(optional = false)
    @Column(name = "Isdel")
    private int isdel;
    @Column(name = "RoomName")
    private String roomName;
    @Column(name = "RoomCode")
    private String roomCode;

    public THWGateRoom() {
    }

    public THWGateRoom(String gateRoomID) {
        this.gateRoomID = gateRoomID;
    }

    public THWGateRoom(String gateRoomID, String gateID, String roomID, int isdel) {
        this.gateRoomID = gateRoomID;
        this.gateID = gateID;
        this.roomID = roomID;
        this.isdel = isdel;
    }

    public String getGateRoomID() {
        return gateRoomID;
    }

    public void setGateRoomID(String gateRoomID) {
        this.gateRoomID = gateRoomID;
    }

    public String getGateID() {
        return gateID;
    }

    public void setGateID(String gateID) {
        this.gateID = gateID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public int getIsdel() {
        return isdel;
    }

    public void setIsdel(int isdel) {
        this.isdel = isdel;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gateRoomID != null ? gateRoomID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof THWGateRoom)) {
            return false;
        }
        THWGateRoom other = (THWGateRoom) object;
        if ((this.gateRoomID == null && other.gateRoomID != null) || (this.gateRoomID != null && !this.gateRoomID.equals(other.gateRoomID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWGateRoom[ gateRoomID=" + gateRoomID + " ]";
    }
    
}
