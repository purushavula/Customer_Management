package com.techpalle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.techpalle.module.Customer;

public class DataAccess
{
	//static HashMap <String,String> hm=new HashMap <String,String>();
	private static final String dburl="jdbc:mysql://localhost:3306/jdbc";
	private static final String dbusername="root";
	private static final String dbpassword1="purush";
	private static Connection con=null;
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;

	
	private static final String insertqry="insert into Customer(name,email,pass,mobile,state) values(?,?,?,?,?)";
	private static final String validateqry=" select email,pass from Customer where email= ? and pass=?";
	public static boolean validateCustomer(String email,String pass)
	{
		boolean b=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(dburl, dbusername, dbpassword1);
			ps=con.prepareStatement(validateqry);
			ps.setString(1, email);
			ps.setString(2, pass);

			 rs=ps.executeQuery();
			b=rs.next();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) 
			{
				try {
					rs.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
			}
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
		}
		return b;
		
		
		

	 
}



			


		
		
	


	public static void insertCustomer(Customer c)
	{
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection(dburl, dbusername, dbpassword1);
						ps=con.prepareStatement(insertqry);
						ps.setString(1, c.getName());
						ps.setString(2, c.getEmail());
						ps.setString(3, c.getPass());
						ps.setLong(4, c.getMobile());
						ps.setString(5, c.getState());
						ps.executeUpdate();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					finally {
						if(ps!=null) {
							try {
								ps.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
							
						}
						if(con!=null) {
							try {
								con.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						
						
					}
					
					
					
			
				 
}























	
						
		
		
}


	