package databaseConnectionTest;

import java.sql.SQLException;

import org.testng.annotations.Test;

import dbConnection.DB2_Connection;

/**
 * @author Hari Karepe
 *
 */
public class Db2Test {

	@Test
	public void dbConnectionDevEnvTest() throws SQLException {
		DB2_Connection.dbConnection();
	}

}
