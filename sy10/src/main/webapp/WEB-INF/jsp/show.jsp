<%--
  Created by IntelliJ IDEA.
  User: shuho
  Date: 2022/5/16
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>提交成功</h1>
    <h2>学号: ${requestScope.sno }</h2>
    <h2>姓名: ${requestScope.sname }</h2>
    <h2>性别: ${requestScope.sex==1?"男":"女" }</h2>
    <h2>出生日期:<fmt:formatDate value="${requestScope.birthday}" pattern="yyyy-MM-dd"/></h2>

    <h2>计算机导论成绩: ${requestScope.score[0] }</h2>
    <h2>C语言程序设计成绩: ${requestScope.score[1] }</h2>
    <h2>Java程序设计论成绩: ${requestScope.score[2] }</h2>
</body>
</html>
