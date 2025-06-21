package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AlpayPage;
import utils.JSUtilities;
import utils.ReusableMethods;

public class US_043 {
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
    //deneme pushu
}
