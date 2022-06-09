<%--
  Created by IntelliJ IDEA.
  User: shuho
  Date: 2022/5/16
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>用户注册成功页面</h1>
    <h1>提交成功</h1>
    <h1>你的用户是：<%=request.getParameter("username")%></h1>
    <h1><a href="/login">去登录页面</a></h1>

</body>
</html>
