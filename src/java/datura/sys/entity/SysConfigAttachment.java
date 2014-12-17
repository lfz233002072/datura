package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1



/**
 * SysConfigAttachment generated by hbm2java
 */
public class SysConfigAttachment  implements java.io.Serializable {


     private String id;
     private String description;
     private String name;
     private String code;
     private String fileExtensions;
     private String maxSize;
     private Byte singleOrMulti;
     private Integer dataSort;
     private Integer visitLevel;
     private String visitPath;
     private String rootId;
     private String parentId;

    public SysConfigAttachment() {
    }

	
    public SysConfigAttachment(String id) {
        this.id = id;
    }
    public SysConfigAttachment(String id, String description, String name, String code, String fileExtensions, String maxSize, Byte singleOrMulti, Integer dataSort, Integer visitLevel, String visitPath, String rootId, String parentId) {
       this.id = id;
       this.description = description;
       this.name = name;
       this.code = code;
       this.fileExtensions = fileExtensions;
       this.maxSize = maxSize;
       this.singleOrMulti = singleOrMulti;
       this.dataSort = dataSort;
       this.visitLevel = visitLevel;
       this.visitPath = visitPath;
       this.rootId = rootId;
       this.parentId = parentId;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getFileExtensions() {
        return this.fileExtensions;
    }
    
    public void setFileExtensions(String fileExtensions) {
        this.fileExtensions = fileExtensions;
    }
    public String getMaxSize() {
        return this.maxSize;
    }
    
    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }
    public Byte getSingleOrMulti() {
        return this.singleOrMulti;
    }
    
    public void setSingleOrMulti(Byte singleOrMulti) {
        this.singleOrMulti = singleOrMulti;
    }
    public Integer getDataSort() {
        return this.dataSort;
    }
    
    public void setDataSort(Integer dataSort) {
        this.dataSort = dataSort;
    }
    public Integer getVisitLevel() {
        return this.visitLevel;
    }
    
    public void setVisitLevel(Integer visitLevel) {
        this.visitLevel = visitLevel;
    }
    public String getVisitPath() {
        return this.visitPath;
    }
    
    public void setVisitPath(String visitPath) {
        this.visitPath = visitPath;
    }
    public String getRootId() {
        return this.rootId;
    }
    
    public void setRootId(String rootId) {
        this.rootId = rootId;
    }
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }




}


