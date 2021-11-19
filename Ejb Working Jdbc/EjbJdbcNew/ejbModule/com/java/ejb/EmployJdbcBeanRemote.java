package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface EmployJdbcBeanRemote {

	Employ[] showEmploy();
	void addEmploy(Employ employ);
}
