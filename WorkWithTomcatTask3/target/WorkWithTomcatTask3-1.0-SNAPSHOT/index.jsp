<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
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