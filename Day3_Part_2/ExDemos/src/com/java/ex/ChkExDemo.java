package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChkExDemo {

	public void check(String dt) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(dt);
		System.out.println(d);
	}
	public static void main(String[] args) {
		String dt="23/12/20201";
		ChkExDemo obj = new ChkExDemo();
		try {
			obj.check(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
