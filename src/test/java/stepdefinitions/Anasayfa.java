package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AlpayPage;
import pages.CihatPage;
import pages.LoginPage;
import utils.JSUtilities;
import utils.ReusableMethods;

import static org.testng.Assert.assertTrue;

public class Anasayfa {

    WebDriver driver = DriverManager.getDriver(); // fetch current thread's driver
    AlpayPage alpayPage = new AlpayPage(driver);

    @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        driver.get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/");
    }

    @Given("Kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        driver.get(ConfigReader.getProperty("loginUrl"));
        ReusableMethods.bekle(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/login");
    }

    @Given("Kullanici {string} ve {string} ile login olur")
    public void kullanici_login_olur(String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
        ReusableMethods.bekle(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/panel");

    }

    @Given("Kullanici sayfada asagi dogru hareket eder")
    public void kullanici_sayfada_asagi_dogru_hareket_eder() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ReusableMethods.bekle(1);
        for (int i = 0; i <= 150; i++) {
            js.executeScript("window.scrollBy(0, 100);");
            Thread.sleep(200); // Adjust for speed
        }

        ReusableMethods.bekle(3);
    }

    @Given ("Driveri {int} saniye Bekletir")
    public void driver_bekler(int saniye){
        ReusableMethods.bekle(saniye);
    }

    @Given("Sayfayi en yukari kaydir")
    public void sayfayi_yukari_kaydir(){
        ReusableMethods.bekle(1);
        JSUtilities.scrollToTop(driver);
    }

    @Given ("Dashboard paneli acilir")
    public void dashboard_paneli_acilir(){
        driver.get("https://qa.instulearn.com/panel");
        ReusableMethods.bekle(2);
    }

    @Given("Dashboardda settingse tiklar")
    public void dashboardda_settingse_tiklar(){
        JSUtilities.clickWithJS(driver,alpayPage.dashboardSettings);
        ReusableMethods.bekle(1);
    }

    @Given("Courses sayfasında {string} butonu görüntülenir")
    public void courses_sayfasında_butonu_görüntülenir(String string) {
        WebElement FilterItemsButon = new CihatPage(driver).FilterItemsButon;
        JSUtilities.scrollToVisibleElement(driver, FilterItemsButon);

        if (!FilterItemsButon.isDisplayed()) {
            throw new AssertionError("FilterItemsButon görünür değil: ");

        }
        ReusableMethods.bekle(2);
    }

    @Given("Ilk kursa tiklanir")
    public void ilk_kursa_tiklanir(){
        JSUtilities.clickWithJS(driver,alpayPage.healthAndFitnessCourse);
    }

    @Given("Buy now butonuna tıklanır")
    public void buy_now_butonu_tıklanır() {
        WebElement BuyButon =new AlpayPage(driver).buyButton;
        BuyButon.click();

        ReusableMethods.bekle(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/course/direct-payment");
        ReusableMethods.bekle(2);

    }

    @Given("start payment butonuna tıklanır")
    public void start_payment_butonu_tıklanır() {

        WebElement StartPayment = new AlpayPage(driver).StartPayment;

        assertTrue(StartPayment.isDisplayed());
        StartPayment.click();
    }


}
