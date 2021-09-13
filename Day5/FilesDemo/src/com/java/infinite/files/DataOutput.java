package com.java.infinite.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/data.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(12);
			dout.writeUTF("Prasanna");
			dout.writeBoolean(true);
			dout.writeDouble(88235.33);
			dout.close();
			fout.close();
			System.out.println("File Copied..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
