package com.file.streamstypes;

import java.io.*;

public class  ByteStreams_file_class {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\pavan\\NNW\\king.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println("==================================================================");
		
		File f1 = new File("C:\\Users\\pavan\\NNW" , "K15678.txt");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());

		System.out.println("==================================================================");
		
		File f2 = new File(f1,"mounica.txt");
		System.out.println(f2.exists());
		f2.createNewFile();
		System.out.println(f2.exists());
		System.out.println("Executed");

		System.out.println("==================================================================");
		
	}
}
