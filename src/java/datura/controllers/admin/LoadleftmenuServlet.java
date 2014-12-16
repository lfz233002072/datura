/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.controllers.admin;

import datura.security.UserInfo;
import datura.Utils;
import datura.controllers.AdminServletBase;
import datura.enums.TreeLevel;
import datura.models.AdminIndexModel;
import datura.models.AdminMenuModel;
import datura.models.Sys_ModuleGroup;
import datura.service.SysBasicServiceImp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "Admin_LoadleftmenuServlet", urlPatterns = {"/admin/loadleftmenu"})
public class LoadleftmenuServlet extends AdminServletBase {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        UserInfo userInfo = (UserInfo) req.getSession().getAttribute("user");
        if (userInfo == null) {
            userInfo = new UserInfo();
        }
        String groupid = req.getParameter("groupid");
        SysBasicServiceImp sysService = new SysBasicServiceImp();
        int pathUnit = 3;
        AdminIndexModel indexModel = new AdminIndexModel();
        
        //头部菜单构建
        List<Sys_ModuleGroup> topGroupList= new ArrayList<>();
        indexModel.setModuleGroups(topGroupList); 
        indexModel.setCurrentGroupId(groupid);
        List<Sys_ModuleGroup> menuGroupList = sysService.GetModuleGroups(userInfo.getUserId(), groupid,
                TreeLevel.Two, userInfo.getIsSupperAdmin(), pathUnit);
        List<AdminMenuModel> menuItems = new ArrayList<>();
        for (Sys_ModuleGroup group : menuGroupList) {
            AdminMenuModel tempVar2 = new AdminMenuModel();
            tempVar2.setGroupId(group.getId());
            tempVar2.setGroupName(group.getDisplayName());
            tempVar2.setMenuItems(
                    sysService.GetModules(userInfo.getUserId(), group.getId(), userInfo.getIsSupperAdmin()));
            menuItems.add(tempVar2);
        }
        indexModel.setMenuModels(menuItems);
        indexModel.setLoginInfo(userInfo.getRealname());
        req.setAttribute("indexModel", indexModel);  
        this.RenderView(req, resp,"/admin/menu.jsp");
    }
    
}
