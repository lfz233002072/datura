<%-- 
    Document   : modulegourp
    Created on : 2014-11-15, 15:56:13
    Author     : lfz
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../header.jsp" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">

</script>
<div style="margin: 10px"> 
    <div class="toolbar">
        <span class="fl"> 
            <h2 style="padding-left: 15px; padding-top: 10px;">
                模块组管理</h2>
        </span><span class="fr search"> 
        </span>
    </div>
    <div id="dvPagers">
        <table class="table table100">
            <thead>
                <tr>
                    <th>
                       序号
                    </th> 
                    <th>名称</th>
                    <th>代码</th>
                    <th>描述</th>
                    <th>状态</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody> 
                <s:iterator id="item" value="groupPageRecords.records" status="st"> 
                    <tr class="${st.even ?'':'gray'}">
                        <td>${(groupPageRecords.pageIndex -1)*groupPageRecords.pageSize +st.getCount()}</td>
                        <td data-key="${item.id}" class="text-indent${item.visitLevel*2}0">
                            ${item.displayName}
                            -${item.visitPath}
                        </td>
                        <td>
                            ${item.englishName} -${item.visitLevel}</td>
                        <td>
                            ${item.description}</td>
                        <td>
                            ${item.dataStatus}
                        </td>
                        <td>
                            关闭／开启 删除 添加子模块 修改编辑
                        </td> 
                    </tr>
                </s:iterator>  
            </tbody>
        </table>
    </div>  

</div>
<%@include  file="../footer.jsp" %>