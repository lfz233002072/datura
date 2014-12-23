<%-- 
    Document   : menuGroup
    Created on : 2014-11-11, 18:43:50
    Author     : lfz
--%> 
<%
String path = request.getContextPath(); 
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:if test="${indexModel.moduleGroups.size() != 0}">
    <ul>  
        <c:forEach var="item" items="${indexModel.moduleGroups}" varStatus="itemStatus"> 
            <c:if test="${itemStatus.count%3==1}">
                <li>
            </c:if> 
                    <a href="<%= path %>/administrator/loadleftmenu.do?groupid=${item.id}" data-ajax-method="GET" data-ajax-url="<%= path %>/administrator/loadleftmenu.do?groupid=${item.id}" data-ajax="true" groupId="${item.id}" 
                       data-ajax-update = "#dvTreeMenu" data-ajax-complete = "InitLeftMenu">
                    <img src="<%= path %>/content/images/menu/${item.englishName}.gif"/><span>${item.displayName}</span>  
                </a>
            <c:if test="${itemStatus.count%3==0 || itemStatus.count==indexModel.moduleGroups.size()}">
                </li>
            </c:if> 
        </c:forEach> 
    </ul> 
</c:if> 