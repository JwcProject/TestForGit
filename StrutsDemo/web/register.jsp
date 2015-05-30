<%--
  Created by IntelliJ IDEA.
  User: Super
  Date: 2015/5/28
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
  <title>注册页面</title>

  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
</head>

<body>
<center>
  <div
          style="margin-top: 20px; margin-left: 20px; front-size: 20px; height: 50px">
    请输入用户注册信息
  </div>
  单击此处
  <a href="/Login.jsp">登录</a>
  <s:form action="register" namespace="/user">
    <s:textfield label="用户名" name="user.username"></s:textfield>
    <s:password label="密码" name="user.password"></s:password>
    <s:submit value="提交"></s:submit>
  </s:form>
</center>
</body>
</html>

