package com.java.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("e:\\Karen Amy\\Documents\\TestTextFile.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNext())
		{
			System.out.println(scan.next());
		}
		
		FileWriter filewrite = new FileWriter("e:\\\\Karen Amy\\\\Documents\\WtriteTextFile.txt");
		filewrite.write("Hi how are u ");
		filewrite.close();
 
	}

}
