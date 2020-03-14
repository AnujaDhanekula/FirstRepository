package springSBA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProg3 {

	 public static void main(String[] args) {
	     AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclebean.xml");

	     HelloWorld a = (HelloWorld) context.getBean("helloWorld");
	     a.getMessage();
	     
	     ((AbstractApplicationContext) context).registerShutdownHook();
	  }
	}
	


