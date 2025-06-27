package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AlpayPage;
import utils.JSUtilities;
import utils.ReusableMethods;

public class US_015 {

    WebDriver driver= DriverManager.getDriver();

    @Given("Kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {
        driver.get("https://qa.instulearn.com/");
        Assert.assertEquals("https://qa.instulearn.com/", driver.getCurrentUrl());
    }

    @Then("Anasayfada Organizations başlığı görünür olmalıdır")
    public void anasayfada_organizations_basligi_gorunur_olmalidir() {
        WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'Organizations')]"));
        Assert.assertTrue(title.isDisplayed());
    }

    @Then("All Organizations butonu görünür ve aktif olmalıdır")
    public void all_organizations_butonu_gorunur_ve_aktif_olmalidir() {
        WebElement button = driver.findElement(By.xpath("//a[contains(text(),'All Organizations')]"));
        Assert.assertTrue(button.isDisplayed());
        Assert.assertTrue(button.isEnabled());
    }

    @Then("Organizations başlığı altındaki slider görünür ve aktif olmalıdır")
    public void organizations_basligi_altindaki_slider_gorunur_ve_aktif_olmalidir() {
        WebElement slider = driver.findElement(By.xpath("//div[contains(@class,'home-organizations-card')]"));
        Assert.assertTrue(slider.isDisplayed());
        Assert.assertTrue(slider.isEnabled());
    }
}






