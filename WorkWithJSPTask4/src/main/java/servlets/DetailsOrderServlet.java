package servlets;

import db.DBManager;
import entities.Orders;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetailsOrderServlet", value = "/details")
public class DetailsOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));

        Orders order = DBManager.getOrder(id);
        if(order != null) {
            request.setAttribute("orders", order);
            request.getRequestDispatcher("details.jsp").
                    forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
