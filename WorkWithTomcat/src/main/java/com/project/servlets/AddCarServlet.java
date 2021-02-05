package com.project.servlets;

import com.project.db.Cars;
import com.project.db.DBManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
// value like action
@WebServlet(name = "AddCarServlet", value = "/add")
public class AddCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String model = request.getParameter("model");
        int year = Integer.parseInt(request.getParameter("year"));
        int price = Integer.parseInt(request.getParameter("price"));

        Cars newCar = new Cars(0, name, model, price, year);
        DBManager.addCar(newCar);
        // попадем на страницу по умолчанию!
        response.sendRedirect("/");
    }
}
