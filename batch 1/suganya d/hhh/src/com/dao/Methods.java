package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import com.beans.Hospital_Beans;
import com.util.DatabaseUtil;

public class Methods {
		
	DatabaseUtil util=new DatabaseUtil();
	
	public String daoHome(String username,String password) throws Exception
	{
		Connection con=util.getConnection();
		String user_name=null;
		
		try
		{
			String query="select * from hospital where user_name=? and password=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			 user_name=rs.getString(1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user_name;
	}
	public ArrayList<Hospital_Beans> daoSuccess(String username) throws Exception
	{
		Connection con=util.getConnection();
		ArrayList<Hospital_Beans> alist=new ArrayList<Hospital_Beans>();
		
		
		
			
			try
			{
				String query="select * from hospital where user=?";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1, username);
				
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					alist.add(new Hospital_Beans(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getLong(6),rs.getString(7)));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return alist;
	}
	public int daoCreate(String name,int age,String gender,String marital_status,long phone_number,String disease_type,String username,String password) throws Exception
	{
		Connection con=util.getConnection();
		int count=0;
		try
		{
			String query="insert into hospital values(h_name.nextval,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(2, name);
			pst.setInt(3, age);
			pst.setString(4, gender);
			pst.setString(5, marital_status);
			pst.setLong(6, phone_number);
			pst.setString(7, disease_type);
			pst.setString(8,username);
			pst.setString(9,password);
			count=pst.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
}
