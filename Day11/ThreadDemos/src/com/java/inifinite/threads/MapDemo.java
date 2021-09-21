package com.java.inifinite.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> data = new HashMap<Integer, String>();
		data.put(1, "obuli Sundar");
		data.put(2, "Anushka Priya");
		data.put(3, "Arti Yadav");
		data.put(4, "Gowtham Sekhar");
		
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		String result = data.getOrDefault(empno, "Not Found");
		System.out.println(result);
	}
}
