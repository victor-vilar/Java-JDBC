

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {

		Connection connection = CreateConnectionFactory.buildConnection();
	
		connection.close();
	}

}
