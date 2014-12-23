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
public class SysModuleGroupAction extends ActionSupport {

    @Override
    public String execute() throws Exception { 
        return SUCCESS;
    }
    
    public String Index() throws Exception {
        return execute();
    }
     
    public String Edit() throws Exception {
        return execute();
    }
    
    public String Delete() throws Exception {
        return execute();
    }
    
    public String Detail() throws Exception {
        return execute();
    }
}
