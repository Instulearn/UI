package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.FilizPage;
import utils.ReusableMethods;


public class US_001 {


    WebDriver driver = DriverManager.getDriver();
     FilizPage filizPage = new FilizPage(driver);

    @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {

        driver.get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/");

            ReusableMethods.bekle(3);

    }
    @Then("sayfa başlığı {string} olmalı")
    public void sayfaBasligiOlmali(String beklenenBaslik) {
        String mevcutBaslik = driver.getTitle();
        Assert.assertEquals(mevcutBaslik, beklenenBaslik, "Sayfa başlığı beklenenden farklı!");

    }
}