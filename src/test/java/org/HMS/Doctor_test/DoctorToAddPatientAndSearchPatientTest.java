package org.HMS.Doctor_test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.HMS.POMRepository.AddPatientPage_Doc;
import org.HMS.POMRepository.Doc_ManagePatientsPage;
import org.HMS.POMRepository.DoctorDashboardPage;
import org.HMS.POMRepository.LoginPage;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.IConstantPath;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DoctorToAddPatientAndSearchPatientTest extends BaseClass {
    
	@Test
	public void doctorToAddPatientAndSearchPatientTest() throws EncryptedDocumentException, IOException {
		//Fetch the data from Excel File
		
		
		//driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		//loginPage.docLoginActions(doctorUsn, doctorPwd);
		
		//Map<String, String> map = excelUtil.getDataFromExcelInMap("patientSearch1");
		List<Map<String, String>> list= excelUtil.getDataFromExcelInList("patientSearch1");
        String patientContact = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch1", 1, 1);
	String patientEmail = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch1", 1, 2);
		String patientAddress = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch1", 1, 3);
		String patientAge= excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch1", 1, 4);
		String MedicalHistory = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch1", 1, 5); 
		String patientSearch = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch1", 1, 6); 
	
		String Pname = list.get(0).get("PatientName")+random;
		LoginPage lp=new LoginPage(driver);
		lp.clickDoc();
		lp.docLoginActions(doctorUsn, doctorPwd);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		AddPatientPage_Doc ap=new AddPatientPage_Doc(driver);
		DoctorDashboardPage dd=new DoctorDashboardPage(driver);
		
		//lp.docLoginActions(doctorUsn, doctorPwd);
       
	//driver.findElement(By.name("username")).sendKeys(doctorUsn);
		//driver.findElement(By.name("password")).sendKeys(doctorPwd);
		//driver.findElement(By.name("submit")).click();
	
		dd.patDropDown();
		dd.addPatientOption();
	
		//driver.findElement(By.xpath("//span[text()=' Patients ']")).click();
		//driver.findElement(By.xpath("//span[text()=' Add Patient']")).click();

		//ap.patientDetails(Pname, patientContact, pEmail, patientAddress, patientAge, MedicalHistory);
	//	ap.patientDetails(list.get(1).get("PatientName"),list.get(1).get("PatientContactNo"));
		ap.patientDetails(list.get(0), random);
		dd.searchFeature();	
		
		//driver.findElement(By.name("patname")).sendKeys(Pname);
		System.out.println(Pname);
		//driver.findElement(By.name("patcontact")).sendKeys(patientContact);
		//driver.findElement(By.id("patemail")).sendKeys(random+patientEmail);
		//driver.findElement(By.xpath("//label[@for='rg-female']")).click();
		//driver.findElement(By.name("pataddress")).sendKeys(patientAddress);
		//driver.findElement(By.name("patage")).sendKeys(patientAge);
		//driver.findElement(By.name("medhis")).sendKeys(MedicalHistory);
		//driver.findElement(By.id("submit")).click();
		//driver.findElement(By.xpath("//span[text()=' Search ']")).click();
		Doc_ManagePatientsPage dm= new Doc_ManagePatientsPage(driver);
		dm.managePatients(Pname);
		dm.clickonSubmit();
		//driver.findElement(By.id("searchdata")).sendKeys(Pname);
		//driver.findElement(By.id("submit")).click();
		String fetchedtext = dm.gettextfromwebElement(Pname, driver);
		//String text = driver.findElement(By.xpath("//td[.='"+Pname+"']")).getText();
		System.out.println("This is fetched from web page "+fetchedtext);
		/*if(Pname.equalsIgnoreCase(fetchedtext))
		{
			System.out.println("TC IS PASS");
			
		}
		else
		{
			System.out.println("TC IS FAIL");
		}*/
		Assert.assertEquals(fetchedtext,Pname);
		System.out.println("tc is pass"); 
		

	}

}
