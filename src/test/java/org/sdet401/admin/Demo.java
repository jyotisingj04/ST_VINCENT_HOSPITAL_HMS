package org.sdet401.admin;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.FileUtility;
import org.sdet40.genericUtility.JavaUtility;
import org.sdet40.genericUtility.WebDriverUtility;

class Demo{
	public static void main(String[] args) throws IOException {

		FileUtility fileUtil= new FileUtility();
		WebDriverUtility webDriverUtil=new WebDriverUtility();
		ExcelUtility excelUtil=new ExcelUtility();
		
		JavaUtility Ju=new JavaUtility();
		
		int random = Ju.getRanDomNum(100);
		String appUrl = fileUtil.getPropertyKeyValue("url");
		String browser = fileUtil.getPropertyKeyValue("browser");
		String doctorUsn = fileUtil.getPropertyKeyValue("doctorUsername");
		String doctorPwd = fileUtil.getPropertyKeyValue("doctorPassword");
		
		WebDriver driver = webDriverUtil.openBrowserWithApplication(browser, appUrl);
		webDriverUtil.waitForElementInDOM(driver);
		List<Map<String, String>> list= excelUtil.getDataFromExcelInList("patientsearch1");
	}
}