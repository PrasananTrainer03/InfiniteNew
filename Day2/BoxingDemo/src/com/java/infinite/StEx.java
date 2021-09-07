package com.java.infinite;

public class StEx {

	public void show() {
		System.out.println("From Show Method...");
	}
	
	public static void display() {
		System.out.println("From Display Method...");
	}
	
	public static void main(String[] args) {
		StEx.display();
		new StEx().show();
	}
}
