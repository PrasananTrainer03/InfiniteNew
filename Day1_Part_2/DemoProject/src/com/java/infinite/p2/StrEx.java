package com.java.infinite.p2;

public class StrEx {

	public void show() {
		String s1="Hello";
		String s2=s1.concat(" World");
		System.out.println(s2);
		System.out.println(s1);
	}
	public static void main(String[] args) {
		StrEx obj = new StrEx();
		obj.show();
	}
}
