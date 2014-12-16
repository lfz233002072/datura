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
@Table(name = "T_HW_Fingerprint")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "THWFingerprint.findAll", query = "SELECT t FROM THWFingerprint t"),
    @NamedQuery(name = "THWFingerprint.findByFingerprintID", query = "SELECT t FROM THWFingerprint t WHERE t.fingerprintID = :fingerprintID"),
    @NamedQuery(name = "THWFingerprint.findByUserID", query = "SELECT t FROM THWFingerprint t WHERE t.userID = :userID"),
    @NamedQuery(name = "THWFingerprint.findByCreatetime", query = "SELECT t FROM THWFingerprint t WHERE t.createtime = :createtime"),
    @NamedQuery(name = "THWFingerprint.findByCreator", query = "SELECT t FROM THWFingerprint t WHERE t.creator = :creator"),
    @NamedQuery(name = "THWFingerprint.findBySort", query = "SELECT t FROM THWFingerprint t WHERE t.sort = :sort")})
public class THWFingerprint implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FingerprintID")
    private String fingerprintID;
    @Basic(optional = false)
    @Column(name = "UserID")
    private String userID;
    @Basic(optional = false)
    @Column(name = "Createtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Basic(optional = false)
    @Column(name = "Creator")
    private String creator;
    @Lob
    @Column(name = "Features")
    private String features;
    @Column(name = "Sort")
    private Integer sort;
    @Lob
    @Column(name = "Fingerprint")
    private String fingerprint;

    public THWFingerprint() {
    }

    public THWFingerprint(String fingerprintID) {
        this.fingerprintID = fingerprintID;
    }

    public THWFingerprint(String fingerprintID, String userID, Date createtime, String creator) {
        this.fingerprintID = fingerprintID;
        this.userID = userID;
        this.createtime = createtime;
        this.creator = creator;
    }

    public String getFingerprintID() {
        return fingerprintID;
    }

    public void setFingerprintID(String fingerprintID) {
        this.fingerprintID = fingerprintID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fingerprintID != null ? fingerprintID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof THWFingerprint)) {
            return false;
        }
        THWFingerprint other = (THWFingerprint) object;
        if ((this.fingerprintID == null && other.fingerprintID != null) || (this.fingerprintID != null && !this.fingerprintID.equals(other.fingerprintID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.THWFingerprint[ fingerprintID=" + fingerprintID + " ]";
    }
    
}
