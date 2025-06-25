package stepdefinitions;

import context.ScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import drivers.DriverManager;
import org.testng.asserts.SoftAssert;
import utils.LoggerHelper;
import utils.ReusableMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class Hooks {

	@Before
	public void setUp(Scenario scenario) {
		LoggerHelper.info("Test Başlıyor: " + scenario.getName());

		WebDriver driver = DriverManager.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		LoggerHelper.info("Driver başlatıldı");
	}

	@After
	public void afterScenario() {
		SoftAssert softAssert = ScenarioContext.softAssert.get();
		try {
			softAssert.assertAll();
		} finally {
			ScenarioContext.softAssert.remove(); // Clean up
		}
	}




	@After
	public void tearDown(Scenario scenario) {
		WebDriver driver = DriverManager.getDriver();

		if (scenario.isFailed()) {
			LoggerHelper.error("Test başarısız oldu: " + scenario.getName());
			try {
				// Save screenshot to disk and get a path
				String screenshotPath = ReusableMethods.getScreenshot("FailedScenario_" + scenario.getName());

				// Attach screenshot to a Cucumber report
				Path path = Paths.get(screenshotPath);
				byte[] screenshotBytes = Files.readAllBytes(path);
				scenario.attach(screenshotBytes, "image/png", "Failure Screenshot");

				LoggerHelper.info("Ekran görüntüsü alındı ve rapora eklendi: " + screenshotPath);
			} catch (IOException e) {
				LoggerHelper.error("Ekran görüntüsü alınırken hata oluştu: " + e.getMessage());
			}
		} else {
			LoggerHelper.info("Test başarıyla tamamlandı: " + scenario.getName());
		}

		DriverManager.quitDriver();
		LoggerHelper.info("Driver kapatıldı.");
	}
}