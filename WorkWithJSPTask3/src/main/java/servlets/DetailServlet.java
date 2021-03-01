package servlets;

import db.DBManager;
import entities.Cars;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetailServlet", value = "/details")
public class DetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));

        Cars car = DBManager.getCar(id);
        if(car != null){
            request.setAttribute("vehicle", car);
            request.getRequestDispatcher("view/details.jsp").
                    forward(request, response);
        }else{
            request.getRequestDispatcher("view/404.jsp").
                    forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
