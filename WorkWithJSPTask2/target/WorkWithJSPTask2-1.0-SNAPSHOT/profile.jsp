<%@ page import="db.DBManager" %>
<%@ page import="entities.Users" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<%@include file="nav.jsp"%>
<div class="container mt-5">

    <div class="row">

        <div class="col-10 offset-1">

            <h1>Welcome</h1>
            <%
                String login = request.getParameter("user_login");
                String password = request.getParameter("user_password");

                DBManager dbManager = new DBManager();
                Users user = dbManager.auth(login,password);
            %>
            <h2><%
                user.getLogin();
            %></h2>
            <h3><%
                user.getAge();
            %></h3>

        </div>

    </div>

</div>

</body>
</html>