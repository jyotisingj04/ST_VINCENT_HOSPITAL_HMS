package org.sdet401.admin;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HMSTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		driver.findElement(By.xpath("//h3[text()='Admin Login']/following-sibling::div//a[text()='Click Here']")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.xpath(""))
		//driver.findElement(By.xpath(""))
		
		
		//List<WebElement> headerList = driver.findElements(By.xpath(""))
		List<WebElement> doctorNameList = new ArrayList<WebElement>();
		//for(int i=0; i<headerList.size(); i++)
		{
			// String headerName = headerList.get(i).getText();
			 //if(headerName.equals("Doctor Name")) {
				 doctorNameList = driver.findElements(By.xpath(""));
				// break;
			 }
		//}
		for(WebElement doctor:doctorNameList) {
			System.out.println(doctor.getText());
		}
	}

}
