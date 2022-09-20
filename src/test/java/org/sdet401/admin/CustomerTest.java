package org.sdet401.admin;

import org.testng.annotations.Test;

public class CustomerTest {
@Test
public void createCustomerTest() {
	System.out.println("execute HDFC createCustomerTest");
	int[]arr= {1,2,3};
	System.out.println(arr[5]);
	
}
@Test(dependsOnMethods = "createCustomerTest")
public void modifyCustomerTest() {
	System.out.println("execute modify HDFC to AIRTEL CustomerTest");
}
@Test(dependsOnMethods = "modifyCustomerTest" )
public void deleteCustomerTest( ) {
	System.out.println("execute delete AIRTEL CustomerTest");
}
}
