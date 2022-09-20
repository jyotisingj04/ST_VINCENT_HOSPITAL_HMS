package org.sdet40.genericUtility;

public interface IConstantPath {

	
		
		/**
		* This interface consists of all the external file paths
		* 
		* @author 
		*
		*/
		
		//variable, method name=camelcase
		//Interface, class, enum,annotion=pascal case
		//static final-->capital
		String PROJECT_PATH = System.getProperty("user.dir");
		String EXCEL_PATH = PROJECT_PATH + "/src/test/resources/Admin.xlsx";
		String PROPERTY_FILE_PATH = PROJECT_PATH + "/src/test/resources/commondata.properties";
		String DB_URL = "jdbc:mysql://localhost:3306/tyss";
		String DB_USERNAME = "root";
        String DB_PASSWORD = "root";
		int Implicitly_TIMEOUT = 20;
	    int Explicitly_TIMEOUT = 20;
		}
		
	

