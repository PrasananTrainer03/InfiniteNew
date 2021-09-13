package com.java.infinite.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		File src = new File("D:/Infinite_new/Day4/StudentProject/src/com/java/infinite/studentproject/Student.java");
		File tar = new File("c:/files/StudentInfinite.java");
		int ch;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(tar);
			while((ch=fr.read()) != -1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("*** File Copied Successfully ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
