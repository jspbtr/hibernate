package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() 
	{
		if(sessionFactory==null) {
			Configuration config=new Configuration();
			config.configure("Hibernate.cfg.xml");
			
			 sessionFactory=config.buildSessionFactory();
		    
		}
		return sessionFactory;
		
	}

}
