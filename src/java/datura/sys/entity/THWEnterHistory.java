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
@Table(name = "T_HW_EnterHistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWEnterHistory.findAll", query = "SELECT t FROM THWEnterHistory t"),
    @NamedQuery(name = "THWEnterHistory.findById", query = "SELECT t FROM THWEnterHistory t WHERE t.id = :id"),
    @NamedQuery(name = "THWEnterHistory.findByExpertName", query = "SELECT t FROM THWEnterHistory t WHERE t.expertName = :expertName"),
    @NamedQuery(name = "THWEnterHistory.findBySex", query = "SELECT t FROM THWEnterHistory t WHERE t.sex = :sex"),
    @NamedQuery(name = "THWEnterHistory.findByCardID", query = "SELECT t FROM THWEnterHistory t WHERE t.cardID = :cardID"),
    @NamedQuery(name = "THWEnterHistory.findByPhone", query = "SELECT t FROM THWEnterHistory t WHERE t.phone = :phone"),
    @NamedQuery(name = "THWEnterHistory.findByProName", query = "SELECT t FROM THWEnterHistory t WHERE t.proName = :proName"),
    @NamedQuery(name = "THWEnterHistory.findByRoom", query = "SELECT t FROM THWEnterHistory t WHERE t.room = :room"),
    @NamedQuery(name = "THWEnterHistory.findByArriveTime", query = "SELECT t FROM THWEnterHistory t WHERE t.arriveTime = :arriveTime"),
    @NamedQuery(name = "THWEnterHistory.findByCheckinState", query = "SELECT t FROM THWEnterHistory t WHERE t.checkinState = :checkinState"),
    @NamedQuery(name = "THWEnterHistory.findByGateName", query = "SELECT t FROM THWEnterHistory t WHERE t.gateName = :gateName"),
    @NamedQuery(name = "THWEnterHistory.findByControlerName", query = "SELECT t FROM THWEnterHistory t WHERE t.controlerName = :controlerName"),
    @NamedQuery(name = "THWEnterHistory.findByCreateDate", query = "SELECT t FROM THWEnterHistory t WHERE t.createDate = :createDate")})
public class THWEnterHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "ExpertName")
    private String expertName;
    @Column(name = "Sex")
    private String sex;
    @Column(name = "CardID")
    private String cardID;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "ProName")
    private String proName;
    @Column(name = "Room")
    private String room;
    @Column(name = "ArriveTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arriveTime;
    @Column(name = "CheckinState")
    private String checkinState;
    @Column(name = "GateName")
    private String gateName;
    @Column(name = "ControlerName")
    private String controlerName;
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public THWEnterHistory() {
    }

    public THWEnterHistory(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getCheckinState() {
        return checkinState;
    }

    public void setCheckinState(String checkinState) {
        this.checkinState = checkinState;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public String getControlerName() {
        return controlerName;
    }

    public void setControlerName(String controlerName) {
        this.controlerName = controlerName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        if (!(object instanceof THWEnterHistory)) {
            return false;
        }
        THWEnterHistory other = (THWEnterHistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWEnterHistory[ id=" + id + " ]";
    }
    
}
