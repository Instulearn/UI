package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/java/features", // Feature dosyalarının yolu
        glue = "stepdefinitions",                // Step Definitions'ın yolu
        plugin = {
                "pretty",                         // Konsolda okunabilir loglar
                "html:target/cucumber-reports/cucumber.html", // Cucumber HTML raporu
                "json:target/cucumber-reports/cucumber.json", // JSON raporu (Cucumber HTML için gerekli)
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // Allure raporları için plugin
        },
        monochrome = true,                         // Konsol çıktısını daha okunabilir hale getirir
        tags = "@review",                           // Yalnızca belirtilen etiketli senaryolar çalıştırılır....
        dryRun = false								/* true yaparsanız sadece eksik stepleri
													 	kontrol eder çalıştırmaz, false ise test çalışır */
)
public class ReviewRunner extends AbstractTestNGCucumberTests {
    private static final Logger logger = LogManager.getLogger(ReviewRunner.class);

    @BeforeClass
    public void setup() {
        // Test çalışmaya başlamadan önce loglama yapılır
        logger.info("Cucumber Test Runner başlatılıyor...");
    }
}
