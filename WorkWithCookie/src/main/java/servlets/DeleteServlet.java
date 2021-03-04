package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", value = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie []cookies = request.getCookies();
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("myCookie")){
                    c.setMaxAge(0);
                    response.addCookie(c);
                    break;
                }
            }
        }
        response.sendRedirect("/");
    }
}
