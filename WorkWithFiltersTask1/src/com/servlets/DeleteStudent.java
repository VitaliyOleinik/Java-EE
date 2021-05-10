package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DBManager;import com.dto.Students;

@WebServlet("/delete")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBManager dbManager;
	
    public DeleteStudent() {
        super();
        dbManager = new DBManager();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		dbManager.deleteStudent(id);
		
		response.sendRedirect("index");
		
	}

}
