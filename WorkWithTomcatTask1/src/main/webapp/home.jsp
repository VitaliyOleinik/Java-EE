<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Digit" %><%--
  Created by IntelliJ IDEA.
  User: Mi Book
  Date: 2/8/2021
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RANDOM DIGITS!</title>
</head>

<body>
    <form action="add" method="post">
        Digit:  <input type="number" name="new_digit">
        <button>Add new random digit!</button>
    </form>
    <%
        //out.print("<h1>"+"Hi There"+"</h1>");
        ArrayList<Digit> digits = (ArrayList<Digit>) request.getAttribute("digits");
        if(digits != null){ // check digits is initializer
            for(Digit digit : digits){
                %>
                <h1>id: <%=digit.getId()%> Digit: <%=digit.getDigit()%></h1>
    <%
            }

        }
    %>
</body>
</html>
