package com.java.infinite;

public class CaseEx2 {

	public void show(String day) {
		switch(day) {
		case "Mon" : 
			System.out.println("Its Monday...");
			break;
		case "Tue" : 
			System.out.println("Its Tuesday...");
			break;
		case "Wed" : 
			System.out.println("Its Wednesday...");
			break;
		case "Thu" : 
			System.out.println("Its Thursday...");
			break;
		case "Fri" :
			System.out.println("Its Friday...");
			break;
		case "Sat" : 
			System.out.println("Its Saturday...");
			break;
		case "Sun" :
			System.out.println("Its Sunday...");
			break;
		default : 
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		String day="Mon";
		CaseEx2 obj = new CaseEx2();
		obj.show(day);
	}
}
