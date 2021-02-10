package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", value = "/act")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("user_name");
        int age = Integer.parseInt(req.getParameter("user_age"));
        System.out.println("GET METHOD IS WORKING IN SERVLET");

        System.out.println("Your name is "+name+" and you are "+age+" years old");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1 style = 'color:red;'>Your name is "+name+" and you are "+age+" years old<h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("user_name");
        int age = Integer.parseInt(req.getParameter("user_age"));

        System.out.println("POST METHOD IS WORKING IN SERVLET");
        System.out.println("Your name is "+name+" and you are "+age+" years old");

        resp.sendRedirect("/");

    }
}
