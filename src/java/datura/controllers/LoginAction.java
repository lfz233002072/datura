/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.controllers;

import org.apache.struts2.config.*;
import com.opensymphony.xwork2.ActionSupport;
import datura.Security.UserInfo;
import datura.Utils;
import datura.service.UserInfoServiceImp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author lfz
 */
public class LoginAction extends ActionSupport {

    private String username;
    private String password;

    @Override
    public String execute() {
        return LOGIN;
    }

    public String login() {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpServletResponse resp = ServletActionContext.getResponse();
        if (!(username == null || password == null || username.isEmpty() || password.isEmpty())) {
            UserInfoServiceImp service = new UserInfoServiceImp();
            UserInfo user = service.Login(username, Utils.md5(password));
            if (user != null) {
                UserInfo user2 = service.GetUserInfoByUserName(username);
                if (user2 == null) {
                    user2 = user;
                }
                req.getSession().setAttribute("user", user2);
                return execute();
            }
        }
        req.setAttribute("loginErrorMsg", "用户名称或密码不正确！");
        return LOGIN;
    }

    public String logout() {
        return "logout";
    }
}
