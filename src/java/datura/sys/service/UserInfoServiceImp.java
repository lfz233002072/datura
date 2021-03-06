/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.sys.service;

import datura.sys.entity.*;
import datura.security.UserInfo;
import datura.security.UserRole;
import datura.DBHelper;
import static datura.DBHelper.getConnection;
import datura.dao.HibernateBasicDao;
import datura.dao.IBasicDao;
import datura.entity.PageOfRecords;
import datura.service.BasicService;
import datura.sys.dao.*;
import java.io.Serializable;
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
public class UserInfoServiceImp extends BasicService<SysUsers, String> implements UserInfoService {

    private SysUserDao userDao;

    public UserInfoServiceImp() {
        super(new SysUserDao());
    }

    @Override
    public UserInfo GetUserInfoByUserName(String username) {
        LinkedHashMap<Object, Object> equalFields = new LinkedHashMap<Object, Object>();
        equalFields.put("username", username);
        SysUsers temp = get(equalFields);
        UserInfo userInfo = null;
        if (temp != null) {
            userInfo = new UserInfo();
            userInfo.setUserId(temp.getId());
            userInfo.setUsername(temp.getUsername());
            userInfo.setRealname(temp.getRealname());
        } else {
            return null;
        }

        SysRolesDao roleDao = new SysRolesDao();
        String sql = "WHERE EXISTS(\n"
                + "	SELECT 1 FROM SysUserRoleRelationShips as s WHERE userid='%1$s' and s.roleId =o.id)";
        sql = String.format(sql, userInfo.getUserId());

        List<SysRoles> list = roleDao.findResultList(null, null, null, null, null, sql);

        int i = 0;
        while (i < list.size()) {
            SysRoles result = list.get(i);
            UserRole tempVar2 = new UserRole();
            tempVar2.setName(result.getName());
            tempVar2.setId(result.getId());
            tempVar2.setActive(result.getActive() == 0 ? false : true);
            tempVar2.setAreaCode(result.getAreaCode());
            tempVar2.setDescription(result.getDescription());
            tempVar2.setExtCode(result.getExtCode());
            userInfo.getRoles().add(tempVar2);
            i++;
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
/*  select o from datura.sys.entity.SysRoles as o 
         WHERE EXISTS( 
                SELECT roleId FROM datura.sys.entity.SysUserRoleRelationShips 
                    WHERE userid='58FC7E03-A393-47AE-BBA3-46853AC8BCBE' 
                UNION ALL 
                SELECT roleId FROM datura.sys.entity.HrPositionRoleRelationShips 
                    WHERE EXISTS( 
                            SELECT * FROM datura.sys.entity.HrDepartmentPosition AS DP 
                            INNER JOIN HrEmployee AS EMP ON DP.ID=EMP.departmentPositionId 
                            WHERE EMP.userid='58FC7E03-A393-47AE-BBA3-46853AC8BCBE')
        )
       
         */
        return userInfo;
    }

    @Override
    public UserInfo Login(String userName, String password
    ) {
        LinkedHashMap<Object, Object> equalFields = new LinkedHashMap<Object, Object>();
        equalFields.put("username", userName);
        equalFields.put("password", password);
        SysUsers temp = get(equalFields);
        UserInfo userInfo = null;
        if (temp != null) {
            userInfo = new UserInfo();
            userInfo.setUserId(temp.getId());
            userInfo.setUsername(temp.getUsername());
            userInfo.setRealname(temp.getRealname());
        } else {
            return null;
        }
        return userInfo;
    }

    @Override
    public void DeleteUser(String userId
    ) {
        this.delete(userId);
    }

    @Override
    public String GetUserNameById(String id
    ) {
        LinkedHashMap<Object, Object> equalFields = new LinkedHashMap<Object, Object>();
        equalFields.put("id", id);
        SysUsers temp = get(equalFields);
        if (temp != null) {
            return temp.getUsername();
        } else {
            return "";
        }
    }

    @Override
    public void UpdateLastActivityInfo(String id, Date lastActivityDate, String lastActivityIp
    ) {
        LinkedHashMap<Object, Object> equalFields = new LinkedHashMap<Object, Object>();
        equalFields.put("id", id);
        SysUsers temp = get(equalFields);
        if (temp != null) {
            temp.setLastActivityDate(lastActivityDate);
            temp.setLastIpAddress(lastActivityIp);
            this.update(temp);
        }
    }

    @Override
    public void UpdateLoginTimes(String id
    ) {
        LinkedHashMap<Object, Object> equalFields = new LinkedHashMap<Object, Object>();
        equalFields.put("id", id);
        SysUsers temp = get(equalFields);
        if (temp != null) {
            temp.setLoginTimes(temp.getLoginTimes() + 1);
            this.update(temp);
        }
    }

    @Override
    public boolean CheckSupperAdmin() {

        return false;
    }

    @Override
    public String GerRealName(String userid
    ) {

        LinkedHashMap<Object, Object> equalFields = new LinkedHashMap<Object, Object>();
        equalFields.put("id", userid);
        SysUsers temp = get(equalFields);
        if (temp != null) {
            return temp.getUsername();
        } else {
            return "";
        }
    }

}
