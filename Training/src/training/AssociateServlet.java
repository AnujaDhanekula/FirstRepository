package training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AssociateServlet
 */
@WebServlet("/AssociateServlet")
public class AssociateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssociateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List<Orders> list=new ArrayList<Orders>();
		try
		{

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from orders");
		while(rs.next())
		{
		Orders o=new Orders ();
		o.setOrderid(rs.getString(1));
		o.setOrderdesc(rs.getString(2));
		o.setTotalcost(rs.getString(3));
		o.setDisamt(rs.getString(4));
		
		list.add(o);
		System.out.println(list);

		}
		}
		
		/*try
		{
			String orderid=(String)request.getString
		//String orderid=(String)request.getAttribute("orderid");
		String orderdesc=(String)request.getAttribute("orderdesc");
		String totalcost=(String)request.getAttribute("totalcost");
		String disamt=(String)request.getAttribute("disamt");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");

		PreparedStatement pst=con.prepareStatement("select * from orders");
		pst.setString(1,orderid );
		pst.setString(2,orderdesc);
		pst.setString(3,totalcost );
		pst.setString(4,disamt);
		
		
		int count=pst.executeUpdate();
		
		System.out.println(count);
		pst.close();
		con.close();
		
		
		}*/
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
