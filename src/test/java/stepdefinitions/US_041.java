package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.CananPage;

import java.time.Duration;
import java.util.Objects;

public class US_041 {

    WebDriver driver = DriverManager.getDriver();
    CananPage cananPage = new CananPage(driver);
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));


    @Given("Kullanıcı dashboard sayfasındadır")
    public void kullanici_dashboard_sayfasindadir() {
        driver.get("https://qa.instulearn.com/login");
        cananPage.emailTextbox.sendKeys("canan@gmail.com");
        cananPage.passwordInputC.sendKeys("Canan.11");
        cananPage.loginButtonC.click();

        wait.until(ExpectedConditions.urlContains("/panel"));

        Assert.assertTrue(Objects.requireNonNull(DriverManager.getDriver().getCurrentUrl()).contains("/panel"));
     }

    @Then("Dashboard sidebar'da {string} linki görünür ve aktif olmalı")
    public void dashboard_sidebar_da_linki_görünür_ve_aktif_olmalı(String string) {
        cananPage.coursesLinkiC.click();
        wait.until(ExpectedConditions.visibilityOf(cananPage.myPurchasesLinkC));
        Assert.assertTrue(cananPage.myPurchasesLinkC.isDisplayed());
        Assert.assertTrue(cananPage.myPurchasesLinkC.isEnabled());
     }
    @Given("Kullanıcı {string} linkine tıklar")
        public void kullanıcı_linkine_tıklar (String linkText) {
            if (linkText.equals("My purchases")) {
                cananPage.myPurchasesLinkC.click();
            }
     }
   @Then("Kullanıcı satın aldığı kursların listelendiğini görür")
        public void kullanıcı_satın_aldığı_kursların_listelendiğini_görür() {
        Assert.assertFalse(cananPage.myPurchasesList.isEmpty());
    }
   @When("Kullanıcı bir kursun {string} butonuna tıklar")
        public void kullanıcı_bir_kursun_butonuna_tıklar(String invoice) {
        cananPage.satinAlinandersActionButonu.click();
        if (invoice.equals("Invoice")) {
            cananPage.invoiceButonuC.click();
        }
    }

   @Then("Kursa ait fatura PDF veya sayfa görünür olmalı")
        public void kursa_ait_fatura_pdf_veya_sayfa_görünür_olmalı() {
            String firstTab = driver.getWindowHandle();
            for (String tab : driver.getWindowHandles()) {
                if (!tab.equals(firstTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
    }
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("/invoice"), "Fatura sayfası açılmadı: " + currentUrl);
            driver.close();
            driver.switchTo().window(firstTab);
         }

    @When("Kullanıcı listeden bir kursa tıklar")
    public void kullanıcı_listeden_bir_kursa_tıklar() {
        cananPage.dairyTechnologyLinkiC.click();
         }

    @Then("Seçilen kursun video içerikleri erişilebilir olmalı")
    public void secilen_kursun_video_icerikleri_erisilebilir_olmali() {
        wait.until(ExpectedConditions.visibilityOf(cananPage.videoIcerikLinkiC));
        Assert.assertTrue(cananPage.videoIcerikLinkiC.isDisplayed());
        driver.navigate().back();
        }

    @Given("Kullanıcı {string} başlığına tıklar")
    public void kullanıcı_başlığına_tıklar(String textL) {
        wait.until(ExpectedConditions.visibilityOf(cananPage.favoritesLinkiC));
        if(textL.equals("Favorites")) {
        cananPage.favoritesLinkiC.click();
        }
    }

    @Then("Favorilere eklenen kurslar listelenir")
    public void favorilere_eklenen_kurslar_listelenir() {
        Assert.assertFalse(cananPage.favoritesList.isEmpty());
        }

    @When("Kullanıcı listedeki bir kursu siler")
    public void kullanıcı_listedeki_bir_kursu_siler() {
       cananPage.ilkFavoriActionButonuC.click();
       cananPage.ilkFavoriRemoveButonu.click();
    }
}



