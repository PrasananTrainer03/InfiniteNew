package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class ShowAll {

	public static void main(String[] args) {
		//Configuration cf = new AnnotationConfiguration().configure().buildSessionFactory();
		StandardServiceRegistry ssr=new 
			StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Query query=session.createQuery("from Employee");  
	    List<Employee> list=query.list();
	    for(Employee emp : list) {
	    	
	     System.out.println(emp.getEmployeeId()+" "+emp.getName()+" "+emp.getEmail());  
	     Address address=emp.getAddress();  
	     System.out.println(address.getAddressLine1()+" "+address.getCity()+" "+  
	        address.getState()+" "+address.getCountry()+" "+address.getPincode());  
	    }  
	  
	    session.close();  
	    System.out.println("success"); 
	}
}
