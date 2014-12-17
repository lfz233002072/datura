package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1



/**
 * SysLogData generated by hbm2java
 */
public class SysLogData  implements java.io.Serializable {


     private String id;
     private String logId;
     private String displayName;
     private String entityId;
     private String tableDisplayName;
     private String tableName;
     private String oldData;
     private String newData;
     private Integer operationType;
     private String assemblyQualifiedName;

    public SysLogData() {
    }

	
    public SysLogData(String id) {
        this.id = id;
    }
    public SysLogData(String id, String logId, String displayName, String entityId, String tableDisplayName, String tableName, String oldData, String newData, Integer operationType, String assemblyQualifiedName) {
       this.id = id;
       this.logId = logId;
       this.displayName = displayName;
       this.entityId = entityId;
       this.tableDisplayName = tableDisplayName;
       this.tableName = tableName;
       this.oldData = oldData;
       this.newData = newData;
       this.operationType = operationType;
       this.assemblyQualifiedName = assemblyQualifiedName;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getLogId() {
        return this.logId;
    }
    
    public void setLogId(String logId) {
        this.logId = logId;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getEntityId() {
        return this.entityId;
    }
    
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
    public String getTableDisplayName() {
        return this.tableDisplayName;
    }
    
    public void setTableDisplayName(String tableDisplayName) {
        this.tableDisplayName = tableDisplayName;
    }
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getOldData() {
        return this.oldData;
    }
    
    public void setOldData(String oldData) {
        this.oldData = oldData;
    }
    public String getNewData() {
        return this.newData;
    }
    
    public void setNewData(String newData) {
        this.newData = newData;
    }
    public Integer getOperationType() {
        return this.operationType;
    }
    
    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }
    public String getAssemblyQualifiedName() {
        return this.assemblyQualifiedName;
    }
    
    public void setAssemblyQualifiedName(String assemblyQualifiedName) {
        this.assemblyQualifiedName = assemblyQualifiedName;
    }




}


