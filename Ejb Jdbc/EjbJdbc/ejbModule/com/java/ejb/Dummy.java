package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		try {
			List<Employ> arr = new EmployDAO().showEmploy();
			for (Employ employ : arr) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
