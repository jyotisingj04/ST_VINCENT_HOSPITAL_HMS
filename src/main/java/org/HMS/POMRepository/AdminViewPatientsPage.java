package org.HMS.POMRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminViewPatientsPage {

	public AdminViewPatientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	String dynamicXpath="//td[.='%s']";
	 public String gettextfromwebElement(String replace,WebDriver driver)
	  {
		  String reqwebele = String.format(dynamicXpath,replace );
		   String dynamicText = driver.findElement(By.xpath(reqwebele)).getText();
		  return dynamicText;
	  }
//	@FindBy(xpath = "//td[.='JYOTHI']")
//	private WebElement patSearchInAdmin;
//	
////business library
//public String patSearchInAdmin() {
//	String text = patSearchInAdmin.getText();
//	return text;
	
}


