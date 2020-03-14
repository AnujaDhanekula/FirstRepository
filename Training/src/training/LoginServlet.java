package training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		

		try
		{
		int flag=0;
		
		String id=request.getParameter("UserId");
		
		String pd=request.getParameter("Password");
		
		Class.forName("com.mysql.jdbc.Driver");
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training" ,"root", "root");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from Login");
				
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		
		while(rs.next())
		{
			String t1=rs.getString(1);
			String t2 =rs.getString(3);
			
			if((id.equals("admin"))&&(pd.equals("admin")))
			{
			flag=1;
			break;
			}

			else if(id.equals(t1)&& pd.equals(t2))
					{
					flag=2;
					break;
					}
		}
		
		if(flag==1)
		{
			ServletContext ctx=this.getServletContext();
		//	response.sendRedirect("auth.jsp");
			RequestDispatcher rd=ctx.getRequestDispatcher("/Authorised.jsp");
		
			rd.include(request,response);
		}	
		else if(flag==2)
		{
			ServletContext ctx=this.getServletContext();
			
			RequestDispatcher rd=ctx.getRequestDispatcher("/Associate.html");
		
			rd.forward(request,response);
		}
		else
		{
			
			ServletContext ctx=this.getServletContext();
			
			RequestDispatcher rd=ctx.getRequestDispatcher("/UnAuthorised.html");
		
			rd.forward(request,response);
		}	
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
