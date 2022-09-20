package org.HMS.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage {
	public AdminDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//span[.=' Patient Search ']")
private WebElement patSearchInAdmin;
@FindBy(id="searchdata")
private WebElement patSearchTxt;
@FindBy(id="submit")
private WebElement submitBtn;
@FindBy(xpath="//span[.=' Doctors ']")
private WebElement ClickOnDoctorsDropDown;
@FindBy(xpath="//span[.=' Add Doctor']")
private WebElement ClickOnAddDoctorOption;
@FindBy(xpath="//span[.=' Patients ']")
private WebElement ClickOnPatientDropDownOption;
@FindBy(xpath="//span[.=' Manage Patients ']")
private WebElement ClickOnManagePatientsOption;

@FindBy(xpath="//a[@href='manage-patient.php']")
private WebElement ClickOnManagePatientOption;

//business library
public void patSearch(String pName) {
	patSearchInAdmin.click();
	patSearchTxt.sendKeys(pName);
	submitBtn.click();
}
public void addDoctorActivity() {
	ClickOnDoctorsDropDown.click();
	ClickOnAddDoctorOption.click();
}
public void managePatientClicking() {
	//ClickOnManagePatientOption.click();
	ClickOnPatientDropDownOption.click();
	ClickOnManagePatientsOption.click();
}
//public void patSrch() {
	//patSearchTxt.sendKeys("jyothi");
//}
//public void clickOnSubmit() {
	//submitBtn.click();
//}
}
