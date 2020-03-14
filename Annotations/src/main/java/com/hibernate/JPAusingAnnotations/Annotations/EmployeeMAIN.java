package com.hibernate.JPAusingAnnotations.Annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class EmployeeMAIN {

	public static void main(String[] args) 
	{
		//StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		//SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory=cf.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		Employee emp=new Employee();
		
		emp.setId(1);
		emp.setFirstname("Anu");
		emp.setLastname("Dhanekula");
		
		session.save(emp);
		
		t.commit();
		
		System.out.println("SuccesFully Saved into database in emp1000 table.....");
		
		factory.close();
		session.close();
		
		
	}

}
