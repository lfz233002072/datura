package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1



/**
 * HelpCategory generated by hbm2java
 */
public class HelpCategory  implements java.io.Serializable {


     private String id;
     private String categoryName;
     private String url;
     private String title;
     private String shortDescrption;
     private String descrption;
     private String icon;
     private Integer dataSort;
     private String parentId;

    public HelpCategory() {
    }

	
    public HelpCategory(String id) {
        this.id = id;
    }
    public HelpCategory(String id, String categoryName, String url, String title, String shortDescrption, String descrption, String icon, Integer dataSort, String parentId) {
       this.id = id;
       this.categoryName = categoryName;
       this.url = url;
       this.title = title;
       this.shortDescrption = shortDescrption;
       this.descrption = descrption;
       this.icon = icon;
       this.dataSort = dataSort;
       this.parentId = parentId;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getShortDescrption() {
        return this.shortDescrption;
    }
    
    public void setShortDescrption(String shortDescrption) {
        this.shortDescrption = shortDescrption;
    }
    public String getDescrption() {
        return this.descrption;
    }
    
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Integer getDataSort() {
        return this.dataSort;
    }
    
    public void setDataSort(Integer dataSort) {
        this.dataSort = dataSort;
    }
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }




}


