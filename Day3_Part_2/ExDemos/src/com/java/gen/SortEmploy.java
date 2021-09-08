package com.java.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortEmploy {

	public static void main(String[] args) {
		// Comparator<Employ> c = new NameComparator();
		Comparator<Employ> c = new BasicComparator();
		SortedSet<Employ> s = new TreeSet<Employ>(c);
		s.add(new Employ(6, "Sundar", 88234));
		s.add(new Employ(7, "Neeraj", 88832));
		s.add(new Employ(8,"Manish",88112));
		s.add(new Employ(1, "Akriti", 98234));
		s.add(new Employ(3, "Arti", 99233));
		s.add(new Employ(4, "Praneetha", 89933));
		s.add(new Employ(5, "Gowtham", 90023));
		for (Employ employ : s) {
			System.out.println(employ);
		}
	}
}
