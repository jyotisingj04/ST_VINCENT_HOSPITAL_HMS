package org.sdet401.admin;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGPracticeTest {
	//if we are having more than 20 steps in tc --> storing all the testcases in module wise package -->className=testcasename,testAnnotationMethodName=stepName
	//if we are having 5 to 10 steps in tc--> storing all the testcases in single package-->className=modulename,testAnnotationMethodName=testcaseName
	
@Test(groups="regression",retryAnalyzer = org.sdet40.genericUtility.RetryImplementation.class)
public void step1Test() {
	Assert.fail();
	System.out.println("test1");
	
}
@Test(groups= {"sanity","regression"})
public void step2Test( ) {
	System.out.println("jyoti--> test2");
}
}
