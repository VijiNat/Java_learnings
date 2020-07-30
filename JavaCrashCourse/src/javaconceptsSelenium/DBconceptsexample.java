package javaconceptsSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconceptsexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Mention the type of DB to be used
		//Create connection with the DB by giving the details
		//Create a statement
		//Execute a query
		//Store the result in result set
		//Get the results from result set		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection cnxn = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_users");
		Statement stmnt = cnxn.createStatement();
		ResultSet results= stmnt.executeQuery("SELECT * FROM superhero_users_table");
		
		while(results.next()) {
			System.out.println("Name: "+results.getString(1)+ " || Nickname: "+results.getString(2));
		}
			

	}

}
