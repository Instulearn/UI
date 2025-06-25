package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AlpayPage;
import pages.HomePage;
import utils.JSUtilities;
import utils.ReusableMethods;


public class US_038 {


    public class LogoutStepDefs {

        WebDriver driver = DriverManager.getDriver();
        HomePage homePage = new HomePage(driver);  // locator'ların bulunduğu class

        @When("Kullanici profil ikonuna tiklar")
        public void kullanici_profil_ikonuna_tiklar() {
            ReusableMethods.bekle(homePage.profileIcon);  // profil icon locator varsa burada kullanılmalı
            ReusableMethods.bekle(1);
        }

        @Then("Logout butonu görünür olmalidir")
        public void logout_butonu_gorunur_olmalidir() {
            Assert.assertTrue(homePage.logoutButton.isDisplayed());
        }

        @Then("Logout butonu aktif olmalidir")
        public void logout_butonu_aktif_olmalidir() {
            Assert.assertTrue(homePage.logoutButton.isEnabled());
        }

        @When("Kullanici Logout butonuna tiklar")
        public void kullanici_logout_butonuna_tiklar() {
            homePage.logoutButton.click();
            ReusableMethods.bekle(2);
        }

        @Then("Kullanici login sayfasina yönlendirilmelidir")
        public void kullanici_login_sayfasina_yonlendirilmelidir() {
            Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
            Assert.assertTrue(homePage.loginLink.isDisplayed());
        }

        @Then("Sayfada logout linki görünür olmalidir")
        public void sayfada_logout_linki_gorunur_olmalidir() {
            Assert.assertTrue(homePage.logoutLink.isDisplayed());
        }

        @Then("Logout linki aktif olmalidir")
        public void logout_linki_aktif_olmalidir() {
            Assert.assertTrue(homePage.logoutLink.isEnabled());
        }

        @When("Kullanici logout linkine tiklar")
        public void kullanici_logout_linkine_tiklar() {
            homePage.logoutLink.click();
            ReusableMethods.bekle(2);
        }
    }











}
