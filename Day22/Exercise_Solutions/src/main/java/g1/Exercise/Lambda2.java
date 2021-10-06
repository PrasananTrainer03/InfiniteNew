package g1.Exercise;
interface IDemo{
	String hello();
}

public class Lambda2 {

	public static void main(String[] args) {
		
		IDemo h1=()->{
			return "Welcome to Lambda Expressions...";
		};
		
		IDemo h2=()->{
			return "Bye for today...";
		};
		
		System.out.println(h1.hello());
		System.out.println(h2.hello());
	}
}
