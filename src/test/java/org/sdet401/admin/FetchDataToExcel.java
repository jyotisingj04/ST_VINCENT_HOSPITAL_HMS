package org.sdet401.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataToExcel {

	public static void main(String[] args) throws IOException {
		//step1: convert the physical file into java readable object
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/TestData.xlsx");
		//step2: open the excel workbook
		Workbook wb = WorkbookFactory.create(fisExcel);
		//step3: get the control on sheet
		Sheet sheet = wb.getSheet("Organization");
		//step4: get the control on row for new row
		Row row = sheet.createRow(18);
		//step5: create the cell
		Cell cell = row.createCell(3);
		//step6: update the status/set the data
		cell.setCellValue("Skip");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
		//step7: write the data into excel
		wb.write(fos);
		System.out.println("Data updated successfully");
		//step8: close the workbook
		wb.close();

	}

}
