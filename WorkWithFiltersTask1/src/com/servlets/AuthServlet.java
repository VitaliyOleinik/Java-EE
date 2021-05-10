package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DBManager;
import com.dto.Users;

@WebServlet("/auth")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DBManager dbManager;
	
    public AuthServlet() {
        super();
        dbManager = new DBManager();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Users user = dbManager.getUser(email, password);
		
		if(user!=null){
			request.getSession().setAttribute("userSession", user);
		}
		
		response.sendRedirect("index");
		
	}

}
