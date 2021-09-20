package com.java.infinite.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySortNew {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Manish", 88232));
		employList.add(new Employ(12,"Anushka",88223));
		employList.add(new Employ(13,"Neeraj",88811));
		employList.add(new Employ(11,"Joel",88111));
		employList.add(new Employ(3, "Nikita", 77245));
		employList.add(new Employ(4, "Praneetha", 88822));
		employList.add(new Employ(5, "Prachi", 90234));
		
		Collections.sort(employList, (e1,e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		
		System.out.println("Sorted Data...");
		employList.forEach(x -> System.out.println(x));
		
		Collections.sort(employList, (e1,e2) -> {
			return e1.getBasic() - e2.getBasic();
		});
		System.out.println("Sort By Basic-Wise");
		System.out.println("-------------------");
		
		employList.forEach(x -> System.out.println(x));
	}
}
