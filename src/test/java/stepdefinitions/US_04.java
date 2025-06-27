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
    ReusableMethods reusableMethods = new ReusableMethods();
    String email2="";

    @When("Register butona tiklanir")
    public void register_butona_tiklanir() {
        LoggerHelper.info("Register butonuna click yapiliyor");
        Allure.step("Register butonuna click yapiliyor");
        basePage.click(registerPage.getRegisterButton());
        registerPage.getRegisterButton().click();
    }

    @When("Register formundaki bütün bilgiler gecerli verilerle doldurulur")
    public void register_formundaki_bütün_bilgiler_gecerli_verilerle_doldurulur() {
        ReusableMethods.writeSingleFakeUser("src/test/resources/TugbaTestData.xlsx");
        User user = ReusableMethods.readSingleFakeUser("src/test/resources/TugbaTestData.xlsx");
        String email = user.getEmail();
        email2=email;

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
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(registerPage.getUserName()),"Register islemi basarili sekilde gerceklesemedi");
    }

    @Given("Register butonunun görünürlügü dogrulanir")
    public void register_butonunun_görünürlügü_dogrulanir() {
        LoggerHelper.info("Register butonunun görünürlügü dogrulaniyor");
        Allure.step("Register butonunun görünürlügü dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(registerPage.getRegisterButton()),"Register butonunun görünürlügü dogrulanamadi");
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
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(registerPage.getPhoto()),"Register sayfasindaki resmin görünürlügü dogrulanamadi");
    }

    @Then("Sayfanin saginda yer alan signup formunun görünürlügü dogrulanir")
    public void sayfanin_saginda_yer_alan_signup_formunun_görünürlügü_dogrulanir() {
        LoggerHelper.info("Register formunun görünürlügü dogrulaniyor");
        Allure.step("Register formunun görünürlügü dogrulaniyor");
        Assert.assertTrue(registerPage.getSignupForm().isDisplayed(),"Register formunun görünürlügü dogrulanamadi");
    }

    @Then("Signup formu içerisinde Account type butonlarinin görünürlügü dogrulanir")
    public void signup_formu_içerisinde_account_type_butonlarinin_görünürlügü_dogrulanir() {
        LoggerHelper.info("Account type butonlarinin görünürlügü dogrulaniyor");
        Allure.step("Account type butonlarinin görünürlügü dogrulaniyor");
        for (WebElement element : registerPage.getAccountType()){
            Assert.assertTrue(element.isDisplayed(),"Account type butonlarinin görünürlügü dogrulanamadi");
        }
    }

    @Then("Signup formu içerisinde Account type butonlarinin tiklanabilirligi dogrulanir")
    public void signup_formu_içerisinde_account_type_butonlarinin_tiklanabilirligi_dogrulanir() {

        LoggerHelper.info("Account type butonlarinin tiklanabilirligi dogrulaniyor");
        Allure.step("Account type butonlarinin tiklanabilirligi dogrulaniyor");
        for (WebElement element : registerPage.getAccountType()){
            Assert.assertTrue(registerPage.waitForClickability(element),"Account type butonlarinin tiklanabilirligi dogrulanamadi");
        }
    }

    @When("Register formu eksik birakilarak doldurulur {string}, {string}, {string}, {string}")
    public void register_formu_eksik_birakilarak_doldurulur(String fullName, String email, String password, String retypePassword) {
        LoggerHelper.info("Fullname bilgisi giriliyor");
        Allure.step("Fullname bilgisi giriliyor");
        basePage.type(registerPage.getFullName(),fullName);
        LoggerHelper.info("Email bilgisi giriliyor");
        Allure.step("Email bilgisi giriliyor");
        basePage.type(registerPage.getEmailBox(),email);
        LoggerHelper.info("Password bilgisi giriliyor");
        Allure.step("Password bilgisi giriliyor");
        basePage.type(registerPage.getPassword(),password);
        LoggerHelper.info("Retype Password bilgisi giriliyor");
        Allure.step("Retype Password bilgisi giriliyor");
        basePage.type(registerPage.getRetypePassword(),retypePassword);
    }

    @Then("uyari mesajinin görüntülendigi dogrulanir")
    public void uyari_mesajinin_görüntülendigi_dogrulanir() {
        LoggerHelper.info("Uyari mesajinin görüntülendigi dogrulaniyor");
        Allure.step("Uyari mesajinin görüntülendigi dogrulaniyor");
        for (WebElement element : registerPage.getErrormessages()){
            Assert.assertTrue(reusableMethods.isWebElementDisplayed(element),"Uyari mesajinin görüntülendigi dogrulanamadi");
        }
    }

    @Then("I agree with terms&rules alaninin altinda {string} mesajinin yer aldigi dogrulanir")
    public void i_agree_with_terms_rules_alaninin_altinda_mesajinin_yer_aldigi_dogrulanir(String string) {
        LoggerHelper.info("I agree with terms&rules alani secilmediginde cikan mesaj dogrulaniyor");
        Allure.step("I agree with terms&rules alani secilmediginde cikan mesaj dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(registerPage.getTermAndRulesMessage()),"I agree with terms&rules alani secilmediginde cikan mesaj dogrulanamadi");

    }


    @When("Gecerli full name {string}, password {string} ve retype password {string} bilgileri girilir")
    public void gecerli_full_name_password_ve_retype_password_bilgileri_girilir(String fullName, String password, String retypePassword) {
        LoggerHelper.info("Fullname bilgisi giriliyor");
        Allure.step("Fullname bilgisi giriliyor");
        basePage.type(registerPage.getFullName(),fullName);
        LoggerHelper.info("Password bilgisi giriliyor");
        Allure.step("Password bilgisi giriliyor");
        basePage.type(registerPage.getPassword(),password);
        LoggerHelper.info("Retype Password bilgisi giriliyor");
        Allure.step("Retype Password bilgisi giriliyor");
        basePage.type(registerPage.getRetypePassword(),retypePassword);

    }

    @When("Email alanina gecersiz email {string} girilir")
    public void email_alanina_gecersiz_email_girilir(String email) {
        LoggerHelper.info("E-mail alanina gecersiz bir email giriliyor");
        Allure.step("E-mail alanina gecersiz bir email giriliyor");
       basePage.type(registerPage.getEmailBox(),email);

    }

    @Then("Email alaninin altinda {string} mesajinin yer aldigi dogrulanir")
    public void email_alaninin_altinda_mesajinin_yer_aldigi_dogrulanir(String expectedMessage) {
        LoggerHelper.info("E-mail alanina gecersiz bir email girildiginde cikan mesaj dogrulaniyor");
        Allure.step("E-mail alanina gecersiz bir email girildiginde cikan mesaj dogrulaniyor");

        String actualMessage = ReusableMethods.getElementText(registerPage.getInvalidEmailMessage());
        Assert.assertTrue(actualMessage.contains(expectedMessage),"E-mail alanina gecersiz bir email girildiginde cikan mesaj dogrulanamadi");

    }


    @When("Full Name alani {string} gecerli verilerle doldurulur")
    public void full_name_alani_gecerli_verilerle_doldurulur(String fullName) {
        LoggerHelper.info("Full name alani gecerli bir veriyle dolduruluyor");
        Allure.step("Full name alani gecerli bir veriyle dolduruluyor");
        basePage.type(registerPage.getFullName(),fullName);
    }
    @When("Email alanina gecerli bir email girilir")
    public void email_alanina_gecerli_bir_email_girilir() {
        ReusableMethods.writeSingleFakeUser("src/test/resources/TugbaTestData.xlsx");
        User user = ReusableMethods.readSingleFakeUser("src/test/resources/TugbaTestData.xlsx");
        String email = user.getEmail();
        LoggerHelper.info("Email bilgisi giriliyor");
        Allure.step("Email bilgisi giriliyor");
        basePage.type(registerPage.getEmailBox(), email);

    }

    @When("Password alani {string} ve Retype Password alani {string} olarak doldurulur")
    public void password_alani_ve_retype_password_alani_olarak_doldurulur(String password, String retypePassword) {
        LoggerHelper.info("password alani dolduruluyor");
        Allure.step("5 haneli Password giriliyor");
        basePage.type(registerPage.getPassword(), password);
        basePage.type(registerPage.getRetypePassword(), retypePassword);
    }
    @Then("Password altinda {string} uyari mesajinin görüntülendigi dogrulanir")
    public void password_altinda_uyari_mesajinin_görüntülendigi_dogrulanir(String expectedMsg) {
        LoggerHelper.info("Denenecek Password giriliyor");
        Allure.step("Denenecek Password giriliyor");

        String actualMsg = ReusableMethods.getElementText(registerPage.getPassCharacterMessage()).trim();
        Assert.assertEquals(actualMsg,expectedMsg,"Uyari mesajinin görüntülendigi dogrulanamadi");
}

    @When("Formun altinda yer alan login yazisina tiklanir")
    public void formun_altinda_yer_alan_login_yazisina_tiklanir() {
        LoggerHelper.info("Logine tiklaniyor");
        Allure.step("Logine tiklaniyor");
      basePage.click(registerPage.getLogin());
    }

    @Then("Yönlendirilen sayfanin URL'inin 'login' icerdigi dogrulanir")
    public void yönlendirilen_sayfanin_url_inin_login_icerdigi_dogrulanir() {
        LoggerHelper.info("URL'in login icerdigi dogrulaniyor");
        Allure.step("URL'in login icerdigi dogrulaniyor");
        String url = DriverManager.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("login"),"URL'in login icerdigi dogrulanamadi");

    }

    @When("Yönlendirilen sayfada kayit olan kisinin isminin üstüne gelinir")
    public void yönlendirilen_sayfada_kayit_olan_kisinin_isminin_üstüne_gelinir() {
        LoggerHelper.info("kayitli kisinin ismine tiklaniyor");
        Allure.step("kayitli kisinin ismine tiklaniyor");
        basePage.click(registerPage.getUserName());
    }
    @When("Logout yazisina tiklanir")
    public void logout_yazisina_tiklanir() {
        LoggerHelper.info("Logout yazisina tiklaniyor");
        Allure.step("Logout yazisina tiklaniyor");
        basePage.click(registerPage.getLogout());
    }
    @Then("Kullanicinin tekrar register olamadigi dogrulanir")
    public void kullanicinin_tekrar_register_olamadigi_dogrulanir() {

        LoggerHelper.info("Kullanicinin ayni emaille tekrar register olamadigi dogrulaniyor");
        Allure.step("Kullanicinin ayni emaille tekrar register olamadigi dogrulaniyor");
       String actualMessage = ReusableMethods.getElementText(registerPage.getErrormessages().get(0)).trim();
       String extectedMessage = "The email has already been taken.";
       Assert.assertEquals(actualMessage,extectedMessage,"Kullanici ayni emaille 2. kez register olabildi!");

    }

    @When("Register formundaki mail haric bilgiler gecerli verilerle doldurulur")
    public void register_formundaki_mail_haric_bilgiler_gecerli_verilerle_doldurulur() {

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
    @When("emaile ayni mail tekrar girilir")
    public void emaile_ayni_mail_tekrar_girilir() {
        LoggerHelper.info("Email bilgisi giriliyor");
        Allure.step("Email bilgisi giriliyor");
        basePage.type(registerPage.getEmailBox(), email2);
    }


}



