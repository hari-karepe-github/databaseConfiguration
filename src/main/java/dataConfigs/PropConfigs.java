package dataConfigs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Hari Karepe
 *
 */
public class PropConfigs extends Properties {

	private static final long serialVersionUID = 1314087300250077629L;

	private static PropConfigs instance;

	private PropConfigs() {
		try (InputStream input = new FileInputStream(".//src/test/resources/Data/db2.properties")) {
			super.load(input);
			input.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static PropConfigs getConfig() {
		if (instance == null) {
			synchronized (PropConfigs.class) {
				if (instance == null) {
					instance = new PropConfigs();
				}
			}

		}
		return instance;
	}

	public String getProperty(String key) {
		return super.getProperty(key) != null ? super.getProperty(key) : null;
	}

}
