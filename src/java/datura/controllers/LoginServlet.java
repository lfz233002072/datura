/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.controllers;

import datura.security.UserInfo;
import datura.Utils;
import datura.sys.service.UserInfoServiceImp;
import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lfz
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends AdminServletBase {
 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("UserName");
        String password = req.getParameter("Password"); 
        if (!(username == null || password == null || username.isEmpty() || password.isEmpty())) {
            UserInfoServiceImp service = new UserInfoServiceImp();
            UserInfo user = service.Login(username, Utils.md5(password));
            if (user != null) { 
                UserInfo user2 = service.GetUserInfoByUserName(username); 
                if (user2 == null) {
                    user2 = user;
                } 
                req.getSession().setAttribute("user", user2);  
                resp.sendRedirect(req.getContextPath() + "/admin/index");
                return;
            }
        }
        req.setAttribute("loginErrorMsg", "用户名称或密码不正确！");
        this.RenderView(req, resp);
    }

    @Override
    public String getservletTitle() {
        return "系统登录"; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
