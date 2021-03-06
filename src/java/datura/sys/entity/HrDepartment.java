package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1



/**
 * HrDepartment generated by hbm2java
 */
public class HrDepartment  implements java.io.Serializable {


     private String id;
     private String name;
     private String description;
     private Integer deptmentType;
     private String areaCode;
     private String rootId;
     private String parentId;
     private Integer visitLevel;
     private String visitPath;
     private Byte delFlag;

    public HrDepartment() {
    }

	
    public HrDepartment(String id) {
        this.id = id;
    }
    public HrDepartment(String id, String name, String description, Integer deptmentType, String areaCode, String rootId, String parentId, Integer visitLevel, String visitPath, Byte delFlag) {
       this.id = id;
       this.name = name;
       this.description = description;
       this.deptmentType = deptmentType;
       this.areaCode = areaCode;
       this.rootId = rootId;
       this.parentId = parentId;
       this.visitLevel = visitLevel;
       this.visitPath = visitPath;
       this.delFlag = delFlag;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getDeptmentType() {
        return this.deptmentType;
    }
    
    public void setDeptmentType(Integer deptmentType) {
        this.deptmentType = deptmentType;
    }
    public String getAreaCode() {
        return this.areaCode;
    }
    
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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
    public Byte getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }




}


