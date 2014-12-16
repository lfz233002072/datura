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
@WebServlet(name = "datura.controllers.LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServlet extends AdminServletBase {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        req.getSession().invalidate();
        resp.sendRedirect(req.getContextPath()+"/login.jsp");
    } 
}
