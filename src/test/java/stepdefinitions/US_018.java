package stepdefinitions;

import config.UserConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.CananPage;

import java.time.Duration;

public class US_018 {


    WebDriver driver = DriverManager.getDriver();
    CananPage cananPage = new CananPage(driver);

    @Given("Kullanıcı ana sayfaya gider")
    public void kullanıcı_ana_sayfaya_gider() {
        DriverManager.getDriver().get("https://qa.instulearn.com/");
    }
    @Then("Footer bölümü görünür olmalıdır")
    public void footer_bölümü_görünür_olmalıdır() {
        Assert.assertTrue(cananPage.footerBolumu.isEnabled());
    }
    @Then("Footer içindeki {string} linki görünür ve aktif olmalıdır")


    public void footer_icindeki_linki_gorunur_ve_aktif_olmalidir(String linkName) {

        WebElement link;

        switch (linkName) {
            case "About us":
                link = cananPage.aboutUsLink;
                break;
            case "Contact us":
                link = cananPage.contactUsLink;
                break;
            case "Certificate validation":
                link = cananPage.certificateValidationLink;
                break;
            case "Terms & rules":
                link = cananPage.termsAndRulesLink;
                break;
            default:
                throw new RuntimeException("Bilinmeyen link: " + linkName);
        }

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(link));
        Assert.assertTrue(link.isEnabled(), linkName + " linki aktif değil!");
    }

    @When("Kullanıcı footer'daki subscriber alanına geçerli bir email girer")
    public void kullanıcı_footer_daki_subscriber_alanına_geçerli_bir_email_girer() {
        String email = UserConfigReader.getProperty("newsletterMail");
        cananPage.subscriberEmailInput.sendKeys(email);

    }
    @When("Abone ol butonuna tıklar")
    public void abone_ol_butonuna_tıklar() {

       cananPage.subscribeButon.click();
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
    }

    @Then("Abone olunduğuna dair başarı mesajı görünür olmalıdır")
    public void abone_olunduğuna_dair_başarı_mesajı_görünür_olmalıdır() {
        Assert.assertTrue(cananPage.requestDoneMesajiC.isDisplayed());
    }

    @Then("{string} ikonu görünür ve aktif olmalıdır")
    public void ikonu_gorunur_ve_aktif_olmalidir(String iconName) {


        WebElement icon;

        switch (iconName) {
            case "Twitter":
                icon = cananPage.twitterIkon;
                break;
            case "WhatsApp":
                icon = cananPage.whatsappIkon;
                break;
            case "Instagram":
                icon = cananPage.instagramIkon;
                break;
            case "Facebook":
                icon = cananPage.facebookIkon;
                break;
            default:
                throw new RuntimeException("Bilinmeyen ikon: " + iconName);
        }

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(icon));

        Assert.assertTrue(icon.isDisplayed(), iconName + " ikonu görünür değil!");
        Assert.assertTrue(icon.isEnabled(), iconName + " ikonu aktif değil!");
    }

    @Then("Footer'da {string} metni görünür olmalıdır")
    public void footer_da_metni_görünür_olmalıdır(String footerMetni) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(cananPage.footerRightsMetni));
        Assert.assertEquals(cananPage.footerRightsMetni.getText(),footerMetni);
    }

    @When("Footer'daki logo linkine tıklar")
    public void footer_daki_logo_linkine_tıklar() {
        cananPage.footerLogoLink.click();

    }
    @Then("Kullanıcı sayfanın en üstüne yönlendirilmelidir")
    public void kullanici_sayfanin_en_ustune_yonlendirilmelidir() {
        String currentUrl = DriverManager.getDriver().getCurrentUrl();
        assert currentUrl != null;
        Assert.assertTrue(currentUrl.endsWith("/"), "Kullanıcı ana sayfanın başına yönlendirilmedi!");
    }

    }







