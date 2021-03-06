package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SysModule generated by hbm2java
 */
public class SysModule  implements java.io.Serializable {


     private String id;
     private String url;
     private String description;
     private String displayName;
     private String englishName;
     private String imgUrl;
     private String groupId;
     private Integer dataSort;
     private Integer dataStatus;
     private Byte delFlag;
     private Date createTime;
     private String createUserId;
     private Date lastUpdateTime;
     private String lastUpdateUserId;

    public SysModule() {
    }

	
    public SysModule(String id) {
        this.id = id;
    }
    public SysModule(String id, String url, String description, String displayName, String englishName, String imgUrl, String groupId, Integer dataSort, Integer dataStatus, Byte delFlag, Date createTime, String createUserId, Date lastUpdateTime, String lastUpdateUserId) {
       this.id = id;
       this.url = url;
       this.description = description;
       this.displayName = displayName;
       this.englishName = englishName;
       this.imgUrl = imgUrl;
       this.groupId = groupId;
       this.dataSort = dataSort;
       this.dataStatus = dataStatus;
       this.delFlag = delFlag;
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
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getEnglishName() {
        return this.englishName;
    }
    
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }
    
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public Integer getDataSort() {
        return this.dataSort;
    }
    
    public void setDataSort(Integer dataSort) {
        this.dataSort = dataSort;
    }
    public Integer getDataStatus() {
        return this.dataStatus;
    }
    
    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }
    public Byte getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
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


