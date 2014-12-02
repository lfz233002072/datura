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
public class AdminMenuModel {

    private String privateGroupId = "";

    public final String getGroupId() {
        return privateGroupId;
    }

    public final void setGroupId(String value) {
        privateGroupId = value;
    }
    private String privateGroupName;

    public final String getGroupName() {
        return privateGroupName;
    }

    public final void setGroupName(String value) {
        privateGroupName = value;
    }
    private int privateGroupSort;

    public final int getGroupSort() {
        return privateGroupSort;
    }

    public final void setGroupSort(int value) {
        privateGroupSort = value;
    }
    private Iterable<Sys_Module> privateMenuItems;

    public final Iterable<Sys_Module> getMenuItems() {
        return privateMenuItems;
    }

    public final void setMenuItems(Iterable<Sys_Module> value) {
        privateMenuItems = value;
    }
}
