package com.java.infinite.studentproject;

import java.io.IOException;
import java.util.List;

public class StudentBAL {
	
	private StudentBAL() {}
	
	private static StudentBAL bal;
	
	public static StudentBAL getInstance() {
		if (bal==null) {
			bal = new StudentBAL();
		}
		return bal;
	}

	static StringBuilder sb = new StringBuilder();
	
	private static StudentDAO dao;
	public String writeStudentBal() throws IOException {
		dao = StudentDAO.getInstance();
		return dao.writeStudentDao();
	}
	public String readStudentBal() throws ClassNotFoundException, IOException {
		dao = StudentDAO.getInstance();
		return dao.readStudentDao();
	}
	public boolean validateStudent(Student student) {
		boolean isAdded=true;
		if (student.getSno() <= 0) {
			isAdded=false;
			sb.append("Student No Cannot be Negative\r\n");
		}
		if (student.getName().length() <= 5) {
			isAdded=false;
			sb.append("Student Name Contains min. 5 characters\r\n");
		}
		if (student.getCity().length() <= 5) {
			isAdded=false;
			sb.append("Student City Contains min. 5 characters\r\n");
		}
		if (student.getCgp() <= 0) {
			isAdded=false;
			sb.append("CGP Cannot Be Negative...");
		}
		return isAdded;
	}
	
	public Student searchStudentBal(int sno) {
		dao = StudentDAO.getInstance();
		return dao.searchStudentDao(sno);
	}
	
	public String updateStudentBal(Student student) throws StudentException {
		dao = StudentDAO.getInstance();
		if (validateStudent(student) == true) {
			return dao.updateStudentDao(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}
	public String deleteStudentBal(int sno) {
		dao = StudentDAO.getInstance();
		return dao.deleteStudentDao(sno);
	}
	public List<Student> showStudentBal() {
		dao = StudentDAO.getInstance();
		return dao.showStudentDao();
	}
	public String addStudentBal(Student student) throws StudentException {
		dao = StudentDAO.getInstance();
		if (validateStudent(student) == true) {
			return dao.addStudentDao(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}
}
