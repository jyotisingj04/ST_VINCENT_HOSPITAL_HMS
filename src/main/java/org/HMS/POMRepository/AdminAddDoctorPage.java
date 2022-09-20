package org.HMS.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAddDoctorPage {
	@FindBy (name = "Doctorspecialization")
	private WebElement docspecializ;
	@FindBy (name="docname")
	private WebElement docNameTxt;
	@FindBy(name="clinicaddress")
	private WebElement clinicAddTxt;
	@FindBy(name="docfees")
	private WebElement docFeesTxt;
	@FindBy(name="doccontact")
	private WebElement docContTxt;
	@FindBy(id="docemail")
	private WebElement docMailTxt;
	@FindBy(name="npass")
	private WebElement pwdTxt;
	@FindBy(name="cfpass")
	private WebElement cfrmPwdTxt;
	@FindBy(id="submit")
	private WebElement submitBtn;
	@FindBy(xpath = "//span[.=' Doctors ']")
	private WebElement docFea;
	@FindBy(xpath = "//span[text()=' Add Doctor']")
	private WebElement addDoc;
	//initialization
	  public AdminAddDoctorPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	//business library
	public void addDoctorFeature() {
		docspecializ.click();
		docNameTxt.sendKeys("docName");
		clinicAddTxt.sendKeys("clinicAddress");
		docContTxt.sendKeys("docContact");
		docMailTxt.sendKeys("docMail");
		pwdTxt.sendKeys("docpwdTxt");
		cfrmPwdTxt.sendKeys("confirmpwd");
		submitBtn.click();
	}
	public void addDoctor(int randomNum,String docName,String clinicAddress,String docFeess,String docContact,String docEmail,String docPassword,String docConfirPwd) {
		docNameTxt.sendKeys(docName+randomNum);
		clinicAddTxt.sendKeys(clinicAddress);
		docFeesTxt.sendKeys(docFeess);
		docContTxt.sendKeys(docContact);
		docMailTxt.sendKeys(docEmail);
		pwdTxt.sendKeys(docPassword);
		cfrmPwdTxt.sendKeys(docConfirPwd);
		submitBtn.click();
	}
	public WebElement docSpecialization() {
		docspecializ.click();
		return docspecializ;
		
	}
	public void docFeature() {
		docFea.click();
	}
	public void addDoctorFea() {
		addDoc.click();
	}
}
