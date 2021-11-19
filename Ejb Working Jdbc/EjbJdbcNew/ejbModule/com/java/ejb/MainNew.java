package com.java.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MainNew {

	public static void main(String[] args) {
		EmployJdbcBeanRemote service;
		try {
			service = (EmployJdbcBeanRemote)new InitialContext().lookup("EmployJdbcBean/remote");
			Employ employ = new Employ();
			employ.setEmpno(553);
			employ.setName("Jaya");
			employ.setGender(Gender.FEMALE);
			employ.setDept("Java");
			employ.setDesig("Programmer");
			employ.setBasic(99212);
			service.addEmploy(employ);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
