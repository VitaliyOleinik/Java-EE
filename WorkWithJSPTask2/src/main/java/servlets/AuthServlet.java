package servlets;

import db.DBManager;
import entities.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AuthServlet", value = "/auth")
public class AuthServlet extends HttpServlet {
        private DBManager dbManager;

        public void init(){
                dbManager = new DBManager();
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
                String login = request.getParameter("user_login");
                String password = request.getParameter("user_password");

                Users user = dbManager.auth(login,password);

                if(user != null){
                        response.sendRedirect("profile");
                        System.out.println(user.getUserFullName());
                }else{
                        response.sendRedirect("index?error");
                }
        }
}

