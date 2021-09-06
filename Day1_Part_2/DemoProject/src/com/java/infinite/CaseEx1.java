package com.java.infinite;

public class CaseEx1 {

	public void show(int n) {
		switch(n) {
		case 1 : 
			System.out.println("HI I am Gowtham Sekhar...");
			break;
		case 2 : 
			System.out.println("Hi I am Harshit Chaudhary...");
			break;
		case 3 : 
			System.out.println("Hi I am Krishna Shashank...");
			break;
		case 4 : 
			System.out.println("Nikita Mohanty...");
			break;
		case 5 : 
			System.out.println("Hi I am Obuli Sundar...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		int n=1;
		CaseEx1 obj = new CaseEx1();
		obj.show(n);
	}
}
