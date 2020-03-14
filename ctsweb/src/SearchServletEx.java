
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class SearchServletEx
*/
@WebServlet("/SearchServletEx")
public class SearchServletEx extends HttpServlet {
private static final long serialVersionUID = 1L;
     
   /**
    * @see HttpServlet#HttpServlet()
    */
   public SearchServletEx() {
       super();
       
   }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {


try 
{

String name=request.getParameter("name");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");

PreparedStatement pst=con.prepareStatement("select * from employee where name=?");
pst.setString(1,name);
ResultSet rs=pst.executeQuery();
rs.next();

response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<html><body>");
out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
out.println("</html></body>");

out.close();
pst.close();
con.close();

}
catch(Exception e)
{
System.out.println(e);
}
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

doGet(request, response);
}

}
