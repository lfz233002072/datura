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
        <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=1">
        <meta name="format-detection" content="telephone=no">
        <meta name="renderer" content="webkit">
        <meta http-equiv="Cache-Control" content="no-siteapp" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="alternate icon" type="image/gif" href="<%=path%>/assets/images/logo.gif">
        <link rel="stylesheet" href="<%=path%>/assets/css/default.css"/>
        <link rel="stylesheet" href="<%=path%>/assets/css/zui-1.2.0/css/zui.min.css"/>
        <script src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
        <script src="<%=path%>/assets/js/jquery.validate.js"></script>
        <script src="<%=path%>/assets/js/jquery.unobtrusive-ajax.min.js"></script>
        <script src="<%=path%>/assets/js/jquery.validate.unobtrusive.js"></script>
        <script src="<%=path%>/assets/js/zui-1.2.0/js/zui.min.js"></script>
        <!--[if lt IE 9]>
      <script src="<%=path%>/assets/js/zui-1.2.0/lib/ieonly/html5shiv.js"></script>
      <script src="<%=path%>/assets/js/zui-1.2.0/lib/ieonly/respond.js"></script>
      <![endif]-->
    </head>
    <body>
        <!--[if lt IE 8]>
            <div class="alert alert-danger">您正在使用 <strong>过时的</strong> 浏览器. 是时候 <a href="http://browsehappy.com/">更换一个更好的浏览器</a> 来提升用户体验.</div>
        <![endif]--> 
        <noscript>
        <div style="position: absolute; z-index: 10000; height: 2046px; top: 0px; left: 0px; width: 100%; background: white; text-align: center;">
            <img alt="抱歉，请开启脚本支持！" src="<%=path%>/assets/images/noscript.gif"/>
        </div>
        </noscript>
        <div class="header">
            <div class="logo"></div>
            <a class="help" href="#">帮助</a>
        </div>

        <div class="panel panel-block col-md-7">
            <div class='panel-heading'>登录</div>
            <div class="panel-body"> 
                <s:form action="login" > 
                    <s:textfield name="username"   label="%{getText('user')}"></s:textfield> 
                    <s:textfield name="password" label="%{getText('pass')}"></s:textfield>
                    <s:submit value="%{getText('login')}"></s:submit>  
                </s:form>
            </div>
        </div>
        <div class="container">
            <div class=" row">
                <div id="loginwrapper" class="col-md-5">
                    <h2 class="title"> 
                        <s:text name="loginPage" />
                    </h2>
                    <form id="logi2n" name="logi2n" action="<%=path%>/login.action" method="post">
                        <div class="login panel">
                            用户名：
                            <div class="lines input-group">
                                <span class="input-group-addon"><i class="icon-user"></i></span> 
                                <input type="text" name="username" class="form-control" data-ajax=true/>
                            </div>
                            <div class="text-danger">
                                <span for="username">  </span>
                            </div>
                            密&nbsp; 码：
                            <div class="lines  input-group">
                                <span class="input-group-addon"><i class="icon-key"></i></span>  
                                <input type="password" name="password" class="form-control" data-ajax=true/>
                            </div>
                            <div class="text-danger">
                                <span> aaaa </span>
                            </div>
                            验证码：
                            <div class="lines input-group">
                                <span class="input-group-addon"><i class="icon-qrcode"></i></span>  
                                <input type="text" name="CheckCode" class="verifycode" data-ajax=true/>
                                <img id="imgcheck"
                                     onclick="this.src = '/Account/VerifyImage?time=' + Math.random()"
                                     title="看不清楚，双击图片换一张。" alt="验证码" />
                            </div>
                            <div class="text-danger">

                            </div>
                            <div class="text-danger" id="divErrorMessage">

                            </div>
                            <div class="button">
                                <input class="btn btn-default" type="submit" value="登录">
                                <input class="btn btn-default" style="margin-left: 30px" type="button" value="CA登录">

                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-7">
                    <div class="article">
                        <div class="article-content">
                            <h2>会员须知</h2>
                            <p style="text-align: left; display: inline-block">&nbsp;&nbsp;会员资格任何企业,团体，在接受通过本系统得资格审核后方可获...会员申请可在线申请，线下申请两种，用户在申请本系统会员时必须填写..</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            //document.getElementById('imgcheck').src = '/Account/VerifyImage?time=' + Math.random();
            //document.getElementById('CheckCode').value = "";

            function hideErrorMessage() {
                $("#divErrorMessage").html("");
            }
        </script>
    </body>
</html>
