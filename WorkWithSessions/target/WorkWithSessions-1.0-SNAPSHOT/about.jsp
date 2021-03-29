<%@ page import="com.db.Users" %><%--
  Created by IntelliJ IDEA.
  User: Mi Book
  Date: 3/29/2021
  Time: 6:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Users user = (Users)request.getAttribute("user");
    if(user != null){
        out.print("<h1>"+user.toString()+"</h1>");
    }else{
        out.print("NO SESSION!");
    }
%>
<a href="/home">GO TO HOME</a>
</body>
</html>
