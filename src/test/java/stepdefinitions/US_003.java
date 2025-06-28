package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.FilizPage;
import utils.ReusableMethods;

public class US_003 {


    WebDriver driver = DriverManager.getDriver();
    FilizPage filizPage = new FilizPage(driver);

    @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {

        driver.get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(3);
    }

    @Then("Anasayfa body bolumunde search box gorunur ve aktif olmalı")
    public void search_box_gorunur_olmali() {

        Assert.assertTrue(filizPage.searchInputBox.isDisplayed());
        Assert.assertTrue(filizPage.searchInputBox.isEnabled());
        filizPage.searchInputBox.click();

        //@When("Search butonu gorunur ve aktif olmali")
       // public void Search_butonu_gorunur_ve_aktif_olmalı (){


            Assert.assertTrue(filizPage.searchButton.isDisplayed());
            Assert.assertTrue(filizPage.searchButton.isEnabled());
            filizPage.searchButton.click();

        }
    }








