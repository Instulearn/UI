package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.AlpayPage;
import utils.JSUtilities;
import utils.ReusableMethods;

import java.util.ResourceBundle;

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
        JSUtilities.clickWithJS(driver, alpayPage.logOut);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/");
        ReusableMethods.bekle(3);
    }

    @Given("Courses support alt basligina tiklanir")
    public void courses_alt_basligina_tiklanir(){
        alpayPage.coursesSupportBasligi.click();
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support");
        ReusableMethods.bekle(3);
    }

    @Given("Ekrandaki board ogeleri kontrol edilir")
    public void ekrandaki_board_ogeleri_kontrol_edilir(){
        assertTrue(alpayPage.openConversations.isDisplayed());
        assertTrue(alpayPage.closedConversations.isDisplayed());
        assertTrue(alpayPage.totalConversations.isDisplayed());
        ReusableMethods.bekle(2);

    }
    @Given("Mesaj gecmisi kisminda filtre uygulanir")
    public void mesaj_gecmisi_kisminda_filtre_uygulanir(){

        SoftAssert softAssert = new SoftAssert();

        alpayPage.dateFrom.click();
        alpayPage.applyFrom.click();
        ReusableMethods.bekle(2);
        alpayPage.dateTo.click();
        alpayPage.applyTo.click();
        ReusableMethods.bekle(2);

        alpayPage.showResults.click();

        if(alpayPage.noResultsText.isDisplayed()){
           softAssert.assertFalse(true,"Filtreleme Hatasi");
           alpayPage.dateFrom.clear();
           ReusableMethods.bekle(1);
           alpayPage.dateTo.clear();
           ReusableMethods.bekle(1);
           alpayPage.showResults.click();
           ReusableMethods.bekle(1);
        }
        softAssert.assertAll();
    }

    @Given("Bir mesaj secilir ve cevap yazilip kapatilir")
    public void bir_mesaj_secilir_ve_kapatilir(){

        alpayPage.firstMessage.click();
        ReusableMethods.bekle(3);
        JSUtilities.scrollToBottom(driver);
        alpayPage.replyMessage.sendKeys("Sorun Cozuldu Tesekkurler");
        ReusableMethods.bekle(3);
        alpayPage.sendTicketMessage.click();
        JSUtilities.scrollToBottom(driver);
        ReusableMethods.bekle(3);
        alpayPage.closeRequest.click();
        ReusableMethods.bekle(3);

        assertTrue(alpayPage.closedMessageText.isDisplayed());
    }

    @Given("Ticket Alt basligina tiklanir")
    public void ticket_alt_basligina_tiklanir(){
        JSUtilities.clickWithJS(driver, alpayPage.ticketsBasligi);
        ReusableMethods.bekle(2);

    }


}
