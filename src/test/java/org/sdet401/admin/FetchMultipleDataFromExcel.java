package org.sdet401.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("CommonData");
		DataFormatter df = new DataFormatter();
		String[][] arr = new String[sheet.getLastRowNum() + 1][sheet.getRow(6).getLastCellNum()];// arr[9][4]

		// insert oprtstion
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {//row

			for (int j = 0; j < sheet.getRow(6).getLastCellNum(); j++) {//column
				arr[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}

		// to print in output
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {

			for (int j = 0; j < sheet.getRow(6).getLastCellNum(); j++) {
				System.out.print(arr[i][j]+ "   ");
			}
			System.out.println();
		}

	}

}
