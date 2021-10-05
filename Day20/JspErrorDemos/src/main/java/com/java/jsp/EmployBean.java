package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployBean {

	private int empno;
	private String name;
	private String gender;
	private String dept;
	private String desig;
	private int basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	
	public String addEmploy() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "Insert into Employ(Empno,Name,gender,Dept,Desig,Basic) "
				+ " values(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, empno);
		pst.setString(2, name);
		pst.setString(3, gender);
		pst.setString(4, dept);
		pst.setString(5, desig);
		pst.setInt(6, basic);
		pst.executeUpdate();
		return "Record Inserted...";
	}
}
