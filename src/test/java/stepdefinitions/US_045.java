package stepdefinitions;

import context.ScenarioContext;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.AlpayPage;
import utils.JSUtilities;
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
        ReusableMethods.bekle(1);

        assertTrue(financialSummary.isDisplayed());

        ReusableMethods.bekle(3);
    }
    @Given("Financial Summary baglantisina tiklanir ve ilgili sayfanin yuklendigi kontrol edilir")
    public void financial_summary_baglantisina_tiklanir() {

        WebElement financialSummary = new AlpayPage(driver).financialSummary;
        financialSummary.click();
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/financial/summary");

        ReusableMethods.bekle(3);

    }
    @Given("Payout baglantisina tiklanir ve henuz tanimli bir hesap yoksa davranis kontrol edilir")
    public void payout_baglantisina_tiklanir_ve_henuz_tanimli_bir_hesap_yoksa_davranis_kontrol_edilir() {

        WebElement payout = new AlpayPage(driver).payout;
        WebElement accountSummary = new AlpayPage(driver).accountSummary;
        WebElement yourIdentity = new AlpayPage(driver).yourIdendity;
        payout.click();
        softAssert().assertTrue(accountSummary.isDisplayed());
        softAssert().assertTrue(yourIdentity.isDisplayed());

        ReusableMethods.bekle(10);


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
        ReusableMethods.bekle(3);
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
        ReusableMethods.bekle(5);

        assertTrue(requestDone.isDisplayed());
        assertTrue(false, "Tanimli Hesap olusmadi");

    }

    @Given("Tanimli hesap silinir")
    public void tanimli_hesap_silinir() {
        assertTrue(false, "Tanimli Hesap Bulunmamaktadir");
    }

    @Given("Charge Account baglantisina tiklanir")
    public void charge_account_baglantisina_tiklanir() {
        WebElement chargeAccount = new AlpayPage(driver).chargeAccount;
        WebElement financialBaslik = new AlpayPage(driver).financialBaslik;

        if(!chargeAccount.isDisplayed()){
            financialBaslik.click();
        }

        ReusableMethods.bekle(3);
        chargeAccount.click();

        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/financial/account");

        ReusableMethods.bekle(3);
    }

    @Given("Odeme yontemi ve tutar girilerek islem tamamlanir")
    public void odeme_yontemi_ve_tutar_girilerek_islem_tamamlanir() {

        WebElement stripeButton = new AlpayPage(driver).stripeButton;
        WebElement amount = new AlpayPage(driver).amount;
        WebElement payButton = new AlpayPage(driver).payButton;
        WebElement emailStripe = new AlpayPage(driver).emailStripe;
        WebElement cardNumber = new AlpayPage(driver).cardNumber;
        WebElement cardExpiry = new AlpayPage(driver).cardExpiry;
        WebElement cardCvc = new AlpayPage(driver).cardCvc;
        WebElement billingName = new AlpayPage(driver).billingName;
        WebElement billingCountry = new AlpayPage(driver).billingCountry;
        WebElement submitButton = new AlpayPage(driver).submitButton;

        stripeButton.click();
        ReusableMethods.bekle(3);
        amount.sendKeys("100");
        payButton.click();
        ReusableMethods.bekle(3);

        assertTrue(emailStripe.isDisplayed());

        emailStripe.sendKeys("test.student@instulearn.com");
        ReusableMethods.bekle(2);
        cardNumber.sendKeys("4242424242424242");
        ReusableMethods.bekle(2);
        cardExpiry.sendKeys("12");
        cardExpiry.sendKeys("40");
        ReusableMethods.bekle(2);
        cardCvc.sendKeys("242");
        ReusableMethods.bekle(2);
        billingName.sendKeys("Tester Name");
        ReusableMethods.bekle(2);
        Select select = new Select(billingCountry);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(2);
        submitButton.click();
        ReusableMethods.bekle(6);

        assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/payments/status");

        ReusableMethods.bekle(4);
    }
    @Given("Subscribe baglantisina tiklanir")
    public void subscribe_baglantisina_tiklanir() {

        WebElement subscribe = new AlpayPage(driver).subscribe;
        subscribe.click();
        ReusableMethods.bekle(4);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/financial/subscribes");


    }
    @Given("Yeni bir uyelik plani secilip olusturulur")
    public void yeni_bir_uyelik_plani_secilip_olusturulur() {

        WebElement purchase = new AlpayPage(driver).purchase;
        WebElement accountCharge = new AlpayPage(driver).accountCharge;
        WebElement paymentSubmit = new AlpayPage(driver).paymentSubmit;
        WebElement activePlan = new AlpayPage(driver).activePlan;

        if (!activePlan.isDisplayed()){
            JSUtilities.scrollToBottom(driver);
            purchase.click();
            ReusableMethods.bekle(4);
            accountCharge.click();
            ReusableMethods.bekle(3);
            paymentSubmit.click();
            ReusableMethods.bekle(3);
            assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/payments/status");

        }
        else {
            ReusableMethods.bekle(3);
        }
    }

}
