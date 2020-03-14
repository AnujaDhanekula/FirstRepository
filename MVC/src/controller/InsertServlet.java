package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.EmployeeDAO;
import data.Employee;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
    public InsertServlet() 
    {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		EmployeeDAO empdao= new EmployeeDAO();
		empdao.getConnection();
		
		Employee emp=new Employee();
		
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		String dept=request.getParameter("dept");
		String desg=request.getParameter("desg");
		String company=request.getParameter("company");
		String email=request.getParameter("email");
		
		
		emp.setCompany(company);
		emp.setDept(dept);
		emp.setDesg(desg);
		emp.setEmail(email);
		emp.setId(id);
		emp.setName(name);
		
		int flag=empdao.insertEmployee(emp);
		
		if(flag==1)
		{
			HttpSession session=request.getSession();  
			session.setAttribute("id",id);
			session.setAttribute("name",name);
			session.setAttribute("dept",dept);
			session.setAttribute("desg",desg);
			session.setAttribute("company",company);
			session.setAttribute("email",email);
			
			RequestDispatcher rd=request.getRequestDispatcher("insertsuccess.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("insertfailure.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
