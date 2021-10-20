package com.java.infinite.dao;

import java.util.List;

import com.java.infinite.model.Employ;

public interface EmployDAO {

	List<Employ> list();
	
	void addEmploy(Employ employ);
	
	void updateEmploy(Employ employ);
	Employ get(int empno);
	void deleteEmploy(int empno);
}
