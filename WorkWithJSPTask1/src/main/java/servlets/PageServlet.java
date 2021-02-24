package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/index")
public class PageServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String name = request.getParameter("user_name");
        String country = request.getParameter("country");

        String result = name + " from " + country;

        PrintWriter out = response.getWriter();
        out.print("<h1>"+result+"</h1>");

        //response.sendRedirect("page.jsp");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String name = request.getParameter("user_name");
        String age = request.getParameter("user_age");

        PrintWriter out = response.getWriter();

        out.print("<h1>DATA FROM GET REQUEST</h1>");
        out.print("<br><img src = 'https://s5o.ru/storage/simple/ru/edt/06/bd/a6/26/ruef388c6e6e7.jpg' />");
        out.print("<h3>"+name+" "+age+" years old </h3>");


    }
}