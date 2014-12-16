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
@Table(name = "T_HW_Checkon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWCheckon.findAll", query = "SELECT t FROM THWCheckon t"),
    @NamedQuery(name = "THWCheckon.findByCheckonID", query = "SELECT t FROM THWCheckon t WHERE t.checkonID = :checkonID"),
    @NamedQuery(name = "THWCheckon.findByProID", query = "SELECT t FROM THWCheckon t WHERE t.proID = :proID"),
    @NamedQuery(name = "THWCheckon.findByProNum", query = "SELECT t FROM THWCheckon t WHERE t.proNum = :proNum"),
    @NamedQuery(name = "THWCheckon.findByProTime", query = "SELECT t FROM THWCheckon t WHERE t.proTime = :proTime"),
    @NamedQuery(name = "THWCheckon.findByProRoom", query = "SELECT t FROM THWCheckon t WHERE t.proRoom = :proRoom"),
    @NamedQuery(name = "THWCheckon.findByUserNo", query = "SELECT t FROM THWCheckon t WHERE t.userNo = :userNo"),
    @NamedQuery(name = "THWCheckon.findByUserID", query = "SELECT t FROM THWCheckon t WHERE t.userID = :userID"),
    @NamedQuery(name = "THWCheckon.findByUserName", query = "SELECT t FROM THWCheckon t WHERE t.userName = :userName"),
    @NamedQuery(name = "THWCheckon.findByUserCardID", query = "SELECT t FROM THWCheckon t WHERE t.userCardID = :userCardID"),
    @NamedQuery(name = "THWCheckon.findByUserTel", query = "SELECT t FROM THWCheckon t WHERE t.userTel = :userTel"),
    @NamedQuery(name = "THWCheckon.findByArriveTime", query = "SELECT t FROM THWCheckon t WHERE t.arriveTime = :arriveTime"),
    @NamedQuery(name = "THWCheckon.findByIsRIght", query = "SELECT t FROM THWCheckon t WHERE t.isRIght = :isRIght"),
    @NamedQuery(name = "THWCheckon.findByIsCheckOn", query = "SELECT t FROM THWCheckon t WHERE t.isCheckOn = :isCheckOn")})
public class THWCheckon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CheckonID")
    private String checkonID;
    @Basic(optional = false)
    @Column(name = "ProID")
    private String proID;
    @Basic(optional = false)
    @Column(name = "ProNum")
    private String proNum;
    @Basic(optional = false)
    @Lob
    @Column(name = "ProName")
    private String proName;
    @Column(name = "ProTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date proTime;
    @Basic(optional = false)
    @Column(name = "ProRoom")
    private String proRoom;
    @Basic(optional = false)
    @Column(name = "UserNo")
    private String userNo;
    @Basic(optional = false)
    @Column(name = "UserID")
    private String userID;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "UserCardID")
    private String userCardID;
    @Basic(optional = false)
    @Column(name = "UserTel")
    private String userTel;
    @Column(name = "ArriveTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arriveTime;
    @Lob
    @Column(name = "UserPhoto")
    private byte[] userPhoto;
    @Lob
    @Column(name = "ArrivePhoto")
    private byte[] arrivePhoto;
    @Basic(optional = false)
    @Column(name = "IsRIght")
    private int isRIght;
    @Lob
    @Column(name = "CompareContent")
    private String compareContent;
    @Basic(optional = false)
    @Column(name = "IsCheckOn")
    private int isCheckOn;
    @Lob
    @Column(name = "AbsenceReason")
    private String absenceReason;
    @Lob
    @Column(name = "Content")
    private String content;

    public THWCheckon() {
    }

    public THWCheckon(String checkonID) {
        this.checkonID = checkonID;
    }

    public THWCheckon(String checkonID, String proID, String proNum, String proName, String proRoom, String userNo, String userID, String userName, String userCardID, String userTel, int isRIght, int isCheckOn) {
        this.checkonID = checkonID;
        this.proID = proID;
        this.proNum = proNum;
        this.proName = proName;
        this.proRoom = proRoom;
        this.userNo = userNo;
        this.userID = userID;
        this.userName = userName;
        this.userCardID = userCardID;
        this.userTel = userTel;
        this.isRIght = isRIght;
        this.isCheckOn = isCheckOn;
    }

    public String getCheckonID() {
        return checkonID;
    }

    public void setCheckonID(String checkonID) {
        this.checkonID = checkonID;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Date getProTime() {
        return proTime;
    }

    public void setProTime(Date proTime) {
        this.proTime = proTime;
    }

    public String getProRoom() {
        return proRoom;
    }

    public void setProRoom(String proRoom) {
        this.proRoom = proRoom;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCardID() {
        return userCardID;
    }

    public void setUserCardID(String userCardID) {
        this.userCardID = userCardID;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public byte[] getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(byte[] userPhoto) {
        this.userPhoto = userPhoto;
    }

    public byte[] getArrivePhoto() {
        return arrivePhoto;
    }

    public void setArrivePhoto(byte[] arrivePhoto) {
        this.arrivePhoto = arrivePhoto;
    }

    public int getIsRIght() {
        return isRIght;
    }

    public void setIsRIght(int isRIght) {
        this.isRIght = isRIght;
    }

    public String getCompareContent() {
        return compareContent;
    }

    public void setCompareContent(String compareContent) {
        this.compareContent = compareContent;
    }

    public int getIsCheckOn() {
        return isCheckOn;
    }

    public void setIsCheckOn(int isCheckOn) {
        this.isCheckOn = isCheckOn;
    }

    public String getAbsenceReason() {
        return absenceReason;
    }

    public void setAbsenceReason(String absenceReason) {
        this.absenceReason = absenceReason;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (checkonID != null ? checkonID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof THWCheckon)) {
            return false;
        }
        THWCheckon other = (THWCheckon) object;
        if ((this.checkonID == null && other.checkonID != null) || (this.checkonID != null && !this.checkonID.equals(other.checkonID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWCheckon[ checkonID=" + checkonID + " ]";
    }
    
}
