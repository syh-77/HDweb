<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/7/17
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/update">
    <table>
        <tr>
            <td>商品id</td>
            <td><input type="hidden" value="${goods.id}" name="id">${goods.id}</td>
        </tr>
        </td>
        <tr>
            <td>商品名</td>
            <td><input type="text" name="gName" value="${goods.gName}"></td>
        </tr>
        <tr>
            <td>商品颜色</td>
            <td><input type="text" name="color" value="${goods.color}"></td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td>
                <input type="text" name="price" value="${goods.price}">
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="修改">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
