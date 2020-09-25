<%--
  Created by IntelliJ IDEA.
  User: zhushuoyuan
  Date: 2020/9/25
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>图书管理系统</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<center>
    <form action="/addBook" method="post">
        <table border="1" style="width: 600px;height: 300px;">
            <tr align="center">
                <td colspan="2" style="height:80px;font-size: 30px;font-weight: bolder;background-color: #FFFECB">增加图书</td>
            </tr>
            <tr>
                <td style="font-weight: bolder">书名<span style="color: red">(*)</span></td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td style="font-weight: bolder">作者<span style="color: red">(*)</span></td>
                <td><input type="text" name="author"></td>
            </tr>
            <tr>
                <td style="font-weight: bolder">出版社<span style="color: red">(*)</span></td>
                <td><input type="text" name="publish"></td>
            </tr>
            <tr>
                <td style="font-weight: bolder">出版日期<span style="color: red">(*)</span></td>
                <td><input type="text" name="publishdate">(yyyy-MM-dd)</td>
            </tr>
            <tr>
                <td style="font-weight: bolder">页数</td>
                <td><input type="text" name="page"></td>
            </tr>
            <tr>
                <td style="font-weight: bolder">价格</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td style="font-weight: bolder">内容摘要</td>
                <td><input type="text" name="content"></td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="提交">
                    <input type="button" value="返回" onclick="back()">
                </td>
            </tr>
        </table>
        <p>${msg}</p>
    </form>
</center>
<script type="text/javascript">
    function back() {
        location.href="javascript:history.back()";
    }
    $("form").submit(function () {
        var name=$("[name='name']").val();
        if(name==""){
            alert("图书名称不能为空!");
            return false;
        }
        var author=$("[name='author']").val();
        if(author==""){
            alert("作者不能为空!");
            return false;
        }
        var publish=$("[name='publish']").val();
        if(publish==""){
            alert("出版社不能为空!");
            return false;
        }
        //日期的正则表达式
        var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
        var regExp = $("[name='publishdate']").val();
        if(!reg.test(regExp)){
            alert("日期格式不正确，正确格式为：2014-01-01");
            return false;
        }
        return true;
    })
</script>
</body>
</html>
