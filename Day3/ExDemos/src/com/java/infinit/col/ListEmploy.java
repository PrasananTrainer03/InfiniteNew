package com.java.infinit.col;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Akriti", 98234));
		employList.add(new Employ(3, "Arti", 99233));
		employList.add(new Employ(4, "Praneetha", 89933));
		employList.add(new Employ(5, "Gowtham", 90023));
		for (Object object : employList) {
			Employ e = (Employ)object;
			System.out.println(e);
		}
	}
}
