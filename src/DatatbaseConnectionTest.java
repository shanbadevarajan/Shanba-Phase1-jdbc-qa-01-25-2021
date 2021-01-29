import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatatbaseConnectionTest {

	public static void main(String[] args) {
	
		try {
					
			String url="jdbc:mysql://localhost:3306/emsystem";
			String username="root";
			String password="root";
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create/Get Connection
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connection Successful !");
			
		} catch (SQLException e) {
			System.out.println("DB Connection Failure !");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
		}
		
		
		

	}

}

