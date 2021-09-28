package com.java.dp;

public class SingletonExample {

	private static SingletonExample example;
	
	private SingletonExample() {}
	
	public static SingletonExample getInstance() {
		if (example==null) {
			example = new SingletonExample();
		}
		return example;
	}
	
	public String sayHello() {
		return "Welcome to SingleTon Design Pattern...";
	}
	public static void main(String[] args) {
		SingletonExample example = SingletonExample.getInstance();
		System.out.println(example.sayHello());
		
		SingletonExample ex1 = SingletonExample.getInstance();
		System.out.println(ex1.sayHello());
		
		System.out.println(example.hashCode());
		System.out.println(ex1.hashCode());
	}
}
