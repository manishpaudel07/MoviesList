package com.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	private static String USER_NAME ="root";
	private static String USER_PASSWORD ="Mach0427$";
	private static String JDBC_URL ="jdbc:mysql://localhost:3306/movies";
	private static String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";

 public static Connection getConn() throws Exception {
	 Class.forName(JDBC_DRIVER);
	 Connection connection=DriverManager.getConnection(JDBC_URL,USER_NAME,USER_PASSWORD );
	 return connection;
 }
}
