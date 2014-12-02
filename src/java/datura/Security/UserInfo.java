/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.Security;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author lfz
 */
public class UserInfo {

    /**
     * *
     *
     */
    public UserInfo() {

    }

    /**
     * *
     *
     */
    public UserInfo(Iterable<UserRole> roles) {

        java.util.ArrayList<UserRole> list = new java.util.ArrayList<UserRole>();

        for (UserRole role : roles) {
            list.add(role);
        }
        _userInfoRoles = list;
    }

    private java.util.Collection<UserRole> _userInfoRoles;
    /**
     * Gets or sets the customer Guid
     *
     */
    private String privateUserId = "";

    public final String getUserId() {
        return privateUserId;
    }

    public final void setUserId(String value) {
        privateUserId = value;
    }

    /**
     * Gets or sets the username
     *
     */
    private String privateUsername;

    public final String getUsername() {
        return privateUsername;
    }

    public final void setUsername(String value) {
        privateUsername = value;
    }
    /**
     * Gets or sets the email
     *
     */
    private String privateEmail;

    public final String getEmail() {
        return privateEmail;
    }

    public final void setEmail(String value) {
        privateEmail = value;
    }
    /**
     * Gets or sets the password
     *
     */
    private String privatePassword;

    public final String getPassword() {
        return privatePassword;
    }

    public final void setPassword(String value) {
        privatePassword = value;
    }

    /**
     * 是否为超级管理员
     *
     */
    public final boolean getIsSupperAdmin() {
        java.util.Collection<UserRole> list = getRoles();
        for (UserRole role : list) {
            if (UserRole.getSupperAdminRoleId().equals(role.getId())
                    || InternalUserRoleType.InternalSupperAdmin.toString().equals(role.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets or sets the permission records
     *
     */
    public java.util.Collection<UserRole> getRoles() {
        return (_userInfoRoles != null) ? _userInfoRoles : (_userInfoRoles = new java.util.ArrayList<UserRole>());
    }

    protected void setRoles(java.util.Collection<UserRole> value) {
        _userInfoRoles = value;
    }

    /**
     * *
     *
     */
    public Iterable<PermissionRecord> getPermissionRecords() {

        java.util.Collection<PermissionRecord> records = new ArrayList<>();
        java.util.Collection<UserRole> list = getRoles();
        for (UserRole role : list) {
            if (role.getPermissionRecords().isEmpty() == false) {
                records.addAll(role.getPermissionRecords());
            }
        }
        return records;
    }

    /**
     * 是否为指定角色
     *
     * @param name 角色名称
     * @return
     */
    public boolean IsInRole(String name) {
        if (name == null) {
            return false;
        }
        java.util.Collection<UserRole> list = getRoles();
        for (UserRole role : list) {
            if (name.equalsIgnoreCase(role.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 是否为指定角色
     *
     * @param roleType 角色类型
     * @return
     */
    public boolean IsInRole(InternalUserRoleType roleType) {
        return IsInRole(roleType.toString());
    }

    /**
     * 是否为指定角色
     *
     * @param roleId 角色ID
     * @return
     */
    public boolean IsInRoleByRoleId(String roleId) {
        if (roleId == null) {
            return false;
        }
        java.util.Collection<UserRole> list = getRoles();
        for (UserRole role : list) {
            if (roleId.equalsIgnoreCase(role.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 是否有该权限
     *
     * @param systemName 模块组代码_模块代码
     * @param rightValue
     * @return
     */
    public final boolean HasRight(String systemName, RightValue rightValue) {
        boolean flag = false;
        if (systemName == null) {
            return true;
        }
        Iterable<PermissionRecord> list = getPermissionRecords();
        int intrightValue = rightValue.getValue();
        for (PermissionRecord record : list) {
            if (record != null && ((record.getRightValue().getValue() & intrightValue) == 0)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Gets or sets the last IP address
     *
     */
    private String privateLastIpAddress;

    public final String getLastIpAddress() {
        return privateLastIpAddress;
    }

    public final void setLastIpAddress(String value) {
        privateLastIpAddress = value;
    }

    /**
     * Gets or sets the date and time of last login
     *
     */
    private java.util.Date privateLastLoginDate;

    public final java.util.Date getLastLoginDate() {
        return privateLastLoginDate;
    }

    public final void setLastLoginDate(java.util.Date value) {
        privateLastLoginDate = value;
    }

    /**
     * Gets or sets the date and time of last activity
     *
     */
    private java.util.Date privateLastActivityDate = new java.util.Date(0);

    public final java.util.Date getLastActivityDate() {
        return privateLastActivityDate;
    }

    public final void setLastActivityDate(java.util.Date value) {
        privateLastActivityDate = value;
    }

    /**
     * 登录次数
     *
     */
    private Integer privateLoginTimes;

    public final Integer getLoginTimes() {
        return privateLoginTimes;
    }

    public final void setLoginTimes(Integer value) {
        privateLoginTimes = value;
    }

    private String realname = "";

    public final void setRealname(String value) {
        realname = value;
    }

    public final String getRealname() {
        return realname;
    }

}
