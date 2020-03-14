package springSBA;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Testprog5
{

	public static void main(String[] args) 
	{
		
		 
			ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");  
	      
		    EmployeeDAOImpl dao=(EmployeeDAOImpl)ctx.getBean("edaoimpl"); 
		    
		    List<Employee> employee =dao.getEmployee();
			 
			Iterator<Employee> itr=employee.iterator();
			for(Employee e:employee)
			{
				System.out.println(e.getName()+" " +e.getId()+" "+e.getDept()+" "+e.getDesg()+" "+e.getCompany()+" "+e.getEmail());
			}
		
			dao.getEmployee();

		    
	}

}
