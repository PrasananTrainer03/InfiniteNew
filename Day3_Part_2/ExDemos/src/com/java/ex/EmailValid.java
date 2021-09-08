package com.java.ex;

import java.util.Scanner;

public class EmailValid {

	public void check(String email) throws InvalidEmailException, InvalidUserException {
		if (email.indexOf("@") == -1) {
			throw new InvalidEmailException("Email is Invalid...");
		} if (email.substring(0,email.indexOf("@")).length() >= 12) {
			throw new InvalidUserException("Invalid User...");
		} else {
			System.out.println(email);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Address   ");
		String email = sc.nextLine();
		try {
			new EmailValid().check(email);
		} catch (InvalidEmailException | InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
