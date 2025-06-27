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



public class US_010 {

    WebDriver driver= DriverManager.getDriver();

    @Given("Kullanıcı anasayfaya gider")
    public void kullanıcı_anasayfaya_gider() {
       driver.get("https://qa.instulearn.com/");
    }

    @Then("Anasayfada 'Join as instructor' başlığı görünür ve aktif olmalıdır")
    public void anasayfada_join_as_instructor_basligi_gorunur_ve_aktif_olmalidir() {
        WebElement joinInstructorButton = driver.findElement(By.xpath("//a[contains(text(), 'Join as instructor')]"));
        Assert.assertTrue(joinInstructorButton.isDisplayed());
        Assert.assertTrue(joinInstructorButton.isEnabled());
    }
    @When("Kullanici Join as instructor linkine tiklar")
    public void kullanici_join_as_instructor_linkine_tiklar() {
        WebElement joinInstructorButton = driver.findElement(By.xpath("//a[contains(text(), 'Join as instructor')]"));
        joinInstructorButton.click();
    }


    @Then("Kullanici login sayfasina yonlendirilmelidir")
    public void kullanici_login_sayfasina_yonlendirilmelidir() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
    }







}







