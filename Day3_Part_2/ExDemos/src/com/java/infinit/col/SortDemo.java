package com.java.infinit.col;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("Joel");
		s.add("Neeraj");
		s.add("Sundar");
		s.add("MuraliKrishna");
		s.add("Aishwarya");
		
		System.out.println("Sorted Data  ");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
}
