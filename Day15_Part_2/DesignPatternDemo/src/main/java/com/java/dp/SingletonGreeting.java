package com.java.dp;

public class SingletonGreeting {

	public static void main(String[] args) {
		//Greeting obj = new Greeting();
		Greeting g1 = Greeting.getInstance();
		System.out.println(g1.sayHello());
		Greeting g2 = Greeting.getInstance();
		System.out.println(g2.sayHello());
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
	}
}
