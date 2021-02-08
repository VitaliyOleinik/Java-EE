package servlets;

import db.DBManager;
import db.Digit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddDigitServlet", value = "/add")
public class AddDigitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int digit = Integer.parseInt(req.getParameter("new_digit"));

        for(int i = 0; i < digit; i++){
            Digit newDigit = new Digit(0, (int) ((Math.random()*(1000 - 1)) + 1));
            DBManager.addDigit(newDigit);
        }
        resp.sendRedirect("/");
    }
}
