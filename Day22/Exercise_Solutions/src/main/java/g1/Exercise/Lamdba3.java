package g1.Exercise;
interface ITest {
	int mult(int a,int b);
}

public class Lamdba3 {

	public static void main(String[] args) {
		ITest t1=(a,b)->(a*b);
		System.out.println("Mult is " +t1.mult(12,5));
		
		ITest t2=(int a,int b)->{
			return (a+b);
		};
		
		System.out.println(t2.mult(12,5));
	}
}
