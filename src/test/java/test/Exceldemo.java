package test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exceldemo {
	@Test
	public static void exceldemoo() throws Exception{
		//creating a file
		File file = new File("C:\\Users\\training_d2.03.07\\Desktop\\TestData.xlsx");
		
		//converting file to a file input stream
		FileInputStream fis = new FileInputStream(file);
		
		//creating the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Creating an object for sheet
		XSSFSheet sheet = wb.getSheet("Login");
		
		//Getting the total no of rows present in excel
		int row_count = sheet.getLastRowNum();
		System.out.printf("aaa", +row_count);
		for (int i = 0; i <= row_count; i++) {
			//create an object for rows
			XSSFRow row = sheet.getRow(i);
			int total_cols = row.getLastCellNum();
			for (int j = 0; j < total_cols; j++) {
				String value = row.getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		
	}
}
