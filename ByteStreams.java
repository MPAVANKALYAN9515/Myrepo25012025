package com.file.streamstypes;

import java.io.*;

public class ByteStreams {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\pavan\\NNW\\king.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		File f1 = new File("C:\\Users\\pavan\\NNW" , "K15678.txt");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
		
		File f2 = new File(f1,"mounica.txt");
		System.out.println(f2.exists());
		f2.createNewFile();
		System.out.println(f2.exists());
		
		
//		String Str = "https://tcsglobal.udemy.com/";
//		FileInputStream fIN = new FileInputStream("C:\\\\Users\\\\pavan\\\\NNW\\\\Summer.txt");
//		int count = fIN.available();
//		byte[] b= new byte[count];
//		String S = b.toString();
//		System.out.println(count);
//		String[] S1 = fIN;
//		FileOutputStream Foutv = new FileOutputStream("C:\\Users\\pavan\\NNW\\Summer.txt", false);
//		byte b[] = Str.getBytes();
//		Foutv.write(b);
		System.out.println("Executed");
		
	}
}