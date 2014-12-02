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
public class Sys_ModuleGroup {

    private String privateId = new String();

    public final String getId() {
        return privateId;
    }

    public final void setId(String value) {
        privateId = value;
    }
    /**
     * 描述      *
     */
    private String privateDescription;

    public final String getDescription() {
        return privateDescription;
    }

    public final void setDescription(String value) {
        privateDescription = value;
    }
    /**
     * 显示名称      *
     */
    private String privateDisplayName;

    public final String getDisplayName() {
        return privateDisplayName;
    }

    public final void setDisplayName(String value) {
        privateDisplayName = value;
    }
    /**
     * 英文名称      *
     */
    private String privateEnglishName;

    public final String getEnglishName() {
        return privateEnglishName;
    }

    public final void setEnglishName(String value) {
        privateEnglishName = value;
    }
    /**
     * 图标路径      *
     */
    private String privateImgUrl;

    public final String getImgUrl() {
        return privateImgUrl;
    }

    public final void setImgUrl(String value) {
        privateImgUrl = value;
    }
    /**
     * 层级      *
     */
    private Integer privateVisitLevel;

    public final Integer getVisitLevel() {
        return privateVisitLevel;
    }

    public final void setVisitLevel(Integer value) {
        privateVisitLevel = value;
    }
    /**
     * 路径      *
     */
    private String privateVisitPath;

    public final String getVisitPath() {
        return privateVisitPath;
    }

    public final void setVisitPath(String value) {
        privateVisitPath = value;
    }

}
