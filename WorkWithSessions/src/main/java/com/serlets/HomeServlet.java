package com.serlets;

import com.db.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Users user = (Users)request.getSession().getAttribute("USER_DATA");

        request.setAttribute("user", user);

        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        int age = Integer.parseInt(request.getParameter("age"));

        Users user = new Users(name, surname, age);
        HttpSession session = request.getSession();
        session.setAttribute("USER_DATA", user);

        response.sendRedirect("/");
    }
}
