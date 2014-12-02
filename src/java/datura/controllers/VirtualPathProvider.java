/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lfz
 */
public class VirtualPathProvider {

    public String getVirtualPath(Class t, HttpServletRequest request, HttpServletResponse response, String viewPath) {
        if (viewPath != null && !viewPath.trim().isEmpty()) {
            return viewPath;
        }
        String className = t.getName().toLowerCase();
        if (className.startsWith("datura.controllers.") && className.endsWith("servlet")) {
            String path = className.substring("datura.controllers.".length());
            path =path.substring(0,path.length()-7);
            path ="/"+ path.replace(".", "/")+ ".jsp";
            System.out.println("Access Class Name:" + t.getName() + " view path:" + path);
            return path;
        }
        return viewPath;
    }
}
