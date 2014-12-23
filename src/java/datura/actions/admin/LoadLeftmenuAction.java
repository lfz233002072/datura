/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.actions.admin;

import com.opensymphony.xwork2.ActionSupport;
import datura.Utils;
import datura.enums.TreeLevel;
import datura.models.AdminIndexModel;
import datura.models.AdminMenuModel;
import datura.models.Sys_ModuleGroup;
import datura.security.UserInfo;
import datura.sys.service.SysBasicServiceImp;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author lfz
 */
public class LoadLeftmenuAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        HttpServletResponse resp = ServletActionContext.getResponse();
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
        List<Sys_ModuleGroup> topGroupList = new ArrayList<>();
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
        return SUCCESS;
    }
}
