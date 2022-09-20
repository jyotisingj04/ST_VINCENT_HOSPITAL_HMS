package org.HMS.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashboardPage {
	
	@FindBy(xpath="//span[text()=' Patients ']")
	  private WebElement clickOnPatientsDropDownFeature;
	
	@FindBy(xpath="//span[text()=' Add Patient']")
	  private WebElement clickOnAddPatientOption;
	
	@FindBy(xpath="//span[text()=' Search ']")
	  private WebElement clickOnSearchFeature;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	  private WebElement clickOnLogOutBtn;
	@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
	private WebElement updateFeaturee;
	@FindBy(xpath = "//a[@href='manage-patient.php']/span[.=' Manage Patient ']")
	private WebElement manageFeature;
	
	//initialization
	  public DoctorDashboardPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	public void patDropDown() {
		clickOnPatientsDropDownFeature.click();
	}
	public void addPatientOption() {
		clickOnAddPatientOption	.click();
	}
	public void searchFeature() {
		clickOnSearchFeature.click();
	}
	public void logOutAction() {
		clickOnLogOutBtn.click();
	}
	public void docUpdateFea() {
		updateFeaturee.click();
	}
	public void managePat() {
		manageFeature.click();
	}
}
