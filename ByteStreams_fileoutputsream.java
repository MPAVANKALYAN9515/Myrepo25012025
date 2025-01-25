package com.file.streamstypes;

import java.io.*;

public class ByteStreams_fileoutputsream {

	public static void main(String[] args) throws IOException {
		
		
		String Str = "https://tcsglobal.udemy.com";
		FileOutputStream Foutv = new FileOutputStream("C:\\Users\\pavan\\NNW\\Summer.txt", false);
		byte b[] = Str.getBytes();
		Foutv.write(b);
		System.out.println("Executed");
		
	}
}