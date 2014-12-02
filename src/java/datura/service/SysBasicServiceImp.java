/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.service;

import datura.DBHelper;
import static datura.DBHelper.getConnection;
import datura.enums.TreeLevel;
import datura.models.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        List<Sys_ModuleGroup> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet result = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement("{ call up_Sys_GetModuleGroups(?,?,?,?,?)}");
            pstmt.setString(1, userId);
            pstmt.setString(2, parentGroupId);
            pstmt.setInt(3, pathUnit);
            pstmt.setInt(4, groupLevel.getValue());
            pstmt.setInt(5, isSupperAdmin ? 1 : 0);
            result = pstmt.executeQuery();
            while (result.next()) {
                Sys_ModuleGroup tempVar = new Sys_ModuleGroup();
                tempVar.setId(result.getString("Id"));
                tempVar.setDescription(result.getString("Description"));
                tempVar.setDisplayName(result.getString("DisplayName"));
                tempVar.setEnglishName(result.getString("EnglishName"));
                tempVar.setImgUrl(result.getString("ImgUrl"));
                list.add(tempVar); 
            }
        } catch (SQLException ex) {
            System.out.println("GetModuleGroups: ex " + ex.getMessage());
            Logger.getLogger(UserInfoServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBHelper.free(result, pstmt, conn);
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
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet result = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement("{ call up_Sys_GetModules(?,?,?)}");
            pstmt.setString(1, userId);
            pstmt.setString(2, groupId);
            pstmt.setBoolean(3, isSupperAdmin);
            result = pstmt.executeQuery();
            while (result.next()) {
                Sys_Module tempVar = new Sys_Module();
                tempVar.setDataSort(result.getInt("DataSort"));
                tempVar.setId(result.getString("Id"));
                tempVar.setDescription(result.getString("Description"));
                tempVar.setDisplayName(result.getString("DisplayName"));
                tempVar.setEnglishName(result.getString("EnglishName"));
                tempVar.setImgUrl(result.getString("ImgUrl"));
                tempVar.setGroupId(result.getString("GroupId"));
                tempVar.setUrl(result.getString("Url"));
                list.add(tempVar);
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserInfoServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBHelper.free(result, pstmt, conn);
        }
        return list;
    }

    @Override
    public void RegisterDefaultModule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
