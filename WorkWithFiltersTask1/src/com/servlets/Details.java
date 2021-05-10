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

@WebServlet("/details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBManager dbManager;
    public Details() {
        super();
        dbManager = new DBManager();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idhska = request.getParameter("id");
		long id = 0;
		Students st = null;
		
		try{
		
			id = Long.parseLong(idhska);
			
		}catch (Exception e) {
			
			id = 0;
		
		}
		if(id>0){
			
			st = dbManager.getStudent(id);
			
		}
		
		if(st!=null){
			request.setAttribute("student", st);
			request.getRequestDispatcher("details.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("404.jsp").forward(request, response);
		}
		
		
	}

}
