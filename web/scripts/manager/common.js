/* 
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
$("a[useTab=true]").live("click", function (evt) {
    evt.preventDefault();
    var title = $(this).attr("tabtitle");
    if (!title) title = $(this).attr("title");
    openInTabs(title, this.href);
});

//页面打开、切换窗口(框架窗口)
$(function () { closeLoading(); });

function openInTabs(title, url) {
    top.addOrSelectTab(title, url);
}

//模态窗口(请不要在外部脚本直接访问)
//调用场景：List页面弹出修改界面，修改界面如果实际修改成功，那么更新List页面的Grid
//callback就是这个更新操作实现者

var currentModalWin;
function showModal2(action, title, width, height, callback) {
    if (width == undefined || width == null || width == 0) width = 520;
    if (height == undefined || height == null || height == 0) height = 260;
    top.showlhgModal(action, title, width, height, callback);
    return false;
}

function showModal3(action, title, callback) {
    return showModal2(action, title, null, null, callback);
}

function showModal(element, width, height, refleshTargetId) {
    var item = $(element);
    return showModal2(item.attr("href"), item.attr("title"), width, height,
        function (flag) {
            UpdateGrid(flag, refleshTargetId);
        });
}

function DeleteCallback(data) {
    AjaxCallback(data);
}

function AjaxCallback(data) {
    if (data.Success == true) {
        UpdateGrid(true);
    }
    else
        alert(data.Message);
}

function FailureCallback(xhr, error) {
    alert(xhr.toString());
    alert(error.toString());
    alert("未知错误！");
}
///
function UpdateGrid(flag, refleshTargetId) {
    //如果存在lnkCurentPage按钮的，那么激活点击事件刷新页面 
    var lnkContext;
    if (refleshTargetId) {
        lnkContext = $("#" + refleshTargetId);
    }
    else
        lnkContext = $('#lnkCurentPage');
    if (lnkContext.size() == 0) {
        var linkList = $('.icon-refresh');
        if (linkList.size() > 0)
            lnkContext = linkList[0];
    }
    if (lnkContext.size() > 0 && flag)
        lnkContext.click();
}

function setModalState(value) {
    top.setUserData(value);
}

//关闭模态窗口(只能通过)
//
function closeModal(userData) {
    top.closelhgModal(userData);
}

//清除搜索文本框内容
function clearText(element, shownullItem) {
    var item = $(element);
    if (shownullItem == true) {
        if ($.trim(item.val()) == "") item.val('请输入关键字');
    }
    else {
        if (item.val() == '请输入关键字') item.val('');
    }
}

function showLoading() {
    if (self.loading == null || self.loading == undefined)
        top.loading.show();
    else self.loading.show();
}

function closeLoading() { 
    if (self.loading != null && self.loading != undefined)
        self.loading.close();
    if (top.loading != null && top.loading != undefined) 
        top.loading.close();
}

function updateChildOptions(obj, url, updateTargetId) {
    var params = "parentId=" + $(obj).val();
    ajaxUpdateContext(url, updateTargetId, params);
}

function updateOptions(parentId, url, updateTargetId) {
    var params = "parentId=" + parentId;
    ajaxUpdateContext(url, updateTargetId, params);
}

function ajaxUpdateContext(url, updateTargetId, params) {
    $.ajax({
        type: "get",
        dataType: "json",
        url: url,
        data: params,
        success: function (data) {
            $("#" + updateTargetId).empty();
            $("#" + updateTargetId).append(data.Content);
        },
        error: function (XmlHttpRequest, textStatus, errorThrown) {
            alert("系统异常[001]");
            //alert($("#ErrorMsg", XmlHttpRequest.responseText).text());
        }
    });
}


 
 