package org.sdet40.testcases;

/*public class DocToAdminPatSearchTestingGenericUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUtility fileUtil=new FileUtility();
		WebdriverUtility webdriverUtil=new WebdriverUtility();
		ExcelUtility excelUtil=new ExcelUtility();
		String expectedResult="harish";
		String appUrl = fileUtil.getPropertyKeyValue("url");
		WebDriver driver = webdriverUtil.launchingBrowser("chrome");
		webdriverUtil.openApplication(driver,appUrl);
		String docUsername = fileUtil.getPropertyKeyValue("doctorusername");
		String docPassword = fileUtil.getPropertyKeyValue("doctorpassword");
		String patientName = excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH,"PatientSearch" ,1, 0);
		String patientContact = excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH, "PatientSearch",1 , 1);
		String patientEmail = excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH, "PatientSearch",1 , 2);
		String patientAddress = excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH, "PatientSearch",1 ,3);
		String patientAge = excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH, "PatientSearch",1 ,4);
		String patientMedicalHistory= excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH, "PatientSearch",1 , 5);
		String patientSearch = excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH, "PatientSearch",1 , 6);
		driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		driver.findElement(By.name("username")).sendKeys(docUsername);
		driver.findElement(By.name("password")).sendKeys(docPassword);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[.=' Patients ']")).click();
		driver.findElement(By.xpath("//span[.=' Add Patient']")).click();
		driver.findElement(By.name("patname")).sendKeys(patientName);
		driver.findElement(By.name("patcontact")).sendKeys(patientContact);
		driver.findElement(By.name("patemail")).sendKeys(JavaUtility.getRanDomNum(1000)+patientEmail);
		driver.findElement(By.xpath("//label[@for='rg-male']")).click();
		driver.findElement(By.name("pataddress")).sendKeys(patientAddress);
		driver.findElement(By.name("patage")).sendKeys(patientAge);
		driver.findElement(By.name("medhis")).sendKeys(patientMedicalHistory);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[@class='username']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		String adminLoginUserName = excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH, "Admin",1 ,0 );
		String adminLoginPassword = excelUtil.getDataFromExcel(IConstantpath.EXCEL_PATH, "Admin",1,1);
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		driver.findElement(By.name("username")).sendKeys(adminLoginUserName);
		driver.findElement(By.name("password")).sendKeys(adminLoginPassword);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[.=' Patient Search ']")).click();
		driver.findElement(By.id("searchdata")).sendKeys("Harish");
		driver.findElement(By.id("submit")).click();
		String actualResult=driver.findElement(By.xpath("//td[.='harish']")).getText();
		if(expectedResult.equals(actualResult)) {
		System.out.println("Test Passes");
		}
		else {
		System.out.println("Test Failed");
		}
		webdriverUtil.closeBrowser(driver);
		}
		
		
	}
*/

