package com.java.infinite.lambda;

interface IHello {
	void show();
}

public class Lambda1 {
	public static void main(String[] args) {
		IHello h2=() -> {
			System.out.println("Hi I am Ibrahim...");
		};
		
		IHello h1=() -> {
			System.out.println("HI I am Akash...");
		};
		
		h1.show();
		h2.show();
	}
}
