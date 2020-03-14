package controller;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import dao.EmployeeDAO;
import data.Employee;


public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		EmployeeDAO empdao= new EmployeeDAO();
		String id=request.getParameter("id");
		Employee emp=empdao.searchEmp(id);
		System.out.println(emp);
		request.setAttribute("emp", emp);
		RequestDispatcher rd=request.getRequestDispatcher("searchEmployee.jsp");
		rd.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
