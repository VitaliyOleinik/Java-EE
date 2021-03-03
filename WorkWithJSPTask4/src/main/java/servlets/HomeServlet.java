package servlets;

import db.DBManager;
import entities.Orders;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Orders> allOrders = DBManager.getOrders();

        request.setAttribute("orders", allOrders);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
