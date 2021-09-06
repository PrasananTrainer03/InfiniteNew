package com.java.infinite.p2;

public class StrDemo {

	public void show() {
		String str = "Welcome to Java Programming...Prasanna Trainer";
		System.out.println("Length of String is  " +str.length());
		System.out.println("First Occurrence of char 'o' is " +str.indexOf("o"));
		System.out.println("Chat at 5th position  " +str.charAt(5));
		System.out.println("Lower Case String is  " +str.toLowerCase());
		System.out.println("Upper Case String  " +str.toUpperCase());
		System.out.println("Part of String  " +str.substring(10));
		System.out.println("Part of String  " +str.substring(10, 30));
		System.out.println("Replaced String is  " +str.replace("Java", "MySql"));
		String s1="Akriti",s2="Anushka", s3="Akriti";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
	}
	
	public static void main(String[] args) {
		StrDemo obj = new StrDemo();
		obj.show();
	}
}
