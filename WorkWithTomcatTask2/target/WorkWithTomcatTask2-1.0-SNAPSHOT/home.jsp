<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Users" %><%--
  Created by IntelliJ IDEA.
  User: Mi Book
  Date: 2/9/2021
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search UIN!</title>
</head>
<body>
    <form action="find" method="post">
        UIN: <input type="text" name="find_uin">
        <button>Search!</button>
    </form>
    <%
        ArrayList<Users>users = (ArrayList<Users>) request.getAttribute("users");
<%--        if(users != null){--%>
<%--            %><h1>All Users:</h1><%--%>
<%--            for(Users user : users){--%>
<%--            %>--%>
<%--        <h1><%=user.toString()%></h1>--%>
<%--    <%--%>
<%--            }--%>
<%--        }--%>
    %>
</body>
</html>
