<%-- 
    Document   : login
    Created on : 2014-11-11, 20:04:30
    Author     : lfz
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    Object message =  request.getAttribute("loginErrorMsg");
    String errorMessage="";
    if(message!=null){
        errorMessage =message.toString();
    }
    
Object obj =request.getAttribute("ServletTitle");
String title ="";
if(obj!=null) title=obj.toString(); 
%>
<html xmlns="http://www.w3.org/1999/xhtml"  lang="zh-cn">
    <head lang="zh-cn">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>${title} </title>
        <link href="<%=path%>/content/Site.css" rel="stylesheet" type="text/css" />
        <link href="<%=path%>/content/Login.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript">
            if (self.location != top.location) {
                top.location.href = self.location.href;
            }
        </script>
        <link href="<%=path%>/favicon.ico" rel="shortcut icon" type="image/x-icon" />
    </head>
    <body id="loginBody">
        <div id="loginPage"> 
            <form action="login.do" method="post">
                <div id="loginArea">
                    <div class="login_skin">
                        <div class="hd" style='background: url("")'>
                            <span class="error" id="spErrorMsg">
                                <%=  errorMessage %>
                            </span>
                        </div>
                        <div class="bd" >
                            <div class="tf">
                                <label>UserName:</label> 
                                <input id="UserName" class = "input_off" name="UserName" value="InternalAdmin" onfocus = "this.className = 'input_on'" onblur = "this.className = 'input_off'" />
                            </div>
                            <div class="tf">
                                <label>Password:</label>
                                <input id="Password" type="password" value="123456" class = "input_off" name="Password" onfocus = "this.className = 'input_on'" onblur = "this.className = 'input_off'" />
                            </div>
                            <div class="tf tf_vd">
                                <label for="">
                                    &nbsp;</label>
                                <input id  ="RememberMe" type="checkbox" name="RememberMe" value="ON" class="rp" /> 
                                <label for="RememberMe" style = "text-align:left">RememberMe</label> 
                            </div>
                            <div class="tf tf_sb">
                                <label for="">
                                    &nbsp;</label>
                                <button type="submit" class="submitBtn">
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="display: none"> 
                                <%=  errorMessage %>
                </div>
            </form>
        </div> 
        <script type="text/javascript">
        if (self.location != top.location) {
            top.location.href = self.location.href;
        }
            function addEvent(el, evtType, handler) {
                if (typeof el === 'string') {
                    var d = handler;
                    handler = function () {
                        eval(d);
                    };
                }
                if (el.addEventListener) {
                    if (evtType == 'mousewheel')
                        evtType = 'DOMMouseScroll';
                    el.addEventListener(evtType, handler, false);
                    return true;
                } else
                    return el.attachEvent ? el.attachEvent('on' + evtType, handler) : false;
            }
            function __each(els, fn) {
                for (var i = 0; i < els.length; i++) {
                    fn(els[i], i);
                }
            }
            function __hasClass(el, _class) {
                if (el.className != _class)
                    return false;
                return el.className != el.className.replace(new RegExp('\\b' + _class + '\\b'), '');
            }
            function __addClass(el, _class) {
                if (el.className) {
                    el.className += ' ' + _class;
                } else {
                    el.className = _class;
                }
            }
            function __removeClass(els, _class) {
                if (els.length) {
                    els && __each(els, function (el) {
                        el.className = el.className.replace(new RegExp('\\b' + _class + '\\b'), '');
                    });
                } else {
                    els.className = els.className.replace(new RegExp('\\b' + _class + '\\b'), '');
                }
            }
            function winHeight() {
                var a = document.documentElement;
                return self.innerHeight || a && a.clientHeight || document.body.clientHeight;
            }
            (function () {
                var input = document.getElementById('loginArea').getElementsByTagName('input');
                var loginPage = document.getElementById('loginPage');
                input[0].focus();
                input[0].className = 'cur';
                __each(input, function (el, i) {
                    addEvent(el, 'focus', function (e) {
                        __removeClass(input, 'cur');
                        __addClass(el, 'cur');
                    });
                    addEvent(el, 'blur', function (e) {
                        __removeClass(input, 'cur');
                    });
                });
                function _resize() {
                    var w_height = winHeight();
                    loginPage.style['height'] = w_height + 'px';
                }
                addEvent(window, 'resize', _resize);
                _resize();
            })();
        </script>
        <style>
            html
            {
                _overflow-x: hidden;
                overflow-y: auto;
            }
            body
            {
                overflow: visible;
            }
        </style>
    </body>
</html>
