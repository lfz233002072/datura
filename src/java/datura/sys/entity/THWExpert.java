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
@Table(name = "T_HW_Expert")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWExpert.findAll", query = "SELECT t FROM THWExpert t"),
    @NamedQuery(name = "THWExpert.findById", query = "SELECT t FROM THWExpert t WHERE t.id = :id"),
    @NamedQuery(name = "THWExpert.findByExpertID", query = "SELECT t FROM THWExpert t WHERE t.expertID = :expertID"),
    @NamedQuery(name = "THWExpert.findByExpertName", query = "SELECT t FROM THWExpert t WHERE t.expertName = :expertName"),
    @NamedQuery(name = "THWExpert.findBySex", query = "SELECT t FROM THWExpert t WHERE t.sex = :sex"),
    @NamedQuery(name = "THWExpert.findByTel", query = "SELECT t FROM THWExpert t WHERE t.tel = :tel"),
    @NamedQuery(name = "THWExpert.findByCardID", query = "SELECT t FROM THWExpert t WHERE t.cardID = :cardID"),
    @NamedQuery(name = "THWExpert.findBySpeciality", query = "SELECT t FROM THWExpert t WHERE t.speciality = :speciality"),
    @NamedQuery(name = "THWExpert.findByProCode", query = "SELECT t FROM THWExpert t WHERE t.proCode = :proCode"),
    @NamedQuery(name = "THWExpert.findByLoginname", query = "SELECT t FROM THWExpert t WHERE t.loginname = :loginname"),
    @NamedQuery(name = "THWExpert.findByPassword", query = "SELECT t FROM THWExpert t WHERE t.password = :password"),
    @NamedQuery(name = "THWExpert.findByArriveTime", query = "SELECT t FROM THWExpert t WHERE t.arriveTime = :arriveTime"),
    @NamedQuery(name = "THWExpert.findByIsRight", query = "SELECT t FROM THWExpert t WHERE t.isRight = :isRight"),
    @NamedQuery(name = "THWExpert.findByCheckInState", query = "SELECT t FROM THWExpert t WHERE t.checkInState = :checkInState"),
    @NamedQuery(name = "THWExpert.findByCreateDate", query = "SELECT t FROM THWExpert t WHERE t.createDate = :createDate"),
    @NamedQuery(name = "THWExpert.findByBiddingTime", query = "SELECT t FROM THWExpert t WHERE t.biddingTime = :biddingTime"),
    @NamedQuery(name = "THWExpert.findByExpertCode", query = "SELECT t FROM THWExpert t WHERE t.expertCode = :expertCode"),
    @NamedQuery(name = "THWExpert.findByTechnicalPost", query = "SELECT t FROM THWExpert t WHERE t.technicalPost = :technicalPost")})
public class THWExpert implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "ExpertID")
    private int expertID;
    @Basic(optional = false)
    @Column(name = "ExpertName")
    private String expertName;
    @Basic(optional = false)
    @Column(name = "Sex")
    private String sex;
    @Basic(optional = false)
    @Column(name = "Tel")
    private String tel;
    @Basic(optional = false)
    @Column(name = "CardID")
    private String cardID;
    @Column(name = "Speciality")
    private String speciality;
    @Column(name = "ProCode")
    private Integer proCode;
    @Basic(optional = false)
    @Column(name = "Loginname")
    private String loginname;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Lob
    @Column(name = "Fingerprint1")
    private String fingerprint1;
    @Lob
    @Column(name = "Fingerprint2")
    private String fingerprint2;
    @Lob
    @Column(name = "Fingerprint3")
    private String fingerprint3;
    @Lob
    @Column(name = "Photo")
    private byte[] photo;
    @Lob
    @Column(name = "ArrivePhoto")
    private byte[] arrivePhoto;
    @Column(name = "ArriveTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arriveTime;
    @Column(name = "IsRight")
    private Integer isRight;
    @Column(name = "CheckInState")
    private Integer checkInState;
    @Lob
    @Column(name = "OtherContent")
    private String otherContent;
    @Basic(optional = false)
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "BiddingTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date biddingTime;
    @Column(name = "ExpertCode")
    private String expertCode;
    @Lob
    @Column(name = "EMPLOYER")
    private String employer;
    @Column(name = "TECHNICAL_POST")
    private String technicalPost;

    public THWExpert() {
    }

    public THWExpert(String id) {
        this.id = id;
    }

    public THWExpert(String id, int expertID, String expertName, String sex, String tel, String cardID, String loginname, String password, Date createDate) {
        this.id = id;
        this.expertID = expertID;
        this.expertName = expertName;
        this.sex = sex;
        this.tel = tel;
        this.cardID = cardID;
        this.loginname = loginname;
        this.password = password;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getExpertID() {
        return expertID;
    }

    public void setExpertID(int expertID) {
        this.expertID = expertID;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getProCode() {
        return proCode;
    }

    public void setProCode(Integer proCode) {
        this.proCode = proCode;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFingerprint1() {
        return fingerprint1;
    }

    public void setFingerprint1(String fingerprint1) {
        this.fingerprint1 = fingerprint1;
    }

    public String getFingerprint2() {
        return fingerprint2;
    }

    public void setFingerprint2(String fingerprint2) {
        this.fingerprint2 = fingerprint2;
    }

    public String getFingerprint3() {
        return fingerprint3;
    }

    public void setFingerprint3(String fingerprint3) {
        this.fingerprint3 = fingerprint3;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getArrivePhoto() {
        return arrivePhoto;
    }

    public void setArrivePhoto(byte[] arrivePhoto) {
        this.arrivePhoto = arrivePhoto;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Integer getIsRight() {
        return isRight;
    }

    public void setIsRight(Integer isRight) {
        this.isRight = isRight;
    }

    public Integer getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(Integer checkInState) {
        this.checkInState = checkInState;
    }

    public String getOtherContent() {
        return otherContent;
    }

    public void setOtherContent(String otherContent) {
        this.otherContent = otherContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getBiddingTime() {
        return biddingTime;
    }

    public void setBiddingTime(Date biddingTime) {
        this.biddingTime = biddingTime;
    }

    public String getExpertCode() {
        return expertCode;
    }

    public void setExpertCode(String expertCode) {
        this.expertCode = expertCode;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getTechnicalPost() {
        return technicalPost;
    }

    public void setTechnicalPost(String technicalPost) {
        this.technicalPost = technicalPost;
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
        if (!(object instanceof THWExpert)) {
            return false;
        }
        THWExpert other = (THWExpert) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWExpert[ id=" + id + " ]";
    }
    
}
