package com.java.inifinite.threads;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {
	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Krishna", "Shashank");
		userData.put("Aishwarya", "Sahu");
		userData.put("Hari", "Chandana");
		userData.put("Neeraj", "Singh");
		userData.put("Tanveer", "Akram");
		
		String user,pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		user = sc.next();
		System.out.println("Enter Password  ");
		pwd = sc.next();
		
		String res = userData.getOrDefault(user, "Not Found");
		if (res.equals(pwd)) {
			System.out.println("*** Correct Credentials ***");
		} else {
			System.out.println("*** Invalid Credentials ***");
		}
	}
}
