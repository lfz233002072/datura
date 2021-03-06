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
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author lfz
 */
public class IndexAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        HttpServletRequest req = ServletActionContext.getRequest();
        System.out.println("IndexAction SUCCESS----");
        UserInfo userInfo = (UserInfo) req.getSession().getAttribute("user");
        if (userInfo == null) {
            userInfo = new UserInfo();
        }
        SysBasicServiceImp sysService = new SysBasicServiceImp();
        int pathUnit = 3;
        AdminIndexModel indexModel = new AdminIndexModel();

        //头部菜单构建
        List<Sys_ModuleGroup> topGroupList
                = sysService.GetModuleGroups(userInfo.getUserId(), Utils.EmptyUUID(), TreeLevel.One,
                        userInfo.getIsSupperAdmin(), pathUnit);
        indexModel.setModuleGroups(topGroupList);
        Sys_ModuleGroup parentGroup = topGroupList.size() > 0 ? topGroupList.get(0) : new Sys_ModuleGroup();
        indexModel.setCurrentGroupId(parentGroup.getId());
        List<Sys_ModuleGroup> menuGroupList = sysService.GetModuleGroups(userInfo.getUserId(), parentGroup.getId(),
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
