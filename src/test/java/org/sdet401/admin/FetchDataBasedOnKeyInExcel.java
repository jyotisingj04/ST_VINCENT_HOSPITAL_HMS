package org.sdet401.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataBasedOnKeyInExcel {
//Changes done by ENg-2
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("CommonData");
		DataFormatter df = new DataFormatter();
		//changes done by engg1
		//Changes
		String value= null;
		int i=0;
		while(i<sheet.getLastRowNum()) {
			String key = df.formatCellValue(sheet.getRow(i).getCell(0));
			if(key.equalsIgnoreCase("browser")) {
				value= df.formatCellValue(sheet.getRow(i).getCell(1));
				break;
			}
			i++;
		}
		System.out.println(value); 
		

	}

}
