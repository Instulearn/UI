package pages;

import config.ConfigReader;
import drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
	protected WebDriver driver = DriverManager.getDriver();
	protected WebDriverWait wait;

	// Constructor
	public BasePage(WebDriver driver) {

        // Timeout değerini config'den alddd
		String timeoutValue = ConfigReader.getProperty("timeout");
		if (timeoutValue == null || timeoutValue.isEmpty()) {
			throw new RuntimeException("Timeout value is not set or invalid in config.properties!");
		}

		// WebDriverWait başlat
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(Integer.parseInt(timeoutValue)));

		// PageFactory ile elementleri başlat
		PageFactory.initElements(this.driver, this);
	}

	// Click methodu
	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	// Type (metin yazma) methodu
	public void type(WebElement element, String text) {
		if (element != null && text != null) {
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
			System.out.println("Typed text: " + text);
		} else {
			System.out.println("Element or text is null");
		}
	}
}
