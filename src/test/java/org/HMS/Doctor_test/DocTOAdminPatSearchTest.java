package org.HMS.Doctor_test;

import java.io.IOException;

import org.HMS.POMRepository.AddPatientPage_Doc;
import org.HMS.POMRepository.AdminDashboardPage;
import org.HMS.POMRepository.AdminViewPatientsPage;
import org.HMS.POMRepository.Doc_ManagePatientsPage;
import org.HMS.POMRepository.DoctorDashboardPage;
import org.HMS.POMRepository.LoginPage;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.IConstantPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocTOAdminPatSearchTest extends BaseClass {
	
	@Test
	public void DocPatSrch() throws EncryptedDocumentException, IOException {
		String patientName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch", 1, 0);
		String patientContact = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch", 1, 1);
		String patientEmail = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch", 1, 2);
		String patientAddress = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch", 1, 3);
		String patientAge = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch", 1, 4);
		String patientMedicalHistory = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch", 1, 5);
		String patientSearch = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "patientsearch", 1, 6);
		LoginPage lp=new LoginPage(driver);
		lp.clickDoc();
		lp.docLoginActions(doctorUsn, doctorPwd);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		String expected=patientName+random;
		AddPatientPage_Doc ap=new AddPatientPage_Doc(driver);
		DoctorDashboardPage dd=new DoctorDashboardPage(driver);
		Doc_ManagePatientsPage dm=new Doc_ManagePatientsPage(driver);
		AdminDashboardPage ad=new AdminDashboardPage(driver);
		AdminViewPatientsPage av=new AdminViewPatientsPage(driver);
		//loginPage.clickDoc();
		//String docUsername = fileUtil.getPropertyKeyValue("doctorusername");
		//String docPassword = fileUtil.getPropertyKeyValue("doctorpassword");
		//loginPage.docLoginActivity(docUsername, docPassword);
		dd.patDropDown();
		dd.addPatientOption();
		ap.patientDetails(patientName+random, patientContact, random+patientEmail, patientAddress, patientAge, patientMedicalHistory);;
		//addPatientPage.clickButton();
		System.out.println(expected);
		commonPage.logoutActivity();
		String adminLoginUserName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin", 1, 0);
		String adminLoginPassword = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin", 1, 1);
		lp.clickAdmin();
		lp.adminLoginActions(adminLoginUserName, adminLoginPassword);
		ad.patSearch(expected);
		//Assert.fail();
		//av.patSearchInAdmin();
		//Doc_ManagePatientsPage dm=new Doc_ManagePatientsPage(driver);
		String actualResult = dm.gettextfromwebElement(expected, driver);
		System.out.println(expected);
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, expected);
		System.out.println("Tc is Pass");
		
	}
}

		
		
		
		
		
//		String actualResult = av.patSearchInAdmin();
//		System.out.println(actualResult);
//		if (expectedResult.equals(actualResult)) {
//			System.out.println("Test Pass");
//		} else {
//			System.out.println("Test Failed");
//		}
		
 
		

