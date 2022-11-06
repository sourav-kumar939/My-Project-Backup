package TestNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	
	public static void main(String[] args) throws Exception {
	
	File excelfile=new File("./Resources/Test.xlsx");
	System.out.println(excelfile.exists());
	
	FileInputStream fis=new FileInputStream(excelfile);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int no_of_rows=sheet.getPhysicalNumberOfRows();
	System.out.println(no_of_rows);
	
	
	workbook.close();
	fis.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//int no_column=sheet.getRow(0).getLastCellNum();
	//System.out.println(fileinput.exists());
	
	
//	for (int i = 1; i <no_of_rows ; i++) {
//		for(int j=0;j<no_column;j++) {
//			//DataFormatter df= new DataFormatter();
//			System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
//		}
//	}
	

	//return data;
	}

}
