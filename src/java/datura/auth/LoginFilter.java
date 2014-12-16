/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.auth;
 
import datura.security.UserInfo;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author lfz
 */
public class LoginFilter implements Filter {

    private String permitUrls[] = null;
    private String gotoUrl = null;

    public void destroy() {
        // TODO Auto-generated method stub
        permitUrls = null;
        gotoUrl = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        HttpServletRequest res = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if (!isPermitUrl(request)) {
            if (filterCurrUrl(request)) {
                //System.out.println("--->请登录");
                resp.sendRedirect(res.getContextPath() + gotoUrl);
                return;
            }
        } 
        chain.doFilter(request, response);
    }

    public boolean filterCurrUrl(ServletRequest request) {

        boolean filter = false;
        HttpServletRequest res = (HttpServletRequest) request;
        UserInfo user = (UserInfo) res.getSession().getAttribute("user");
        if (null == user) {
            filter = true;
        }

        return filter;

    }

    public boolean isPermitUrl(ServletRequest request) {
        boolean isPermit = false;
        String currentUrl = currentUrl(request);

        if (permitUrls != null && permitUrls.length > 0) {
            for (int i = 0; i < permitUrls.length; i++) {
                if (permitUrls[i].equals(currentUrl) || 
                        isIngoreAddress(currentUrl, permitUrls[i])) {
                    isPermit = true;
                    break;
                }
            }
        }
        return isPermit;
    }

    //请求地址
    public String currentUrl(ServletRequest request) {
        HttpServletRequest res = (HttpServletRequest) request;
        String task = request.getParameter("task");
        String path = res.getContextPath();
        String uri = res.getRequestURI();
        if (task != null) {// uri格式 xx/ser
            uri = uri.substring(path.length(), uri.length()) + "?" + "task="
                    + task;
        } else {
            uri = uri.substring(path.length(), uri.length());
        }
        //System.out.println("当前请求地址:" + uri);
        return uri;
    }

    public boolean isIngoreAddress(String currentUrl, String permitUrl) {

        if (currentUrl.startsWith(permitUrl)) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        String permitUrls = filterConfig.getInitParameter("permitUrls");
        String gotoUrl = filterConfig.getInitParameter("gotoUrl");

        this.gotoUrl = gotoUrl;

        if (permitUrls != null && permitUrls.length() > 0) {
            this.permitUrls = permitUrls.split(",");
        }
    }

}
