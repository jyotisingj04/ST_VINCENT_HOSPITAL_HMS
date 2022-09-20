package org.sdet401.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// step1: convert the physical file into Java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		
		//STEP2: CREATE THE OBJECT FOR PROPERTIES
		Properties property = new Properties();
		
		//step3: load all the keys
		property.load(fis);
		
		//step4: fetch the data
		String url = property.getProperty("url").trim();
		String browser = property.getProperty("browser").trim();
		
		System.out.println(url);
		System.out.println(browser);
		

	}

}
