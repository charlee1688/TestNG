package com.hrms.tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class addEmpToExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		DataFormatter objDefaultFormat = new DataFormatter();

		String path = "DemoFile.xlsx";
		FileInputStream fs = new FileInputStream(path);
		
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheetAt(1);
		
		
		Cell userName = sheet.getRow(1).getCell(0);
	    String orderID1 = userName.toString();
		System.out.println(userName);
	    
		Cell passWord = sheet.getRow(1).getCell(1);
		String passID = passWord.toString();
		System.out.println(passWord);

		Cell nameEmp = sheet.getRow(1).getCell(2);
		String nameID = nameEmp.toString();
		System.out.println(nameEmp);

		Cell lastEmp = sheet.getRow(1).getCell(3);
		String lastID = lastEmp.toString();
		System.out.println(lastEmp);

//		for (Row row: sheet) {
//			for(Cell cell: row) {
//				String cellValue = objDefaultFormat.formatCellValue(cell);
//				System.out.print(cellValue + "\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
	}
}
