package com.java.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MainProg {

	public static void main(String[] args) {
		EmployJdbcBeanRemote service;
		try {
			service = (EmployJdbcBeanRemote)new InitialContext().lookup("EmployJdbcBean/remote");
			System.out.println(service.showEmploy().length);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
