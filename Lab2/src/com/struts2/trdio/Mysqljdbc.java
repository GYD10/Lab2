package com.struts2.trdio;

import java.sql.*;
import java.util.Properties;
public class Mysqljdbc {
	public static void main (String args[]) throws SQLException{
		Driver driver=new com.mysql.jdbc.Driver();
		String url="jdbc:mysql://localhost:3306/bookdb";
		Properties info=new Properties();
		info.put("user", "root");
		info.put("password", "123456");
		Connection conn=driver.connect(url,info);
		System.out.println(conn);
	}
}
