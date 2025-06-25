package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserConfigReader {
	private static Properties properties;
	//Kisisel verilerimizi surekli girmemek adina olusturulmustur
	//detay hakkinda bilgi almak icin kerem / furkan
	static {
		try {
			FileInputStream fis = new FileInputStream("src/main/resources/userconfig.properties");
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Config file could not be loaded!");
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}
