/* 
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

//页面打开、切换窗口(框架窗口)
$(function () { closeLoading(); });

//模态窗口(请不要在外部脚本直接访问)
//调用场景：List页面弹出修改界面，修改界面如果实际修改成功，那么更新List页面的Grid
//callback就是这个更新操作实现者


var currentModalWin;
function showModal(action, title, width, height, callback) {
    if (width == undefined || width == null || width == 0) width = 600;
    if (height == undefined || height == null || height == 0) height = 400;
    parentdialog(title, width, height, action, null, callback);
    return false;
}

function showModalDefaultWidthHeight(action, title, callback) {
    return showModal(action, title, null, null, callback);
}

function showModalWithElement(element, width, height, refleshTargetId) {
    var item = $(element);
    var url = item.attr("href");
    var title = item.attr("title");
    var callbackName = item.attr("AjaxCallBack");
    return showModal(url, title, width, height,
        function (flag) {
            if (callbackName != null && callbackName != undefined && callbackName != "" && flag) {
                getCallBackFunction(callbackName, ["data", "status"]).apply(this, arguments);
            } else {
                UpdateGrid(flag, refleshTargetId);
            }
        });
}

function getCallBackFunction(code, argNames) {
    var fn = window, parts = (code || "").split(".");
    while (fn && parts.length) {
        fn = fn[parts.shift()];
    }
    if (typeof (fn) === "function") {
        return fn;
    }
    argNames.push(code);
    return Function.constructor.apply(null, argNames);
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
    //alert(xhr.toString());
    //alert(error.toString());
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
    top.setUserDataDialog(value);
}

//关闭模态窗口(只能通过)
//
function closeModal(userData) {
    top.closeParentDialog(userData);
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

function ajaxUpdateContext(url, updateTargetId, params, method) {
    var ajaxUrl = url;
    if (ajaxUrl.indexOf("?") == -1)
        ajaxUrl = url + "?rnd=" + Math.random();
    else
        ajaxUrl = url + "&rnd=" + Math.random();
    $.ajax({
        type: method != "post" ? "get" : "post",
        dataType: "json",
        url: ajaxUrl,
        data: params,
        success: function (data) {
            var updateTargetContext = $("#" + updateTargetId);
            updateTargetContext.empty();
            updateTargetContext.append(data.Content);
            //如果为下拉列表，那么修改下拉列表样式
            if (updateTargetContext.is("select")) {
                $("#" + updateTargetId).tzSelect();
            }
        },
        error: function (XmlHttpRequest, textStatus, errorThrown) {
            alert("系统异常[001]");
        }
    });
}


function ajaxUpdateHtml(url, updateTargetId, params, method, dataTypeValue) {
    ///<summary>ajax更新指定控件Html内容</summary>
    ///<param name="url">获取内容的URL地址</param>
    ///<param name="updateTargetId">待更新控件ID</param> 
    var ajaxUrl = url;
    if (ajaxUrl.indexOf("?") == -1)
        ajaxUrl = url + "?rnd=" + Math.random();
    else
        ajaxUrl = url + "&rnd=" + Math.random();
    $.ajax({
        type: method != "post" ? "get" : "post",
        dataType: dataTypeValue != undefined ? dataTypeValue : "html",
        url: ajaxUrl,
        data: params, beforeSend: function (xhr) {
            showLoading();
        },
        complete: function () {
            closeLoading();
        },
        success: function (data) {
            var updateTargetContext = $("#" + updateTargetId);
            updateTargetContext.empty();
            updateTargetContext.append(data);
        },
        error: function (XmlHttpRequest, textStatus, errorThrown) {
            alert("系统异常[001]");
        }
    });
}

function loadTreeByDefault(baseUrl, clickUrl, rootId) {
    ///<summary>加载树内容，并设置右侧内容加载控件ID</summary>
    ///<param name="baseUrl">获取树内容地址</param>
    ///<param name="clickUrl">树点击事件访问的地址</param>
    ///<param name="rootId">根节点ID</param>
    loadTreeWithData(baseUrl, clickUrl, rootId, "treeContent", "rightContent");
}

function loadTreeWithData(baseUrl, clickUrl, rootId, treeElementId, contentId) {
    ///<summary>加载树内容，并设置右侧内容加载控件ID</summary>
    ///<param name="baseUrl">获取树内容地址</param>
    ///<param name="clickUrl">树点击事件访问的地址</param>
    ///<param name="rootId">根节点ID</param>
    ///<param name="treeElementId">绑定树状内容的元素ID</param>
    ///<param name="contentId">树节点点击更新对应的元素ID</param>
    $("#" + treeElementId).tree({
        url: baseUrl + "?id=" + rootId,
        animate: true,
        lines: true,
        //数据加载
        onBeforeLoad: function (node, param) {
            if (node) {
                $(this).tree('options').url = baseUrl + '?id=' + node.id;
            }
        },
        onClick: function (node) {
            var urlContent = clickUrl + "?id=" + node.id;
            ajaxUpdateHtml(urlContent, contentId);
        },
    });
}




