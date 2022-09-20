package org.sdet40.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	private WebDriver driver;
	/**
	 * it's an implicitly wait Always wait for Element in DOM document & release the
	 * control if element available
	 */

	public void waitForElementInDOM(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IConstantPath.Implicitly_TIMEOUT));
	}
	/**
	 * it's an Explicitly wait Always wait for Page to be loaded & available in GUI
	 */
	//public void waitForPage(WebDriver driver, String partialPageURL) {
	//WebDriverWait wait = new WebDriverWait(driver, IConstantPath.Explicitly_TIMEOUT);
	//wait.until(ExpectedConditions.urlContains(partialPageURL));
	//}
	/**
	 * it's an Explicitly wait Always wait for Page to be loaded & available in GUI
	 */
	//public void waitForElement(WebDriver driver, WebElement element) {
	//WebDriverWait wait = new WebDriverWait(driver, IConstantPath.Explicitly_TIMEOUT);
	//wait.until(ExpectedConditions.visibilityOf(element));
	//}
	/**
	 * used to Switch to Any Window based on Window Title
	 */
	//	public void swithToWindow(WebDriver driver, String partialWindowTitle) {
	//		Set<String> set = driver.getWindowHandles();
	//		Iterator<> it= set.iterator();
	//		while (it.hasNext()) {
	//		String wID = it.next();
	//		driver.switchTo().window(wID);
	//		String currentWindowTitle = driver.getTitle();
	//		if (currentWindowTitle.contains(partialWindowTitle)) {
	//		break;
	//		}
	//	}
	//}
	/**
	 * used to Switch to Alert Window & click on OK button
	 */
	public void swithToAlertWindowAndAccpect(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		//		if (alt.getText().trim().equalsIgnoreCase(expectedMsg.trim())) {
		//		System.out.println("Alert Message is verified");
		//		} else {
		//		System.out.println("Alert Message is not verified");
		//		}
		alt.accept();
	}
	/**
	 * used to Switch to Alert Window & click on Cancel button
	 */
	public void swithToAlertWindowAndCancel(WebDriver driver, String expectedMsg) {
		Alert alt = driver.switchTo().alert();
		//	if (alt.getText().equals(expectedMsg)) {
		//		System.out.println("Alert Message is verified");
		//		} else {
		//		System.out.println("Alert Message is not verified");
		//	}
		alt.dismiss();
	}
	/**
		4
	 * used to Switch to Frame Window based on index
	 */
	public void swithToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * used to Switch to Frame Window based on id or name attribute
	 */
	public void swithToFrame(WebDriver driver, String id_name_attribute) {
		driver.switchTo().frame(id_name_attribute);
	}
	/**
	 * used to select the value from the dropDwon based on index
	 */
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * used to select the value from the dropDwon based on value / option available
	 * in GUI
	 */
	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * used to place mouse cursor on specified element
	 */
	public void mouseOverOnElement(WebDriver driver, WebElement elemnet) {
		Actions act = new Actions(driver);
		act.moveToElement(elemnet).perform();
	}
	/**
	 * used to right click on specified element
	 */
	public void rightClickOnElement(WebDriver driver, WebElement elemnet) {
		Actions act = new Actions(driver);
		act.contextClick(elemnet).perform();
	}
	public void executeJavaScript(WebDriver driver, String javaScript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript(javaScript, null);
	}
	public void waitAndClick(WebElement element) throws InterruptedException {
		int count = 0;
		while (count < 20) {
			try {
				element.click();
				break;
			} catch (Throwable e) {
				Thread.sleep(1000);
				count++;
			}
		}
	}
	/**
	 * pass enter Key appertain in to Browser
	 */
	public void passEnterKey(WebDriver driver) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	/**
	 * LAUNCHING THE BROWSER
	 */
	public WebDriver launchingBrowser(String browser) {
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
			break;
		default:
			System.out.println("you entered wrong browser key");
		}
		return driver;
	}
	/**
	 * this method is used to maximize window
	 */
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to open the application using url
	 */
	public WebDriver openApplication(String url) {
		driver.get(url);
		return driver;
	}
	/**
	 * this method is used to close the browser
	 */
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

	public WebDriver openBrowserWithApplication(String browser,String url)
	{
		driver = launchingBrowser(browser);
		maximizeWindow();
		openApplication(url);
		return driver;

	}
	public String screenShot(WebDriver driver,JavaUtility ju,String className ) throws IOException {
		String currentTime = ju.currentTime();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+className+"_"+currentTime+".png");
		FileUtils.copyFile(src, dst);
		
		return dst.getAbsolutePath();
	}
	
	public String screenShot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		String tempPath = ts.getScreenshotAs(OutputType.BASE64);
		return tempPath;
	}
}

