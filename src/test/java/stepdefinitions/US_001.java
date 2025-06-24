package stepdefinitions;


import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.FilizPage;

import java.sql.Driver;

public class US_001  {
    WebDriver driver = DriverManager.getDriver();
    FilizPage filizPage = new FilizPage(driver);


    @Given("Kullanıcı ana sayfaya gider")
    public void kullanıcı_ana_sayfaya_gider() {
        driver.get("https://qa.instulearn.com");

    }
    @Then("Sayfa başlığı {ınstalearn} olmalı")
    public void sayfa_başlığı_ınstalearn_olmalı(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Sayfa başlığı beklenenden farklı!");
    }


}
