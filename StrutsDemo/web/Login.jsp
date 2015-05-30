<%--
  Created by IntelliJ IDEA.
  User: Super
  Date: 2015/5/28
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="p" uri="/struts-tags" %>
<html>
<head>
  <title>用户登录</title>

  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
</head>
<body>
<center>
  <div style="margin-top: 20px; margin-left: 20px; front-size: 20px; height:50px">
    请输入用户名和密码
  </div>
  如果你还没有注册，单击此处<a href="register.jsp">注册</a>
  <%--<form action="/user/login" method="post">
    <input type="text" name="user.username" >
    <input type="password" name="user.password">
    <input type="submit">--%>
  <%--</form>--%>
  <p:form action="login" namespace="/user">
    <p:textfield label="用户名" name="user.username" cssClass="input_list"/>
    <p:password label="密码" name="user.password" cssClass="input_list"/>
    <p:submit value="登录"></p:submit>
  </p:form>
</center>
</body>
</html>

