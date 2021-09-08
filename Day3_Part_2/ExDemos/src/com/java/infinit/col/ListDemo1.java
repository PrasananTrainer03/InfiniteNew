package com.java.infinit.col;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Anushka");
		names.add("Arti");
		names.add("Gowtham");
		names.add("Tanveer");
		System.out.println("Names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(3,"Rajesh");
		System.out.println("Names after adding new Name   ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(1, "Arti Yadav");
		System.out.println("Names after Modification ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Gowtham");
		System.out.println("List after removing...");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
