package org.sdet40.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.FileUtility;
import org.sdet40.genericUtility.IConstantPath;
import org.sdet40.genericUtility.WebDriverUtility;

//public class AdminToDocTestingGenericUtility {
	
	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
	/*ExcelUtility excelUtil=new ExcelUtility();
	FileUtility fileUtil=new FileUtility();
	WebDriverUtility webdriverUtil=new WebDriverUtility();
	//int randomNumber = new JavaUtility().getRanDomNum(1000);
	String browser = fileUtil.getPropertyKeyValue("browser");
	String appUrl =fileUtil.getPropertyKeyValue("url");
	//driver=webdriverUtil.launchingBrowser(browser);
	webdriverUtil.openBrowserWithApplication(browser, appUrl);
	String adminLoginUserName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1 ,0 );
	String adminLoginPassword = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1,1);
	String docLoginUserName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "admin",2 ,0 );
	String docLoginPassword = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",2 ,1 );
	String docName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1,2);
	String clinicAddress = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1 ,3);
	String docFees= excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1 ,4 );
	
	String docContact=excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1 ,5 );
	String docEmail = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1 ,6 );
	String docPassword = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1 ,7 );
	//String docConfirmationPassword = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1 ,8 );
	//String updateDocFee = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",2,4 );
	/*webdriverUtil.openBrowserWithApplication(driver, browser);
	webdriverUtil.maximizeWindow(driver);
	driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
	driver.findElement(By.name("username")).sendKeys(adminLoginUserName);
	driver.findElement(By.name("password")).sendKeys(adminLoginPassword);
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.xpath("//span[.=' Doctors ']")).click();
	driver.findElement(By.xpath("//span[.=' Add Doctor']")).click();
	WebElement element= driver.findElement(By.name("Doctorspecialization"));
	webdriverUtil.select(element, 2);
	driver.findElement(By.name("docname")).sendKeys(docName);
	driver.findElement(By.name("clinicaddress")).sendKeys(clinicAddress);
	driver.findElement(By.name("docfees")).sendKeys(docFees);
	driver.findElement(By.name("doccontact")).sendKeys(docContact);
	driver.findElement(By.id("docemail")).sendKeys(JavaUtility.getRanDomNum(1000)+docEmail);
	driver.findElement(By.name("npass")).sendKeys(docPassword);
	driver.findElement(By.name("cfpass")).sendKeys(docConfirmationPassword);
	driver.findElement(By.id("submit")).click();
	webdriverUtil.swithToAlertWindowAndAccept(driver);
	driver.findElement(By.xpath("//span[@class='username']")).click();
	driver.findElement(By.xpath("//a[@href='logout.php']")).click();
	driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(docLoginUserName);
	driver.findElement(By.name("password")).sendKeys(docLoginPassword);
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Update Profile')]")).click();
	driver.findElement(By.name("docfees")).sendKeys(updateDocFee);
	driver.findElement(By.name("submit")).click();
	webdriverUtil.swithToAlertWindowAndAccept(driver);
	driver.findElement(By.xpath("//span[@class='username']")).click();
	driver.findElement(By.xpath("//a[@href='logout.php']")).click();
	driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
	driver.findElement(By.name("username")).sendKeys(adminLoginUserName);
	driver.findElement(By.name("password")).sendKeys(adminLoginPassword);
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.xpath("//a[@href='manage-doctors.php']")).click();
	webdriverUtil.closeBrowser(driver);
	}
	}
	BookAppointToAppointHistoryTestingGenericUtility:
}*/
