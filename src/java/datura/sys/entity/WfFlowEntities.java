package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * WfFlowEntities generated by hbm2java
 */
public class WfFlowEntities  implements java.io.Serializable {


     private String id;
     private String entityId;
     private String flowId;
     private String flowTypeName;
     private String flowTypeCode;
     private String systemName;
     private String createUserId;
     private Date createDataTime;
     private String flowModelName;

    public WfFlowEntities() {
    }

	
    public WfFlowEntities(String id) {
        this.id = id;
    }
    public WfFlowEntities(String id, String entityId, String flowId, String flowTypeName, String flowTypeCode, String systemName, String createUserId, Date createDataTime, String flowModelName) {
       this.id = id;
       this.entityId = entityId;
       this.flowId = flowId;
       this.flowTypeName = flowTypeName;
       this.flowTypeCode = flowTypeCode;
       this.systemName = systemName;
       this.createUserId = createUserId;
       this.createDataTime = createDataTime;
       this.flowModelName = flowModelName;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getEntityId() {
        return this.entityId;
    }
    
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
    public String getFlowId() {
        return this.flowId;
    }
    
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }
    public String getFlowTypeName() {
        return this.flowTypeName;
    }
    
    public void setFlowTypeName(String flowTypeName) {
        this.flowTypeName = flowTypeName;
    }
    public String getFlowTypeCode() {
        return this.flowTypeCode;
    }
    
    public void setFlowTypeCode(String flowTypeCode) {
        this.flowTypeCode = flowTypeCode;
    }
    public String getSystemName() {
        return this.systemName;
    }
    
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }
    
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }
    public Date getCreateDataTime() {
        return this.createDataTime;
    }
    
    public void setCreateDataTime(Date createDataTime) {
        this.createDataTime = createDataTime;
    }
    public String getFlowModelName() {
        return this.flowModelName;
    }
    
    public void setFlowModelName(String flowModelName) {
        this.flowModelName = flowModelName;
    }




}

