package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * THwExpert generated by hbm2java
 */
public class THwExpert  implements java.io.Serializable {


     private String id;
     private int expertId;
     private String expertName;
     private String sex;
     private String tel;
     private String cardId;
     private String speciality;
     private Integer proCode;
     private String loginname;
     private String password;
     private String fingerprint1;
     private String fingerprint2;
     private String fingerprint3;
     private byte[] photo;
     private byte[] arrivePhoto;
     private Date arriveTime;
     private Integer isRight;
     private Integer checkInState;
     private String otherContent;
     private Date createDate;
     private Date biddingTime;
     private String expertCode;
     private String employer;
     private String technicalPost;

    public THwExpert() {
    }

	
    public THwExpert(String id, int expertId, String expertName, String sex, String tel, String cardId, String loginname, String password, Date createDate) {
        this.id = id;
        this.expertId = expertId;
        this.expertName = expertName;
        this.sex = sex;
        this.tel = tel;
        this.cardId = cardId;
        this.loginname = loginname;
        this.password = password;
        this.createDate = createDate;
    }
    public THwExpert(String id, int expertId, String expertName, String sex, String tel, String cardId, String speciality, Integer proCode, String loginname, String password, String fingerprint1, String fingerprint2, String fingerprint3, byte[] photo, byte[] arrivePhoto, Date arriveTime, Integer isRight, Integer checkInState, String otherContent, Date createDate, Date biddingTime, String expertCode, String employer, String technicalPost) {
       this.id = id;
       this.expertId = expertId;
       this.expertName = expertName;
       this.sex = sex;
       this.tel = tel;
       this.cardId = cardId;
       this.speciality = speciality;
       this.proCode = proCode;
       this.loginname = loginname;
       this.password = password;
       this.fingerprint1 = fingerprint1;
       this.fingerprint2 = fingerprint2;
       this.fingerprint3 = fingerprint3;
       this.photo = photo;
       this.arrivePhoto = arrivePhoto;
       this.arriveTime = arriveTime;
       this.isRight = isRight;
       this.checkInState = checkInState;
       this.otherContent = otherContent;
       this.createDate = createDate;
       this.biddingTime = biddingTime;
       this.expertCode = expertCode;
       this.employer = employer;
       this.technicalPost = technicalPost;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public int getExpertId() {
        return this.expertId;
    }
    
    public void setExpertId(int expertId) {
        this.expertId = expertId;
    }
    public String getExpertName() {
        return this.expertName;
    }
    
    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getCardId() {
        return this.cardId;
    }
    
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    public String getSpeciality() {
        return this.speciality;
    }
    
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public Integer getProCode() {
        return this.proCode;
    }
    
    public void setProCode(Integer proCode) {
        this.proCode = proCode;
    }
    public String getLoginname() {
        return this.loginname;
    }
    
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFingerprint1() {
        return this.fingerprint1;
    }
    
    public void setFingerprint1(String fingerprint1) {
        this.fingerprint1 = fingerprint1;
    }
    public String getFingerprint2() {
        return this.fingerprint2;
    }
    
    public void setFingerprint2(String fingerprint2) {
        this.fingerprint2 = fingerprint2;
    }
    public String getFingerprint3() {
        return this.fingerprint3;
    }
    
    public void setFingerprint3(String fingerprint3) {
        this.fingerprint3 = fingerprint3;
    }
    public byte[] getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    public byte[] getArrivePhoto() {
        return this.arrivePhoto;
    }
    
    public void setArrivePhoto(byte[] arrivePhoto) {
        this.arrivePhoto = arrivePhoto;
    }
    public Date getArriveTime() {
        return this.arriveTime;
    }
    
    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }
    public Integer getIsRight() {
        return this.isRight;
    }
    
    public void setIsRight(Integer isRight) {
        this.isRight = isRight;
    }
    public Integer getCheckInState() {
        return this.checkInState;
    }
    
    public void setCheckInState(Integer checkInState) {
        this.checkInState = checkInState;
    }
    public String getOtherContent() {
        return this.otherContent;
    }
    
    public void setOtherContent(String otherContent) {
        this.otherContent = otherContent;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getBiddingTime() {
        return this.biddingTime;
    }
    
    public void setBiddingTime(Date biddingTime) {
        this.biddingTime = biddingTime;
    }
    public String getExpertCode() {
        return this.expertCode;
    }
    
    public void setExpertCode(String expertCode) {
        this.expertCode = expertCode;
    }
    public String getEmployer() {
        return this.employer;
    }
    
    public void setEmployer(String employer) {
        this.employer = employer;
    }
    public String getTechnicalPost() {
        return this.technicalPost;
    }
    
    public void setTechnicalPost(String technicalPost) {
        this.technicalPost = technicalPost;
    }




}


