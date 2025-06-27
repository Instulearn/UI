package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CananPage;

import java.time.Duration;
import java.util.List;

public class US_029 {
    WebDriver driver = DriverManager.getDriver();
    CananPage cananPage = new CananPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("Kullanıcı dashboard sayfasına giriş yapar")
    public void kullanıcı_dashboard_sayfasına_giriş_yapar() {
        driver.get("https://qa.instulearn.com/login");
        cananPage.emailTextbox.sendKeys("cananteacher@gmail.com");
        cananPage.passwordInputC.sendKeys("Canan.11");
        cananPage.loginButtonC.click();
        wait.until(ExpectedConditions.urlContains("/panel"));
        Assert.assertTrue(driver.getCurrentUrl().contains("/panel"));
    }

    @Then("Sidebar'da {string} başlığı altında {string} linki görünür ve aktif olmalı")
    public void sidebar_da_başlığı_altında_linki_görünür_ve_aktif_olmalı(String baslik, String altLink) {
        if (baslik.equals("Marketing")) {
            cananPage.marketingMenu.click();
        }
        wait.until(ExpectedConditions.visibilityOf(cananPage.discountsLinkC));
        Assert.assertTrue(cananPage.discountsLinkC.isDisplayed());
        Assert.assertTrue(cananPage.discountsLinkC.isEnabled());
    }

    @Then("{string} linki görünür ve aktif olmalı")
    public void linki_görünür_ve_aktif_olmalı(String linkText) {
        wait.until(ExpectedConditions.visibilityOf(cananPage.promotionsLinkC));
        Assert.assertTrue(cananPage.promotionsLinkC.isDisplayed());
        Assert.assertTrue(cananPage.promotionsLinkC.isEnabled());
    }

    @Given("Kullanıcı dashboard sayfasında {string} linkine tıklar")
    public void kullanıcı_dashboard_sayfasında_linkine_tıklar(String linkText) {
        if (linkText.equals("Discounts")) {
            cananPage.discountsLinkC.click();
        } else if (linkText.equals("Promotions")) {
            cananPage.promotionsLinkC.click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("Yeni kurs indirimi oluşturma formu görüntülenir")
    public void yeni_kurs_indirimi_oluşturma_formu_görüntülenir() {
        wait.until(ExpectedConditions.visibilityOf(cananPage.discountTitleInputC));
        Assert.assertTrue(cananPage.discountTitleInputC.isDisplayed());
    }

    @Then("İndirim oluşturma formundaki {string} alanına başlık girilir")
    public void indirim_oluşturma_formundaki_alanına_başlık_girilir(String field) {
        cananPage.discountTitleInputC.sendKeys("Test İndirimi2");
    }

    @Then("{string} dropdown'dan bir kurs seçilir")
    public void dropdown_dan_bir_kurs_seçilir(String dropdown) {
        Select select = new Select(cananPage.courseDropdownC);
        select.selectByIndex(1);
    }

    @Then("{string} alanına yüzde indirim girilir")
    public void alanına_yüzde_indirim_girilir(String alan) {
        cananPage.discountAmountInputC.sendKeys("15");
    }

    @Then("{string} ve {string} tarihleri seçilir")
    public void ve_tarihleri_seçilir(String from, String to) {
        cananPage.fromDateInputC.sendKeys("06/26/2025");
        cananPage.toDateInputC.sendKeys("06/30/2025");
    }

    @Then("{string} butonuna tıklanır")
    public void butonuna_tıklanır(String buton) {
        wait.until(ExpectedConditions.elementToBeClickable(cananPage.createButonuC));
        Assert.assertTrue(cananPage.createButonuC.isDisplayed());
        Assert.assertTrue(cananPage.createButonuC.isEnabled());
        if(buton.equals("Create")){
        cananPage.createButonuC.click();
    }
}
    @Then("Promosyon planları listesi görünür olmalı")
    public void promosyon_planları_listesi_görünür_olmalı() {
        wait.until(ExpectedConditions.visibilityOfAllElements(cananPage.promotionPlanListesi));
        Assert.assertFalse(cananPage.promotionPlanListesi.isEmpty());
    }

    @Then("Kullanıcı bir promosyon planını seçebilir olmalı")
    public void kullanıcı_bir_promosyon_planını_seçebilir_olmalı() {
        Assert.assertTrue(cananPage.ilkPromosyonPurchaseButonu.isEnabled());
    }

    @When("Kullanıcı bir promosyon planına tıklar")
    public void kullanıcı_bir_promosyon_planına_tıklar() {
        cananPage.ilkPromosyonPurchaseButonu.click();
    }

    @When("Kullanıcı popup'taki {string} dropdown'dan {string} kursunu secer")
    public void kullanıcı_popup_taki_dropdown_dan_kursunu_secer(String dropdownLabel, String dersAdi) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        if (dropdownLabel.equals("Select a course")) {
            cananPage.promotionCourseDropdown.click();
        }
        if (dersAdi.equals("Postman")){
            Select select = new Select(cananPage.promotionCourseDropdown);
            select.selectByVisibleText(dersAdi);
            select.getFirstSelectedOption();

        }
    }
    @Then("{string} butonuna tıklar")
    public void butonuna_tıklar(String butonText) {
        if (butonText.equalsIgnoreCase("Pay")) {
            wait.until(ExpectedConditions.elementToBeClickable(cananPage.payButonuC));
            Assert.assertTrue(cananPage.payButonuC.isDisplayed());
            cananPage.payButonuC.click();}
        else {
            throw new IllegalArgumentException("Tanımsız buton: " + butonText);
        }
    }

    @Then("Kullanıcı checkout sayfasına yönlendirilir")
    public void kullanıcı_checkout_sayfasına_yönlendirilir() {
        wait.until(ExpectedConditions.visibilityOf(cananPage.checkoutBasligiC));
        Assert.assertTrue(cananPage.checkoutBasligiC.isDisplayed());
    }

    @When("Kullanıcı bir ödeme yöntemi seçer")
    public void kullanıcı_bir_ödeme_yöntemi_seçer() {
        wait.until(ExpectedConditions.visibilityOf(cananPage.accountChargeEtiketiC));
        Assert.assertTrue(cananPage.accountChargeEtiketiC.isDisplayed());
        cananPage.accountChargeEtiketiC.click();
    }

    @And("{string} butonuna tıklarr")
    public void butonunaTıklarr(String arg0) {
        wait.until(ExpectedConditions.visibilityOf(cananPage.startPaymentButonuC));
        Assert.assertTrue(cananPage.startPaymentButonuC.isDisplayed());
        cananPage.startPaymentButonuC.click();
    }

    @Then("Ödeme işlemi tamamlanır ve {string} onay mesajı görünür olmalı.")
    public void ödemeIşlemiTamamlanırVeOnayMesajıGörünürOlmalı(String mesaj) {
    wait.until(ExpectedConditions.visibilityOf(cananPage.congratulationsMesajiC));
        if (mesaj.equals("Congratulations")) {
            Assert.assertTrue(cananPage.congratulationsMesajiC.isDisplayed());

        }

    }


}



