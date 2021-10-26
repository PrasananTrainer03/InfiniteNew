package com.java.hib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {

	public static SessionFactory getConnection() {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		return sf;
	}
}
