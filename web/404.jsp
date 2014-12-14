<%-- 
    Document   : 404
    Created on : 2014-11-15, 17:38:39
    Author     : lfz
--%> 
<%@page contentType="text/html"  isErrorPage="true" pageEncoding="UTF-8"%>
<%@include  file="/administrator/header.jsp" %> 

<table width="100%" style="padding-top: 25px;padding-left: 25px"> 
    <tr>
        <td style="width: 130px;padding-top: 25px" >
            <img src="<%= request.getContextPath()%>/content/images/error.jpg" id="error_img" />
        </td>
        <td style="padding-left: 25px;padding-top: 10px"> 
            <span style="font-size: 16px;font-weight: bold">尊敬的用户：</span>
            <p class="error" style=" font-size: 14px;padding-left: 30px;margin-bottom: 30px;padding-top: 15px">
                 系统出现了异常，请重试。如果问题重复出现，请向系统管理员反馈。 
            </p>
            <span style="font-size: 14px;font-weight: bold;">
                详细错误信息如下：</span> 
            <div class="page" style="margin-top: 10px">
                <table class="table table100">
                    <tr valign="top">
                        <td width="90px" style="text-align: right"><b>错误信息:</b></td>
                        <td class="error">${pageContext.exception}</td>
                    </tr>
                    <tr valign="top">
                        <td  style="text-align: right"><b>地址:</b></td>
                        <td class="error">${pageContext.errorData.requestURI}</td>
                    </tr>
                    <tr valign="top">
                        <td  style="text-align: right"><b>HTTP状态:</b></td>
                        <td class="error">${pageContext.errorData.statusCode}</td>
                    </tr>
                    <tr valign="top">
                        <td  style="text-align: right"><b>错误跟踪:</b></td>
                        <td class="error">
                    <c:forEach var="trace" 
                               items="${pageContext.exception.stackTrace}">
                        <p>${trace}</p>
                    </c:forEach>
                    </td>
                    </tr>
                </table>
            </div>
        </td>
    </tr>
</table>
<%@include  file="/administrator/footer.jsp" %> 