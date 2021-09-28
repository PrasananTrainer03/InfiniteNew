package infinite.FactoryDemo2;

import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		String type;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ur Education  ");
		type=sc.next();
		Student student = new FactoryDemo().show(type);
		student.name();
		student.course();
		student.age();
	}
}
