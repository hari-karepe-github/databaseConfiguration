package managers;

import dataConfigs.PropConfigs;

/**
 * @author Hari Karepe
 *
 */
public class DB2_Manager {

	public static String jdbcClassName() {
		return PropConfigs.getConfig().getProperty("jdbcClassName") != null
				? PropConfigs.getConfig().getProperty("jdbcClassName")
				: null;
	}

	public static String userName(String username) {
		return PropConfigs.getConfig().getProperty(username) != null ? PropConfigs.getConfig().getProperty(username)
				: null;
	}

	public static String password(String password) {
		return PropConfigs.getConfig().getProperty(password) != null ? PropConfigs.getConfig().getProperty(password)
				: null;
	}

	public static String databaseUrl(String dbServer, String serverName, String port, String dbName) {

		String url = PropConfigs.getConfig().getProperty(dbServer) + "://"
				+ PropConfigs.getConfig().getProperty(serverName) + ":" + PropConfigs.getConfig().getProperty(port)
				+ "/" + PropConfigs.getConfig().getProperty(dbName);
		return url != null ? url : null;

	}

}
