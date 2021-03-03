<%@ page import="entities.Orders" %><%--
  Created by IntelliJ IDEA.
  User: Mi Book
  Date: 3/3/2021
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>
<body>

<%
    Orders order = (Orders) request.getAttribute("orders");
    if(order != null){
        out.print("<h1> ID : " + order.getId() + "</h1>");
        out.print("<h1> Name :" + order.getName() + "</h1>");
        out.print("<h2> Is Completed : " + order.isCompleted() + "</h2>");
%>
<form action="complete" method="post">
    <input type="hidden" name="id" value="<%out.print(order.getId());%>">
    <button>COMPLETE</button>
</form>
<%
    }// close operation if (check initialization of order)
%>
</body>
</html>