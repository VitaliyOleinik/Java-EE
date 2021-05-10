package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DBManager;
import com.dto.Students;

@WebServlet("/addstudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddStudent() {
    	super();
    	System.out.println("Using constructor method");
    }
    
    private DBManager dbManager;
    
    public void init(){
    	System.out.println("Initializing init method");
    	dbManager = new DBManager();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		double gpa = Double.parseDouble(request.getParameter("gpa"));
		int ent = Integer.parseInt(request.getParameter("ent"));
		String group = request.getParameter("group");
		
		dbManager.addStudent(new Students(null, name, surname, gpa, ent, group));
		
		response.sendRedirect("index");
		
	}

}
