package datura.sys.entity;
// Generated 2014-12-17 22:28:15 by Hibernate Tools 4.3.1



/**
 * HrPositionRoleRelationShips generated by hbm2java
 */
public class HrPositionRoleRelationShips  implements java.io.Serializable {


     private String id;
     private String positionId;
     private String roleId;

    public HrPositionRoleRelationShips() {
    }

    public HrPositionRoleRelationShips(String id, String positionId, String roleId) {
       this.id = id;
       this.positionId = positionId;
       this.roleId = roleId;
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
    public String getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }




}


