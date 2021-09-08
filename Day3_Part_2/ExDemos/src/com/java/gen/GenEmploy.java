package com.java.gen;

import java.util.ArrayList;
import java.util.List;

import com.java.infinit.col.Employ;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Nikita", 88245));
		employList.add(new Employ(2, "Akriti", 98234));
		employList.add(new Employ(3, "Arti", 99233));
		employList.add(new Employ(4, "Praneetha", 89933));
		employList.add(new Employ(5, "Gowtham", 90023));
		
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
