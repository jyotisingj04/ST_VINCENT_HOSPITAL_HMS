package org.sdet401.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws IOException {
		// step1: convert the physical file into java readable object
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/TestData.xlsx");
		// step2: open the excel workbook
		Workbook wb = WorkbookFactory.create(fisExcel);
		
		//step3: get the control on sheet
		Sheet sheet = wb.getSheet("CommonData");
		
		//step4: get the control on row
		Row row = sheet.getRow(2);
		
		//step5: get the control on cell
		Cell cell = row.getCell(1);
		
		//step6: fetch the data
		String username = cell.getStringCellValue();
		
		System.out.println(username);
		
		//step7: close the workbook
		//wb.close();

	}

}
