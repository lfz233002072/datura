package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * WfEntitiesProcess generated by hbm2java
 */
public class WfEntitiesProcess  implements java.io.Serializable {


     private String id;
     private String entityId;
     private String flowId;
     private String nodeId;
     private String nodeCode;
     private String nodeName;
     private String sender;
     private String senderName;
     private Byte submitOrReturn;
     private Date sendTime;
     private String parentNodeId;
     private String entitiesType;
     private String systemName;

    public WfEntitiesProcess() {
    }

	
    public WfEntitiesProcess(String id) {
        this.id = id;
    }
    public WfEntitiesProcess(String id, String entityId, String flowId, String nodeId, String nodeCode, String nodeName, String sender, String senderName, Byte submitOrReturn, Date sendTime, String parentNodeId, String entitiesType, String systemName) {
       this.id = id;
       this.entityId = entityId;
       this.flowId = flowId;
       this.nodeId = nodeId;
       this.nodeCode = nodeCode;
       this.nodeName = nodeName;
       this.sender = sender;
       this.senderName = senderName;
       this.submitOrReturn = submitOrReturn;
       this.sendTime = sendTime;
       this.parentNodeId = parentNodeId;
       this.entitiesType = entitiesType;
       this.systemName = systemName;
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
    public String getNodeId() {
        return this.nodeId;
    }
    
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
    public String getNodeCode() {
        return this.nodeCode;
    }
    
    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }
    public String getNodeName() {
        return this.nodeName;
    }
    
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    public String getSender() {
        return this.sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getSenderName() {
        return this.senderName;
    }
    
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    public Byte getSubmitOrReturn() {
        return this.submitOrReturn;
    }
    
    public void setSubmitOrReturn(Byte submitOrReturn) {
        this.submitOrReturn = submitOrReturn;
    }
    public Date getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }
    
    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }
    public String getEntitiesType() {
        return this.entitiesType;
    }
    
    public void setEntitiesType(String entitiesType) {
        this.entitiesType = entitiesType;
    }
    public String getSystemName() {
        return this.systemName;
    }
    
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }




}


