package com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.db.DBManager;
import com.dto.Users;

@WebFilter("/*")
public class UserFilter implements Filter {

	private DBManager dbManager;
	
    public UserFilter() {
        dbManager = new DBManager();
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Starting Filter");
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		
		Users sessionUser = (Users)session.getAttribute("userSession");
		
		if(sessionUser!=null){
			
			System.out.println("Session exists");
			
			Users user = dbManager.getUser(sessionUser.getEmail(), sessionUser.getPassword());
			
			if(user!=null){
				
				System.out.println("Session data matches with db");
				request.setAttribute("userData", user);
				
			}else{
				
				session.removeAttribute("userSession");
				
			}
			
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
