package g1.Exercise;
interface ICtoF{
	double calc(double c);
}

public class Lambda5 {

	public static void main(String[] args) {
		ICtoF cf=(c)->{
			double f=((9*c)/5)+32;
			return f;
		};
		
		ICtoF kl=(c)->{
			double k=c+273;
			return k;
		};
		
		System.out.println(cf.calc(37));
		System.out.println(kl.calc(37));
	}
}
