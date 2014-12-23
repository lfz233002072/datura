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
        <div style="margin: 0 auto; margin-top: 100px; width: 800px;">
            <table style="width: 800px; margin: 0 auto;">
                <tr>
                    <td><img src="/Content/Images/account.jpg"></td>
                    <td style="width: 310px;">
                        <form action="<%=path%>/login.do" method="POST">
                        <table id="LoginTb" style="margin-top: 10px; background: #fff; width: 100%; height: 230px; border: 1px #ccc solid;">
                            <tr>
                                <td colspan="2" style="font-size: 18px;  font-weight: bold; padding: 5px 20px;">
                                    <s:text name="loginPage" />
                                </td>

                            </tr>
                            <tr>
                                <td style="width: 80px; text-align: right"><s:text name="user" />
                                </td>
                                <td>
                                    <input id="username" name="username" type="text" />
                                </td>
                            </tr>
                            <tr>
                                <td style="width: 80px; text-align: right;"><s:text name="pass" />
                                </td>
                                <td>
                                    <input id="password" name="password" type="password" />
                                </td>
                            </tr>

                            <tr>
                                <td style="width: 80px; text-align: right">验证码：
                                </td>
                                <td>

                                </td>
                            </tr>


                            <tr>

                                <td colspan="2">
                                    <table style="width: 100%;">
                                        <tr>
                                            <td style="width:40px;">&nbsp;</td>
                                            <td>
                                                <div id="mes" class="field-validation-error">
                                                </div>
                                                <div id="Loading" style="display: none" class='panel-loading'><font color='#000'>加载中...</font></div>
                                            </td>
                                            <td style="width: 100px;">
                                              
                                                <button type="submit" >登录</button>
                                            </td>
                                        </tr>

                                    </table>

                                </td>
                            </tr>

                        </table>
                                </form>
                    </td>
                </tr>
            </table>

        </div> 
    </body>
</html>
