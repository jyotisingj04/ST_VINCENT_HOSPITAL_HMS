package org.sdet401.admin;

import java.util.Map;

import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.IConstantPath;

public class FetchDataFromExcelThroughMap {

	public static void main(String[] args) throws Throwable {
		ExcelUtility excelUtil=new ExcelUtility();
		excelUtil.openExcel(IConstantPath.EXCEL_PATH);
		Map<String, String> map= excelUtil.getDataFromExcelInMap("form");
		System.out.println(map.get("City")); 
		
	}

}
