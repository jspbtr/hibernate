package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Employee;
import util.HibernateUtil;

public class UserInterface
{
	public static void main(String[] args)
	{
		Session session=null;
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);
		SessionFactory sessionFactory2 = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory2);
		/*session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		
		//Employee e1=new Employee();
		//e1.setEmpno(101);
		//e1.setEname("smith");
		
		Employee e1=session.find(Employee.class,1);
		e1.setEname("scott");
		
		
		tx.commit();*/
	}
}
