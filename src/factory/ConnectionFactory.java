package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhosts/banco", "root", "password");
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
