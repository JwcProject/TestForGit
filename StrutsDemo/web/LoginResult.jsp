<%--
  Created by IntelliJ IDEA.
  User: Super
  Date: 2015/5/28
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
  <title>My JSP 'reslut.jsp' starting page</title>

  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
</head>
<body>
登录成功！您的帐号和密码是：<br>
username: ${requestScope.user.username}<br>
password: ${requestScope.user.password}<br>
点击此处可以跳转到<s:a href="http://www.cqu.edu.cn">重大首页</s:a>！	</body>
</html>

