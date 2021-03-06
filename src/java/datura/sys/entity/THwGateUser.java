package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * THwGateUser generated by hbm2java
 */
public class THwGateUser  implements java.io.Serializable {


     private String userId;
     private String userName;
     private String userCard;
     private String userTel;
     private Date createtime;
     private String creator;
     private int isActive;
     private Integer isInvocation;

    public THwGateUser() {
    }

	
    public THwGateUser(String userId, String userName, String userCard, String userTel, Date createtime, String creator, int isActive) {
        this.userId = userId;
        this.userName = userName;
        this.userCard = userCard;
        this.userTel = userTel;
        this.createtime = createtime;
        this.creator = creator;
        this.isActive = isActive;
    }
    public THwGateUser(String userId, String userName, String userCard, String userTel, Date createtime, String creator, int isActive, Integer isInvocation) {
       this.userId = userId;
       this.userName = userName;
       this.userCard = userCard;
       this.userTel = userTel;
       this.createtime = createtime;
       this.creator = creator;
       this.isActive = isActive;
       this.isInvocation = isInvocation;
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
    public String getUserCard() {
        return this.userCard;
    }
    
    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }
    public String getUserTel() {
        return this.userTel;
    }
    
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public String getCreator() {
        return this.creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public int getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
    public Integer getIsInvocation() {
        return this.isInvocation;
    }
    
    public void setIsInvocation(Integer isInvocation) {
        this.isInvocation = isInvocation;
    }




}


