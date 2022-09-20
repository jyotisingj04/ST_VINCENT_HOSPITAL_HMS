package org.sdet401.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AdminToDoctor {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Admin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Admin");
		String url = sheet.getRow(1).getCell(0).toString();
		String usn = sheet.getRow(1).getCell(1).toString();
		String loginpwd = sheet.getRow(1).getCell(2).toString();
		String docusn = sheet.getRow(2).getCell(1).toString();
		String docloginpwd = sheet.getRow(2).getCell(2).toString();
		String docName = sheet.getRow(1).getCell(3).toString();
		String clinicadd = sheet.getRow(1).getCell(4).toString();
		String docfee = sheet.getRow(1).getCell(5).toString();
		String doccont = sheet.getRow(1).getCell(6).toString();
		String email = sheet.getRow(1).getCell(7).toString();
		String passwd = sheet.getRow(1).getCell(8).toString();
		String cpass = sheet.getRow(1).getCell(9).toString();
		String updatedocfee = sheet.getRow(2).getCell(4).toString();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("password")).sendKeys(loginpwd);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("(//div[@class='item-inner'])[2]")).click();
		driver.findElement(By.xpath("//span[text()=' Add Doctor']")).click();
		WebElement ad = driver.findElement(By.name("Doctorspecialization"));
		Select s = new Select(ad);
		s.selectByIndex(2);
		driver.findElement(By.name("docname")).sendKeys(docName);
		driver.findElement(By.name("clinicaddress")).sendKeys(clinicadd);
		driver.findElement(By.name("docfees")).sendKeys(docfee);
		driver.findElement(By.name("doccontact")).sendKeys(doccont);
		driver.findElement(By.id("docemail")).sendKeys(email);
		driver.findElement(By.name("npass")).sendKeys(passwd);
		driver.findElement(By.name("cfpass")).sendKeys(cpass);
		driver.findElement(By.id("submit")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//span[@class='username']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(docusn);
		driver.findElement(By.name("password")).sendKeys(docloginpwd);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("(//a[@href='edit-profile.php'])[2]")).click();
		driver.findElement(By.name("docfees")).sendKeys(updatedocfee);
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//span[@class='username']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("password")).sendKeys(loginpwd);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//a[@href='manage-doctors.php']")).click();
		Thread.sleep(1000);    //setting dropdown is not working
		driver.close();
				}
		
	}


