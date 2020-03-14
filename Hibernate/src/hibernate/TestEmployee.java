package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

	public static void main(String[] args) {
		 /*StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();
		
		Metadata meta=(Metadata) new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory= meta.getSessionFactoryBuilder().build();
		*/
		SessionFactory factory= new Configuration()
								.configure("/hibernate.cfg.xml").buildSessionFactory();
		Session session1=factory.openSession();
		Session session2=factory.openSession();
		Session session3=factory.openSession();
		Session session4=factory.openSession();
		Transaction t1=session1.beginTransaction();
		Transaction t2=session2.beginTransaction();
		Transaction t3=session3.beginTransaction();
		Transaction t4=session4.beginTransaction();
		
		Employee emp1=new Employee();
		
		emp1.setName("mydhili");
		emp1.setId("4");
		emp1.setDept("btech");
		emp1.setDesg("ece");
		emp1.setCompany("cts");
		emp1.setEmail("dm@gmail.com");
		
		session1.save(emp1);
		t1.commit();
		
		Employee emp2=new Employee();
		
		emp2.setName("siva");
		emp2.setId("5");
		emp2.setDept("btech");
		emp2.setDesg("cse");
		emp2.setCompany("cts");
		emp2.setEmail("siva@gmail.com");
		
		session2.save(emp2);
		t2.commit();
		
		Employee emp4=new Employee();
		
		emp4.setName("Anuja");
		emp4.setId("1");
		emp4.setDept("btech");
		emp4.setDesg("cse");
		emp4.setCompany("cts");
		emp4.setEmail("Anuja@gmail.com");
		
		session4.save(emp4);
		t4.commit();
		
		Employee emp3=new Employee();
		
		emp3.setName("nissi");
		emp3.setId("6");
		emp3.setDept("btech");
		emp3.setDesg("cse");
		emp3.setCompany("cts");
		emp3.setEmail("nissi@gmail.com");
		
		session3.save(emp3);
		//t3.commit();
		t3.rollback();
		
		
		System.out.println("SuccesFully Saved into database in Employee table.....");
		
		factory.close();
		session1.close();
		session2.close();
		session3.close();
		session4.close();

	}

}
