<%@ page import="java.util.ArrayList" %>
<%@ page import="entities.Orders" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Order List</title>
</head>
<body>

<form action="add" method="post">
    Name : <input name="name" type="text">
    Price : <input name="price" type="number">
    <button type="submit">ADD ORDER</button>
</form>
    <%
        ArrayList<Orders> orders = (ArrayList<Orders>) request.getAttribute("orders");
        if(orders != null){
            for(Orders o: orders){
                out.print("<h2>" + "Name: " + o.getName() + ". Price: " + o.getPrice() + ". Order Time: " + o.getOrderedTime()
                       + ". Completed: " + o.isCompleted());
                out.println("<a href = 'details?id=" + o.getId() + "'> DETAILS</a>");
            }
        }
    %>
</body>
</html>