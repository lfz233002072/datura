var dialogContext;
var userData;
function showlhgModal(action, title, width, height, callback) {
    //设置关闭后是否调用CallBack函数
    userData = undefined;
    dialogContext = $.dialog(
    {
        content: 'url:' + action,
        title: title,
        icon: 'succeed',
        width: width,
        height: height,
        lock: true,
        background: '#BBB', /* 背景色 默认的遮罩背景色为:#DCE2F1浅蓝护眼色 */
        opacity: 0.4,
        ok: false,
        cancel: true,
        drag: true,
        resize: true,
        max: false, min: false,
        iframe: true,
        close: function () {
            if (userData != undefined && userData != null) callback(userData);
        }
    });
}

//弹出提示信息
function showlhgMessage(msg, callback) {
    if (!callback) callback = function () { };
    if (msg == undefined || msg == null || msg.length == 0) callback();
    else
        return $.dialog({
            title: '提示信息',
            id: 'AlertCustom',
            fixed: true,
            lock: true,
            background: '#BBB', /* 背景色 默认的遮罩背景色为:#DCE2F1浅蓝护眼色 */
            opacity: 0.4,
            content: msg,
            ok: true,
            resize: false,
            max: false, min: false,
            close: function () { callback(); }
        });
    return true;
}


function closelhgModal(userDataArg) {
    userData = userDataArg;
    if (dialogContext != null && dialogContext != undefined) {
        dialogContext.close();
    }
    else
        $.dialog.close();
}

function setUserData(value) {
    userData = value;
}
 