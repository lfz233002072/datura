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
public enum InternalUserRoleType {

    /**
     * 系统超级管理员
     *
     */
    InternalSupperAdmin,
    /**
     * 系统用户
     *
     */
    InternalSystemUser,
    /**
     * 企业库用户
     *
     */
    InternalEnterUser,
    /**
     * 企业库普通用户
     *
     */
    InternalEnterEmp,
    /**
     * 专家账户
     *
     */
    InternalExpertUser;

    public int getValue() {
        return this.ordinal();
    }

    public static InternalUserRoleType forValue(int value) {
        return values()[value];
    }
}
