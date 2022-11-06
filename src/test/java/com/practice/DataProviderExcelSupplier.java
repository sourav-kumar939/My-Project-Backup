package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderExcelSupplier {
	
	@DataProvider(name="loginDetails")
	public String[][] excelData() {
		
		String[][] data=null;
		
		try {
			
			File file=new File("D:/Excel/Book1.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int noOfRows=sheet.getPhysicalNumberOfRows();
			int noOfColumns=sheet.getRow(0).getLastCellNum();
			
			data=new String[noOfRows-1][noOfColumns];
			for(int i=0;i<noOfRows-1;i++) {
				for(int j=0;j<noOfColumns;j++) {
					DataFormatter df=new DataFormatter();
					data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				}
			}
			
			fis.close();
			workbook.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}

}