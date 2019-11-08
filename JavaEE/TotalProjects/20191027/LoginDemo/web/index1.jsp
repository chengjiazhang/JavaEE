<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-10-26
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <title>登录界面</title>
    <link href="css/default.css" rel="stylesheet" type="text/css" />
    <!--必要样式-->
    <link href="css/styles.css" rel="stylesheet" type="text/css" />
    <link href="css/demo.css" rel="stylesheet" type="text/css" />
    <link href="css/loaders.css" rel="stylesheet" type="text/css" />

</head>
<body>
<form action="login" method="post">
    请输入用户名：<input type="text" name="userName" value="" id="userName_id">
    请输入密码：<input type="password" name="userPassword" value="" id="userPassword_id">
    <input type="submit" name="submit">
</form>

</body>
</html>
