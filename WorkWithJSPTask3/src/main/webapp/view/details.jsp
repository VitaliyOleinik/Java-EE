<%@ page import="entities.Cars" %><%--
  Created by IntelliJ IDEA.
  User: Mi Book
  Date: 2/28/2021
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>
<body>
    <%
        Cars car = (Cars) request.getAttribute("vehicle");
        if(car != null){
            out.print("<h1>ID : " + car.getId() + "</h1>");
            out.print("<h1>" + car.getName() + "</h1>");
            out.print("<h2>Max Speed : " + car.getMaxSpeed() + " km/h</h2>");

    %>

    <form action="delete" method="post">
        <input type="hidden" name="id" value="<% out.print(car.getId());%>">
        <button>DELETE</button>
    </form>
    <%
        } // close operation if
    %>

</body>
</html>
