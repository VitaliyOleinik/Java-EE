<%@ page import="entities.Cars" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index</title>
</head>
<body>
<form action="add" method="post">
    NAME: <input type="text" name="name">
    MAX SPEED: <input type="number" name="max_speed">
    <button>ADD CAR</button>
</form>
<%
    ArrayList<Cars> cars = (ArrayList<Cars>) request.getAttribute("mashiny");
    if(cars != null){
        for(Cars c : cars){
            out.print("<h1>" + c + " <a href = 'details?id=" + c.getId() + "'> DETAILS</a></h1>");
        }
    }
%>
</body>
</html>