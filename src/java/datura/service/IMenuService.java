/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.service;

import datura.models.Sys_Module;
import datura.models.Sys_ModuleGroup;
import datura.*;
import datura.enums.*;
import java.util.Collection;
import java.util.List;

/**
 * *
 *
 *
 * /**
 * 菜单服务
 *
 */
public interface IMenuService {

    /**
     * 获取系统模块组列表
     *
     * @param userId 登录用户ID
     * @param parentGroupId 父模块组ID
     * @param groupLevel 模块层级
     * @param isSupperAdmin 是否超级管理员
     * @param pathUnit 路径长度
     * @return
     */ 
    List<Sys_ModuleGroup> GetModuleGroups(String userId, String parentGroupId, TreeLevel groupLevel, boolean isSupperAdmin, int pathUnit);

    /**
     * 获取系统模块列表
     *
     * @param userId 登录用户ID
     * @param groupId 归属模块组
     * @param isSupperAdmin 是否超级管理员
     * @return
     */
    List<Sys_Module> GetModules(String userId, String groupId, Boolean isSupperAdmin);

}
