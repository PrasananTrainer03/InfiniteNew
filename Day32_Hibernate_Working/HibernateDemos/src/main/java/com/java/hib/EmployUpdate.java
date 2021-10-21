package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployUpdate {

	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		int empno;
		System.out.println("Enter Employ No  ");
		Scanner sc = new Scanner(System.in);
		empno=sc.nextInt();
		Query q = s.createQuery("from Employ where empno="+empno);
		List<Employ> employList = q.list();
		
		if (employList.size() == 1) {
			Employ employ = employList.get(0);
		//	out.println("Employ Name  " +employ.getName());
			Transaction t = s.beginTransaction();
			employ.setDept("Oracle");
			employ.setDesig("TSE");
			employ.setBasic(56333);
			s.save(employ);
			t.commit();
			System.out.println("Updated...");
		}
	}
}
