package ContactManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SearchContactByName {
	public List<Contact> searchContactByName(String prefix) {
		String dbURL = "jdbc:mysql://localhost:3306/ContactManage";
		String username = "root";
		String password = "root";
		List<Contact> contactList =  new LinkedList();

		try (
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		Statement statement = conn.createStatement();) {

			String sql =  "SELECT * FROM contacts WHERE name LIKE '%"+prefix+"%'";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				Contact contact =new Contact();
				contact.setName(rs.getString("name"));
				contact.setOrganisation(rs.getString("organisation"));
				contact.setPhoneNumber(Arrays.asList(rs.getString("phoneNumber")));
				contact.setAddress(Arrays.asList(rs.getString("address")));
				contactList.add(contact);  
	         }
	         rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return contactList;
	}
}
