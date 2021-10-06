package g1.Exercise;
interface IHello{
	void sayHello();
}

public class Lambda1 {
	public static void main(String[] args) {
		IHello h2=()->{
			System.out.println("Welcome to Lambda Expression...");
		};
		h2.sayHello();
	}
}
