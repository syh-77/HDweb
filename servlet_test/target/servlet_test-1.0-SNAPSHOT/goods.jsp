<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/7/16
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        a {
            text-decoration: none;
            color: red;
        }
        .styled-table {
            width: 100%;
            border-collapse: collapse;
            margin: 25px 0;
            font-size: 0.9em;
            font-family: sans-serif;
            min-width: 400px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
            text-align: center;
        }
        .styled-table thead tr {
            background-color: #009879;
            color: #ffffff;

        }
        .styled-table th,
        .styled-table td {
            padding: 12px 15px;
        }
        .styled-table tbody tr {
            border-bottom: 1px solid #dddddd;
        }

        .styled-table tbody tr:nth-of-type(even) {
            background-color: #f3f3f3;
        }

        .styled-table tbody tr:last-of-type {
            border-bottom: 2px solid #009879;
        }
        .styled-table tbody tr.active-row {
            font-weight: bold;
            color: #009879;
        }
    </style>
</head>
<body>
<button><a href="/add_goods.html">增加</a></button>
<table class="styled-table">
    <thead>
    <tr>
        <th>商品id</th>
        <th>商品名</th>
        <th>商品颜色</th>
        <th>商品价格</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${gList}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.gName}</td>
            <td>${u.color}</td>
            <td>${u.price}</td>
            <td>
                <button><a href="/delete?id=${u.id}">删除</a></button>
                <button><a href="/getGid?id=${u.id}">修改</a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
