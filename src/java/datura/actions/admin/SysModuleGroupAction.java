/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.actions.admin;

import com.opensymphony.xwork2.ActionSupport;
import datura.Utils;
import datura.entity.PageOfRecords;
import datura.enums.TreeLevel;
import datura.models.AdminIndexModel;
import datura.models.AdminMenuModel;
import datura.models.Sys_ModuleGroup;
import datura.security.UserInfo;
import datura.sys.dao.SysModuleGroupDao;
import datura.sys.entity.SysModuleGroup;
import datura.sys.service.SysBasicServiceImp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author lfz
 */
public class SysModuleGroupAction extends ActionSupport {

    private PageOfRecords<SysModuleGroup> groupPageRecords;

    public PageOfRecords<SysModuleGroup> getGroupPageRecords() {
        return groupPageRecords;
    }

    public void setGroupPageRecords(PageOfRecords<SysModuleGroup> groupPageRecords) {
        this.groupPageRecords = groupPageRecords;
    }
    
    @Override
    public String execute() throws Exception { 
        return SUCCESS;
    }
    
    public String Index() throws Exception {
        
        SysModuleGroupDao dao =new SysModuleGroupDao();
        PageOfRecords<SysModuleGroup> result =new PageOfRecords<>();
        result.setPageIndex(1);
        result.setPageSize(8);
        LinkedHashMap<String, String> orderByField =new LinkedHashMap<>();
        orderByField.put("visitPath", "DESC");
        orderByField.put("dataSort", "asc");
        this.groupPageRecords=dao.queryPageModel(null, null, null, null, orderByField,"", result);
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
