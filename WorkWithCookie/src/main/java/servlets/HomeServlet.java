package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get all cookies
        Cookie []cookies = request.getCookies();
        String cookieValue = "No Cookie Value!";
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("myCookie")){
                    cookieValue = c.getValue();
                    break;
                }
            }
        }

        request.setAttribute("cookie_value", cookieValue);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("name");

        // create Cookie object
        Cookie cookie = new Cookie("myCookie", text);
        cookie.setMaxAge(3600); // set cookie age (1 hour)
        response.addCookie(cookie);

        response.sendRedirect("/");
    }
}
