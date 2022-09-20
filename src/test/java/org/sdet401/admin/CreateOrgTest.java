package org.sdet401.admin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateOrgTest {
	@BeforeClass
	public void configBC() {
		System.out.println("===========LAUNCH BROWSER===============");
	}
@BeforeMethod
public void configBM( ) {
	System.out.println("===login===");
}

@Test
public void createOrgTest() {
	System.out.println("navigate to org module");
	System.out.println("create org");
	System.out.println("verify");
}
@Test
public void createOrgWithIndustriesTest() {
	System.out.println("navigate to org module");
	System.out.println("create org with industries");
	System.out.println("verify");
}
@Test
public void createOrgWithRatingTest() {
	System.out.println("navigate to org module");
	System.out.println("create org with rating");
	System.out.println("verify");
}
@AfterMethod
public void configAM() {
	System.out.println("==LOGOUT==");
}
@AfterClass
public void configAC() {
	System.out.println("============CLOSE THE BROWSER");
}
}
