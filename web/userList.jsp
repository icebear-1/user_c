<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/17 0017
  Time: 下午 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<head>
    <title>Title</title>
</head>
<body>
<a href="userAdd.jsp">添加用户</a>
<table style="width: 80%;" border="1px" cellpadding="0" cellspacing="0"
<tr>
    <td>序号</td>
    <td>账号</td>
    <td>年龄</td>
    <td>性别</td>
    <td>工资</td>
    <td>出生日期</td>
    <td>操作</td>
</tr>
<c:forEach var="user" items="${list}" varStatus="status">
    <tr>
        <td>${status.index+1}</td>
        <td>${user.account}</td>
        <td>${user.age}</td>
        <td>${user.sex}</td>
        <td>${user.sal}</td>
        <td>
            <fmt:parseDate var="birth" value="${user.birth }" pattern="yyyy-MM-dd"></fmt:parseDate>
            <fmt:formatDate value="birth" pattern="yyyy年MM月dd日"></fmt:formatDate>
        </td>
        <td>
            <a href="/toUpdate?id=${user.id}">修改</a>
            <a href="/delete?id=${user.id}">删除</a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
