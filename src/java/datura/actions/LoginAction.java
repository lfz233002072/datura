/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.actions;

import com.opensymphony.xwork2.*;
import datura.Utils;
import datura.security.UserInfo;
import datura.sys.service.UserInfoServiceImp;

/**
 *
 * @author lfz
 */
public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1030294046920869257L;
    private String username;
    private String password;

    // 处理用户请求的execute方法
    public String execute() throws Exception {

        if (isInvalid(getUsername())) {
            return INPUT;
        }

        if (isInvalid(getPassword())) {
            return INPUT;
        }
        UserInfoServiceImp service = new UserInfoServiceImp();
        UserInfo user = service.Login(getUsername(), Utils.md5(getPassword()));
        if (user != null) {
            UserInfo user2 = service.GetUserInfoByUserName(getUsername());
            if (user2 == null) {
                user2 = user;
            } 
        }
        if (user!=null) { 
            UserInfo user2 = service.GetUserInfoByUserName(getUsername());
            if (user2 == null) {
                user2 = user;
            }
            ActionContext.getContext().getSession().put("user", user2); 

            System.out.println(user2.getRealname() + "----" + user2.getUserId());
            return SUCCESS;
        } else {
            System.out.println(getUsername() + "----" + getPassword());
            return INPUT;
        }
    }

    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void validate() {
        if (isInvalid(username)) {
            addFieldError("username", "用户明不能为空");
        }

        if (isInvalid(password)) {
            addFieldError("password", "密码不能为空");
        }
    }
}
