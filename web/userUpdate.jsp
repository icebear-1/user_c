<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/17 0017
  Time: 下午 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/userUpdate" method="post">
    <input type="hidden" name="id" value="${user.id}"><br><br>
    账号：<input type="text" name="account" value="${user.account}"><br><br>
    密码：<input type="password" name="password" value="${user.password}"><br><br>
    年龄：<input type="text" name="age" value="${user.age}"><br><br>
    性别：<input type="radio" name="sex" value="1"
              <c:if test="${user.sex==1}">checked</c:if> >男
    <input type="radio" name="sex" value="0"
           <c:if test="${user.sex==0}">checked</c:if> >女<br><br>
    工资：<input type="text" name="sal" value="${user.sal}"><br><br>
    出生日期：<input type="date" name="birth" value="${user.birth}"><br><br>
    <input type="submit" value="修改">
    <input type="reset" value="重置">
</form>
</body>
</html>
