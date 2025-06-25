package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import pages.FilizPage;
import pages.RegisterPage;
import utils.JSUtilities;


public class US_003 {
WebDriver driver = DriverManager.getDriver();


    @Then("{string} başlığı görünür olmalı")
    public void baslikGorunurOlmali(String beklenenBaslik) {



        WebElement baslikElementi = new FilizPage(driver).transformYourFutureTitle;







        Assert.assertTrue(baslikElementi.isDisplayed(), "Beklenen başlık görünür değil: " + beklenenBaslik);
    }




}

