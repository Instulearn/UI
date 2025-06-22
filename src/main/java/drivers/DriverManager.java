package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		if (driver.get() == null) {
			String browser = config.ConfigReader.getProperty("browser").toLowerCase();
			switch (browser) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver.set(new ChromeDriver());
					break;
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver.set(new FirefoxDriver());
					break;
				case "edge":
					WebDriverManager.edgedriver().setup();
					driver.set(new EdgeDriver());
					break;
				case "safari":
					WebDriverManager.safaridriver().setup();
					driver.set(new SafariDriver());
					break;
				default:
					throw new IllegalArgumentException("Unsupported browser: " + browser);
			}

		}
		return driver.get();
	}

	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}
}
