/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.security;

/**
 *
 * @author lfz
 */
public class UserRole {

    /**
     * 超级管理员角色ID
     *
     */
    public static String getSupperAdminRoleId() {
        return "F60DE9BA-1ECC-4ADB-0426-98407C407D5C";
    }

    private java.util.Collection<PermissionRecord> _permissionRecords;

    private String privateId = "";

    public final String getId() {
        return privateId;
    }

    public final void setId(String value) {
        privateId = value;
    }
    private String privateDescription;

    public final String getDescription() {
        return privateDescription;
    }

    public final void setDescription(String value) {
        privateDescription = value;
    }
    private Boolean privateActive;

    public final Boolean getActive() {
        return privateActive;
    }

    public final void setActive(Boolean value) {
        privateActive = value;
    }
    private String privateAreaCode;

    public final String getAreaCode() {
        return privateAreaCode;
    }

    public final void setAreaCode(String value) {
        privateAreaCode = value;
    }
    private String privateExtCode;

    public final String getExtCode() {
        return privateExtCode;
    }

    public final void setExtCode(String value) {
        privateExtCode = value;
    }
    /**
     * Gets or sets the customer role name
     *
     */
    private String privateName;

    public final String getName() {
        return privateName;
    }

    public final void setName(String value) {
        privateName = value;
    }

    /**
     * Gets or sets the permission records
     *
     */
    public java.util.Collection<PermissionRecord> getPermissionRecords() {
        return (_permissionRecords != null) ? _permissionRecords : (_permissionRecords = new java.util.ArrayList<PermissionRecord>());
    }

    protected void setPermissionRecords(java.util.Collection<PermissionRecord> value) {
        _permissionRecords = value;
    }
}
