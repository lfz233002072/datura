<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();

    Object obj = request.getAttribute("ServletTitle");
    String title = "";
    if (obj != null) {
        title = obj.toString();
    }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-cn">
    <head lang="zh-cn">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>${title}</title>
        <link rel="stylesheet" type="text/css" href="<%=path%>/scripts/jquery-easyui-1.2.5/themes/default/easyui.css"/>
        <link rel="stylesheet" type="text/css" href="<%=path%>/scripts/lhgdialog/skins/default.css"/> 
        <link rel="stylesheet" type="text/css" href="<%=path%>/content/icon.css"/>
        <link rel="stylesheet" type="text/css" href="<%=path%>/content/Site.css"/>
        <link rel="stylesheet" type="text/css" href="<%=path%>/content/themes/green/style.css"/> 
        <script type="text/javascript" src="<%=path%>/scripts/jquery-1.7.1.js"></script>
        <script type="text/javascript" src="<%=path%>/scripts/jquery.validate.js"></script>  
        <script type="text/javascript" src="<%=path%>/scripts/jquery.unobtrusive-ajax.js"></script> 
        <script type="text/javascript" src="<%=path%>/scripts/jquery.validate.unobtrusive.js"></script> 
        <script type="text/javascript" src="<%=path%>/scripts/jquery-easyui-1.2.5/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="<%=path%>/scripts/lhgdialog/lhgdialog.min.js"></script>
        <script type="text/javascript" src="<%=path%>/scripts/manager/main.js"></script>
        <script type="text/javascript" src="<%=path%>/scripts/manager/dialog.js"></script>
        <script type="text/javascript" src="<%=path%>/scripts/manager/loading.js"></script>
        <link href="<%=path%>/favicon.ico" rel="shortcut icon" type="image/x-icon" /> 
    </head>
    <body class="easyui-layout framework-layout">
        <noscript>
            <div style="position: absolute; z-index: 10000; height: 2046px; top: 0px; left: 0px;
                 width: 100%; background: white; text-align: center;">
                <img alt="抱歉，请开启脚本支持！" src="<%=path%>/content/images/noscript.gif"/>
            </div>
        </noscript>
        <div id="dvLoadingFramework" style="position: absolute; z-index: 9999; height: 2046px;
             top: 0px; left: 0px; width: 100%; background: white; text-align: center; display: none;">
            <img alt="正在加载，请稍后！" src="<%=path%>/content/images/noscript.gif"/>
        </div>
        <div region="north" border="false">
            <div class="header">
                欢迎您，<span>${indexModel.loginInfo}</span>│
                <a href="javascript:void(0);" onclick="addOrSelectTab('修改密码', '<%=path%>/admin/sysuser/changepwd')">修改密码</a>│<a
                    href="javascript:void(0);" onclick="addOrSelectTab('修改资料', '<%=path%>/admin/sysuser/editUserInfo')">修改资料</a> │ 
                <a href="javascript:void(0);" class="refresh" title="刷新">刷新</a> │ 
                <a href="javascript:void(0);" onclick="alert('暂未实现')">帮助</a>│ 
                <a href="<%=path%>/logout" >退出</a>
            </div>
            <div class="logo-bg">
                <a class="logo" style="background: url('')" href="javascript:void(0);"></a>
            </div>
        </div>
        <div region="south" border="false" split="false">
            <div class="footer">
                Copyright◎2008-2014 All Resrved 版权所有：拓创软件有限公司 浙ICP备0900000号</div>
        </div>
        <div id="framework_layout_west" region="west" split="false" border="false" title="系统菜单"
             style="overflow: hidden;">
            <div id="p" class="easyui-panel" fit="true">
                <div class="easyui-layout LeftMenu-Layout" fit="true" id="leftMenu_Layout">
                    <div region="center" border="false" split="false" style="overflow: hidden;">
                        <div id="dvTreeMenu" class="tree">  
                            <jsp:include page="/admin/menu.jsp" flush="true">
                                <jsp:param name="indexModel" value="${indexModel}" />
                            </jsp:include>
                        </div>
                    </div>
                    <div region="south" border="false" style="overflow: hidden;" title="导航栏">
                        <div class="LeftMenu-Layout-menu" id="dvMenuGroup">   
                            <jsp:include page="/admin/menuGroup.jsp" flush="true">
                                <jsp:param name="data" value="${indexModel}" />
                            </jsp:include>
                        </div>
                        <div class="layout-blank">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="frameworkContent" region="center" border="false" style="overflow: hidden;">
            <div id="frameworkTabs" class="easyui-tabs" plain="true" scrollincrement="112" fit="true"
                 border="false" style="overflow: hidden;">
                <div title="首页" iconcls="home-icon" style="overflow: hidden;">
                    <iframe scrolling="auto" frameborder="0" style="width:100%;height:100%;" src="<%=path%>/admin/home.jsp" name="iFrameHome" id="iFrameHome">
                    </iframe>
                </div>
            </div>
        </div>
        <div id="tabRightmenuContent" class="easyui-menu" style="width:150px;"> 
            <!--  <div name="tab_menu-tabclose">关闭</div> -->  
            <div name="tab_menu-tabcloseall">关闭全部标签</div>  
            <div name="tab_menu-tabcloseother">关闭其他标签</div>  
            <div class="menu-sep"></div>
            <div name="tab_menu-tabcloseright">关闭右侧标签</div>  
            <div name="tab_menu-tabcloseleft">关闭左侧标签</div>  
        </div>
    </body>
</html>
