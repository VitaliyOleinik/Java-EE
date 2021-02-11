package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", value = "/act")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        int age = Integer.parseInt(request.getParameter("user_age"));
        System.out.println("GET METHOD IS WORKING IN SERVLET");
        System.out.println("Your name is "+name+" and you are "+age+" years old");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1 style = 'color:red;'>Your name is "+name+" and you are "+age+" years old<h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        int age = Integer.parseInt(request.getParameter("user_age"));
        System.out.println("POST METHOD IS WORKING IN SERVLET");
        System.out.println("Your name is "+name+" and you are "+age+" years old");
        response.sendRedirect("/");
    }
}
