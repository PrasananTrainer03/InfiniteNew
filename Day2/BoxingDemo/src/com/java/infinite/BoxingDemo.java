package com.java.infinite;

public class BoxingDemo {

	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Infinite";
		
		/* Boxing */ 
		
		Object ob1=a;
		Object ob2=b;
		Object ob3=name;
		
		/* Unboxing */ 
		int x = (Integer)ob1;
		double y = (Double)ob2;
		String str = (String)ob3;
		
		System.out.println("X value  " +x);
		System.out.println("Y Value  " +y);
		System.out.println("Name is  " +str);
	}
}
