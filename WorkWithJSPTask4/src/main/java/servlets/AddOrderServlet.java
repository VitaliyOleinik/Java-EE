package servlets;

import db.DBManager;
import entities.Orders;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "AddOrderServlet", value = "/add")
public class AddOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        DBManager.addOrder(new Orders(null, price, name, new Date(), false));

        response.sendRedirect("/");
    }
}
