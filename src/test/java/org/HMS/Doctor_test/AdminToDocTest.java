package org.HMS.Doctor_test;

import java.io.IOException;

import org.HMS.POMRepository.AdminAddDoctorPage;
import org.HMS.POMRepository.AdminDashboardPage;
import org.HMS.POMRepository.DocUpdateProfPage;
import org.HMS.POMRepository.DoctorDashboardPage;
import org.HMS.POMRepository.LoginPage;
import org.HMS.POMRepository.ManageDoctorsPage;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.FileUtility;
import org.sdet40.genericUtility.IConstantPath;
import org.sdet40.genericUtility.JavaUtility;
import org.sdet40.genericUtility.WebDriverUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminToDocTest extends BaseClass{
	@Test
	public void adminDocTest() throws EncryptedDocumentException, IOException {
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
	String docConfirmPwd = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",1 ,8 );
	String updateDocFee = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin",2,4 );
	String expectedResult = docName+random;
	LoginPage lp=new LoginPage(driver);
	lp.clickAdmin();
	lp.adminLoginActions(adminLoginUserName,adminLoginPassword );
	AdminAddDoctorPage ad=new AdminAddDoctorPage(driver);
	ManageDoctorsPage md=new ManageDoctorsPage(driver);
	//ad.docSpecialization();
	ad.docFeature();
	webDriverUtil.waitForElementInDOM(driver);
	ad.addDoctorFeature();
	//WebElement element = ad.docSpecialization();
	//webDriverUtil.select(element, 2);
	ad.addDoctor(random, docName, clinicAddress, docFees, docContact, random+docEmail, docPassword, docConfirmPwd);
	webDriverUtil.swithToAlertWindowAndAccpect(driver);
	String fetchedtext = md.gettextfromwebElement(expectedResult, driver);
	Assert.assertEquals(fetchedtext, expectedResult);
	System.out.println("ts is pass");
	}

}
