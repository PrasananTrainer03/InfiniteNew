package com.java.ex;

public class ThrEx {

	public void check(int n) {
		if (n < 0) {
			throw new ArithmeticException("Negative Numbers Not Allowed...");
		} else if (n == 0) {
			throw new NumberFormatException("Zero is Invalid...");
		} else {
			System.out.println("N value is  " +n);
		}
	}
	
	public static void main(String[] args) {
		int n=-1;
		ThrEx obj = new ThrEx();
		try {
			obj.check(n);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
