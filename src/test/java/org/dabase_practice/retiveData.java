package org.dabase_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class retiveData {

	public static void main(String[] args) throws SQLException {
		Connection conncetion = null;
		Driver driver = new Driver();
		try {
			conncetion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
			Statement statement = conncetion.createStatement();
			//for CRUD change executeQuery to excuteUpdate
			ResultSet result = statement.executeQuery("select * from employee");

			while (result.next())
				System.out.println(result.getString("emp_name"));

		} finally {
			conncetion.close();
		}

	}

}
