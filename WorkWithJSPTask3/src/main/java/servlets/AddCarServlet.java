package servlets;

import db.DBManager;
import entities.Cars;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/add")
public class AddCarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int maxSpeed = Integer.
                parseInt(request.getParameter("max_speed"));

        DBManager.addCar(new Cars(null, name, maxSpeed));
        response.sendRedirect("/");
    }
}
