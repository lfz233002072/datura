/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.Security;

/**
 *
 * @author lfz
 */
public class PermissionRecord {

    private String privateModuleRightsId = "";

    public final String getModuleRightsId() {
        return privateModuleRightsId;
    }

    public final void setModuleRightsId(String value) {
        privateModuleRightsId = value;
    }

    /**      *
     *
     */
    private String privateGroupId = "";

    public final String getGroupId() {
        return privateGroupId;
    }

    public final void setGroupId(String value) {
        privateGroupId = value;
    }

    /**      *
     *
     */
    private String privateModuleId = "";

    public final String getModuleId() {
        return privateModuleId;
    }

    public final void setModuleId(String value) {
        privateModuleId = value;
    }

    /**
     * 模块代码
     *
     */
    private String privateModuleName;

    public final String getModuleName() {
        return privateModuleName;
    }

    public final void setModuleName(String value) {
        privateModuleName = value;
    }

    /**
     * 权限系统名称(归属模块组代码_模块代码)
     *
     */
    public final String getSystemName() {
        return String.format("%1$s_%2$s", getGroupName(), getModuleName());
    }

    /**
     * 归属模块组代码
     *
     */
    private String privateGroupName;

    public final String getGroupName() {
        return privateGroupName;
    }

    public final void setGroupName(String value) {
        privateGroupName = value;
    }

    /**
     * 指定插件名称
     *
     */
    private String privatePluginName;

    public final String getPluginName() {
        return privatePluginName;
    }

    public final void setPluginName(String value) {
        privatePluginName = value;
    }

    /**      *
     *
     */
    private RightValue privateRightValue = RightValue.forValue(0);

    public final RightValue getRightValue() {
        return privateRightValue;
    }

    public final void setRightValue(RightValue value) {
        privateRightValue = value;
    }
}
