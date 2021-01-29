package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {

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
			
			String query= "delete from employees where id=3";
			
			int  rowsDeleted= stm.executeUpdate(query);
			System.out.println("Number of rows deleted : "+ rowsDeleted);
			
			
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
