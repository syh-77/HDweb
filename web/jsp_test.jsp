<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/7/15
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        table {
            border-collapse: collapse;
        }
        td {
            padding: 5px;
        }

    </style>
</head>
<body>

<table>
    <c:forEach var="i" begin="1" end="9">
       <c:choose>
           <c:when test="${i%2==0}">
               <tr style="background-color: royalblue">
                   <c:forEach var="j" begin="1" end="${i}">
                       <td>
                           <c:out value="${j}*${i}=${j*i}"></c:out>
                       </td>
                   </c:forEach>
               </tr>
           </c:when>
           <c:otherwise>
               <tr style="background-color: darkgreen">
                   <c:forEach var="j" begin="1" end="${i}">
                       <td>
                           <c:out value="${j}*${i}=${j*i}"></c:out>
                       </td>
                   </c:forEach>
               </tr>
           </c:otherwise>
       </c:choose>
    </c:forEach>
</table>
</body>
</html>
