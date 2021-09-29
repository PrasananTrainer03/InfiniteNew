package infinite.ServletJdbcRealTime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
	public static EmployDAO dao;
	
	private EmployDAO() {}
	
	public static EmployDAO getInstance() {
		if (dao==null) {
			dao = new EmployDAO();
		}
		return dao;
	}
	public String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		Employ old = searchEmploy(employ.getEmpno());
		if (old != null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "update Employ set Name=?, Gender=?, Dept=?, Desig=?,"
					+ " Basic=? where empno=?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1, employ.getName());
			pst.setString(2, employ.getGender().toString());
			pst.setString(3, employ.getDept());
			pst.setString(4, employ.getDesig());
			pst.setInt(5, employ.getBasic());
			pst.setInt(6, employ.getEmpno());
			pst.executeUpdate();
			return "Record Updated...";
		}
		return "Record Not Found...";
	}
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException {
		Employ employ = searchEmploy(empno);
		if (employ!=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "delete from Employ where empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Record Deleted Successfully...";
		}
		return "Record Not Found...";
	}
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender().toString());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setInt(6, employ.getBasic());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
		} 
		return employ;
	}
	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
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
		return employList.toArray(new Employ[employList.size()]);
	}
}
