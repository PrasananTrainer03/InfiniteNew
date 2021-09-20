package com.java.infinite.lambda;

interface IDemo {
	String hello();
}

public class Lambda2 {

	public static void main(String[] args) {
		IDemo h1=() -> {
			return "Welcome to Lambda Expression...";
		};
		
		IDemo h2=() -> {
			return "Welcome to Jdk1.8 Features...";
		};
		System.out.println(h1.hello());
		System.out.println(h2.hello());
	}
	
	
}
