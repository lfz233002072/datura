/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.models;

/**
 *
 * @author lfz
 */
public class AdminIndexModel {

    /**
     * 模块组
     *
     */
    private Iterable<Sys_ModuleGroup> privateModuleGroups;

    public final Iterable<Sys_ModuleGroup> getModuleGroups() {
        return privateModuleGroups;
    }

    public final void setModuleGroups(Iterable<Sys_ModuleGroup> value) {
        privateModuleGroups = value;
    }

    /**      *
     *
     */
    private Iterable<AdminMenuModel> privateMenuModels;

    public final Iterable<AdminMenuModel> getMenuModels() {
        return privateMenuModels;
    }

    public final void setMenuModels(Iterable<AdminMenuModel> value) {
        privateMenuModels = value;
    }

    private String privateLoginInfo;

    public final String getLoginInfo() {
        return privateLoginInfo;
    }

    public final void setLoginInfo(String value) {
        privateLoginInfo = value;
    }

    /**
     * 当前模块组
     *
     */
    private String privateCurrentGroupId = "";

    public final String getCurrentGroupId() {
        return privateCurrentGroupId;
    }

    public final void setCurrentGroupId(String value) {
        privateCurrentGroupId = value;
    }
}
