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
@Table(name = "Sys_Users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysUsers.findAll", query = "SELECT s FROM SysUsers s"),
    @NamedQuery(name = "SysUsers.findById", query = "SELECT s FROM SysUsers s WHERE s.id = :id"),
    @NamedQuery(name = "SysUsers.findByUsername", query = "SELECT s FROM SysUsers s WHERE s.username = :username"),
    @NamedQuery(name = "SysUsers.findByPassword", query = "SELECT s FROM SysUsers s WHERE s.password = :password"),
    @NamedQuery(name = "SysUsers.findByRealname", query = "SELECT s FROM SysUsers s WHERE s.realname = :realname"),
    @NamedQuery(name = "SysUsers.findBySex", query = "SELECT s FROM SysUsers s WHERE s.sex = :sex"),
    @NamedQuery(name = "SysUsers.findByTel", query = "SELECT s FROM SysUsers s WHERE s.tel = :tel"),
    @NamedQuery(name = "SysUsers.findByMoblie", query = "SELECT s FROM SysUsers s WHERE s.moblie = :moblie"),
    @NamedQuery(name = "SysUsers.findByIdNo", query = "SELECT s FROM SysUsers s WHERE s.idNo = :idNo"),
    @NamedQuery(name = "SysUsers.findByLoginTimes", query = "SELECT s FROM SysUsers s WHERE s.loginTimes = :loginTimes"),
    @NamedQuery(name = "SysUsers.findByLastLoginTime", query = "SELECT s FROM SysUsers s WHERE s.lastLoginTime = :lastLoginTime"),
    @NamedQuery(name = "SysUsers.findByDelFlag", query = "SELECT s FROM SysUsers s WHERE s.delFlag = :delFlag"),
    @NamedQuery(name = "SysUsers.findByDataStatus", query = "SELECT s FROM SysUsers s WHERE s.dataStatus = :dataStatus"),
    @NamedQuery(name = "SysUsers.findByCreateTime", query = "SELECT s FROM SysUsers s WHERE s.createTime = :createTime"),
    @NamedQuery(name = "SysUsers.findByLastIpAddress", query = "SELECT s FROM SysUsers s WHERE s.lastIpAddress = :lastIpAddress"),
    @NamedQuery(name = "SysUsers.findByLastActivityDate", query = "SELECT s FROM SysUsers s WHERE s.lastActivityDate = :lastActivityDate"),
    @NamedQuery(name = "SysUsers.findByLastUpdateTime", query = "SELECT s FROM SysUsers s WHERE s.lastUpdateTime = :lastUpdateTime")})
public class SysUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @Column(name = "Realname")
    private String realname;
    @Column(name = "Sex")
    private Integer sex;
    @Column(name = "Tel")
    private String tel;
    @Column(name = "Moblie")
    private String moblie;
    @Column(name = "IdNo")
    private String idNo;
    @Column(name = "LoginTimes")
    private Integer loginTimes;
    @Column(name = "LastLoginTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;
    @Column(name = "DelFlag")
    private Integer delFlag;
    @Column(name = "DataStatus")
    private Integer dataStatus;
    @Column(name = "CreateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "LastIpAddress")
    private String lastIpAddress;
    @Column(name = "LastActivityDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActivityDate;
    @Column(name = "LastUpdateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateTime;

    public SysUsers() {
    }

    public SysUsers(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastIpAddress() {
        return lastIpAddress;
    }

    public void setLastIpAddress(String lastIpAddress) {
        this.lastIpAddress = lastIpAddress;
    }

    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
        if (!(object instanceof SysUsers)) {
            return false;
        }
        SysUsers other = (SysUsers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.SysUsers[ id=" + id + " ]";
    }
    
}
