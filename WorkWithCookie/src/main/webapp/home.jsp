<%--
  Created by IntelliJ IDEA.
  User: Mi Book
  Date: 3/4/2021
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookie</title>
</head>
<body>

    <form action="/home" method="post">
        Name: <input name="name" type="text">
        <button>Save Cookie</button>
    </form>

<h1>
    <%
        String cookieValue = (String) request.getAttribute("cookie_value");
        out.print(cookieValue);
    %>
</h1>

<a href="delete">Clear Cookies</a>

</body>
</html>
