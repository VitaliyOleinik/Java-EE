<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table>
        <tr>
            <td>NAME</td><td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td><input type="submit" value="SEND"></td>
        </tr>
    </table>

    <%
        String someText = "SOME TEXT DATA";
        for(int i = 0;i<10;i++){
            out.print("<h1>HELLO BITLAB</h1>");
        }
        out.print(someText);
    %>

    <%
        String myText = "HELLO TEXT";
        out.print("<h3 style = 'color:red; '>"+myText+"</h3>");
    %>
    <%

        String text = request.getParameter("key");
        out.print(text);

    %>

</body>
</html>
