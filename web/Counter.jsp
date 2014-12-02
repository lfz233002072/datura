<%-- 
    Document   : Counter
    Created on : 2014-11-6, 23:01:04
    Author     : lfz
--%>

<%@page import="utils.Counter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
            访问次数<%= Counter.getCount() %>
        </p>
    </body>
</html>
