if (self.location != top.location) {
    top.location.href = self.location.href;
}

var frameworkContentId = "#frameworkContent";
var frameworkTabsId = "#frameworkTabs";
var divLeftMenuTreeId = "#divLeftMenuTree";

$(function () {
    loading.show();
    var tabContext = $(frameworkTabsId);
    tabContext.tabs({
        tools: [{
            iconCls: 'icon-refresh', 
            handler: function (e) {
                refreshCurrentTab();
            }
        }
        //    ,{
        //    iconCls: 'icon-help',
        //    handler: function (e) {
        //        e.preventDefault();
        //        $('#divDropDownMenu').menu('show', {
        //            left: e.pageX, top: e.pageY
        //        });
        //    }
        //}
        ], 
        //绑定tabs的右键菜单  
        onContextMenu: function (e, title) {
            e.preventDefault();
            $('#tabRightmenuContent').menu('show',
                    { left: e.pageX, top: e.pageY }).data("tabTitle", title);
        }
    });
    var centerContext = $(frameworkContentId);
    tabContext.tabs('add', {
        title: "个人中心",
        content: createFrame("/Home/PersonalCenter", "mainFrame"),
        closable: false,
        width: centerContext.width() - 10,
        height: centerContext.height() - 26,
        iconCls: 'home-icon',
    });

    //实例化menu的onClick事件
    var tabRightMenuContext = $('#tabRightmenuContent');
    tabRightMenuContext.menu({
        onClick: function (item) {
            var itemPosition = item.name;
            if (itemPosition == undefined) {
                itemPosition = $(item.target).attr("name");
            }
            closeTab(tabContext, tabRightMenuContext, itemPosition);
        }
    });
    $('#divDropDownMenu').menu({
        onClick: function (item) {
            alert(item.text);
        }
    });
    initTopMenu();
    InitLeftMenu();
    loading.close();
    
});

function initTopMenu() {
    var menuContext = $("li>a", $("#nav"));
    menuContext.click(function () {
        menuContext.each(function (i) {
            $(this).removeClass("hover");
        });
        $(this).addClass("hover");
    }); 
}


function refreshCurrentTab() {
    try {
        var tabContext = $(frameworkTabsId);
        var tabcontentPanelsContext = $(".panel", $(".tabs-panels", tabContext));
        var currentIframe = $("iframe", tabcontentPanelsContext.not(":hidden"));
        var cuurentIframeName = currentIframe.attr("name");
        var currentDocument = self.frames[cuurentIframeName].document;
        if (currentDocument.location.href.replace("?", "").indexOf("?") >= 0) {
            currentDocument.location = currentDocument.location.href.replace("#@", "").replace("#", "");
        } else {
            var str = currentDocument.location.href.replace("#@", "").replace("#", "");
            var indexRefresh = str.indexOf("?refresh=1&md=");
            if (indexRefresh > 0)
                str = str.substr(0, indexRefresh);
            currentDocument.location = str.replace("?refresh=1", "");
        }
        loading.show();
    } catch (e) {
        return true;
    }
}

function InitLeftMenu() {
    var menuContext = $(divLeftMenuTreeId);
    menuContext.find("dd:first").find("a").addClass("hover");
    menuContext.find("dt:first").nextUntil("dt").show().last().addClass("bb6");
    //下拉树的动态效果  
    menuContext.find("dd").click(function () {
        $(this).find("a").addClass("hover").end().siblings().find("a").removeClass("hover");
    });

    var $extendDt = menuContext.find("dt");
    $extendDt.click(function () {
        var $extendDd = $(this).nextUntil("dt");
        if ($extendDd.length != 0) {
            $(this).siblings("dt").nextUntil("dt").slideUp();
            $extendDd.slideToggle();
            $extendDd.last().addClass("bb6");
            $extendDd.click(function () {
                $(this).find("a").addClass("hover").end().siblings().find("a").removeClass("hover");
            });
        }
        else {
            $(this).find("a").addClass("hover").end().siblings().find("a").removeClass("hover");
        }
    });
    //属性菜单项
    var menuItemsContext = menuContext.find("dd > a");
    menuItemsContext.click(function () {
        menuItemsContext.each(function () {
            $(this).removeClass("hover");
        });
        $(this).addClass("hover");
        addTab($(this).text(), $(this).attr("href"));
        return false;
    });
}


function addOrSelectTab(title, url) {
    addTab(title, url);
}

function addTab(title, url) { 
    var tabContext = $(frameworkTabsId);
    if (tabContext.tabs('exists', title)) {
        tabContext.tabs('select', title);
    } else {
        var _id = "frame_" + (Math.round(Math.random() * 100 / 1));
        //生成唯一ID
        while ($("#" + _id).size() > 0)
            _id = "frame_" + (Math.round(Math.random() * 100 / 1));
        var centerContext = $(frameworkContentId);
        tabContext.tabs('add', {
            title: title,
            content: createFrame(url, _id),
            closable: true,
            width: centerContext.width() - 10,
            height: centerContext.height() - 26
        });
        var ieset = navigator.userAgent;
        if (ieset.indexOf("MSIE 6.0") > -1)//浏览器判断 如果是IE6
            setTimeout("top.frames['" + _id + "'].location.reload();", 10);
        loading.show();
    }
}

function createFrame(url, _id) {
    var s = '<iframe id="' + _id + '" name="' + _id + '" scrolling="auto" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
    return s;
}



/**
 tab关闭事件
 @param	tabId		tab组件Id
 @param	tabMenuId	tab组件右键菜单Id
 @param	type		tab组件右键菜单div中的name属性值
 */
function closeTab(tabContextArg, tabRightMenuContext, type) {
    //tab组件对象
    var tabs = tabContextArg;
    //tab组件右键菜单对象
    var tab_menu = tabRightMenuContext;
    //获取当前tab的标题
    var curTabTitle = tab_menu.data('tabTitle');
    //关闭当前tab
    if (type === 'tab_menu-tabclose') {
        //通过标题关闭tab
        tabs.tabs("close", curTabTitle);
    }
        //关闭全部tab
    else if (type === 'tab_menu-tabcloseall') {
        //获取所有关闭的tab对象
        var closeTabsTitle = getAllTabObj(tabs);
        //循环删除要关闭的tab
        $.each(closeTabsTitle, function () {
            var title = this;
            tabs.tabs('close', title);
        });
    }
        //关闭其他tab
    else if (type === 'tab_menu-tabcloseother') {
        //获取所有关闭的tab对象
        var closeTabsTitle = getAllTabObj(tabs);
        //循环删除要关闭的tab
        $.each(closeTabsTitle, function () {
            var title = this;
            if (title != curTabTitle) {
                tabs.tabs('close', title);
            }
        });
    }
        //关闭当前左侧tab
    else if (type === 'tab_menu-tabcloseleft') {
        //获取所有关闭的tab对象
        var closeTabsTitle = getLeftToCurrTabObj(tabs, curTabTitle);
        //循环删除要关闭的tab
        $.each(closeTabsTitle, function () {
            var title = this;
            tabs.tabs('close', title);
        });
    }
        //关闭当前右侧tab
    else if (type === 'tab_menu-tabcloseright') {
        //获取所有关闭的tab对象
        var closeTabsTitle = getRightToCurrTabObj(tabs, curTabTitle);
        //循环删除要关闭的tab
        $.each(closeTabsTitle, function () {
            var title = this;
            tabs.tabs('close', title);
        });
    }
}

/**
 获取所有关闭的tab对象
 @param	tabs	tab组件
 */
function getAllTabObj(tabs) {
    //存放所有tab标题
    var closeTabsTitle = [];
    //所有所有tab对象
    var allTabs = tabs.tabs('tabs');
    $.each(allTabs, function () {
        var tab = this;
        var opt = tab.panel('options');
        //获取标题
        var title = opt.title;
        //是否可关闭 ture:会显示一个关闭按钮，点击该按钮将关闭选项卡
        var closable = opt.closable;
        if (closable) {
            closeTabsTitle.push(title);
        }
    });
    return closeTabsTitle;
}

/**
 获取左侧第一个到当前的tab
 @param	tabs		tab组件
 @param	curTabTitle	到当前的tab
 */
function getLeftToCurrTabObj(tabs, curTabTitle) {
    //存放所有tab标题
    var closeTabsTitle = [];
    //所有所有tab对象
    var allTabs = tabs.tabs('tabs');
    for (var i = 0; i < allTabs.length; i++) {
        var tab = allTabs[i];
        var opt = tab.panel('options');
        //获取标题
        var title = opt.title;
        //是否可关闭 ture:会显示一个关闭按钮，点击该按钮将关闭选项卡
        var closable = opt.closable;
        if (closable) {
            //alert('title' + title + '  curTabTitle:' + curTabTitle);
            if (title == curTabTitle) {
                return closeTabsTitle;
            }
            closeTabsTitle.push(title);
        }
    }
    return closeTabsTitle;
}

/**
 获取当前到右侧最后一个的tab
 @param	tabs		tab组件
 @param	curTabTitle	到当前的tab
 */
function getRightToCurrTabObj(tabs, curTabTitle) {
    //存放所有tab标题
    var closeTabsTitle = [];
    //所有所有tab对象
    var allTabs = tabs.tabs('tabs');
    for (var i = (allTabs.length - 1) ; i >= 0; i--) {
        var tab = allTabs[i];
        var opt = tab.panel('options');
        //获取标题
        var title = opt.title;
        //是否可关闭 ture:会显示一个关闭按钮，点击该按钮将关闭选项卡
        var closable = opt.closable;
        if (closable) {
            //alert('title' + title + '  curTabTitle:' + curTabTitle);
            if (title == curTabTitle) {
                return closeTabsTitle;
            }
            closeTabsTitle.push(title);
        }
    }
    return closeTabsTitle;
}
