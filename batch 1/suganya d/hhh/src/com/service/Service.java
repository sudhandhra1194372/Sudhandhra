package com.service;

import java.util.ArrayList;

import com.beans.Hospital_Beans;
import com.dao.Methods;

public class Service {

	Methods objDao=new Methods();
	
	
	public String serviceHome(String username,String password) throws Exception
	{
		String user_name=objDao.daoHome(username,password);
		return user_name;
	}
	
	public ArrayList<Hospital_Beans> serviceSuccess(String username) throws Exception
	{
		return objDao.daoSuccess(username);
	}
	
	public int  serviceCreate( String name, int age,
			String gender, String marital_status, long phone_number,
			String disease_type,String username,String password) throws Exception
	{
		return objDao.daoCreate(   name,  age,
				 gender,  marital_status,  phone_number, disease_type,username,password);
	
	}
}
