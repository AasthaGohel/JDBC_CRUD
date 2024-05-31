package com.capgemini.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/",username,password);
		
		System.out.println("Connection Established");
		
		return con;
		
		}
}
