package ConnectionManagerExample;

import java.sql.SQLException;

public class SingletonClassTest {

	public static void main(String[] args) throws SQLException {
		ConnectionManager connectionManager = ConnectionManager.getInstance();
		connectionManager.view();

	}

}
