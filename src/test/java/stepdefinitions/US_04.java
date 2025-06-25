package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import pages.RegisterPage;
import utils.JSUtilities;
import utils.LoggerHelper;
import utils.ReusableMethods;
import utils.User;


public class US_04 {

    WebDriver driver = DriverManager.getDriver();
    BasePage basePage = new BasePage(driver);
    RegisterPage registerPage = new RegisterPage(driver);


    @When("Register butona tiklanir")
    public void register_butona_tiklanir() {
        LoggerHelper.info("Register butonuna click yapiliyor");
        basePage.click(registerPage.getRegisterButton());
        registerPage.getRegisterButton().click();
    }

    @When("Register formundaki bütün bilgiler gecerli verilerle doldurulur")
    public void register_formundaki_bütün_bilgiler_gecerli_verilerle_doldurulur() {
        ReusableMethods.writeSingleFakeUser("src/test/resources/TugbaTestData.xlsx");
        User user = ReusableMethods.readSingleFakeUser("src/test/resources/TugbaTestData.xlsx");
        String email = user.getEmail();

        LoggerHelper.info("Email bilgisi giriliyor");
        Allure.step("Email bilgisi giriliyor");
        basePage.type(registerPage.getEmailBox(), email);
        LoggerHelper.info("Fullname bilgisi giriliyor");
        Allure.step("Fullname bilgisi giriliyor");
        basePage.type(registerPage.getFullName(), "Tugba");
        LoggerHelper.info("Password bilgisi giriliyor");
        Allure.step("Password bilgisi giriliyor");
        basePage.type(registerPage.getPassword(), "abc.12345");
        LoggerHelper.info("Retype Password bilgisi giriliyor");
        Allure.step("Retype Password bilgisi giriliyor");
        basePage.type(registerPage.getRetypePassword(), "abc.12345");
    }

    @Then("I agree with terms&rules secilir")
    public void i_agree_with_terms_rules_secilir() {
        LoggerHelper.info("Terms and Rules onaylaniyor");
        Allure.step("Terms and Rules onaylaniyor");
        JSUtilities.clickWithJS(driver,registerPage.getTermsRulesConfirm());
    }
    @Then("Signup butonuna tiklanir")
    public void signup_butonuna_tiklanir() {
        LoggerHelper.info("signup butonuna tiklaniyor");
        Allure.step("signup butonuna tiklaniyor");
        basePage.click(registerPage.getSignupButton());
    }

    @Then("Yönlendirilen sayfada Full Name alanina yazilan ismin görüldügü dogrulanir")
    public void yönlendirilen_sayfada_full_name_alanina_yazilan_ismin_görüldügü_dogrulanir() {
        LoggerHelper.info("Basarili sekilde register olunabildigi dogrulaniyor");
        Allure.step("Basarili sekilde register olunabildigi dogrulaniyor");
        Assert.assertTrue(registerPage.isWebElementDisplayed(registerPage.getUserName()),"Register islemi basarili sekilde gerceklesti");
    }

    @Given("Register butonunun görünürlügü dogrulanir")
    public void register_butonunun_görünürlügü_dogrulanir() {
        LoggerHelper.info("Register butonunun görünürlügü dogrulaniyor");
        Allure.step("Register butonunun görünürlügü dogrulaniyor");
        Assert.assertTrue(registerPage.isWebElementDisplayed(registerPage.getRegisterButton()),"Register butonunun görünürlügü dogrulanamadi");
    }

    @Then("Register butonuna tiklandiginda acilan sayfanin URL'inde 'register' kelimesinin yer aldigi dogrulanir")
    public void register_butonuna_tiklandiginda_acilan_sayfanin_url_inde_register_kelimesinin_yer_aldigi_dogrulanir() {
         LoggerHelper.info("URL'in 'register' kelimesini icerdigi dogrulaniyor");
         Allure.step("URL'in 'register' kelimesini icerdigi dogrulaniyor");
         Assert.assertTrue(driver.getCurrentUrl().contains("register"),"URL register kelimesini icermiyor");
    }

    @Then("Sayfanin solunda yer alan resmin görünürlügü dogrulanir")
    public void sayfanin_solunda_yer_alan_resmin_görünürlügü_dogrulanir() {
        LoggerHelper.info("Register sayfasinin solunda yer alan resmin görünürlügü dogrulaniyor");
        Allure.step("Register sayfasinin solunda yer alan resmin görünürlügü dogrulaniyor");
        Assert.assertTrue(registerPage.isWebElementDisplayed(registerPage.getPhoto()),"Register sayfasindaki resmin görünürlügü dogrulanamadi");
    }

    @Then("Sayfanin saginda yer alan signup formunun görünürlügü dogrulanir")
    public void sayfanin_saginda_yer_alan_signup_formunun_görünürlügü_dogrulanir() {
        Assert.assertTrue(registerPage.getSignupForm().isDisplayed(),"Register formunun görünürlügü dogrulanamadi");
    }

    @Then("Signup formu içerisinde Account type butonlarinin görünürlügü dogrulanir")
    public void signup_formu_içerisinde_account_type_butonlarinin_görünürlügü_dogrulanir() {

        for (WebElement element : registerPage.getAccountType()){
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Then("Signup formu içerisinde Account type butonlarinin tiklanabilirligi dogrulanir")
    public void signup_formu_içerisinde_account_type_butonlarinin_tiklanabilirligi_dogrulanir() {

        for (WebElement element : registerPage.getAccountType()){
            Assert.assertTrue(registerPage.waitForClickability(element));
        }

    }

    @When("Register formu eksik birakilarak doldurulur {string}, {string}, {string}, {string}")
    public void register_formu_eksik_birakilarak_doldurulur(String fullName, String email, String password, String retypePassword) {
        basePage.type(registerPage.getFullName(),fullName);
        basePage.type(registerPage.getEmailBox(),email);
        basePage.type(registerPage.getPassword(),password);
        basePage.type(registerPage.getRetypePassword(),retypePassword);
    }

    @Then("uyari mesajinin görüntülendigi dogrulanir")
    public void uyari_mesajinin_görüntülendigi_dogrulanir() {
        for (WebElement element : registerPage.getErrormessages()){
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Then("I agree with terms&rules alaninin altinda {string} mesajinin yer aldigi dogrulanir")
    public void i_agree_with_terms_rules_alaninin_altinda_mesajinin_yer_aldigi_dogrulanir(String string) {
        Assert.assertTrue(registerPage.getTermAndRulesMessage().isDisplayed());

    }


    @When("Gecerli full name {string}, password {string} ve retype password {string} bilgileri girilir")
    public void gecerli_full_name_password_ve_retype_password_bilgileri_girilir(String fullName, String password, String retypePassword) {
        basePage.type(registerPage.getFullName(),fullName);
        basePage.type(registerPage.getPassword(),password);
        basePage.type(registerPage.getRetypePassword(),retypePassword);

    }

    @When("Email alanina gecersiz email {string} girilir")
    public void email_alanina_gecersiz_email_girilir(String email) {

       basePage.type(registerPage.getEmailBox(),email);

    }

    @Then("Email alaninin altinda {string} mesajinin yer aldigi dogrulanir")
    public void email_alaninin_altinda_mesajinin_yer_aldigi_dogrulanir(String expectedMessage) {

        String actualMessage = ReusableMethods.getElementText(registerPage.getInvalidEmailMessage());
        Assert.assertTrue(actualMessage.contains(expectedMessage));

    }


    @When("Full Name alani {string} gecerli verilerle doldurulur")
    public void full_name_alani_gecerli_verilerle_doldurulur(String fullName) {

        basePage.type(registerPage.getFullName(),fullName);
    }
    @When("Email alanina gecerli bir email girilir")
    public void email_alanina_gecerli_bir_email_girilir() {
        User user = ReusableMethods.readSingleFakeUser("src/test/resources/TugbaTestData.xlsx");
        String email = user.getEmail();
        LoggerHelper.info("Email bilgisi giriliyor");
        Allure.step("Email bilgisi giriliyor");
        basePage.type(registerPage.getEmailBox(), email);

    }

    @When("Password alani {string} ve Retype Password alani {string} olarak doldurulur")
    public void password_alani_ve_retype_password_alani_olarak_doldurulur(String password, String retypePassword) {
        LoggerHelper.info("5 haneli Password giriliyor");
        Allure.step("5 haneli Password giriliyor");
        basePage.type(registerPage.getPassword(), password);
        basePage.type(registerPage.getRetypePassword(), retypePassword);
    }
    @Then("Password altinda {string} uyari mesajinin görüntülendigi dogrulanir")
    public void password_altinda_uyari_mesajinin_görüntülendigi_dogrulanir(String string) {












}


