package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

		private static final String dbURL = "jdbc:mysql://localhost:3306/magshop";
		private static final String user = "root";
		private static final String password = "root";

		private static Connection myConn;

		private JDBCUtils() {
		}

		public static Connection getConnection() {
			if (myConn == null) {
				try {
					myConn = DriverManager.getConnection(dbURL, user, password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return myConn;
		}

}
