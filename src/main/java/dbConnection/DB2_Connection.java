package dbConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.ibm.db2.jcc.am.Connection;

import dataConfigs.PropConfigs;
import managers.DB2_Manager;


public class DB2_Connection {
	public static void dbConnection() throws SQLException {

		Connection connection = null;
		try {
			// Load class into memory
			Class.forName(DB2_Manager.jdbcClassName());
			// Establish connection
			connection = (Connection) DriverManager.getConnection(
					DB2_Manager.databaseUrl("dataBaseServer", "serverName", "port", "databaseName"),
					DB2_Manager.userName("username"), DB2_Manager.password("password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				if (connection.databaseName_.equals(PropConfigs.getConfig().getProperty("databaseName")))
					System.out.println(connection.databaseName_ + " DB connected successfully");
				else
					throw new SQLException();
			}

			if (connection.open_)
				System.out.println(
						"defaultClientAccountingInformation	: " + connection.defaultClientAccountingInformation_);
			System.out.println(
					"defaultClientApplicationInformation	: " + connection.defaultClientApplicationInformation_);
			System.out.println("defaultSetClientWorkstationName		: " + connection.defaultSetClientWorkstationName_);

			connection.close();

			if (connection.isClosed())
				System.out.println("Connection closed.");
			else
				throw new SQLException();
		}

	}

}
