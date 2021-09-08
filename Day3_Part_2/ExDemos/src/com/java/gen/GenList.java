package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Aishwarya");
		names.add("Aditya");
		names.add("Sundar");
		names.add("Praneetha");
		names.add("Gowtham");
		names.add("Prithvi");
		System.out.println("Names  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
