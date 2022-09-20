package org.HMS.POMRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doc_ManagePatientsPage {
	 String dynamicXpath="//td[.='%s']";
	 @FindBy(id="searchdata")
	  private WebElement searchTextField;
	 
	 @FindBy(id = "submit") private WebElement submitButton;
	@FindBy(xpath="//input[@class='form-control']")
	  private WebElement clickOnSearchButton;
//	@FindBy(xpath="//td[.='"+Pname+"']")
//	  private WebElement patientResult;
	@FindBy(xpath="//td[.='JYOTHI88']")
	private WebElement expectedPat;
	//initialization
	  public Doc_ManagePatientsPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  public void managePatients(String patName) {
		  searchTextField.sendKeys(patName);
		  clickOnSearchButton.click();
	  }
	  public WebElement convertStringtoWebElement(String pname,WebDriver driver)
	  {
		  String format = String.format(dynamicXpath, pname);
	  WebElement webelement = driver.findElement(By.xpath(format));
	  return webelement;
	  }
	  
	  public String gettextfromwebElement(String replace,WebDriver driver)
	  {
		  String reqwebele = String.format(dynamicXpath,replace );
		   String dynamicText = driver.findElement(By.xpath(reqwebele)).getText();
		  return dynamicText;
	  }
//	  public String patExpected() {
//		  return expectedPat.getText();
//	  }
	  public void clickonSubmit()
	  {
		  submitButton.click();
	  }
	 
	  
}
