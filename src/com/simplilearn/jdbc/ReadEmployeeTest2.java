package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// 1. create/Get Connection
					Connection conn = DBConnection.initConnection();
					
					
					// 2. Execute statement
					
					Statement stm = conn.createStatement();
					
					// 3. Execute query->(1.create query, 2. execute query)
					
					String query= "select * from employees";
					
					ResultSet rest= stm.executeQuery(query);
					
					while(rest.next())
					{
						System.out.println(rest.getInt("id")+ " " +
											rest.getString("first_name")+ " "+
											rest.getString("last_name")+ " "+
											rest.getString("email")+ " "+
											rest.getString("department")+ " "+
											rest.getDouble("Salary"));								
					}
					
				} catch (SQLException e) {
					System.out.println("DB Connection Failure !");
				} 	

			
}

}
