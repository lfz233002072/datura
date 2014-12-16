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
@Table(name = "T_HW_GateUser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWGateUser.findAll", query = "SELECT t FROM THWGateUser t"),
    @NamedQuery(name = "THWGateUser.findByUserID", query = "SELECT t FROM THWGateUser t WHERE t.userID = :userID"),
    @NamedQuery(name = "THWGateUser.findByUserName", query = "SELECT t FROM THWGateUser t WHERE t.userName = :userName"),
    @NamedQuery(name = "THWGateUser.findByUserCard", query = "SELECT t FROM THWGateUser t WHERE t.userCard = :userCard"),
    @NamedQuery(name = "THWGateUser.findByUserTel", query = "SELECT t FROM THWGateUser t WHERE t.userTel = :userTel"),
    @NamedQuery(name = "THWGateUser.findByCreatetime", query = "SELECT t FROM THWGateUser t WHERE t.createtime = :createtime"),
    @NamedQuery(name = "THWGateUser.findByCreator", query = "SELECT t FROM THWGateUser t WHERE t.creator = :creator"),
    @NamedQuery(name = "THWGateUser.findByIsActive", query = "SELECT t FROM THWGateUser t WHERE t.isActive = :isActive"),
    @NamedQuery(name = "THWGateUser.findByIsInvocation", query = "SELECT t FROM THWGateUser t WHERE t.isInvocation = :isInvocation")})
public class THWGateUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UserID")
    private String userID;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "UserCard")
    private String userCard;
    @Basic(optional = false)
    @Column(name = "UserTel")
    private String userTel;
    @Basic(optional = false)
    @Column(name = "Createtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Basic(optional = false)
    @Column(name = "Creator")
    private String creator;
    @Basic(optional = false)
    @Column(name = "IsActive")
    private int isActive;
    @Column(name = "IsInvocation")
    private Integer isInvocation;

    public THWGateUser() {
    }

    public THWGateUser(String userID) {
        this.userID = userID;
    }

    public THWGateUser(String userID, String userName, String userCard, String userTel, Date createtime, String creator, int isActive) {
        this.userID = userID;
        this.userName = userName;
        this.userCard = userCard;
        this.userTel = userTel;
        this.createtime = createtime;
        this.creator = creator;
        this.isActive = isActive;
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

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
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

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public Integer getIsInvocation() {
        return isInvocation;
    }

    public void setIsInvocation(Integer isInvocation) {
        this.isInvocation = isInvocation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof THWGateUser)) {
            return false;
        }
        THWGateUser other = (THWGateUser) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWGateUser[ userID=" + userID + " ]";
    }
    
}
