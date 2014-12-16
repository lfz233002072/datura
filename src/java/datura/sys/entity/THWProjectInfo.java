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
@Table(name = "T_HW_ProjectInfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWProjectInfo.findAll", query = "SELECT t FROM THWProjectInfo t"),
    @NamedQuery(name = "THWProjectInfo.findById", query = "SELECT t FROM THWProjectInfo t WHERE t.id = :id"),
    @NamedQuery(name = "THWProjectInfo.findByProCode", query = "SELECT t FROM THWProjectInfo t WHERE t.proCode = :proCode"),
    @NamedQuery(name = "THWProjectInfo.findByProName", query = "SELECT t FROM THWProjectInfo t WHERE t.proName = :proName"),
    @NamedQuery(name = "THWProjectInfo.findByRoomName", query = "SELECT t FROM THWProjectInfo t WHERE t.roomName = :roomName"),
    @NamedQuery(name = "THWProjectInfo.findByStartTime", query = "SELECT t FROM THWProjectInfo t WHERE t.startTime = :startTime"),
    @NamedQuery(name = "THWProjectInfo.findByEndTime", query = "SELECT t FROM THWProjectInfo t WHERE t.endTime = :endTime"),
    @NamedQuery(name = "THWProjectInfo.findByProjectState", query = "SELECT t FROM THWProjectInfo t WHERE t.projectState = :projectState"),
    @NamedQuery(name = "THWProjectInfo.findByCompany", query = "SELECT t FROM THWProjectInfo t WHERE t.company = :company"),
    @NamedQuery(name = "THWProjectInfo.findByCreateDate", query = "SELECT t FROM THWProjectInfo t WHERE t.createDate = :createDate"),
    @NamedQuery(name = "THWProjectInfo.findByRoomCode", query = "SELECT t FROM THWProjectInfo t WHERE t.roomCode = :roomCode"),
    @NamedQuery(name = "THWProjectInfo.findByProCode2", query = "SELECT t FROM THWProjectInfo t WHERE t.proCode2 = :proCode2")})
public class THWProjectInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "ProCode")
    private Integer proCode;
    @Basic(optional = false)
    @Column(name = "ProName")
    private String proName;
    @Basic(optional = false)
    @Column(name = "RoomName")
    private String roomName;
    @Basic(optional = false)
    @Column(name = "StartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "EndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "ProjectState")
    private Integer projectState;
    @Basic(optional = false)
    @Column(name = "Company")
    private String company;
    @Basic(optional = false)
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "RoomCode")
    private String roomCode;
    @Column(name = "ProCode2")
    private String proCode2;

    public THWProjectInfo() {
    }

    public THWProjectInfo(String id) {
        this.id = id;
    }

    public THWProjectInfo(String id, String proName, String roomName, Date startTime, String company, Date createDate) {
        this.id = id;
        this.proName = proName;
        this.roomName = roomName;
        this.startTime = startTime;
        this.company = company;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProCode() {
        return proCode;
    }

    public void setProCode(Integer proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
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

    public Integer getProjectState() {
        return projectState;
    }

    public void setProjectState(Integer projectState) {
        this.projectState = projectState;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getProCode2() {
        return proCode2;
    }

    public void setProCode2(String proCode2) {
        this.proCode2 = proCode2;
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
        if (!(object instanceof THWProjectInfo)) {
            return false;
        }
        THWProjectInfo other = (THWProjectInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWProjectInfo[ id=" + id + " ]";
    }
    
}
