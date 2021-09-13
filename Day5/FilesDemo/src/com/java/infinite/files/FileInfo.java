package com.java.infinite.files;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File f1 = new File("D:/Infinite_new/Day4/StudentProject/src/com/java/infinite/studentproject/Student.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("Path  " +f1.getPath());
		System.out.println("Parent Directory  " +f1.getParent());
		File f2 = new File("D:/Infinite_new/Day4/StudentProject/src/com/java/infinite/studentproject");
		String[] flist = f2.list();
		for (String s : flist) {
			System.out.println(s);
		}
	}
}
