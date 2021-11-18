package com.java.ejb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EmployJdbcBean
 */
@Stateless
@Remote(EmployJdbcBeanRemote.class)
public class EmployJdbcBean implements EmployJdbcBeanRemote {

    /**
     * Default constructor. 
     */
    public EmployJdbcBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Employ[] showEmploy() {
		List<Employ> employList = new ArrayList<Employ>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice", "root","root");
			String cmd = "select * from Employ";
			PreparedStatement pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			Employ employ = null;
			while(rs.next()) {
				employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(Gender.valueOf(rs.getString("gender")));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
				employList.add(employ);
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employList.toArray(new Employ[employList.size()]);
	}

}
