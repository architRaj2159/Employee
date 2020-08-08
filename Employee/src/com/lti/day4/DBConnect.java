package com.lti.day4;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnect {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//step 1:- Loading the JDBC driver
			//For oracle
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			//Step 2:- Establishing the connection with the database
			
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String user = "system";
			String pass = "21662159";		
					
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Successful!!!!");
			
			
			//Now let's see how to perform SQL operations
			//For ex:- If we want to fire an INSERT/UPDATE/DELETE/SELECT Statement
			//There are 2 ways to do that:- 
			//1. Statement
			//2. PreparedStatement
			
			
			
			/*Statement st = conn.createStatement();
			st.execute("INSERT INTO student VALUES(1, 'Archit', '19-NOV-1997')");*/
			
			
			
			
			
			//The problem with statement object to execute any SQL is
			//1. The database will have to compile the SQL again and again if the same query executes repeatedly
			//2. It's very error prone passing values dynamically in the above case 
			
			
			//The alternative is to use the preparedStatement in which
			//1. The queries are precompiled and kept in the database cache for improved performance
			//2. It's very easy to pass values dynamically in the query
			//3. we use ? symbol as a placeholder for values coming in dynamically in the query
			
			
			
			/*
			PreparedStatement pst = conn.prepareStatement("INSERT INTO student VALUES(?, ?, ?)");
			pst.setInt(1, 222);
			pst.setString(2, " Sarthak ");
			pst.setString(3, "07-SEP-1998");
			pst.executeUpdate();
			*/
			
			
			//For ex:- If we want to call stored procedure or function
			//1. CallableStatement
			
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace(); //detailed report of the exception
		}
		finally{
			try {conn.close();} catch(Exception e) {}
		}
	}

}
