<%-- 
    Document   : plugin
    Created on : 2014-11-15, 15:56:51
    Author     : lfz
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../header.jsp" %>

<div class="toolbar">
    <span class="fl"> 
        <h2 style="padding-left: 15px; padding-top: 10px;">
           <%=request.getAttribute("ServletTitle")%></h2>
    </span><span class="fr search"> 
    </span>
</div>
<div id="dvPagers">
    <table class="table table100">
        <thead>
            <tr>
                <th>
                    编号
                </th> 
            </tr>
        </thead>
        <tbody>

            <tr>
                <td >
                    详细数据查看
                </td>
            </tr>
        </tbody>
    </table>
</div>  

<%@include  file="../footer.jsp" %>