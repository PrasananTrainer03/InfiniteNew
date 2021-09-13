package com.java.infinite.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/employ.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Employ employ = new Employ(1, "Anushka", 88234);
			objout.writeObject(employ);
			objout.close();
			fout.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
