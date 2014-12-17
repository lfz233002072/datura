package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1



/**
 * SysConfigItem generated by hbm2java
 */
public class SysConfigItem  implements java.io.Serializable {


     private String id;
     private String name;
     private String displayName;
     private String value;
     private String itemType;
     private String dataSourseType;
     private String dataSourseJsonData;
     private int dataSort;
     private String customField;
     private Integer dataPrecision;

    public SysConfigItem() {
    }

	
    public SysConfigItem(String id, int dataSort) {
        this.id = id;
        this.dataSort = dataSort;
    }
    public SysConfigItem(String id, String name, String displayName, String value, String itemType, String dataSourseType, String dataSourseJsonData, int dataSort, String customField, Integer dataPrecision) {
       this.id = id;
       this.name = name;
       this.displayName = displayName;
       this.value = value;
       this.itemType = itemType;
       this.dataSourseType = dataSourseType;
       this.dataSourseJsonData = dataSourseJsonData;
       this.dataSort = dataSort;
       this.customField = customField;
       this.dataPrecision = dataPrecision;
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
    public String getDisplayName() {
        return this.displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public String getItemType() {
        return this.itemType;
    }
    
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public String getDataSourseType() {
        return this.dataSourseType;
    }
    
    public void setDataSourseType(String dataSourseType) {
        this.dataSourseType = dataSourseType;
    }
    public String getDataSourseJsonData() {
        return this.dataSourseJsonData;
    }
    
    public void setDataSourseJsonData(String dataSourseJsonData) {
        this.dataSourseJsonData = dataSourseJsonData;
    }
    public int getDataSort() {
        return this.dataSort;
    }
    
    public void setDataSort(int dataSort) {
        this.dataSort = dataSort;
    }
    public String getCustomField() {
        return this.customField;
    }
    
    public void setCustomField(String customField) {
        this.customField = customField;
    }
    public Integer getDataPrecision() {
        return this.dataPrecision;
    }
    
    public void setDataPrecision(Integer dataPrecision) {
        this.dataPrecision = dataPrecision;
    }




}


