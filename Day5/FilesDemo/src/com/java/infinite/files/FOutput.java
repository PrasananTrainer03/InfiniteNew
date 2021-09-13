package com.java.infinite.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {

	public static void main(String[] args) {
		try {
			FileInputStream fin =
					new FileInputStream("D:/Infinite_new/Day4/StudentProject/src/com/java/infinite/studentproject/Student.java");
			FileOutputStream fout = new FileOutputStream("c:/files/StudentNewOne.java");
			int ch;
			while((ch=fin.read()) != -1) {
				fout.write((char)ch);
			}
			fin.close();
			fout.close();
			System.out.println("*** File Copied Successfully ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
