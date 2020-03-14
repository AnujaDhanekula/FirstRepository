package springs_jdbc;  
  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) 
{  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringJDBC.xml");  
      
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao"); 
    
   /* int status1=dao.saveEmployee(new Employee("siri","2","btech","cse","nothing","siri@gmail.com"));  
    System.out.println("Inserted SuccessFully...."+status1);  
       */
   
   /* int status2=dao.saveEmployee(new Employee("Anuja","1","btech","cse","cts","Anuja@gmail.com"));  
    System.out.println("Inserted SuccessFully...."+status2);  
     */
    int st=dao.updateEmploye(new Employee("Anuja.D","1","b.tech","cse-A","cts-pat","Anuja@gmail.com")); 
    System.out.println("Updated SuccessFully........"+st); 
     
          
    Employee emp=new Employee(); 
    
    emp.setId("7"); 
    int sts=dao.deleteEmploye(emp); 
    System.out.println("Deleted SuccessFully...."+sts);  
      
}  
  
}  