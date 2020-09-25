<%--
  Created by IntelliJ IDEA.
  User: 39740
  Date: 2020/9/25
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/static/js/jquery-1.12.4.js"></script>
<body>
<form action="/selectAll" method="post">
    <table align="center" border="1px">
        <tr align="center">
            <td colspan="2">
                <h3>登录图书管理系统</h3>
            </td>
        </tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
<p style="color:red;" align="center">${error}</p>
<script>
    $("form").submit(function () {
        var name = $("[name ='name']").val();
        var password = $("[name = 'password']").val();
        if(name == ""){
            alert("用户名不能为空");
            return false;
        }
        if(password == ""){
            alert("密码不能为空");
            return false;
        }
        return true;
    })
</script>
</body>
</html>
