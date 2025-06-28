package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.AlpayPage;
import utils.ReusableMethods;

import static org.testng.Assert.*;

public class US_046 {

    WebDriver driver = DriverManager.getDriver(); // fetch current thread's driver
    AlpayPage alpayPage = new AlpayPage(driver);

    @Given("Dashboard menu sidebar da support menusu oldugunu kontrol eder")
    public void dashboard_menu_sidebar_da_support_menusu_oldugunu_kontrol_eder() {

        assertTrue(alpayPage.supportBasligi.isDisplayed());

        ReusableMethods.bekle(2);
    }
    @Given("Support basligina tiklanir")
    public void support_basligina_tiklanir() {

        alpayPage.supportBasligi.click();
        ReusableMethods.bekle(2);

        assertTrue(alpayPage.newBasligi.isDisplayed());
    }
    @Given("Support basliginin altindaki her bir baglantiya tiklanir")
    public void support_basliginin_altindaki_her_bir_baglantiya_tiklanir() {

        alpayPage.newBasligi.click();
        ReusableMethods.bekle(2);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support/new");

        alpayPage.coursesSupportBasligi.click();
        ReusableMethods.bekle(2);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support");

        alpayPage.ticketsBasligi.click();
        ReusableMethods.bekle(2);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support/tickets");
    }

    @Given("New alt basligina tiklanir")
    public void new_alt_basligina_tiklanir() {

        alpayPage.newBasligi.click();
        ReusableMethods.bekle(2);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support/new");

    }
    @Given("Subject alanına bilgi girilir")
    public void alanina_bilgi_girilir() {
        alpayPage.subjectTextArea.sendKeys("Payout");
        ReusableMethods.bekle(2);
    }
    @Given("Type secimi yapilir")
    public void secimi_yapilir() {
        Select select = new Select(alpayPage.typeDropdown);
        select.selectByVisibleText("Platform support");
        ReusableMethods.bekle(2);

    }
    @Given("Department secilir")
    public void course_secimi_yapilir() {
        Select select = new Select(alpayPage.department);
        select.selectByVisibleText("Financial");
        ReusableMethods.bekle(2);
    }


    @Given("Message yazilir")
    public void message_yazilir() {

        alpayPage.messageTextArea.sendKeys("Yanlislikla hesabima fazla para yukledim ve Payoutdan para iadesi almak istedim ama" +
                " gerekli bilgileri doldurdugum halde Payout butonu aktif olmadi");
        ReusableMethods.bekle(5);

    }

    @Given("Gonder butonuna tiklanir")
    public void butonuna_tiklanir() {
        alpayPage.attachTextArea.sendKeys("/store/1584/download.png");
        ReusableMethods.bekle(2);
        alpayPage.sendMessage.click();
        ReusableMethods.bekle(3);
        assertTrue(alpayPage.waitingText.isDisplayed());
    }

    @Given("Logout butonuna tiklanir")
    public void logout_butonuna_tiklanir() {
        alpayPage.logOut.click();
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/");
        ReusableMethods.bekle(3);
    }


}
