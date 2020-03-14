package springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThroughList 
{

public static void main(String[] args) 
{

ApplicationContext context=new ClassPathXmlApplicationContext("list.xml");
Listclass list=(Listclass)context.getBean("List");
list.displayInfo();
}

}