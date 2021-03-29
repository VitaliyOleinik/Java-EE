package com.serlets;

import com.db.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AboutServlet", value = "/about")
public class AboutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users user = (Users)request.getSession().getAttribute("USER_DATA");

        request.setAttribute("user", user);
        request.getRequestDispatcher("/about.jsp").forward(request, response);
    }
}
