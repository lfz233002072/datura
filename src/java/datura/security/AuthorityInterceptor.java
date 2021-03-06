/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.security;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

/**
 *
 * @author lfz
 */
public class AuthorityInterceptor extends AbstractInterceptor {

    private static final long serialVersionUID = 1358600090729208361L;

    //拦截Action处理的拦截方法
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        // 取得请求相关的ActionContext实例
        ActionContext ctx = invocation.getInvocationContext();
        Map session = ctx.getSession();
        //取出名为user的session属性
        UserInfo user = (UserInfo) session.get("user");
        //如果没有登陆，或者登陆所有的用户名不是aumy，都返回重新登陆
        if (user != null && user.getUserId() != null) {
            return invocation.invoke();
        }
        //没有登陆，将服务器提示设置成一个HttpServletRequest属性
        ctx.put("tip", "您还没有登录，请登陆系统");
        return Action.LOGIN;
    }
}
