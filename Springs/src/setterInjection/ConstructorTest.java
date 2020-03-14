package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTest {

	public static void main(String[] args) 
	{
		
ApplicationContext context = new ClassPathXmlApplicationContext("autowire_constructor.xml");

EmployeeBean employee=(EmployeeBean)context.getBean("employee");
System.out.println(employee.getFullName());
System.out.println(employee.getDepartmentbean().getName());
	}

}
