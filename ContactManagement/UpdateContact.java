package ContactManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * A sample program that demonstrates how to execute SQL UPDATE statement
 * using JDBC.
 * @author Nandini Kumari
 *
 */
public class UpdateContact {
	public void updateContact(String name,String organisation, String phoneNumber, String address) {
		String dbURL = "jdbc:mysql://localhost:3306/ContactManage";
		String username = "root";
		String password = "root";

		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			String sql = "UPDATE contacts SET organisation=?, phoneNumber=?, address=? WHERE name=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, organisation);
			statement.setString(2, phoneNumber);
			statement.setString(3, address);
			statement.setString(4, name);

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing Conatct was updated successfully!");
			}else {
				System.out.println("An existing Conatct was found for name"+name);
			}


		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}