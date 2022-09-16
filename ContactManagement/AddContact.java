package ContactManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * A sample program that demonstrates how to execute SQL INSERT statement
 * using JDBC. 
 * @author Nandini Kumari
 *
 */
public class AddContact {
	public void addContact(String name,String organisation, String phoneNumber, String address) {
		String dbURL = "jdbc:mysql://localhost:3306/ContactManage";
		String username = "root";
		String password = "root";
		
		try (
			Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "INSERT INTO contacts (name, organisation, phoneNumber, address) VALUES (?, ?, ?, ?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, organisation);
			statement.setString(3, phoneNumber);
			statement.setString(4, address);
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new contact was inserted successfully!");
			}

			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}
