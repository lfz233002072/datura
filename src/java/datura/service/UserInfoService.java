/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.service;

import datura.Security.UserInfo;

/**
 *
 * @author lfz
 */
public interface UserInfoService {

    /**      *
     *
     * @param username
     * @return
     */
    UserInfo GetUserInfoByUserName(String username);

    /**      *
     *
     * @param userName
     * @param password MD5加密过的密码
     * @return
     */
    UserInfo Login(String userName, String password);

    /**
     * 删除用户
     *
     * @param userId
     */
    void DeleteUser(String userId);

    /**
     * 根据用户Id获取用户名
     *
     * @param id
     * @return
     */
    String GetUserNameById(String id);

    /**
     * 最近活动信息更新
     *
     * @param id
     * @param lastActivityDate
     * @param lastActivityIp
     */
    void UpdateLastActivityInfo(String id, java.util.Date lastActivityDate, String lastActivityIp);

    /**      *
     *
     * @param id
     */
    void UpdateLoginTimes(String id);

    /**
     * 检查管理员角色是否存在且有效
     *
     * @return
     */
    boolean CheckSupperAdmin();

    /**
     * 获取用户姓名
     *
     * @param userid
     * @return
     */
    String GerRealName(String userid);
}
