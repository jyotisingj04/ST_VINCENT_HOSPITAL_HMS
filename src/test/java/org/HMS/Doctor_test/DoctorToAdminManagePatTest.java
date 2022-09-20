package org.HMS.Doctor_test;

import java.io.IOException;

import org.HMS.POMRepository.AddPatientPage_Doc;
import org.HMS.POMRepository.AdminDashboardPage;
import org.HMS.POMRepository.AdminViewPatientsPage;
import org.HMS.POMRepository.Doc_ManagePatientsPage;
import org.HMS.POMRepository.DoctorDashboardPage;
import org.HMS.POMRepository.LoginPage;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.IConstantPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoctorToAdminManagePatTest extends BaseClass  {
	@Test
	public void patientSrchTest() throws IOException, InterruptedException {
	String patientName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 0);
	String patientContact = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 1);
	String patientEmail = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 2);
	String patientAddress = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 3);
	String patientAge = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 4);
	String patientMedicalHistory = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 5);
	String patientSearch = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 6);
	String expected = patientName+random;
	System.out.println(expected);
	LoginPage lp= new LoginPage(driver); 
	lp.clickDoc();
	lp.docLoginActions(doctorUsn, doctorPwd);
	DoctorDashboardPage dd=new DoctorDashboardPage(driver);
	dd.patDropDown();
	dd.addPatientOption();
	AddPatientPage_Doc ap=new AddPatientPage_Doc(driver);
	ap.patientDetails(patientName+random, patientContact, patientEmail+random, patientAddress, patientAge, patientMedicalHistory);
	dd.searchFeature();
	//managePatient.searchPattxt(patientName+random);
	//managePatient.submitButton();
	commonPage.logoutActivity();
	lp.clickAdmin();
	String adminLoginUserName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin", 1, 0);
	String adminLoginPassword = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin", 1, 1);
	 lp.adminLoginActions(adminLoginUserName, adminLoginPassword);
	 AdminDashboardPage ad=new AdminDashboardPage(driver);
	 ad.managePatientClicking();
	 AdminViewPatientsPage av=new AdminViewPatientsPage(driver);
	 String actualResult = av.gettextfromwebElement(expected, driver);
	 //String actualResult = av.patSearchInAdmin()+random;
	 System.out.println(actualResult);
		Assert.assertEquals(actualResult, expected);
		System.out.println("tc is pass");
	 //adminDashPage.ManagePatInAdmin();
	// String actual = driver.findElement(By.xpath("//td[.='"+expectedResult+"']")).getText();
	// System.out.println(actual);
	}
	}
	