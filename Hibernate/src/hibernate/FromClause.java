package hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FromClause {

	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration()
				.configure("/hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
	
		String hql1="FROM Employee";
		Query query1=session.createQuery(hql1);
		List<Employee> items1=query1.list();
		
		
		for(Employee e:items1)
		{
			System.out.println("Employe details in the database:"+e.getName()+" "+e.getId()+" "+e.getDept()+" "+e.getDesg()+" "+e.getCompany()+" "+e.getEmail());
		}
		
		
		String hql2="FROM Employee as E where E.id=4";
		Query query2=session.createQuery(hql2);
		List<Employee> items2=query2.list();
		
		
		for(Employee e:items2)
		{
			System.out.println("Employe details whose id=4:"+e.getName()+" "+e.getId()+" "+e.getDept()+" "+e.getDesg()+" "+e.getCompany()+" "+e.getEmail());
		}
		
		
		String hql3="SELECT E.name from Employee E where E.id<=4";
		Query query3=session.createQuery(hql3);
		List<String> items3=query3.list();
		for(String s:items3)
		{
			System.out.println("Employee name whose id <=4:"+s);
		}
		
		String hql4="FROM Employee E order by E.id";
		Query query4=session.createQuery(hql4);
		List<Employee> items4=query4.list();
		
		
		for(Employee e:items4)
		{
			System.out.println("Order of the Items:"+e.getName()+" "+e.getId()+" "+e.getDept()+" "+e.getDesg()+" "+e.getCompany()+" "+e.getEmail());
		}
		
	}

}
