package org.sdet401.admin;

import org.sdet40.genericUtility.WebDriverUtility;
import org.testng.annotations.Test;

public class MavenPracticeTest {
@Test(groups="sanity")
public void step1Test() {
	String browser = System.getProperty("b");
	String url = System.getProperty("u");
	
	System.out.println("Browser name is ====>>>>>>>   "+browser);
	System.out.println("URL is ======>>>>>>   "+url);
	
	WebDriverUtility webUtility=new WebDriverUtility();
	webUtility.openBrowserWithApplication(browser, url); 
	
	
}
}
