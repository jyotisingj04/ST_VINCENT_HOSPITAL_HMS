package org.sdet40.genericUtility;

import java.io.IOException;

import org.HMS.POMRepository.LoginPage;
import org.openqa.selenium.WebDriver;

public class POM {

	public static void main(String[] args) throws IOException {
		FileUtility fileUtil= new FileUtility();
		WebDriverUtility webDriverUtil=new WebDriverUtility();
		ExcelUtility excelUtil=new ExcelUtility();
		JavaUtility Ju=new JavaUtility();
		
		String appUrl = fileUtil.getPropertyKeyValue("url");
		String browser = fileUtil.getPropertyKeyValue("browser");
		String doctorUsn = fileUtil.getPropertyKeyValue("doctorUsername");
		String doctorPwd = fileUtil.getPropertyKeyValue("doctorPassword");
		
		WebDriver driver = webDriverUtil.openBrowserWithApplication(browser, appUrl);
		webDriverUtil.waitForElementInDOM(driver);
		
		LoginPage logpg=  new LoginPage(driver);
		logpg.clickDoc();
		logpg.docLoginActions(doctorUsn, doctorPwd);

		
	}

}
