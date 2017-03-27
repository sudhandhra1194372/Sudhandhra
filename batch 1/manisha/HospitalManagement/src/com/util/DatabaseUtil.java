package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {

	 public static final String url="jdbc:oracle:thin:@inchnilpdb03.India.TCS.com:1521:JavaDB03";
	 public static final String user="E1194372";
	 public static final String password="E1194372";
	
	 static PreparedStatement ps=null;
	 static ResultSet rs=null;
	 static Connection con=null;
	 
	 public static Connection getConnection(){
		 try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection(url, user, password);
			
			 
		 }
		 catch(Exception ex){
			 ex.printStackTrace();
		 }
		 return con;
		 
	 }
	 
	 public void closeConnection(Connection con){
		 
		 try {
			 if(con!=null){
			con.close();
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	 
	 public void closePreparedstat(PreparedStatement ps){
		 
			 try {
				 if(ps!=null){
				ps.close();
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 }
	 public void closeResult(ResultSet rs){
		 
		 try {
			 if(rs!=null){
			rs.close();
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
}

