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

    <%=request.getParameter("errmsg")==null?"":request.getParameter("errmsg")%></h1>
    <form action="/submit" method="post">
        学号：<input type="text" name="sno"> <br>
        姓名：<input type="text" name="sname"> <br>
        性别：<input type="radio" value="1" name="sex"> 男
            <input type="radio" value="0" name="sex"> 女 <br>
        出生日期： <input type="date" name="birthday"> <br>
        成绩（计算机导论）： <input type="text" name="score[0]"> <br>
        成绩（C语言程序设计）： <input type="text" name="score[1]"> <br>
        成绩（Java程序设计）： <input type="text" name="score[2]"> <br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
