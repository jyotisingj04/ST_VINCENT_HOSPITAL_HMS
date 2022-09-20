package org.HMS.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	@FindBy (xpath = "//span[@class='username']")
	private WebElement dropDownForLogout;
	@FindBy (xpath = "//a[contains(text(),'Log Out')]")
	private WebElement logout;


	public CommonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	//business library
	//public void logoutDropdown() {
	//	dropDownForLogout.click();
	//}
	//public void logoutBtn() {
	//	logout.click();
	//}
	public void logoutActivity() {
		dropDownForLogout.click();
		logout.click();
}
}
