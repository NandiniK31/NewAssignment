package ContactManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * A sample program that demonstrates how to execute SQL DELETE statement
 * using JDBC. 
 * @author Nandini Kumari
 *
 */
public class DeleteContact {
	public void deleteContact(String name) {
		String dbURL = "jdbc:mysql://localhost:3306/ContactManage";
		String username = "root";
		String password = "root";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "DELETE FROM contacts WHERE name=?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, name);
			
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}
