<%--
  Created by IntelliJ IDEA.
  User: Super
  Date: 2015/5/28
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ss" uri="/struts-tags" %>
<html>
    <head>
        <title>主界面</title>
    </head>

    <body>
        <center>
            <ss:form action="mainPage" namespace="/user">
                如果您还没有登录，请先<ss:a href="Login.jsp">登录</ss:a>后操作！<br>
                如果您还没有帐号，请先<ss:a href="register.jsp">注册</ss:a>然后在登录！<br>
                如果您已经登录请您进入<ss:a href="user/mainPage.action">重大首页</ss:a>操作！<br>
            </ss:form>>
        </center>

    </body>
</html>

