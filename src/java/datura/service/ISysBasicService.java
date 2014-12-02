/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.service;

public interface ISysBasicService extends IMenuService {

    /**
     * 生成模块组路径
     *
     * @param parentId 父模块组ID
     * @param pathUnit
     * @return
     */ 
    String GenerateModuleGroupPath(String parentId, int pathUnit);

    /**
     * 政策默认模块
     *
     */
    void RegisterDefaultModule();

}
