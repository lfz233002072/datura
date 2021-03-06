package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * THwCheckon generated by hbm2java
 */
public class THwCheckon  implements java.io.Serializable {


     private String checkonId;
     private String proId;
     private String proNum;
     private String proName;
     private Date proTime;
     private String proRoom;
     private String userNo;
     private String userId;
     private String userName;
     private String userCardId;
     private String userTel;
     private Date arriveTime;
     private byte[] userPhoto;
     private byte[] arrivePhoto;
     private int isRight;
     private String compareContent;
     private int isCheckOn;
     private String absenceReason;
     private String content;

    public THwCheckon() {
    }

	
    public THwCheckon(String checkonId, String proId, String proNum, String proName, String proRoom, String userNo, String userId, String userName, String userCardId, String userTel, int isRight, int isCheckOn) {
        this.checkonId = checkonId;
        this.proId = proId;
        this.proNum = proNum;
        this.proName = proName;
        this.proRoom = proRoom;
        this.userNo = userNo;
        this.userId = userId;
        this.userName = userName;
        this.userCardId = userCardId;
        this.userTel = userTel;
        this.isRight = isRight;
        this.isCheckOn = isCheckOn;
    }
    public THwCheckon(String checkonId, String proId, String proNum, String proName, Date proTime, String proRoom, String userNo, String userId, String userName, String userCardId, String userTel, Date arriveTime, byte[] userPhoto, byte[] arrivePhoto, int isRight, String compareContent, int isCheckOn, String absenceReason, String content) {
       this.checkonId = checkonId;
       this.proId = proId;
       this.proNum = proNum;
       this.proName = proName;
       this.proTime = proTime;
       this.proRoom = proRoom;
       this.userNo = userNo;
       this.userId = userId;
       this.userName = userName;
       this.userCardId = userCardId;
       this.userTel = userTel;
       this.arriveTime = arriveTime;
       this.userPhoto = userPhoto;
       this.arrivePhoto = arrivePhoto;
       this.isRight = isRight;
       this.compareContent = compareContent;
       this.isCheckOn = isCheckOn;
       this.absenceReason = absenceReason;
       this.content = content;
    }
   
    public String getCheckonId() {
        return this.checkonId;
    }
    
    public void setCheckonId(String checkonId) {
        this.checkonId = checkonId;
    }
    public String getProId() {
        return this.proId;
    }
    
    public void setProId(String proId) {
        this.proId = proId;
    }
    public String getProNum() {
        return this.proNum;
    }
    
    public void setProNum(String proNum) {
        this.proNum = proNum;
    }
    public String getProName() {
        return this.proName;
    }
    
    public void setProName(String proName) {
        this.proName = proName;
    }
    public Date getProTime() {
        return this.proTime;
    }
    
    public void setProTime(Date proTime) {
        this.proTime = proTime;
    }
    public String getProRoom() {
        return this.proRoom;
    }
    
    public void setProRoom(String proRoom) {
        this.proRoom = proRoom;
    }
    public String getUserNo() {
        return this.userNo;
    }
    
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserCardId() {
        return this.userCardId;
    }
    
    public void setUserCardId(String userCardId) {
        this.userCardId = userCardId;
    }
    public String getUserTel() {
        return this.userTel;
    }
    
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
    public Date getArriveTime() {
        return this.arriveTime;
    }
    
    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }
    public byte[] getUserPhoto() {
        return this.userPhoto;
    }
    
    public void setUserPhoto(byte[] userPhoto) {
        this.userPhoto = userPhoto;
    }
    public byte[] getArrivePhoto() {
        return this.arrivePhoto;
    }
    
    public void setArrivePhoto(byte[] arrivePhoto) {
        this.arrivePhoto = arrivePhoto;
    }
    public int getIsRight() {
        return this.isRight;
    }
    
    public void setIsRight(int isRight) {
        this.isRight = isRight;
    }
    public String getCompareContent() {
        return this.compareContent;
    }
    
    public void setCompareContent(String compareContent) {
        this.compareContent = compareContent;
    }
    public int getIsCheckOn() {
        return this.isCheckOn;
    }
    
    public void setIsCheckOn(int isCheckOn) {
        this.isCheckOn = isCheckOn;
    }
    public String getAbsenceReason() {
        return this.absenceReason;
    }
    
    public void setAbsenceReason(String absenceReason) {
        this.absenceReason = absenceReason;
    }
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }




}


