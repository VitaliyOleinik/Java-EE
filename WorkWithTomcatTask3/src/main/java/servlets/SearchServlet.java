package servlets;

import db.DBManager;
import entites.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "SearchServlet", value = "/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        String key = req.getParameter("key");
        if(key==null){
            key = "";
        }

        if(type==null){
            type = "1";
        }

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<form action = '/search' method = 'get'>");
        out.print("SEARCH BY: ");
        out.print("<select name = 'type'>");
        out.print("<option value = '1' "+(type.equals("1")?"selected":"")+" >NAME</option>");
        out.print("<option value = '2' "+(type.equals("2")?"selected":"")+" >SURNAME</option>");
        out.print("<option value = '3' "+(type.equals("3")?"selected":"")+" >GROUP</option>");
        out.print("<option value = '4' "+(type.equals("4")?"selected":"")+" >YEAR</option>");
        out.print("</select> ");
        out.print("<input type = 'text' name = 'key' value = '"+key+"'> ");
        out.print("<button>SEARCH</button>");
        out.print("</form>");

        ArrayList<Students> result = DBManager.getAllStudents();
        if(type!=null&&!type.equals("")){
            if(key!=null&&!key.equals("")){
                result = DBManager.getStudents(key, type);
            }
        }

        if(result!=null){
            for(Students st : result){
                out.print("<h1>"+st+"</h1>");
            }
        }
    }
}
