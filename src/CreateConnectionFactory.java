

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class CreateConnectionFactory {

	public static Connection buildConnection() throws SQLException {
		String url = "jdbc:postgresql://localhost/loja_virtual?user=postgres&password=231090&ssl=false";
		Connection conn = DriverManager.getConnection(url);
		return conn;
	}
}
