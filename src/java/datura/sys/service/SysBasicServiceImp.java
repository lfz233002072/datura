/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.sys.service;

import datura.sys.service.UserInfoServiceImp;
import datura.DBHelper;
import static datura.DBHelper.getConnection;
import datura.dao.SysHibernateUtil;
import datura.enums.TreeLevel;
import datura.models.*;
import datura.sys.entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author lfz
 */
public class SysBasicServiceImp implements ISysBasicService {

    /**
     * 生成模块组路径
     *
     * @param parentId 父模块组ID
     * @param pathUnit
     * @return
     */
    public final String GenerateModuleGroupPath(String parentId, int pathUnit) {
//        if (_dbContext == null) {
//            return "";
//        }
//        ObjectResult<String> data = _dbContext.up_Sys_GenerateModuleGroupPath(parentId, pathUnit);
//        if (data != null) {
//            return ((data.FirstOrDefault()) != null) ? data.FirstOrDefault() : "";
//        }
        return "";
    }

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
    public final List<Sys_ModuleGroup> GetModuleGroups(String userId, String parentGroupId, TreeLevel groupLevel, boolean isSupperAdmin, int pathUnit) {

        Session session = SysHibernateUtil.getSessionFactory().openSession();
        List<Sys_ModuleGroup> list = new ArrayList<>(); 
        try {

            SQLQuery query = session.createSQLQuery("{ call up_Sys_GetModuleGroups(?,?,?,?,?)}").addEntity(SysModuleGroup.class);
             
            query.setString(0, userId);
            query.setString(1, parentGroupId);
            query.setInteger(2, pathUnit);
            query.setInteger(3, groupLevel.getValue());
            query.setInteger(4, isSupperAdmin ? 1 : 0); 
            List<SysModuleGroup> result =  query.list();
            int i=0;
            while (i<result.size()) {
                SysModuleGroup temp =result.get(i);
                Sys_ModuleGroup tempVar = new Sys_ModuleGroup();
                tempVar.setId(temp.getId());
                tempVar.setDescription(temp.getDescription());
                tempVar.setDisplayName(temp.getDisplayName());
                tempVar.setEnglishName(temp.getEnglishName());
                tempVar.setImgUrl(temp.getImgUrl());
                list.add(tempVar);
                i++;
            }
        } catch (Exception ex) {
            System.out.println("GetModuleGroups: ex " + ex.getMessage());
            Logger.getLogger(UserInfoServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return list;
    }

    /**
     * 获取系统模块列表
     *
     * @param userId 登录用户ID
     * @param groupId 归属模块组
     * @param isSupperAdmin 是否超级管理员
     * @return
     */
    public final List<Sys_Module> GetModules(String userId, String groupId, Boolean isSupperAdmin) {
        List<Sys_Module> list = new ArrayList<>(); 
        Session session = SysHibernateUtil.getSessionFactory().openSession();
        try {
           SQLQuery query = session.createSQLQuery("{ call up_Sys_GetModules(?,?,?)}").addEntity(SysModule.class);
             
            query.setString(0, userId);
            query.setString(1, groupId);
            query.setBoolean(2, isSupperAdmin);
            List<SysModule> result =  query.list();
            int i=0;
            while (i<result.size()) {
                SysModule temp =result.get(i);
                Sys_Module tempVar = new Sys_Module();
                tempVar.setDataSort(temp.getDataSort());
                tempVar.setId(temp.getId());
                tempVar.setDescription(temp.getDescription());
                tempVar.setDisplayName(temp.getDisplayName());
                tempVar.setEnglishName(temp.getEnglishName());
                tempVar.setImgUrl(temp.getImgUrl());
                tempVar.setGroupId(temp.getGroupId());
                tempVar.setUrl(temp.getUrl());
                list.add(tempVar);
                i++;
            } 
        } catch (Exception ex) {
            Logger.getLogger(UserInfoServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public void RegisterDefaultModule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
