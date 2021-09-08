package com.java.infinit.col;

import java.util.LinkedList;

public class LinkDemo {

	public static void main(String[] args) {
		LinkedList listDemo = new LinkedList();
		listDemo.add("Akash");
		listDemo.add("Prithvi");
		listDemo.add("Santosh");
		listDemo.add("Sreenath");
		listDemo.add("Prachi");
		listDemo.addFirst("Mukesh");
		listDemo.addLast("Tejaswini");
		
		System.out.println("Linked List Values  ");
		for (Object ob : listDemo) {
			System.out.println(ob);
		}
	}
}
