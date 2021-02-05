<%@ page import="java.util.ArrayList" %>
<%@ page import="com.project.db.Cars" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="add" method="post">
        Name: <input type="text" name="name">
        Model: <input type="text" name="model">
        Year: <input type="number" name="year">
        Price: <input type="number" name="price">
        <button>ADD NEW CAR!</button>

    </form>

    <%
        // jsp->java server page
        // text on page with tag h1
//        String text = "Vitaliy";
//        out.print("<h1>"+text+"</h1>");
        ArrayList<Cars> cars = (ArrayList<Cars>) request.getAttribute("cars");
        if(cars != null){ // check cars is initializer
            for(Cars car : cars){
                %>
                    <h1><%=car.getName()%> <%=car.getModel()%> for <%=car.getPrice()%> USD from <%=car.getYear()%></h1>
                <%
            }
        }
    %>
</body>
</html>

