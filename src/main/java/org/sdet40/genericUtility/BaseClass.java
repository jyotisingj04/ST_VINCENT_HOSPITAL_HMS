package org.sdet40.genericUtility;

import java.io.IOException;

import org.HMS.POMRepository.CommonPage;
import org.HMS.POMRepository.DoctorDashboardPage;
import org.HMS.POMRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	private LoginPage lp;
	protected CommonPage commonPage;
	private DoctorDashboardPage dd;
	protected WebDriver driver;
	protected String doctorUsn;
	protected String doctorPwd;
	protected ExcelUtility excelUtil;
	protected WebDriverUtility webDriverUtil;
	protected int random;
	protected String excelpath;
	public static WebDriver sdriver;
	public static JavaUtility sjavaUtility;
	/**
	 * initialize the all utility class
	 * open the excel, propertyfile
	 * read the common data
	 * create the instance for browser(launch browser)
	 * maximize, implicit wait
	 * open the application
	 * initialize jsexecutor,actions,webdriverwait
	 * create the instance for common object repo
	 * @throws IOException
	 * 
	 */

	@BeforeClass (groups="baseclass")
	public void classSetUp() throws IOException {

		//create instance for the Generic Utility
		FileUtility fileUtil= new FileUtility();
		webDriverUtil=new WebDriverUtility();
		excelUtil=new ExcelUtility();
		JavaUtility Ju=new JavaUtility();
		sjavaUtility=Ju;

		//initialize the property file and excelfile
		fileUtil.initializePropertyFile(IConstantPath.PROPERTY_FILE_PATH);
		excelUtil.openExcel(IConstantPath.EXCEL_PATH);

		//FETCH THE DATA FROM PROPERTY FILE
		String browser = fileUtil.getPropertyKeyValue("browser");
		doctorUsn = fileUtil.getPropertyKeyValue("doctorUsername");
		doctorPwd = fileUtil.getPropertyKeyValue("doctorPassword");
		excelpath = IConstantPath.EXCEL_PATH;
		String appUrl = fileUtil.getPropertyKeyValue("url");
		random = Ju.getRanDomNum(100);

		//LAUNCHING THE BROWSER AND DOING SOME BROWSER SETTING
		driver = webDriverUtil.openBrowserWithApplication(browser, appUrl);
		sdriver=driver;
		webDriverUtil.waitForElementInDOM(driver);

		//create object for common pom repo
		lp=new LoginPage(driver);
		commonPage =new CommonPage(driver);

	}
	//login to the application
	/**
	 * whenever we create the testscript class for module and test annotation method for testcase
	 * create the instance for browser(launch browser)
	 * maximize,implicit wait
	 * initialize jsexecutor,actions,webdriverwait
	 * create the instance for common object repo(driver)
	 * login to the app
	 */
	@BeforeMethod(groups="baseclass")
	public void methodSetUp1( ) {
		//lp.docLoginActions(doctorUsn, doctorPwd);
	}
	@AfterMethod(groups="baseclass")
	public void methodTearDown() throws IOException {
		//logout from the application
		//dd.logOutAction();

		//save the excel data
		excelUtil.saveDataIntoExcel(excelpath);
	}
	@AfterClass (groups="baseclass")
	public void classTearDown() throws IOException {
		//webDriverUtil.closeBrowser();
		//excelUtil.closeExcelWorkBook();

	//	commonPage.logoutActivity();
		System.out.println("===close the browser=====");
		driver.quit();
	}
}
