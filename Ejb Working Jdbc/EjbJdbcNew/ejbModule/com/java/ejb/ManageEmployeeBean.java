package com.java.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * Session Bean implementation class ManageEmployeeBean
 */
@Stateless
public class ManageEmployeeBean implements EmployeeRemote {

	@PersistenceContext(unitName = "EmpMgmtPU")
	private EntityManager entityManager;

	public ManageEmployeeBean() {

	}

	public boolean addEmployee(Employee employee) {
		entityManager.persist(employee);
		return true;
	}

	@Override
	public List<Employee> showEmploy() {
		Query q = entityManager.createQuery("from Employee");
		List<Employee> employeeList = q.getResultList();
		return employeeList;
	}

}
