package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MainProg {

	public static void main(String[] args) throws NamingException {
		   EmployBeanRemote service = null;

		    // InitialContext().lookup("java:comp/env/ejb/HelloService");
		    service = (EmployBeanRemote) new InitialContext().lookup("EmployBean/remote");
		    List<Employ> arrEmploy;
				arrEmploy = service.showBeanEmploy();
				 System.out.println(arrEmploy.size());
		   
		   // System.out.println(arrEmploy.length);
//		    for (Employ employ : arrEmploy) {
//				System.out.println(employ);
//			}

	}
}
