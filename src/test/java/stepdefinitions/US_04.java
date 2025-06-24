package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import pages.RegisterPage;
import utils.JSUtilities;

public class US_04 {

    WebDriver driver = DriverManager.getDriver();
    ConfigReader configReader = new ConfigReader();
    BasePage basePage = new BasePage(driver);
    RegisterPage registerPage = new RegisterPage(driver);
    SoftAssert softAssert = new SoftAssert();


    @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {

        driver.get(configReader.getProperty("url"));
    }
    @When("Register butona tiklanir")
    public void register_butona_tiklanir() {

        basePage.click(registerPage.getRegisterButton());
        registerPage.getRegisterButton().click();
    }

    @When("Formdaki bütün bilgiler gecerli verilerle doldurulur")
    public void formdaki_bütün_bilgiler_gecerli_verilerle_doldurulur() {
        registerPage.registerFormDoldur("tugba0@tugba.com","Tugba","abc.12345","abc.12345");
    }
    @Then("I agree with terms&rules secilir")
    public void i_agree_with_terms_rules_secilir() {
        JSUtilities.clickWithJS(driver,registerPage.getTermsRulesConfirm());
    }
    @Then("Signup butonuna tiklanir")
    public void signup_butonuna_tiklanir() {
        basePage.click(registerPage.getSignupButton());
    }
    @Then("Yönlendirilen sayfada {string} yazilan ismin görüldügü dogrulanir")
    public void yönlendirilen_sayfada_yazilan_ismin_görüldügü_dogrulanir(String string) {
        softAssert.assertTrue(registerPage.getUserName().isDisplayed());
    }

}
