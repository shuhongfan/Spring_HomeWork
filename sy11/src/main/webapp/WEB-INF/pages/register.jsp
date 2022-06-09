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
<h1>
    <h1>用户注册页面</h1>
    <%="1".equalsIgnoreCase(request.getParameter("errcode"))?"注册失败，请重试":""%></h1>

    <form action="/register" method="post">
        用户名：<input type="text" name="username"> <br>
        密码：<input type="password" name="password"> <br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
