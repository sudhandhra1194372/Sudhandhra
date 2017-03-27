package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beans.Hospital_Beans;

public class dao {
	static Connection con=null;
	static PreparedStatement ps =null;
	static ResultSet rs=null;
	static com.util.DatabaseUtil du=new com.util.DatabaseUtil();
			
public static int createmovie(Hospital_Beans h)throws SQLException,ClassNotFoundException {
		
		int no=-1;
		
		try{
			con=com.util.DatabaseUtil.getConnection();
			
			ps=con.prepareStatement("insert into hospit values(h_name.nextval,?,?,?,?,?,?)");
			ps.setString(1, h.getName());
			ps.sets
			
			
			int x=ps.executeUpdate();
			

			if(x>0){
				
				
				ps=con.prepareStatement("select s_name.currval from dual");
				rs=ps.executeQuery();
				while(rs.next()){
					no=rs.getInt(1);
				}
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			du.closePreparedstat(ps);
			du.closeConnection(con);
		}return no;
	}
	
}
