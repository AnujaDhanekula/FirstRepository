package hibernateMany2Many;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil 
{
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		SessionFactory factory = new Configuration()
									.configure("hib.cfg.xml")
									.buildSessionFactory();
		return factory;
		
	}
	}
