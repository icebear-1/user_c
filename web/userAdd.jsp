<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/17 0017
  Time: 下午 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/userAdd" method="post">

    账号：<input type="text" name="account" value=""><br><br>
    密码：<input type="password" name="password" value=""><br><br>
    年龄：<input type="text" name="age" value=""><br><br>
    性别：<input type="radio" name="sex" value="1" checked>男
    <input type="radio" name="sex" value="0">女<br><br>

    工资：<input type="text" name="sal" value=""><br><br>
    出生日期：<input type="date" name="birth" value=""><br><br>

    <input type="submit" value="保存">
    <input type="reset" value="重置">
</form>
</body>
</html>
