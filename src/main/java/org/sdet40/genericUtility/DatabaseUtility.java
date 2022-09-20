package org.sdet40.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	Connection connection;
	public List<String> getDataFromDatabase(String query, String columnName) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(query);
		List<String> list=new ArrayList<>();
		while(result.next()) {
			list.add(result.getString(columnName));
		}
		return list;
	}
	
	public void openDBConnection(String dbURL, String dbUserName, String dbPassword) throws SQLException {
		Driver dbdriver=new Driver();
		DriverManager.registerDriver(dbdriver);
		connection= DriverManager.getConnection(dbURL, dbUserName, dbPassword);
	}
	public void closeDB() throws SQLException {
		connection.close();
	}
	public void modifyDataIntoDB(String query) throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);  //update and insert both possible here
	}
	public boolean verifyDataInDatabase(String query,String columnName,String expectedData) throws SQLException {
		List<String> list = getDataFromDatabase(query, columnName);
		boolean flag=false;
		for(String actualData:list) {
			if(actualData.equalsIgnoreCase(expectedData)) {
				flag=true;
				break;
			}
		}
		return flag;
	}
}
	
	//Driver dbdriver=new Driver();
   // DriverManager.registerDriver(dbdriver);
    //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
   // try {
  	 // Statement statement = connection.createStatement();
    //int result = statement.executeUpdate("insert into sdet401 values(1003,'kiran',8843921,'Bangalore');");
    //System.out.println("Data updated successfully");
      // }
       //finally {
      	// connection.close();  
//}
