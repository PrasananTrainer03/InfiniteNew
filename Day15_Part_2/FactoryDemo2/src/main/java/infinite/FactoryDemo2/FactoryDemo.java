package infinite.FactoryDemo2;

public class FactoryDemo {

//	public Tenth show1() {
//		return new Tenth();
//	}
//	
//	public Inter show2() {
//		return new Inter();
//	}
//	
//	public Degree show3() {
//		return new Degree();
//	}
	
	public Student show(String type) {
		if (type.toUpperCase().equals("TENTH")) {
			return new Tenth();
		} else if(type.equalsIgnoreCase("INTER")) {
			return new Inter();
		} else if (type.equalsIgnoreCase("DEGREE")) {
			return new Degree();
		}
		return null;
	}
}
