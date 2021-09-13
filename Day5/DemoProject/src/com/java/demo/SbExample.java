package com.java.demo;

public class SbExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome to Java Programming...Prasanna");
		System.out.println(sb);
		sb.insert(4, "Arti");
		System.out.println(sb);
		sb.delete(4, 10);
		System.out.println(sb);
		sb.append("\nToday Project will be followed");
		System.out.println(sb);
	}
}
