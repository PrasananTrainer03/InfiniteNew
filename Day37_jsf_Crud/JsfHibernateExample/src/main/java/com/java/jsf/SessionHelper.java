package com.java.jsf;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {

	public static SessionFactory getConnection() {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		return sf;
	}
}
