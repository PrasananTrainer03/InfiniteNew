package com.java.inifinite.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


class C3 implements Runnable {

	@Override
	public void run() {
		Vector<String> names = new Vector<String>();
		names.addElement("Murali");
		names.addElement("Ibrahim");
		names.addElement("Thejaswini");
		names.addElement("Joel");
		names.addElement("Gowtham");
		names.addElement("Arti");
		for (String s : names) {
			System.out.println("Vector  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class C2 implements Runnable {

	@Override
	public void run() {
		Set<String> s = new TreeSet<String>();
		s.add("Gowtham");
		s.add("Anushka Priya");
		s.add("Krishna Shashank");
		s.add("Obuli Sundar");
		s.add("Neeraj");
		s.add("Harshit");
		
		for (String str : s) {
			System.out.println("Treeset " +str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class C1 implements Runnable {

	@Override
	public void run() {
		List<String> names = new ArrayList<String>();
		names.add("Akriti");
		names.add("Anushka");
		names.add("Arti");
		names.add("Hari");
		names.add("Praneetha");
		for (String s : names) {
			System.out.println("ArrayList  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThrExNew {
	public static void main(String[] args) {
		Thread t1 = new Thread(new C1());
		Thread t2 = new Thread(new C2());
		Thread t3 = new Thread(new C3());
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}
}
