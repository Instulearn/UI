package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utils.ReusableMethods;

public class Anasayfa {

    WebDriver driver = DriverManager.getDriver(); // fetch current thread's driver

    @Given("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        driver.get(ConfigReader.getProperty("url"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/");
    }

    @Given("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        driver.get(ConfigReader.getProperty("loginUrl"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/login");
    }

    @Given("kullanici {string} ve {string} ile login olur")
    public void kullanici_login_olur(String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
        System.out.println(email + "  " + password);

        ReusableMethods.bekle(2);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/panel");

    }

}
