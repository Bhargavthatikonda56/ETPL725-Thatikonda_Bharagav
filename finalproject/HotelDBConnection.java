package com.evergent.corejava.bhargav.finalproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class HotelDBConnection {
	public static Connection getConnection() throws Exception
	{
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evergentdb","root","admin"); 
		  return conn;
	}

}
