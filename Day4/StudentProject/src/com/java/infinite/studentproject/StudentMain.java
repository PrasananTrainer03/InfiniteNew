package com.java.infinite.studentproject;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	static Scanner sc=new Scanner(System.in);
	
	public static void deleteStudent() {
		System.out.println("Enter Student No   ");
		int sno =sc.nextInt();
		System.out.println(new StudentBAL().deleteStudentBal(sno));
	}
	
	public static void searchStudent() {
		System.out.println("Enter Student No   ");
		int sno =sc.nextInt();
		Student student = new StudentBAL().searchStudentBal(sno);
		if (student!=null) {
			System.out.println(student);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
	public static void showStudent() {
		List<Student> studentList= new StudentBAL().showStudentBal();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	public static void updateStudent() throws StudentException {
		Student student = new Student();
		System.out.println("Enter Student No   ");
		student.setSno(sc.nextInt());
		System.out.println("Enter Student Name  ");
		student.setName(sc.next());
		System.out.println("Enter Student City   ");
		student.setCity(sc.next());
		System.out.println("Enter Cgp   ");
		student.setCgp(sc.nextDouble());
		StudentBAL bal = new StudentBAL();
		System.out.println(bal.updateStudentBal(student));
	}

	public static void addStudent() throws StudentException {
		Student student = new Student();
		System.out.println("Enter Student No   ");
		student.setSno(sc.nextInt());
		System.out.println("Enter Student Name  ");
		student.setName(sc.next());
		System.out.println("Enter Student City   ");
		student.setCity(sc.next());
		System.out.println("Enter Cgp   ");
		student.setCgp(sc.nextDouble());
		StudentBAL bal = new StudentBAL();
		System.out.println(bal.addStudentBal(student));
	}
	public static void main(String[] args) {
		int ch;
		do {
			System.out.println("O P T I O N S");
			System.out.println("--------------");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student");
			System.out.println("3. Search Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Update Student");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice   ");
			ch = sc.nextInt();
			switch(ch) {
			case 1 :
				try {
					addStudent();
				} catch (StudentException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2 : 
				showStudent();
				break;
			case 3 : 
				searchStudent();
				break;
			case 4 :
				deleteStudent();
				break;
			case 5 :
				try {
					updateStudent();
				} catch (StudentException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6 : 
				return;
			}
		} while(ch!=6);
	}
}
