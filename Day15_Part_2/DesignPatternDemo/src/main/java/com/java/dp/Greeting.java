package com.java.dp;

public class Greeting {

	private static Greeting greeting;
	
	private Greeting() {} 
	
	static {
		greeting = new Greeting();
	}
	
	public static Greeting getInstance() {
		return greeting;
	}
	
	public String sayHello() {
		return "Greeting Example SingleTon...";
	}
	
	public String topic() {
		return "Topic is SingleTon Design Pattern...";
	}
}
