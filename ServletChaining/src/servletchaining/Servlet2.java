package servletchaining;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try
		{
		
		String name=request.getParameter("name");
		String dept=request.getParameter("dept");
		String desg=request.getParameter("desg");
		String mobile=(String)request.getAttribute("mobile");
		String email=(String)request.getAttribute("email");
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");

		PreparedStatement pst=con.prepareStatement("insert into employe values( ?,?,?,?,?)");
		pst.setString(1,name );
		pst.setString(2,dept);
		pst.setString(3,desg );
		pst.setString(4,mobile );
		pst.setString(5,email );
		
		int count=pst.executeUpdate();
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		       if(count!=0)
		        out.println("<b>user Registered");
		       else
		        out.println("<b>Not Registered");
		 out.println("</body></html>");
		
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
