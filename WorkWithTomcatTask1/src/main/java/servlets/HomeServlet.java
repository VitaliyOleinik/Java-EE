package servlets;

import db.DBManager;
import db.Digit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("Some DIGITS!!!");
        ArrayList<Digit> digits = DBManager.getAllDigits();
        req.setAttribute("digits", digits);
        req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }
}
