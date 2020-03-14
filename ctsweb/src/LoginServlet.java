import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		try
		{
		int flag=0;
		
		String id=request.getParameter("login");
		
		String pd=request.getParameter("pwd");
		
		//Class.forName("com.mysql.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc" ,"root", "root");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from users");
				
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		
		while(rs.next())
		{
			String t1=rs.getString(1);
			String t2 =rs.getString(2);
			
			if(id.equals(t1)&& pd.equals(t2))
					{
					flag=1;
					break;
					}
		}
		
		if(flag==1)
			//out.println("<b> Authorized User....</b>");
			response.sendRedirect("Success.html");
		else
			//out.println("<b> Not Authorized User...</b>");
			response.sendRedirect("Register.html");
		out.println("</body></html>");
		
		out.close();
		rs.close();
		stmt.close();
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
