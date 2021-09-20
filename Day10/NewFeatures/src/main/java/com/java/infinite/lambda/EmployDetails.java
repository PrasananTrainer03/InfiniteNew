package com.java.infinite.lambda;

import java.util.ArrayList;
import java.util.List;

public class EmployDetails {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Manish", 88232));
		employList.add(new Employ(3, "Nikita", 77245));
		employList.add(new Employ(4, "Praneetha", 88822));
		employList.add(new Employ(5, "Prachi", 90234));
		
		System.out.println("Employ Records are ");
		System.out.println("-------------------");
		employList.forEach( x -> System.out.println(x));
	}
}
