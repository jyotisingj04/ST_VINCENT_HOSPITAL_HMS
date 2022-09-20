package org.HMS.POMRepository;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddPatientPage_Doc {
	WebDriver driver;
	@FindBy(name="patname")
	  private WebElement patientNameTextField;
	@FindBy(name="patcontact")
	  private WebElement patientContactTextField;
	@FindBy(id="patemail")
	  private WebElement patientEmailTextField;
	@FindBy(xpath="//label[@for='rg-female']")
	  private WebElement patientGenderRadioButton;
	@FindBy(name="pataddress")
	  private WebElement patientAddressTextField;
	@FindBy(name="patage")
	  private WebElement patientAgeTextField;
	@FindBy(name="medhis")
	  private WebElement patientMedicalHistoryTextField;
	@FindBy(xpath="//button[@type='submit']")
	  private WebElement clickOnAddButton;
	//initialization
	  public AddPatientPage_Doc(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	  public void patientDetails(Map<String, String>map,int random)
	  {
		  
		  patientNameTextField.sendKeys(map.get("PatientName")+random);//list.get(1).get("PatientName")
		  patientContactTextField.sendKeys(map.get("PatientContactNo"));
		  patientEmailTextField.sendKeys(random+map.get("PatientEmail"));
		  patientGenderRadioButton.click();
		  patientAddressTextField.sendKeys(map.get("PatientAddress"));
		  patientAgeTextField.sendKeys(map.get("PatientAge"));
		  patientMedicalHistoryTextField.sendKeys(map.get("MedicalHistory"));
		  clickOnAddButton.click();
	  }
	  public void patientDetails(String PatientName,String PatientContactNo,String PatientEmail,String PatientAddress,String PatientAge,String MedicalHistory)
	  {
		  patientNameTextField.sendKeys(PatientName);
		  patientContactTextField.sendKeys(PatientContactNo);
		  patientEmailTextField.sendKeys(PatientEmail);
		  patientGenderRadioButton.click();
		  patientAddressTextField.sendKeys(PatientAddress);
		  patientAgeTextField.sendKeys(PatientAge);
		  patientMedicalHistoryTextField.sendKeys(MedicalHistory);
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.elementToBeClickable(clickOnAddButton));
		  clickOnAddButton.click();
	  }
	
	
	
}
