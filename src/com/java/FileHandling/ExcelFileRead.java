package com.java.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("e:\\Karen Amy\\Documents\\Excel.xlsx");
		FileInputStream input = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		for(int i=0;i<=row;i++)
		{
			Row rowcount = sheet.getRow(i);
			int colcount = rowcount.getLastCellNum();
			for(int j=0;j<=colcount-1;j++)
			{
				System.out.println(rowcount.getCell(j).toString());
			}
			System.out.println();
		}
		

	}

}
