<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <form action="/user" method="post">
        NAME : <input type="text" name="user_name">
        AGE : <input type="number" name="user_age">
        <button>ADD USER</button>
    </form>
    <a href="/user">VIEW ALL USERS</a>
</body>
</html>