package com.java.infinite;

public class ConEx {

	static {
		System.out.println("Static Constructor...");
	}
	
	ConEx() {
		System.out.println("Default Constructor...");
	}
	
	public static void main(String[] args) {
		ConEx obj = new ConEx();
	}
}
