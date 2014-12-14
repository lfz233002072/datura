/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.actions;

import com.opensymphony.xwork2.*;

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

        if ((getUsername().equals("mm") || getUsername().equals("aumy"))
                && getPassword().equals("111")) {
            // 通过ActionContext对象访问Web应用的Session
            ActionContext.getContext().getSession().put("user", getUsername());
            ActionContext.getContext().getSession().put("pass", getPassword());
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
        if(isInvalid(username)){
            addFieldError("username", "用户明不能为空");
        }
        
        if(isInvalid(password)){
            addFieldError("password", "密码不能为空");
        }
    }
}
