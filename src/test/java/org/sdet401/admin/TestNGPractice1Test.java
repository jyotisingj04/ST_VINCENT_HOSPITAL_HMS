package org.sdet401.admin;

import org.sdet40.genericUtility.ExcelUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPractice1Test {
@Test(dataProvider="getData")
public void step2Test(String username, String password) {
	System.out.println(Thread.currentThread().getId());
	System.out.println("City----> "+username);
	System.out.println("Pincode----> "+password);
	System.out.println();
}
//@DataProvider
//public Object[][] getData() {
	ExcelUtility excelUtil= new ExcelUtility();
}
//}
