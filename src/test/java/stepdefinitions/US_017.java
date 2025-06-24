package stepdefinitions;

import config.ConfigReader;
import config.UserConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.CananPage;

import java.sql.Driver;
import java.time.Duration;
import java.util.Objects;
import java.util.Set;

public class US_017 {
    WebDriver driver = DriverManager.getDriver();
    CananPage cananPage = new CananPage(driver);

    @Given("Kullanıcı login sayfasına gider")
    public void kullanici_login_sayfasina_gider() {
        driver.get("https://qa.instulearn.com/login");
    }

    @Then("\"Forgot your password?\" linki görünür olmalı")
    public void forgot_password_linki_gorunur_olmali() {
        Assert.assertTrue(cananPage.forgotPasswordLink.isDisplayed());
    }

    @Then("Link aktif olmalı")
    public void link_aktif_olmali() {
        Assert.assertTrue(cananPage.forgotPasswordLink.isEnabled());
    }

    @When("Kullanıcı bu linke tıklar")
    public void kullanici_bu_linke_tiklar() {
        cananPage.forgotPasswordLink.click();

        }

    @Then("Kullanıcı forget-password sayfasına yönlendirilir")
    public void kullanici_forget_password_sayfasina_yonlendirilir() {
        // Link yeni sekmede açıldığı için window handle değişimini de ekliyoruz:
        Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
        for (String handle : windowHandles) {
            DriverManager.getDriver().switchTo().window(handle);
        }

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("forget-password"));
        Assert.assertTrue(Objects.requireNonNull(DriverManager.getDriver().getCurrentUrl()).contains("forget-password"));
    }

    @Given("Kullanıcı forget-password sayfasındadır")
    public void kullanıcı_forget_password_sayfasındadır() {
        DriverManager.getDriver().get("https://qa.instulearn.com/forget-password");

    }
    @Then("Sayfada {string} yazısı görünmelidir")
    public void sayfada_yazısı_görünmelidir(String baslik) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(cananPage.passwordRecoveryBasligi));
        Assert.assertEquals(cananPage.passwordRecoveryBasligi.getText(), baslik);
    }

    @Then("Email giriş alanı görünür olmalı")
    public void email_giriş_alanı_görünür_olmalı() {
      Assert.assertTrue(cananPage.emailTextbox.isDisplayed());
    }
    @Then("Email giriş alanı aktif olmalı")
    public void email_giriş_alanı_aktif_olmalı() {
        Assert.assertTrue(cananPage.emailTextbox.isEnabled());
    }

    @When("Kayıtlı bir email adresi girer")
    public void kayıtlı_bir_email_adresi_girer() {
        String email = UserConfigReader.getProperty("cananMailStudent");
        cananPage.emailTextbox.sendKeys(email);

    }
    @When("Reset Password butonuna tıklar")
    public void reset_password_butonuna_tıklar() {

        cananPage.resetPasswordButonu.click();

    }
    @Then("{string} mesajı görünmelidir")
    public void mesajı_görünmelidir(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOf(cananPage.successMessageC));
        Assert.assertTrue(cananPage.successMessageC.getText().contains(expectedMessage));
    }

    @Then("Reset Password butonu görünür olmalı")
    public void reset_password_butonu_görünür_olmalı() {
        Assert.assertTrue(cananPage.resetPasswordButonu.isDisplayed());

    }
    @Then("Buton aktif olmalı")
    public void buton_aktif_olmalı() {
        Assert.assertTrue(cananPage.resetPasswordButonu.isEnabled());

    }
    @When("Kullanıcı login sayfasına dön linkine tıklar")
    public void kullanıcı_login_sayfasına_dön_linkine_tıklar() {
        cananPage.loginLinkOnForgotPasswordPage.click();
    }
    @Then("Login sayfasına yönlendirilmelidir")
    public void login_sayfasına_yönlendirilmelidir() {
        String currentUrl = DriverManager.getDriver().getCurrentUrl();
        assert currentUrl != null;
        Assert.assertTrue(currentUrl.contains("login"));
    }

    @Then("Footer'da mail bilgisi görünür olmalıdır")
    public void footer_da_mail_bilgisi_görünür_olmalıdır() {
        Assert.assertTrue(cananPage.footerEmail.isDisplayed());

    }
    @Then("Footer'da telefon bilgisi görünür olmalıdır")
    public void footer_da_telefon_bilgisi_görünür_olmalıdır() {
        Assert.assertTrue(cananPage.footerTelefon.isDisplayed());

    }








}




