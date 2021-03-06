package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1



/**
 * SysPersonalQualifications generated by hbm2java
 */
public class SysPersonalQualifications  implements java.io.Serializable {


     private String id;
     private String description;
     private String rootId;
     private String parentId;
     private Integer dataSort;
     private Byte delFlag;
     private Integer visitLevel;
     private String visitPath;
     private String name;
     private String shortName;
     private String code;
     private String ruleExpression;
     private Integer customField1;
     private String customField2;
     private String customField3;
     private Byte hasChild;

    public SysPersonalQualifications() {
    }

	
    public SysPersonalQualifications(String id) {
        this.id = id;
    }
    public SysPersonalQualifications(String id, String description, String rootId, String parentId, Integer dataSort, Byte delFlag, Integer visitLevel, String visitPath, String name, String shortName, String code, String ruleExpression, Integer customField1, String customField2, String customField3, Byte hasChild) {
       this.id = id;
       this.description = description;
       this.rootId = rootId;
       this.parentId = parentId;
       this.dataSort = dataSort;
       this.delFlag = delFlag;
       this.visitLevel = visitLevel;
       this.visitPath = visitPath;
       this.name = name;
       this.shortName = shortName;
       this.code = code;
       this.ruleExpression = ruleExpression;
       this.customField1 = customField1;
       this.customField2 = customField2;
       this.customField3 = customField3;
       this.hasChild = hasChild;
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
    public Integer getDataSort() {
        return this.dataSort;
    }
    
    public void setDataSort(Integer dataSort) {
        this.dataSort = dataSort;
    }
    public Byte getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
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
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getShortName() {
        return this.shortName;
    }
    
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getRuleExpression() {
        return this.ruleExpression;
    }
    
    public void setRuleExpression(String ruleExpression) {
        this.ruleExpression = ruleExpression;
    }
    public Integer getCustomField1() {
        return this.customField1;
    }
    
    public void setCustomField1(Integer customField1) {
        this.customField1 = customField1;
    }
    public String getCustomField2() {
        return this.customField2;
    }
    
    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }
    public String getCustomField3() {
        return this.customField3;
    }
    
    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }
    public Byte getHasChild() {
        return this.hasChild;
    }
    
    public void setHasChild(Byte hasChild) {
        this.hasChild = hasChild;
    }




}


