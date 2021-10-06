package g1.Exercise;
import java.util.Scanner;


interface ICalc {
	int sum(int x,int y); 
}

public class LambdaCalc {
	public static void main(String[] args) {
		
		ICalc ad1=(a,b)->(a+b);

		int a,b;
		System.out.println("Enter 2 Numbers  ");
		Scanner scr=new Scanner(System.in); 
		a=scr.nextInt();
		b=scr.nextInt();
		
		System.out.println("Sum " +ad1.sum(a,b));
	}
}
