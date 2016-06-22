package com.stocks.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jbossben","Y1tchak");
		} catch (ClassNotFoundException cnfe){
			System.out.println("Missing JDBC Driver");
			cnfe.printStackTrace();
		} catch (SQLException se){
			System.out.println("Connection Failed!");
			se.printStackTrace();
		}
		return conn;
	}
}
