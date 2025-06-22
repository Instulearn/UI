package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AlpayPage;
import utils.JSUtilities;
import utils.ReusableMethods;

public class US_013 {

    WebDriver driver = DriverManager.getDriver(); // fetch current thread's driver

    @When("{string} kartinin gorunur olup olmadigini kontrol eder.")
    public void kartinin_gorunur_olup_olmadigini_kontrol_eder(String validate) {

        WebElement kart = new AlpayPage(driver).validateCard;
        JSUtilities.scrollToVisibleElement(driver, kart);
        ReusableMethods.bekle(2);

        if (!kart.isDisplayed()) {
            throw new AssertionError("Kart görünür değil: " + validate);
        }
    }
    @Then("Validate Certificate kartina tiklar")
    public void kartin_uzerine_tiklar() {
        WebElement kart = new AlpayPage(driver).validateCard;
        kart.click();
        ReusableMethods.bekle(2);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/certificate_validation");
    }

    @When("{string} kartinin sayfada gorunur olup olmadigini kontrol eder.")
    public void kartininSayfadaGorunurOlupOlmadiginiKontrolEder(String reserve) {

        WebElement kart = new AlpayPage(driver).reserveAMeetingCard;
        JSUtilities.scrollToVisibleElement(driver, kart);
        ReusableMethods.bekle(2);

        if (!kart.isDisplayed()) {
            throw new AssertionError("Kart görünür değil: " + reserve);
        }

    }

    @Then("Reserve a meeting kartina tiklar")
    public void reserveAMeetingKartinaTiklar() {
        WebElement kart = new AlpayPage(driver).reserveAMeetingCard;
        kart.click();
        ReusableMethods.bekle(2);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/instructors");
    }
    //deneme saat 3:02 jenkins merge calisiyor ama merge edenin instulearn olmasi gerekiyor.
}
