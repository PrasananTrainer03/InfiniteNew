package com.java.infinite.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:/files/data.txt");
			DataInputStream din = new DataInputStream(fin);
			int x = din.readInt();
			String name = din.readUTF();
			boolean flag = din.readBoolean();
			double bas = din.readDouble();
			System.out.println("X value is  " +x);
			System.out.println("Name is  " +name);
			System.out.println("Boolean Value  " +flag);
			System.out.println("Basic  " +bas);
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
