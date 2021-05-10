package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DBManager;
import com.dto.Students;
import com.dto.Users;

@WebServlet("/index")
public class IndexPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBManager dbManager;
    public IndexPage() {
        super();
        dbManager = new DBManager();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Users userData = (Users)request.getAttribute("userData");
		
		if(userData!=null){
			
			request.getRequestDispatcher("profile.jsp").forward(request, response);
			
		}else{
		
			ArrayList<Students> students = dbManager.getStudents();
			request.setAttribute("stList", students);	
			request.getRequestDispatcher("index.jsp").forward(request, response);
		
		}
	
	}

}
