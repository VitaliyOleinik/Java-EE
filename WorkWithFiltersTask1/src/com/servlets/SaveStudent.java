package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DBManager;import com.dto.Students;

@WebServlet("/save")
public class SaveStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBManager dbManager;
	
    public SaveStudent() {
        super();
        dbManager = new DBManager();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long id = Long.parseLong(request.getParameter("id"));
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		double gpa = Double.parseDouble(request.getParameter("gpa"));
		int ent = Integer.parseInt(request.getParameter("ent"));
		String group = request.getParameter("group");
		
		dbManager.saveStudent(new Students(id, name, surname, gpa, ent, group));
		
		response.sendRedirect("details?id="+id+"&success");
		
	}

}
