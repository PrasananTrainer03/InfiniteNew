package com.java.infinite.dao;

import java.util.List;

import com.java.infinite.model.Employ;

public interface EmployDAO {

	void updateEmploy(Employ employ);
	List<Employ> list();
	Employ get(int empno);
	void addEmploy(Employ employ);
	void deleteEmploy(int empno);
}
