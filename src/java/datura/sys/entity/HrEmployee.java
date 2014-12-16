/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.sys.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lfz
 */
@Entity
@Table(name = "Hr_Employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HrEmployee.findAll", query = "SELECT h FROM HrEmployee h"),
    @NamedQuery(name = "HrEmployee.findById", query = "SELECT h FROM HrEmployee h WHERE h.id = :id"),
    @NamedQuery(name = "HrEmployee.findByRealName", query = "SELECT h FROM HrEmployee h WHERE h.realName = :realName"),
    @NamedQuery(name = "HrEmployee.findByUserId", query = "SELECT h FROM HrEmployee h WHERE h.userId = :userId"),
    @NamedQuery(name = "HrEmployee.findBySex", query = "SELECT h FROM HrEmployee h WHERE h.sex = :sex"),
    @NamedQuery(name = "HrEmployee.findByTel", query = "SELECT h FROM HrEmployee h WHERE h.tel = :tel"),
    @NamedQuery(name = "HrEmployee.findByMoblie", query = "SELECT h FROM HrEmployee h WHERE h.moblie = :moblie"),
    @NamedQuery(name = "HrEmployee.findByIdNo", query = "SELECT h FROM HrEmployee h WHERE h.idNo = :idNo"),
    @NamedQuery(name = "HrEmployee.findByDepartmentPositionId", query = "SELECT h FROM HrEmployee h WHERE h.departmentPositionId = :departmentPositionId")})
public class HrEmployee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "RealName")
    private String realName;
    @Column(name = "UserId")
    private String userId;
    @Column(name = "Sex")
    private Integer sex;
    @Column(name = "Tel")
    private String tel;
    @Column(name = "Moblie")
    private String moblie;
    @Column(name = "IdNo")
    private String idNo;
    @Column(name = "DepartmentPositionId")
    private String departmentPositionId;

    public HrEmployee() {
    }

    public HrEmployee(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getDepartmentPositionId() {
        return departmentPositionId;
    }

    public void setDepartmentPositionId(String departmentPositionId) {
        this.departmentPositionId = departmentPositionId;
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
        if (!(object instanceof HrEmployee)) {
            return false;
        }
        HrEmployee other = (HrEmployee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datura.data.HrEmployee[ id=" + id + " ]";
    }
    
}
