package setterInjection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;  
  

public class CollectionClass {

	public static void main(String[] args) {
		Resource r= new ClassPathResource("collect.xml");
	
		BeanFactory factory=new XmlBeanFactory(r);
		
		Collect c=(Collect)factory.getBean("address");
		c.display();
	}

}
