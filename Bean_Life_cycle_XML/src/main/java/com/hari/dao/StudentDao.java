package com.hari.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao {
	
	private String driver;
	private String url;
	private String user;
	private String password;
	Connection con;
	
	public void setDriver(String driver) {
		System.out.println("setting driver");
		this.driver = driver;
	}

	public void setUrl(String url) {
		System.out.println("setting URL");
		this.url = url;
	}

	public void setUser(String user) {
		System.out.println("setting user");
		this.user = user;
	}

	public void setPassword(String password) {
		System.out.println("setting password");
		this.password = password;
	}
	
	//@PostConstruct
    public void init()
	{
		System.out.println("Inside init");
		createDBConnection();
	}
	
	public void createDBConnection()
	{
		try
		{
		Class.forName(driver);
		con=DriverManager.getConnection(url, user, password);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectRows()
	{
		try
		{
		//createDBConnection();
		Statement s=con.createStatement();
		String sql="select*from student";
		 ResultSet rs=s.executeQuery(sql);
		 while(rs.next())
		 {
			 System.out.println(rs.getString("sname")+" "+rs.getInt("fees")+"  "+rs.getString("foodType"));
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void deleteStudent(int id)
	{
		try
		{
		//createDBConnection();
		Statement s=con.createStatement();
		String sql="delete from student where id="+id;
		s.executeUpdate(sql);
		System.out.println("Record deleted for id"+id);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	
  //@PreDestroy
	public void destroy() throws SQLException
	{
	  System.out.println("Inside destroys");
		closeConnection();
	}
	
	public void closeConnection() throws SQLException
	{
		con.close();
	}
}
