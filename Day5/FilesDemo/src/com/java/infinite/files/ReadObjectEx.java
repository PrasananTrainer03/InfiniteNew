package com.java.infinite.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ReadObjectEx {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:/files/obj.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			String str = (String)objin.readObject();
			Date dt = (Date)objin.readObject();
			System.out.println(str);
			System.out.println(dt);
			fin.close();
			objin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
