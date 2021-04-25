package com.java.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\WeekEndJava\\src\\com\\java\\resource\\config.properties");
		FileInputStream fileinput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileinput);
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Username"));
	}

}
