package com.util;
import java.sql.*;

public class DatabaseUtil {
	static Connection con=null;
	static PreparedStatement pst=null;
	static ResultSet rs=null;
	
	static String url="jdbc:oracle:thin:@" +  "inchnilpdb03.India.TCS.com" + ":" + "1521" + ":" + "JavaDB03";
	static String username="E1194372";
	static String password="E1194372";
	
	public static Connection getConnection() throws SQLException,ClassNotFoundException
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url,username,password);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void closePrepared(PreparedStatement p)throws SQLException,ClassNotFoundException
	{
		try
		{
		if(p!=null)
			p.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void closeResultSet(ResultSet rs)throws SQLException,ClassNotFoundException
	{
		try
		{
		if(rs!=null)
			rs.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void closeConnection(Connection con)throws SQLException,ClassNotFoundException
	{
		try
		{
		if(con!=null)
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
