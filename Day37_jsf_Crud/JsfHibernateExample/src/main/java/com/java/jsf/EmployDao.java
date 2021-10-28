package com.java.jsf;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@ManagedBean(name="employDao")
public class EmployDao {

	SessionFactory sf;
	public Employ[] showEmploy() {
		sf = SessionHelper.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ");
		List<Employ> employList= q.list();
		return employList.toArray(new Employ[employList.size()]);
	}
}
