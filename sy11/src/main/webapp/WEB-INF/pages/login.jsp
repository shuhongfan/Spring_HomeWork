<%--
  Created by IntelliJ IDEA.
  User: shuho
  Date: 2022/5/16
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<h1>用户登录页面</h1>
<h1>
    <%="1".equalsIgnoreCase(request.getParameter("errcode"))?"用户名或密码错误":""%></h1>
<form action="/login" method="post">
        用户名：<input type="text" name="username"> <br>
        密码：<input type="password" name="password"> <br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
