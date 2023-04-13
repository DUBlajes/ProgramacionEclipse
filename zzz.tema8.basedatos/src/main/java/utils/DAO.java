package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
	private static Connection connection;

	private static Statement connect() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/petsdam", "root", "Gv3rr3r0160294!");
			return connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public static int insert(String query) throws SQLException {
		Statement querier = connect();
		System.out.println(query);
		int ret = querier.executeUpdate(query);

		disconnect(querier);
		return ret;
	}

	public static int delete(String table) throws SQLException {
		Statement querier = connect();
		System.out.println("delete from ");
		int ret = querier.executeUpdate("delete from "+table+" where ");
		//TODO MEJORAR CUANDO VEAMOS MAPAS
		disconnect(querier);
		return ret;
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
