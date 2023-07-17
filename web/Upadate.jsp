<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2023/7/17
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post"action="/update">
    <table>
        <tr>
            <td>商品id</td>
            <td>${shops.id}</td>
        </tr>
        <tr>
            <td>商品介绍</td>
            <td><input type="text" name="sName" value="#{shops.showTxt}"></td>
        </tr>
        <tr>
            <td>商品数量</td>
            <td><input type="number" name="sNumber" value="${shops.number}"></td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td><input type="number"name="sPrice" value="${shops.number}"></td>
        </tr>
        <tr>
            <td><input type="button" value="修改"></td>
        </tr>
    </table>
</form>
</body>
</html>
