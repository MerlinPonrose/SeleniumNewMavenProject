package com.java.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("e:\\Karen Amy\\Documents\\Excel.xlsx");
		FileInputStream input = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.createRow(6);
		Cell cell = row.createCell(2);
		
		cell.setCellValue("write data");
		
		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);
		output.close();
		
	}

}
