package servlets;

import db.DBUtil;
import db.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "FindServlet", value = "/find")
public class FindServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int uin = Integer.parseInt(req.getParameter("find_uin"));
        ArrayList<Users> users = DBUtil.getAllUsers();
        PrintWriter out = resp.getWriter();
        if(users != null){
            for(Users user: users){
                if(user.getId() == uin)
                    out.println(user.toString());
            }
        }
        resp.sendRedirect("/");

    }
}
