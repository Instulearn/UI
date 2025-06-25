package stepdefinitions;

import context.ScenarioContext;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.AlpayPage;
import utils.ReusableMethods;

import static org.testng.Assert.*;


public class US_045 {
    WebDriver driver = DriverManager.getDriver(); // fetch current thread's driver

    private SoftAssert softAssert() {
        return ScenarioContext.softAssert.get();
    }

    @Given("Dashboard menu sidebar da Financial basligi goruntulenir ve tiklanir")
    public void dashboard_menu_sidebar_da_financial_basligi_goruntulenir() {

        WebElement financialBaslik = new AlpayPage(driver).financialBaslik;
        WebElement financialSummary = new AlpayPage(driver).financialSummary;
        assertTrue(financialBaslik.isDisplayed());
        financialBaslik.click();
        softAssert().assertTrue(financialSummary.isDisplayed());

        ReusableMethods.bekle(2);
    }
    @Given("Financial Summary baglantisina tiklanir ve ilgili sayfanin yuklendigi kontrol edilir")
    public void financial_summary_baglantisina_tiklanir() {

        WebElement financialSummary = new AlpayPage(driver).financialSummary;
        WebElement financialDocuments = new AlpayPage(driver).financialDocuments;
        financialSummary.click();
        softAssert().assertTrue(financialDocuments.isDisplayed());

        ReusableMethods.bekle(2);

    }
    @Given("Payout baglantisina tiklanir ve henuz tanimli bir hesap yoksa davranis kontrol edilir")
    public void payout_baglantisina_tiklanir_ve_henuz_tanimli_bir_hesap_yoksa_davranis_kontrol_edilir() {

        WebElement payout = new AlpayPage(driver).payout;
        WebElement accountSummary = new AlpayPage(driver).accountSummary;
        WebElement yourIdentity = new AlpayPage(driver).yourIdendity;
        payout.click();
        softAssert().assertTrue(accountSummary.isDisplayed());
        softAssert().assertTrue(yourIdentity.isDisplayed());

        ReusableMethods.bekle(2);


    }
    @Given("Ayarlar sayfasindan hesap tanimlanir")
    public void ayarlar_sayfasindan_hesap_tanimlanir() {

        WebElement settings = new AlpayPage(driver).settings;
        WebElement selectAccountType = new AlpayPage(driver).selectAccountType;
        WebElement accountHolderField = new AlpayPage(driver).accountHolderField;
        WebElement emailField = new AlpayPage(driver).emailField;
        WebElement identityScanField = new AlpayPage(driver).identityScanField;
        WebElement certificatesField = new AlpayPage(driver).certificateField;
        WebElement addressField = new AlpayPage(driver).addressField;
        WebElement saveButton = new AlpayPage(driver).saveButton;
        WebElement requestDone = new AlpayPage(driver).requestDone;

        settings.click();
        ReusableMethods.bekle(1);
        Select select = new Select(selectAccountType);
        select.selectByVisibleText("Paypal");
        ReusableMethods.bekle(2);
        accountHolderField.clear();
        accountHolderField.sendKeys("Alpay");
        ReusableMethods.bekle(2);
        emailField.clear();
        emailField.sendKeys("alpay.student@instulearn.com");
        ReusableMethods.bekle(2);
        identityScanField.clear();
        identityScanField.sendKeys("/store/1525/testng.png");
        ReusableMethods.bekle(2);
        certificatesField.clear();
        certificatesField.sendKeys("/store/1524/testng.png");
        ReusableMethods.bekle(2);
        addressField.clear();
        addressField.sendKeys("Greenwich, London, UK");
        ReusableMethods.bekle(2);
        saveButton.click();
        ReusableMethods.bekle(2);

        assertTrue(requestDone.isDisplayed());





    }

    @Given("Tanimli hesap silinir")
    public void tanimli_hesap_silinir() {
        assertTrue(false, "Tanimli Hesap Bulunmamaktadir");
    }
    @Given("Charge Account baglantisina tiklanir")
    public void charge_account_baglantisina_tiklanir() {

    }
    @Given("Odeme yontemi ve tutar girilerek islem tamamlanir")
    public void odeme_yontemi_ve_tutar_girilerek_islem_tamamlanir() {

    }
    @Given("Subscribe baglantisina tiklanir")
    public void subscribe_baglantisina_tiklanir() {

    }
    @Given("Yeni bir uyelik plani secilip olusturulur")
    public void yeni_bir_uyelik_plani_secilip_olusturulur() {

    }



}
