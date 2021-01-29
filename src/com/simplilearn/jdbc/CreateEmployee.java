package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployee {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stm = null;
		try {
			// 1. create/Get Connection
			conn = DBConnection.initConnection();
			// 2. Execute statement
			
			 stm = conn.createStatement();
			
			// 3. Execute query->(1.create query, 2. execute query)
			
			String query= "insert into employees"+
					"(id,first_name,last_name,email,department,salary)"+
					"values (3,'Rogger','Federer','Roger@gmail.com','sports',50000)";
			
			int  rowsAdded= stm.executeUpdate(query);
			System.out.println("Number of rows added : "+ rowsAdded);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(stm!=null) {
				stm.close();
			}
			if(conn!=null) {
				conn.close();
			}
				
		}
	}

}
