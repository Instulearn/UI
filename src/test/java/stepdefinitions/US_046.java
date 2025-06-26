package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.AlpayPage;

public class US_046 {

    WebDriver driver = DriverManager.getDriver(); // fetch current thread's driver
    AlpayPage alpayPage = new AlpayPage(driver);

    @Given("Sil")
    public void sil(){

    }

}
