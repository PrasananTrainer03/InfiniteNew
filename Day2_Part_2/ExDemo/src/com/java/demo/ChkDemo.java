package com.java.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChkDemo {

	public void show(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = sdf.parse(str);
		System.out.println(dt);
	}
	public static void main(String[] args) {
		String str="2021-09-07";
		ChkDemo obj = new ChkDemo();
		try {
			obj.show(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
