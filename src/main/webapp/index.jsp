<%--
  Created by IntelliJ IDEA.
  User: 23147
  Date: 2021/5/2
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/FindAll"> 测试查询</a>
<form action="user/save" method="post">
    姓名: <input type="text" name="name">
    金额: <input type="text" name="money">
    <input type="submit" value="保存">
</form>

</body>
</html>
