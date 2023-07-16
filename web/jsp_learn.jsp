<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2023/7/15
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>测试网页</title>
</head>
<body>
   <%! String printMultiTable1() {
       String s = "";
       for (int i = 1; i <= 9; i++) {
           for (int j = 1; j <= 9; j++) {
              s+=i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp;&nbsp;&nbsp;";
           }
           s+="<br>";
       }
       return s;
   }
   %>
   <hr>
   <%=printMultiTable1()%>
   <br>
<a herf="/learn">Learn Servlet</a>
</body>
</html>
