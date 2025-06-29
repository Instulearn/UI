package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.FilizPage;
import io.cucumber.java.en.And;
public class US_005{
        public class KullaniciLoginİslemleri {


                WebDriver driver = DriverManager.getDriver();
                FilizPage filizPage = new FilizPage(driver);


                @Given("Kullanıcı login sayfasına gider")
                public void kullanıcı_login_sayfasına_gider() {
                        DriverManager.getDriver().get("https://qa.instulearn.com/login");
                }

                @Then("Sağ bölümde login formu görünür olmalı")
                public void sağ_bölümde_login_formu_görünür_olmalı() {
                        Assert.assertTrue(filizPage.emailInput.isDisplayed(), "Email textbox görünmüyor");
                        Assert.assertTrue(filizPage.passwordInput.isDisplayed(), "Password textbox görünmüyor");
                        Assert.assertTrue(filizPage.loginButton.isDisplayed(), "Login butonu görünmüyor");
                }

                @Then("'Log in to your account' metni görünür olmalı")
                public void login_metni_görünür_olmalı() {
                        Assert.assertTrue(filizPage.loginFormTitle.isDisplayed(), "'Log in to your account' metni görünmüyor");
                }

                @Then("Email textbox görünür ve aktif olmalı")
                public void email_textbox_gorunur_ve_aktif_olmali() {
                        Assert.assertTrue(filizPage.emailInput.isDisplayed(), "Email textbox görünmüyor!");
                        Assert.assertTrue(filizPage.emailInput.isEnabled(), "Email textbox aktif değil!");
                }

                @Then("Password textbox görünür ve aktif olmalı")
                public void password_textbox_gorunur_ve_aktif_olmali() {
                        Assert.assertTrue(filizPage.passwordInput.isDisplayed(), "Password textbox görünmüyor!");
                        Assert.assertTrue(filizPage.passwordInput.isEnabled(), "Password textbox aktif değil!");
                }

                @Then("Login butonu görünür ve aktif olmalı")
                public void login_butonu_gorunur_ve_aktif_olmali() {
                        Assert.assertTrue(filizPage.loginButton.isDisplayed(), "Login butonu görünmüyor!");
                        Assert.assertTrue(filizPage.loginButton.isEnabled(), "Login butonu aktif değil!");
                }

                @When("Kullanıcı {string} linkine tıklar")
                public void kullanıcı_linkine_tıklar(String linkText) {
                        if (linkText.equals("Forgot your password?")) {
                                filizPage.forgotPasswordLink.click();
                        } else if (linkText.equals("Register")) {
                                filizPage.registerLink.click();
                        } else {
                                Assert.fail("Bilinmeyen link: " + linkText);
                        }
                }

                @Then("Şifre sıfırlama sayfasına yönlendirilmiş olmalı")
                public void şifre_sıfırlama_sayfasına_yönlendirilmiş_olmalı() {
                        String currentUrl = DriverManager.getDriver().getCurrentUrl();
                        Assert.assertTrue(currentUrl.contains("/forget-password"), "Şifre sıfırlama sayfasına gidilmedi.");
                }

                @Then("Kayıt olma sayfasına yönlendirilmiş olmalı")
                public void kayıt_olma_sayfasına_yönlendirilmiş_olmalı() {
                        String currentUrl = DriverManager.getDriver().getCurrentUrl();
                        Assert.assertTrue(currentUrl.contains("/register"), "Register sayfasına gidilmedi.");
                }

                @When("Kullanıcı email olarak {string} ve şifre olarak {string} girer")
                public void kullanıcı_email_ve_şifre_girer(String email, String password) {
                        filizPage.emailInput.clear();
                        filizPage.emailInput.sendKeys(email);
                        filizPage.passwordInput.clear();
                        filizPage.passwordInput.sendKeys(password);
                }

               // @and("Login butonuna tıklar")
                public void login_butonuna_tıklar() {
                        filizPage.loginButton.click();
                }

                @Then("{string} hata mesajı görünür olmalı")
                public void hata_mesajı_görünür_olmalı(String expectedMessage) {
                        Assert.assertTrue(filizPage.invalidEmailErrorMessage.isDisplayed(), "Hata mesajı görünmedi!");
                        String actualMessage = filizPage.invalidEmailErrorMessage.getText();
                        Assert.assertTrue(actualMessage.contains(expectedMessage), "Hata mesajı eşleşmiyor!");
                }

                @Then("Kullanıcı başarıyla giriş yapmış olmalı")
                public void kullanıcı_başarıyla_giriş_yapmış_olmalı() {
                        Assert.assertTrue(filizPage.loginSuccessGreeting.isDisplayed(), "Başarılı giriş yapılmadı!");
                }

        }

}


