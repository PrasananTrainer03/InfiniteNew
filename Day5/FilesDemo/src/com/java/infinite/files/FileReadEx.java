package com.java.infinite.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {
	public static void main(String[] args) {
		File f1 = new File("D:/Infinite_new/Day4/StudentProject/src/com/java/infinite/studentproject/Student.java");
		int ch;
		try {
			FileReader fr = new FileReader(f1);
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
