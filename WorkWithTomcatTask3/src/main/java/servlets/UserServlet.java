package servlets;

import db.DBManager;
import entites.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("INITIALIZING SERVLET");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Users> allUsers = DBManager.getAllUsers();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<form action = 'user' method = 'post'>");
        out.print("NAME : <input type = 'text' name = 'user_name'>");
        out.print("AGE : <input type = 'number' name = 'user_age'>");
        out.print("<button>ADD USER</button>");
        out.print("</form>");

        out.print("<table cellpadding = '10px'>");
        for(Users u : allUsers){
            out.print("<tr>");
            out.print("<td>"+u.getId()+"</td>");
            out.print("<td>"+u.getName()+"</td>");
            out.print("<td>"+u.getAge()+"</td>");
            out.print("</tr>");
        }
        out.print("</table>");
    }

    public void destroy(){
        System.out.println("DELETING SERVLET");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        int age = Integer.parseInt(request.getParameter("user_age"));

        DBManager.addUser(new Users(null, name, age));
        response.sendRedirect("/user");
    }
}
