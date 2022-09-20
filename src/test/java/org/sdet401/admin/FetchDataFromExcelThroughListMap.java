package org.sdet401.admin;

import java.util.Map;

import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.IConstantPath;

public class FetchDataFromExcelThroughListMap {

	public static void main(String[] args) throws Throwable {
		ExcelUtility excelUtil=new ExcelUtility();
		excelUtil.openExcel(IConstantPath.EXCEL_PATH);
		java.util.List<Map<String, String>> list = excelUtil.getDataFromExcelInList("form");
		System.out.println(list.get(3).get("FirstName"));
	}

}
