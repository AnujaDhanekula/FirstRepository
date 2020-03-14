package springs;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestString {

	public static void main(String[] args) 
	{
		//ApplicationContext context =new ClassPathXmlApplicationContext("Spring-bean.xml");
		
		Resource r=new ClassPathResource("Spring-bean.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
	    
		Employee  Emp1=(Employee)factory.getBean("emp1");  
		Emp1.setCompany("cts");
		Emp1.displayemp();  
	    
	    Employee  Emp2=(Employee)factory.getBean("emp1");  
	    Emp2.displayemp(); 
	    
		Student s=(Student)factory.getBean("student");  
	    s.displayName(); 
	    
		 //AddressEmployee s=(AddressEmployee)factory.getBean("e");  
	       // s.show();  
	}

}
