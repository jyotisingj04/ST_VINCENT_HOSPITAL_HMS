package org.sdet401.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelUsingMethodChaining {

	public static void main(String[] args) throws IOException {
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fisExcel);
		
		DataFormatter df = new DataFormatter();
		try {
			Sheet sheet = wb.getSheet("Sheet1");
			  String data = df.formatCellValue(sheet.getRow(1).getCell(1));
			  System.out.println(data);
			 
		}
		  finally {
			  wb.close();
		  }
		

	}

}
