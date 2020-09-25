<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
    <table border="1px" width="1000px">
        <tr>
            <td>书名</td>
            <td>作者</td>
            <td>出版社</td>
            <td>出版日期</td>
            <td>页数</td>
            <td>价格</td>
            <td>内容摘要</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${bookPageInfo.list}" var="item">
            <tr>
                <td>${item.name}</td>
                <td>${item.author}</td>
                <td>${item.publish}</td>
                <td><fmt:formatDate value="${item.publishdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                <td>${item.page}</td>
                <td>${item.price}</td>
                <td>${item.content}</td>
                <td><a href="">修改</a>&nbsp;<a href="javascript:void(0)" onclick="del(${item.id})">删除</a></td>
            </tr>

        </c:forEach>
    </table>

    <div>
        <a href="/selectAll?pageNum=${bookPageInfo.firstPage}">首页</a>
        <c:if test="${bookPageInfo.hasPreviousPage}">
            <a href="/selectAll?pageNum=${bookPageInfo.prePage}">上一页</a>
        </c:if>
        <c:forEach items="${bookPageInfo.navigatepageNums}" var="i">
            <a href="/selectAll?pageNum=${i}">${i}</a>
        </c:forEach>
        <c:if test="${bookPageInfo.hasNextPage}">
            <a href="/selectAll?pageNum=${bookPageInfo.nextPage}">下一页</a>
        </c:if>
        <a href="/selectAll?pageNum=${bookPageInfo.lastPage}">尾页</a>
    </div>

</body>
</html>
<script type="text/javascript">
    function del(id) {
        var flag=confirm("确定要删除吗");
        if(flag){
            location.href="/del?id="+id;
        }
    }

</script>
