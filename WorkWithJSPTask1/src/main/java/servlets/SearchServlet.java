package servlets;

import db.DBManager;
import entities.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/search")
public class SearchServlet extends HttpServlet {

    private DBManager dbManager;

    public void init() throws ServletException {
        dbManager = new DBManager();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String criteria = request.getParameter("criteria");

        ArrayList<Students> result = null;
        String byName = "";
        String bySurname = "";
        String byGroup = "";
        String byYear = "";

        if(key!=null&&!key.equals("")){

            if(criteria.equals("name")){
                result = dbManager.getStudentsByName(key);
                byName = "selected";
            }
            if(criteria.equals("surname")){
                result = dbManager.getStudentsBySurname(key);
                bySurname = "selected";
            }
            if(criteria.equals("group")){
                result = dbManager.getStudentsByGroup(key);
                byGroup = "selected";
            }
            if(criteria.equals("year")){
                int year = Integer.parseInt(key);
                result = dbManager.getStudentsByYear(year);
                byYear = "selected";
            }
        }else{

            result = dbManager.getAllStudents();
            key = "";

        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<form action = 'search' method = 'get' >");
        out.print("SEARCH BY : ");
        out.print("<select name = 'criteria'>" +
                "<option value = 'name' "+byName+" >NAME</option>" +
                "<option value = 'surname' "+bySurname+" >SURNAME</option>" +
                "<option value = 'group' "+byGroup+" >GROUP</option>" +
                "<option value = 'year' "+byYear+" >ADDMITTED YEAR</option>" +
                "</select>");
        out.print(" KEY: <input type = 'text' name = 'key' value = '"+key+"'>");
        out.print("<input type = 'submit' value = 'SEARCH'>");
        out.print("</form>");
        out.print("<table>");
        out.print("<tr><td>Name </td><td>Surname </td><td>Group </td><td>Addmitted Year </td></tr>");

        for(Students st : result){
            out.print("<tr>");
            out.print("<td>");
            out.print(st.getName());
            out.print("</td>");
            out.print("<td>");
            out.print(st.getSurname());
            out.print("</td>");
            out.print("<td>");
            out.print(st.getGroup());
            out.print("</td>");
            out.print("<td>");
            out.print(st.getAddmittedYear());
            out.print("</td>");
            out.print("</tr>");
        }
        out.print("</table>");
    }
}
