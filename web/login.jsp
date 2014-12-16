<%-- 
    Document   : login
    Created on : 2014-12-14, 13:15:06
    Author     : lfz
--%> 
<%@page contentType="text/html" language="java"  pageEncoding="UTF-8"%> 
<%@taglib prefix="s" uri="/struts-tags"%> 
<% String path = request.getContextPath();%>
<!DOCTYPE html>
<html lang="zh-cn">
    <head lang="zh-cn">
        <meta charset="UTF-8">
        <title><s:text name="sitename" /></title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Cache-Control" content="no-siteapp" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> 
        <link rel="stylesheet" href="<%=path%>/content/login.css"/>  
    </head>
    <body> 
        <noscript>
        <div style="position: absolute; z-index: 10000; height: 2046px; top: 0px; left: 0px; width: 100%; background: white; text-align: center;">
            <img alt="抱歉，请开启脚本支持！" src="<%=path%>/assets/images/noscript.gif"/>
        </div>
        </noscript> 
        <div id="loginwrapper"  >
            <h2 class="title"> 
                <s:text name="loginPage" />
            </h2>
            <s:form action="login" > 
                <s:textfield name="username" required="true" label="%{getText('user')}"></s:textfield> 
                <s:textfield name="password" required="true"  label="%{getText('pass')}"></s:textfield>
                <s:submit value="%{getText('login')}" cssStyle="width:120px;" cssClass="login"></s:submit>  
            </s:form>
        </div>  
    </body>
</html>
