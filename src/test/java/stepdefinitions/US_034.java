package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;
import pages.InstructorsPage;
import utils.JSUtilities;
import utils.LoggerHelper;
import utils.ReusableMethods;

import java.time.Duration;

public class US_034 {

    WebDriver driver = DriverManager.getDriver();
    BasePage basePage = new BasePage(driver);
    ReusableMethods reusableMethods = new ReusableMethods();
    InstructorsPage instructorsPage = new InstructorsPage(driver);


    @Then("Instructors yazisi görünür oldugu dogrulanir")
    public void instructors_yazisi_görünür_oldugu_dogrulanir() {
        LoggerHelper.info("Instructor yazisinin görünür oldugu dogrulaniyor");
        Allure.step("Instructor yazisinin görünür oldugu dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getInstructorButton()),"Instructor yazisinin görünür oldugu dogrulanamadi");


    }
    @Then("Instructors yazisina tiklanir")
    public void instructors_yazisina_tiklanir() {
        LoggerHelper.info("Instructors yazisina tiklaniyor");
        Allure.step("Instructors yazisina tiklaniyor");
        basePage.click(instructorsPage.getInstructorButton());
    }


    @Then("Acilan sayfada Instructors yazisinin yer aldigi dogrulanir")
    public void acilan_sayfada_instructors_yazisinin_yer_aldigi_dogrulanir() {
        LoggerHelper.info("Acilan sayfada Instructors yazisinin yer aldigi dogrulaniyor");
        Allure.step("Acilan sayfada Instructors yazisinin yer aldigi dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getInstructorYazisi()),"Acilan sayfada Instructors yazisinin yer aldigi dogrulanamadi");
    }

    @Then("Search textbox görünürlügü dogrulanir")
    public void search_textbox_görünürlügü_dogrulanir() {
        LoggerHelper.info("Search textbox görünürlügü dogrulaniyor");
        Allure.step("Search textbox görünürlügü dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getSearchBox()),"Search textbox görünürlügü dogrulanamadi");
    }
    @Then("search butonunun görünürlügü dogrulanir")
    public void search_butonunun_görünürlügü_dogrulanir() {
        LoggerHelper.info("search butonunun görünürlügü dogrulaniyor");
        Allure.step("search butonunun görünürlügü dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getSearchButton()),"search butonunun görünürlügü dogrulanamadi");
    }

    @Then("Search box'a {string} yazilip aratilir")
    public void search_box_a_yazilip_aratilir(String instractorName) {
        LoggerHelper.info("Search box'a "+instractorName+" yazilip aratiliyor");
        Allure.step("Search box'a "+instractorName+" yazilip aratiliyor");
        basePage.type(instructorsPage.getSearchBox(), instractorName);
    }

    @Then("Gelen sonucun {string} icerdigi dogrulanir")
    public void gelen_sonucun_icerdigi_dogrulanir(String instractorName) {
        LoggerHelper.info("Gelen sonucun "+instractorName+" icerdigi dogrulaniyor");
        Allure.step("Gelen sonucun "+instractorName+" icerdigi dogrulaniyor");
        Assert.assertTrue(instructorsPage.searchResultTest(instractorName),"Gelen sonucun "+instractorName+" icerdigi dogrulanamadi");
    }

    @Then("Search box'a tiklanir")
    public void search_box_a_tiklanir() {
        LoggerHelper.info("Search box'a tiklaniyor");
        Allure.step("Search box'a tiklaniyor");
        JSUtilities.clickWithJS(driver,instructorsPage.getSearchButton());
    }

    @When("Categories'e tiklanir")
    public void categories_e_tiklanir() {
        LoggerHelper.info("Categories'e tiklaniyor");
        Allure.step("Categories'e tiklaniyor");
       basePage.click(instructorsPage.getCategories());
    }
    @When("Categories'in icinde 'Web Design'a tiklanir")
    public void categories_in_icinde_web_design_a_tiklanir() {
        LoggerHelper.info("Categories'in icinde 'Web Design'a tiklaniyor");
        Allure.step("Categories'in icinde 'Web Design'a tiklaniyor");
        basePage.click(instructorsPage.getWebDesign());
    }
    @Then("Acilan URL'in {string} kelimesini icerdigi dogrulanir")
    public void acilan_url_in_kelimesini_icerdigi_dogrulanir(String word) {
        LoggerHelper.info("Acilan URL'in "+word+ " kelimesini icerdigi dogrulaniyor");
        Allure.step("Acilan URL'in "+word+ " kelimesini icerdigi dogrulaniyor");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(word),"Acilan URL'in "+word+ " kelimesini icerdigi dogrulanamadi");
    }

    @Given("Reserve a meeting e tiklanir")
    public void reserve_a_meeting_e_tiklanir() {

        LoggerHelper.info("Reserve a meeting e tiklaniyor");
        Allure.step("Reserve a meeting e tiklaniyor");
        ReusableMethods.bekle(2);
        JSUtilities.scrollToVisibleElement(driver,instructorsPage.getReserveButton());
        JSUtilities.clickWithJS(driver,instructorsPage.getReserveButton());
    }
    @Given("Uygun bir tarih secilir")
    public void uygun_bir_tarih_secilir() {
        LoggerHelper.info("Uygun bir tarih seciliyor");
        Allure.step("Uygun bir tarih seciliyor");
        ReusableMethods.bekle(2);
        JSUtilities.scrollToVisibleElement(driver,instructorsPage.getDate());
        JSUtilities.clickWithJS(driver,instructorsPage.getDate());

    }
    @Given("Saat secilir")
    public void saat_secilir() {
        ReusableMethods.bekle(2);
        LoggerHelper.info("Uygun bir saat seciliyor");
        Allure.step("Uygun bir saat seciliyor");
        JSUtilities.scrollToVisibleElement(driver,instructorsPage.getTime());
        JSUtilities.clickWithJS(driver,instructorsPage.getTime());
    }
    @Given("Meeting Type secilir")
    public void meeting_type_secilir() {
        LoggerHelper.info("Meeting Type seciliyor");
        Allure.step("Meeting Type seciliyor");
        ReusableMethods.bekle(2);
        JSUtilities.scrollToVisibleElement(driver,instructorsPage.getMeetingType());
        JSUtilities.clickWithJS(driver,instructorsPage.getMeetingType());
    }

    @Given("Reserve a meeting e tekrar tiklanir")
    public void reserve_a_meeting_e_tekrar_tiklanir() {
        LoggerHelper.info("Reserve a meeting e tiklaniyor");
        Allure.step("Reserve a meeting e tiklaniyor");
        ReusableMethods.bekle(2);
        JSUtilities.scrollToVisibleElement(driver,instructorsPage.getReserveMeetingButton());
        JSUtilities.clickWithJS(driver,instructorsPage.getReserveMeetingButton());
    }

    @Given("Yönlendirilen sayfada Meeting Reservation yazisinin görüldügü dogrulanir")
    public void yönlendirilen_sayfada_meeting_reservation_yazisinin_görüldügü_dogrulanir() {
        LoggerHelper.info(" Meeting Reservation yazisinin görüldügü dogrulaniyor");
        Allure.step(" Meeting Reservation yazisinin görüldügü dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getInstructorYazisi()),"Meeting Reservation yazisinin görüldügü dogrulanamadi");
    }

    @Given("Checkout butonuna tiklanir")
    public void checkout_butonuna_tiklanir() {
        LoggerHelper.info("Checkout butonuna tiklaniyor");
        Allure.step("Checkout butonuna tiklaniyor");
        //ReusableMethods.bekle(2);
        JSUtilities.waitForPageLoadWithJS(driver, Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(instructorsPage.getCheckout()));
        JSUtilities.scrollToVisibleElement(driver,instructorsPage.getCheckout());
        JSUtilities.clickWithJS(driver,instructorsPage.getCheckout());
    }

    @Given("Acoount Charge'a tiklanir")
    public void acoount_charge_a_tiklanir() {
        LoggerHelper.info("Acount Charge'a tiklaniyor");
        Allure.step("Acount Charge'a tiklaniyor");
        JSUtilities.scrollToVisibleElement(driver,instructorsPage.getAccountCharge());
        JSUtilities.clickWithJS(driver,instructorsPage.getAccountCharge());
    }
    @Given("Start Payment'a tiklanir")
    public void start_payment_a_tiklanir() {
        LoggerHelper.info("Start Payment'a tiklaniyor");
        Allure.step("Start Payment'a tiklaniyor");
        JSUtilities.clickWithJS(driver,instructorsPage.getStartPayment());
    }
    @Given("Yönlendirilen sayfada My Panel butonunun görünür ve aktif oldugu dogrulanir")
    public void yönlendirilen_sayfada_my_panel_butonunun_görünür_ve_aktif_oldugu_dogrulanir() {
        LoggerHelper.info("Yönlendirilen sayfada My Panel butonunun görünür ve aktif oldugu dogrulaniyor");
        Allure.step("Yönlendirilen sayfada My Panel butonunun görünür ve aktif oldugu dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getMyPanel()),"Yönlendirilen sayfada My Panel butonunun görünür ve aktif oldugu dogrulanamadi");
    }

    @Then("Secilen instructor'in fiyat, ders adi, begeni bilgilerinin görüldügü dogrulanir")
    public void secilen_instructor_in_fiyat_ders_adi_begeni_bilgilerinin_görüldügü_dogrulanir() {
        LoggerHelper.info("Secilen instructor'in fiyat bilgisinin görünür oldugu dogrulaniyor");
        Allure.step("Secilen instructor'in fiyat bilgisinin görünür oldugu dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getPrice()),"Secilen instructor'in fiyat bilgisinin görünür oldugu dogrulanamadi");
        LoggerHelper.info("Secilen instructor'in ders bilgisinin görünür oldugu dogrulaniyor");
        Allure.step("Secilen instructor'in ders bilgisinin görünür oldugu dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getLesson()),"Secilen instructor'in ders bilgisinin görünür oldugu dogrulanamadi");
        LoggerHelper.info("Secilen instructor'in begeni bilgisinin görünür oldugu dogrulaniyor");
        Allure.step("Secilen instructor'in begeni bilgisinin görünür oldugu dogrulaniyor");
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getLike()),"Secilen instructor'in begeni bilgisinin görünür oldugu dogrulanamadi");
    }


}
