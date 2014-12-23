<%-- 
    Document   : modulegourp
    Created on : 2014-11-15, 15:56:13
    Author     : lfz
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../header.jsp" %>
<script type="text/javascript">
    //页面加载  
$(document).ready(function(){  
            loadGrid();  
});  
  
//加载表格datagrid  
function loadGrid()  
{  
    //加载数据  
    $('#cxdm').datagrid({  
                width: 'auto',  
                height:$(window).height()-3,               
                striped: true,  
                singleSelect : true,  
                url:'getPsNewConsultList.action',  
                //queryParams:{},  
                loadMsg:'数据加载中请稍后……',  
                pagination: true,  
                rownumbers: true,     
                toolbar:'#tb',
                columns:[[  
                    {field:'adviceid',title: '来文号',align: 'center',width: 40},  
                    {field:'consulter',title: '案由',align: 'center',width: 40,  
                        //添加超级链，并将来文号作为参数传入  
                        formatter:function(val,rec){  
                            //alert(rec.adviceid);  
                            return "<a href='jsp/proposal/psconsultview.jsp?id="+rec.adviceid+"'>"+val+"</a>";  
                       }  
                    },  
                    {field:'content',title: '状态',align: 'center',width: 40},  
                    {field:'replynumber',title: '回复数',align: 'center',width: 40}                                                          
                ]]  
            });  
}  
  
//为loadGrid()添加参数  
        var queryParams = $('#cxdm').datagrid('options').queryParams;  
        queryParams.who = who.value;  
        queryParams.type = type.value;  
        queryParams.searchtype = searchtype.value;  
        queryParams.keyword = keyword.value;  
        //重新加载datagrid的数据  
        $("#cxdm").datagrid('reload');  
</script>
<div style="padding: 1px">
<table id="cxdm"></table> 

    <div id="tb" style="padding:2px 5px;">
        Date From: <input class="easyui-datebox" style="width:110px">
        To: <input class="easyui-datebox" style="width:110px">
        Language: 
        <select class="easyui-combobox" panelHeight="auto" style="width:100px">
            <option value="java">Java</option>
            <option value="c">C</option>
            <option value="basic">Basic</option>
            <option value="perl">Perl</option>
            <option value="python">Python</option>
        </select>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search">Search</a>
    </div>
</div>
<%@include  file="../footer.jsp" %>