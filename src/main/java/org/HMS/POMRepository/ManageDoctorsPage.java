package org.HMS.POMRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDoctorsPage {
	//initialization
	  public ManageDoctorsPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  String dynamicXpath="//td[.='%s']";
	  @FindBy (xpath = "//td[.='JYOTI SINGH']")
	  private WebElement actualResult;
	  
	    //business library
		public String addDoctor() {
			String text = actualResult.getText();
			return text;
		}
		 public String gettextfromwebElement(String replace,WebDriver driver)
		  {
			  String reqwebele = String.format(dynamicXpath,replace );
			   String dynamicText = driver.findElement(By.xpath(reqwebele)).getText();
			  return dynamicText;
		  }
}
