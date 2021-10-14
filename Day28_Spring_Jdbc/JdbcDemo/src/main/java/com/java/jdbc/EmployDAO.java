package com.java.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String deleteEmploy(int empno) {
		Employ res = searchEmploy(empno);
		if (res!=null) {
			String cmd = "delete from Employ where empno=?";
			jdbcTemplate.update(cmd, new Object[] {empno});
			return "Record Deleted...";
		}
		return "Record Not Found...";
	}
	
	public String updateEmploy(Employ employ) {
		Employ res = searchEmploy(employ.getEmpno());
		if (res!=null) {
		String cmd = "Update Employ set Name=?, Gender=?, Dept=?, Desig=?,basic=? where empno=?";
		jdbcTemplate.update(cmd, new Object[] {
				employ.getName(),employ.getGender().toString(),
				employ.getDept(),employ.getDesig(),employ.getBasic(), employ.getEmpno()
		});
		return "Record Updated Successfully..."; 
		}
		return "Employ No Not Found...";
	}
	public String addEmploy(Employ employ) {
		String cmd = "insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {employ.getEmpno(),
						employ.getName(),employ.getGender().toString(),
						employ.getDept(),employ.getDesig(),employ.getBasic()
		});
		return "Employ Record Inserted...";
	}

	public Employ searchEmploy(int empno) {
		String cmd = "select * from Employ where empno=?";
		Employ employ = jdbcTemplate.queryForObject(cmd, new Object[]{empno},
				new BeanPropertyRowMapper<Employ>(Employ.class));
		if (employ!=null) {
			return employ;
		}
		return null;
	}
	public Employ[] showEmploy() {
		String cmd = "select * from Employ";
		List<Employ> employList = null;
		employList = jdbcTemplate.query(cmd, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(Gender.valueOf(rs.getString("gender")));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
				return employ;
			}
			
		});
		return employList.toArray(new Employ[employList.size()]);
	}
	
}
