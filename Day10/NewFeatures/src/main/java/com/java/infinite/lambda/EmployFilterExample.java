package com.java.infinite.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployFilterExample {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Manish", 88232));
		employList.add(new Employ(12,"Anushka",79444));
		employList.add(new Employ(13,"Neeraj",88811));
		employList.add(new Employ(11,"Joel",79088));
		employList.add(new Employ(3, "Nikita", 77245));
		employList.add(new Employ(4, "Praneetha", 88822));
		employList.add(new Employ(5, "Prachi", 90234));
		
		Stream<Employ> filtered_data = employList.stream().filter(x -> x.getBasic() > 80000);
		
		// filtered_data.forEach(x -> System.out.println(x));
		filtered_data.forEach(System.out::println);
		
	}
}
