package com.automation.utiltiy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	
	public ExcelDataProvider()
	{
		File src=new File("./TestData/Test_data.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {

			System.out.println("File not found"+e.getMessage());
		}	
		
			
	}
	public String getStringData(String sheetName,int row,int col)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}

}
