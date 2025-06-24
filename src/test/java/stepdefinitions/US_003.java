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
import pages.RegisterPage;
import utils.JSUtilities;


public class US_003 {

    @Then("{string} başlığı görünür olmalı")
    public void baslikGorunurOlmali(String beklenenBaslik) {


        DriverManager Driver;
        WebElement baslikElementi = Driver.getDriver().findElement(
                By.xpath("//h1[contains(text(),'" + beklenenBaslik + "')]")
        );
        Assert.assertTrue(baslikElementi.isDisplayed(), "Beklenen başlık görünür değil: " + beklenenBaslik);
    }




}

