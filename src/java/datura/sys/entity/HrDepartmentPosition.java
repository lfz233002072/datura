package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * HrDepartmentPosition generated by hbm2java
 */
public class HrDepartmentPosition  implements java.io.Serializable {


     private String id;
     private String positionId;
     private String departmentId;
     private String immediateSuperiorId;
     private Date createTime;
     private String createUserId;
     private Date lastUpdateTime;
     private String lastUpdateUserId;

    public HrDepartmentPosition() {
    }

	
    public HrDepartmentPosition(String id) {
        this.id = id;
    }
    public HrDepartmentPosition(String id, String positionId, String departmentId, String immediateSuperiorId, Date createTime, String createUserId, Date lastUpdateTime, String lastUpdateUserId) {
       this.id = id;
       this.positionId = positionId;
       this.departmentId = departmentId;
       this.immediateSuperiorId = immediateSuperiorId;
       this.createTime = createTime;
       this.createUserId = createUserId;
       this.lastUpdateTime = lastUpdateTime;
       this.lastUpdateUserId = lastUpdateUserId;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getPositionId() {
        return this.positionId;
    }
    
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    public String getImmediateSuperiorId() {
        return this.immediateSuperiorId;
    }
    
    public void setImmediateSuperiorId(String immediateSuperiorId) {
        this.immediateSuperiorId = immediateSuperiorId;
    }
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }
    
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public String getLastUpdateUserId() {
        return this.lastUpdateUserId;
    }
    
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }




}


