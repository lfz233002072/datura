<%-- 
    Document   : footer
    Created on : 2014-11-14, 11:40:38
    Author     : lfz
--%> 
<%@page import="java.util.Date"%>
<%
    String path = request.getContextPath();
    Object obj = request.getAttribute("ServletTitle");
    String title = "";
    if (obj != null) {
        title = obj.toString();
    }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
        <link rel="stylesheet" type="text/css" href="<%=path%>/scripts/jquery-easyui-1.2.5/themes/default/easyui.css"/>
        <link rel="stylesheet" type="text/css" href="<%=path%>/content/icon.css"/>
        <link rel="stylesheet" type="text/css" href="<%=path%>/content/Site.css"/>
        <link rel="stylesheet" type="text/css" href="<%=path%>/content/List.css"/>
        <link rel="stylesheet" type="text/css" href="<%=path%>/content/doc.css"/>
        <link rel="stylesheet" type="text/css" href="<%=path%>/content/themes/green/style.css"/> 
        <script type="text/javascript" src="<%=path%>/scripts/jquery-1.7.1.js"></script>
        <script type="text/javascript" src="<%=path%>/scripts/jquery-easyui-1.2.5/jquery.easyui.min.js"></script> 
        <script type="text/javascript" src="<%=path%>/scripts/jquery.validate.js"></script>  
        <script type="text/javascript" src="<%=path%>/scripts/jquery.unobtrusive-ajax.js"></script> 
        <script type="text/javascript" src="<%=path%>/scripts/jquery.validate.unobtrusive.js"></script> 
        <script type="text/javascript" src="<%=path%>/scripts/manager/common.js"></script>
        <script type="text/javascript" src="<%=path%>/scripts/manager/pager.js"></script>
        <link href="<%=path%>/favicon.ico" rel="shortcut icon" type="image/x-icon" />
        <title><%=title%></title>
        <script type="text/javascript">
            function SuccessClick(data) {
                if (data.Success == true) {
                    closeModal(true);
                }
                else {
                    alert(data.Message);
                }
            }
        </script>
    </head>
    <body> 