package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.RegisterPage;
import utils.JSUtilities;
import utils.LoggerHelper;
import utils.ReusableMethods;


public class US_04 {

    WebDriver driver = DriverManager.getDriver();
    BasePage basePage = new BasePage(driver);
    RegisterPage registerPage = new RegisterPage(driver);
    boolean isDisplayed = false;


    @When("Register butona tiklanir")
    public void register_butona_tiklanir() {
        LoggerHelper.info("Register butonuna click yapiliyor");
        basePage.click(registerPage.getRegisterButton());
    }

    @When("Register formundaki bütün bilgiler gecerli verilerle doldurulur")
    public void register_formundaki_bütün_bilgiler_gecerli_verilerle_doldurulur() {
        registerPage.RegisterForm();
    }

    @Then("I agree with terms&rules secilir")
    public void i_agree_with_terms_rules_secilir() {
        LoggerHelper.info("Terms and Rules onaylaniyor");
        JSUtilities.clickWithJS(driver,registerPage.getTermsRulesConfirm());
    }
    @Then("Signup butonuna tiklanir")
    public void signup_butonuna_tiklanir() {
        LoggerHelper.info("signup butonuna tiklaniyor");
        basePage.click(registerPage.getSignupButton());
    }

    @Then("Yönlendirilen sayfada {string} yazilan ismin görüldügü dogrulanir")
    public void yönlendirilen_sayfada_yazilan_ismin_görüldügü_dogrulanir(String string) {
        Assert.assertTrue(registerPage.isWebElementDisplayed(registerPage.getUserName()));
    }

    @Given("Register butonunun görünürlügü dogrulanir")
    public void register_butonunun_görünürlügü_dogrulanir() {
        LoggerHelper.info("Register butonunun görünürlügü dogrulaniyor");
        Assert.assertTrue(registerPage.isWebElementDisplayed(registerPage.getRegisterButton()));
    }

    @Then("Register butonuna tiklandiginda acilan sayfanin URL'inde 'register' kelimesinin yer aldigi dogrulanir")
    public void register_butonuna_tiklandiginda_acilan_sayfanin_url_inde_register_kelimesinin_yer_aldigi_dogrulanir() {
         LoggerHelper.info("URL'in 'register' kelimesini icerdigi dogrulaniyor");
         Assert.assertTrue(driver.getCurrentUrl().contains("register"),"URL register kelimesini icermiyor");
    }

    @Then("Sayfanin solunda yer alan resmin görünürlügü dogrulanir")
    public void sayfanin_solunda_yer_alan_resmin_görünürlügü_dogrulanir() {
        Assert.assertTrue(registerPage.isWebElementDisplayed(registerPage.getPhoto()));
    }


}
