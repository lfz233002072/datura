/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.service;

import datura.DBHelper;
import static datura.DBHelper.getConnection;
import datura.Security.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lfz
 */
public class UserInfoServiceImp implements UserInfoService {

    @Override
    public UserInfo GetUserInfoByUserName(String username) {
        UserInfo userInfo = null;

        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;
        String sql = String.format("select * from Sys_Users where Username='%s'", username);
        try {
            conn = DBHelper.getConnection();
            stmt = conn.createStatement();
            result = stmt.executeQuery(sql);
            if (result.next()) {
                userInfo = new UserInfo();
                userInfo.setUserId(result.getString("Id"));
                userInfo.setUsername(result.getString("Username"));
                userInfo.setRealname(result.getString("Realname"));
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserInfoServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBHelper.free(result, stmt, conn);
        }
        try {
            sql = "SELECT * FROM Sys_Roles\n"
                    + "WHERE EXISTS(\n"
                    + "	SELECT RoleId FROM Sys_UserRoleRelationShips WHERE userid='%1$s'\n"
                    + "	UNION ALL\n"
                    + "	SELECT RoleId FROM Hr_PositionRoleRelationShips \n"
                    + "	WHERE EXISTS(\n"
                    + "		SELECT * FROM Hr_DepartmentPosition AS DP\n"
                    + "		INNER JOIN Hr_Employee AS EMP ON DP.ID=EMP.DepartmentPositionId WHERE EMP.userid='%1$s'))";
            sql = String.format(sql, userInfo.getUserId()); 
            conn = DBHelper.getConnection();
            stmt = conn.createStatement();
            result = stmt.executeQuery(sql);
            while (result.next()) {
                UserRole tempVar2 = new UserRole();
                tempVar2.setName(result.getString("Name"));
                tempVar2.setId(result.getString("Id"));
                tempVar2.setActive(result.getBoolean("Active"));
                tempVar2.setAreaCode(result.getString("AreaCode"));
                tempVar2.setDescription(result.getString("Description"));
                tempVar2.setExtCode(result.getString("ExtCode"));
                userInfo.getRoles().add(tempVar2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserInfoServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBHelper.free(result, stmt, conn);
        }
        //获取通用权限
//            sql = "SELECT MR.Id ModuleRightsId, mr.RightValue,g.EnglishName GroupName,m.EnglishName ModuleName,G.Id GroupId,M.Id Moduleid \n"
//                    + "FROM Sys_ModuleRights AS MR INNER JOIN Sys_Module AS M ON MR.ModuleId=M.Id INNER JOIN Sys_ModuleGroup AS G ON M.GroupId=G.Id\n"
//                    + "WHERE MR.RightType=0 AND M.DelFlag=0 AND G.DelFlag=0 AND M.DataStatus=1 AND G.DataStatus=1";
//            result = DBHelper.executeQuery(sql);
//            Collection<PermissionRecord> commonRecords = new ArrayList<>();
//            while (result.next()) {
//                PermissionRecord tempVar2 = new PermissionRecord();
//                tempVar2.setModuleRightsId(result.getString("ModuleRightsId"));
//                tempVar2.setRightValue(RightValue.forValue(result.getInt("RightValue")));
//                tempVar2.setGroupId(result.getString("GroupId"));
//                tempVar2.setGroupName(result.getString("GroupName"));
//                tempVar2.setModuleName(result.getString("ModuleName"));
//                tempVar2.setModuleId(result.getString("Moduleid"));
//                commonRecords.add(tempVar2);
//            }
//            for (UserRole role : roles) {
//                //配置权限更新
//                sql = "SELECT MR.Id ModuleRightsId, mr.RightValue,g.EnglishName GroupName,m.EnglishName ModuleName,G.Id GroupId,M.Id Moduleid \n"
//                        + "FROM Sys_ModuleRights AS MR INNER JOIN Sys_Module AS M ON MR.ModuleId=M.Id \n"
//                        + "INNER JOIN Sys_ModuleGroup AS G ON M.GroupId=G.Id INNER JOIN Sys_Rights AS R ON R.ModuleRightsId=MR.Id\n"
//                        + "WHERE MR.RightType!=0 AND M.DelFlag=0 AND G.DelFlag=0 AND M.DataStatus=1 AND G.DataStatus=1\n"
//                        + "	AND R.RoleId='%1$s'";
//                sql = String.format(sql, role.getId());
//                result = DBHelper.executeQuery(sql);
//                while (result.next()) {
//                    PermissionRecord tempVar2 = new PermissionRecord();
//                    tempVar2.setModuleRightsId(result.getString("ModuleRightsId"));
//                    tempVar2.setRightValue(RightValue.forValue(result.getInt("RightValue")));
//                    tempVar2.setGroupId(result.getString("GroupId"));
//                    tempVar2.setGroupName(result.getString("GroupName"));
//                    tempVar2.setModuleName(result.getString("ModuleName"));
//                    tempVar2.setModuleId(result.getString("Moduleid"));
//                    role.getPermissionRecords().add(tempVar2);
//                }
//                for (PermissionRecord r : commonRecords) {
//                    PermissionRecord tempVar4 = new PermissionRecord();
//                    tempVar4.setGroupName(r.getGroupName());
//                    tempVar4.setModuleName(r.getModuleName());
//                    tempVar4.setPluginName("");
//                    tempVar4.setRightValue(r.getRightValue());
//                    tempVar4.setGroupId(r.getGroupId() );
//                    tempVar4.setModuleId(r.getModuleId());
//                    tempVar4.setModuleRightsId(r.getModuleRightsId());
//                    role.getPermissionRecords().add(tempVar4);
//                }
//            }

        return userInfo;
    }

    @Override
    public UserInfo Login(String userName, String password) {
        UserInfo userInfo = null;
        String sql = String.format("select * from Sys_Users where Username='%1$s' and password='%2$s' ", userName, password);
        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;
        try {
            conn = DBHelper.getConnection();
            stmt = conn.createStatement();
            result = stmt.executeQuery(sql);
            if (result.next()) {
                userInfo = new UserInfo();
                userInfo.setUsername(result.getString("Username"));
                userInfo.setUserId(result.getString("Id"));
                userInfo.setRealname(result.getString("Realname"));
            } 

        } catch (SQLException ex) {
            Logger.getLogger(UserInfoServiceImp.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBHelper.free(result, stmt, conn);
        }
        return userInfo;
    }

    @Override
    public void DeleteUser(String userId) {
        String sql = String.format("delete from Sys_Users where Id='%s'", userId);
        DBHelper.executeNonQuery(sql);
    }

    @Override
    public String GetUserNameById(String id) {
        String username = "";
        String sql = String.format("select * from Sys_Users where Id='%s'", id);
        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;
        try {
            conn = DBHelper.getConnection();
            stmt = conn.createStatement();
            result = stmt.executeQuery(sql);
            if (result.next()) {
                username = result.getString("Realname");
            } 
        } catch (SQLException ex) {
            Logger.getLogger(UserInfoServiceImp.class
                    .getName()).log(Level.SEVERE, null, ex);
        }finally {
            DBHelper.free(result, stmt, conn);
        }
        return username;
    }

    @Override
    public void UpdateLastActivityInfo(String id, Date lastActivityDate, String lastActivityIp) {

    }

    @Override
    public void UpdateLoginTimes(String id) {

    }

    @Override
    public boolean CheckSupperAdmin() {

        return false;
    }

    @Override
    public String GerRealName(String userid) {
        String username = "";
        String sql = String.format("select * from Sys_Users where Id='%s'", userid);
        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;
        try {
            conn = DBHelper.getConnection();
            stmt = conn.createStatement();
            result = stmt.executeQuery(sql);
            if (result.next()) {
                username = result.getString("Realname");
            }  
        } catch (SQLException ex) {
            Logger.getLogger(UserInfoServiceImp.class
                    .getName()).log(Level.SEVERE, null, ex);
        }finally {
            DBHelper.free(result, stmt, conn);
        }
        return username;
    }

}
