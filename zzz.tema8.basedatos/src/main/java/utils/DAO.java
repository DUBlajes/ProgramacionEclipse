package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
	private static Connection connection;

	private static Statement connect() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql//localhost:3306/petsdam", "root", "Gv3rr3r0160294!");
			return connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	private static void disconnect(Statement smt) {
		try {
		smt.close();
		connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
