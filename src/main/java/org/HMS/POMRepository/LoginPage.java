package org.HMS.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class LoginPage {

	//initialization
	  public LoginPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	//declaration
	@FindBy(xpath="//a[@href='hms/doctor/']")
	  private WebElement clickOnDocModule;
	 
	@FindBy(name="username")
	  private WebElement docUserNameTextField;
	
	@FindBy(name="password")
	  private WebElement docPasswordTextField;
	
	@FindBy(name="submit")
	  private WebElement docloginButton;
	
	@FindBy(xpath="//a[@href='hms/admin']")
	  private WebElement clickOnAdminModule;
	 
	@FindBy(name="username")
	  private WebElement adminUserNameTextField;
	
	@FindBy(name="password")
	  private WebElement adminPasswordTextField;
	
	@FindBy(name="submit")
	  private WebElement adminloginButton;
	
	@FindBy(xpath="(//a[.='Click Here'])[1]")
	  private WebElement clickOnPatModule;
	 
	@FindBy(name="//input[@name='username']")
	  private WebElement patUserNameTextField;
	
	@FindBy(name="//input[@placeholder='Password']")
	  private WebElement patPasswordTextField;
	
	@FindBy(name="submit")
	  private WebElement patloginButton;
	
	//@FindBy(xpath = "//h3[.='Doctors Login']/parent::div[@class='text list_1_of_2']/descendant::a") private WebElement doctorClickHereButton;
	
	//Business Library
	  public void docLoginActions(String docuserName, String docpassword)
	  {
		 // doctorClickHereButton.click();
		  docUserNameTextField.sendKeys(docuserName);
		  docPasswordTextField.sendKeys(docpassword);
		  docloginButton.click();
	  }
	  public void adminLoginActions(String adminusername, String adminpassword) {
		  adminUserNameTextField.sendKeys(adminusername); 
		  adminPasswordTextField.sendKeys(adminpassword);
		  adminloginButton.click();
	  }
	  public void patLoginActions(String patusername, String patpassword) {
		  patUserNameTextField.sendKeys(patusername);
		  patPasswordTextField.sendKeys(patpassword);
		  patloginButton.click();
	  }
	  
	  public void clickDoc() {
		 clickOnDocModule.click();
	  }
	  public void clickAdmin() {
		  clickOnAdminModule.click();
	  }
	  public void clickPat() {
		  clickOnPatModule.click();
	  }
	  
	  public void doctorclick()
	  {}
}
