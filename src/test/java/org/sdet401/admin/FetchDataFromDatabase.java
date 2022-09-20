package org.sdet401.admin;

import java.sql.SQLException;
import java.util.List;

import org.sdet40.genericUtility.DatabaseUtility;
import org.sdet40.genericUtility.IConstantPath;

public class FetchDataFromDatabase {
  //for DQL STATEMENT
	public static void main(String[] args) throws SQLException {
		DatabaseUtility databaseUtil=new DatabaseUtility();
		databaseUtil.openDBConnection(IConstantPath.DB_URL, "root", "root");
		List<String> data=databaseUtil.getDataFromDatabase("select * from sdet401;", "emp_name");
	//List<String> data1 = databaseUtil.getDataFromDatabase("select * from sdet401;", "emp_name");
	//List<String> data2 = databaseUtil.getDataFromDatabase("select * from sdet401;", "emp_name");
		boolean status = databaseUtil.verifyDataInDatabase("select * from sdet401;", "emp_name", "kiran");
		//databaseUtil.modifyDataIntoDB("insert into sdet401 values(1007,'kumuda',12340890,'bangalore');");
		databaseUtil.modifyDataIntoDB(" update sdet401 set emp_name='Aashi' where emp_id=1002;");
		System.out.println(status);
		System.out.println(data);
	//System.out.println(data1);
	//System.out.println(data2);
		//databaseUtil.closeDB();
	}
}