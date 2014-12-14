<%-- 
    Document   : menu
    Created on : 2014-11-11, 18:44:05
    Author     : lfz
--%>
<%
String path = request.getContextPath(); 
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul id="treeMenu">
    <c:forEach var="item" items="${indexModel.menuModels}" varStatus="itemStatus"> 
        <li><a href="javascript:void(0);">${item.groupName}</a>
            <c:choose>
                <c:when test="${itemStatus.count!=0}">  
                    <ul class="hide">
                </c:when> 
                <c:when test="${itemStatus.count==0}">  
                    <ul>
                </c:when>
            </c:choose>
            <c:forEach var="menu" items="${item.menuItems}" varStatus="menuStatus"> 
                <li>
                    <a href="<%=path%>${menu.url}" id="siderBar_${menu.id}" 
                       target = "iframeHome" >${menu.displayName}</a></li>
                </c:forEach>
                    </ul>
        </li>  
    </c:forEach>
</ul>
