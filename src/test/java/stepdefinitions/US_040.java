package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.KeremPage;
import utils.ReusableMethods;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

public class US_040 {
    WebDriver driver = DriverManager.getDriver();
    private static final Logger logger = LogManager.getLogger(US_040.class);
    KeremPage keremPage = new KeremPage(driver);

    // ****************** TC_40.1 farklı stepler ***************************

    @And("header bölümündeki profil ismine tıklar, açılan menüde dashboard'a tıklar")
    public void headerBölümündekiProfilIsmineTıklarAçılanMenüdeDashboardATıklar() {
        logger.info("Profil isminin görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.anasayfaProfilIsmi.isDisplayed());
        assertTrue(keremPage.anasayfaProfilIsmi.isEnabled());

        logger.info("Profil ismine tıklanıyor.");
        keremPage.anasayfaProfilIsmi.click();
        ReusableMethods.bekle(1);

        logger.info("Dashboard bağlantısının görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.anasayfaDashboardBaglantisi.isDisplayed());
        assertTrue(keremPage.anasayfaDashboardBaglantisi.isEnabled());

        logger.info("Dashboard bağlantısına tıklanıyor.");
        keremPage.anasayfaDashboardBaglantisi.click();
    }

    @Then("kullanıcı ‘Student Panel' {string} sayfasına yönlendirilir")
    public void kullanıcıStudentPanelSayfasınaYönlendirilir(String panelUrl) {

        ReusableMethods.bekle(1);
        String actualUrl = driver.getCurrentUrl();
        logger.info("Yönlendirme kontrolü yapılıyor. Beklenen URL: {}, Güncel URL: {}", panelUrl, actualUrl);
        assertEquals(actualUrl, panelUrl);

        logger.info("Yönlendirme başarılı şekilde gerçekleşti.");
    }

    @And("dashboard sidebard'da yer alan Logout linkine tıklar")
    public void dashboardSidebardDaYerAlanLogoutLinkineTıklar() {
        logger.info("Logout butonunun görünür ve aktif olduğu doğrulanıyor...");
        assertTrue(keremPage.studentPanelLogoutButonu.isDisplayed());
        assertTrue(keremPage.studentPanelLogoutButonu.isEnabled());

        Actions actions = new Actions(driver);

        // Sidebar'da önce Meetings elementine focus al ve tıklayarak aktif et
        actions.moveToElement(keremPage.studentDashboardMeetingBaglantisi).click().perform();

        logger.info("Sidebar scroll için klavye ile aşağı kaydırılıyor...");
        // Klavyeyle birkaç kez PAGE_DOWN gönder, sidebar aktifken scroll eder
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);  // Yarım saniye bekle
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);

        // Logout butonuna mouse ile in
        actions.moveToElement(keremPage.studentPanelLogoutButonu).perform();

        logger.info("Logout butonuna tıklanıyor...");
        keremPage.studentPanelLogoutButonu.click();
        //logout sonrası anasayfa açılmalı, işlemin doğruluğu test ediliyor
        logger.info("Logout işlemi sonrası yönlendirme kontrol ediliyor...");
        ReusableMethods.bekle(1);
        String expectedUrl= ConfigReader.getProperty("url");
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)) {
            logger.info("Logout başarılı. Kullanıcı ana sayfaya yönlendirildi.");
        } else {
            logger.error("Logout başarısız! Beklenen URL: " + expectedUrl + ", Gerçekleşen URL: " + actualUrl);
        }
        assertEquals(actualUrl, expectedUrl);
    }

    // ****************** TC_40.2 farklı stepler ***************************

    @Then("dashboard sidebar’da Courses,Meetings,Quizzes,Certificates,Financial,Support,Notifications,Settings,Log Out\" linkleri görür ve aktif olduğunu test eder")
    public void dashboardSidebarDaCoursesMeetingsQuizzesCertificatesFinancialSupportNotificationsSettingsLogOutLinkleriGörürVeAktifOlduğunuTestEder() {

        Actions actions = new Actions(driver);

        // Coursess
        logger.info("Sidebar 'Courses' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentSidebarCoursesBaglantisi.isDisplayed());
        assertTrue(keremPage.studentSidebarCoursesBaglantisi.isEnabled());
        logger.info("'Courses' bağlantısı görünür ve aktif.");

        // Meetings
        logger.info("Sidebar 'Meetings' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentDashboardMeetingBaglantisi.isDisplayed());
        assertTrue(keremPage.studentDashboardMeetingBaglantisi.isEnabled());
        logger.info("'Meetings' bağlantısı görünür ve aktif.");

        // Quizzes
        logger.info("Sidebar 'Quizzes' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentSidebarQuizzesBaglantisi.isDisplayed());
        assertTrue(keremPage.studentSidebarQuizzesBaglantisi.isEnabled());
        logger.info("'Quizzes' bağlantısı görünür ve aktif.");

        // Sertifika
        logger.info("Sidebar 'Sertifika' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentSidebarSertifikaBaglantisi.isDisplayed());
        assertTrue(keremPage.studentSidebarSertifikaBaglantisi.isEnabled());
        logger.info("'Sertifika' bağlantısı görünür ve aktif.");

        // Finans
        logger.info("Sidebar 'Finans' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentSidebarFinansBaglantisi.isDisplayed());
        assertTrue(keremPage.studentSidebarFinansBaglantisi.isEnabled());
        logger.info("'Finans' bağlantısı görünür ve aktif.");

        // Support
        logger.info("Sidebar 'Support' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentSidebarSupportBaglantisi.isDisplayed());
        assertTrue(keremPage.studentSidebarSupportBaglantisi.isEnabled());
        logger.info("'Support' bağlantısı görünür ve aktif.");

        // Notifications
        logger.info("Sidebar 'Notifications' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentSidebarNotificationsBaglantisi.isDisplayed());
        assertTrue(keremPage.studentSidebarNotificationsBaglantisi.isEnabled());
        logger.info("'Notifications' bağlantısı görünür ve aktif.");

        // Settings
        logger.info("Sidebar 'Settings' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentSidebarSettingsBaglantisi.isDisplayed());
        assertTrue(keremPage.studentSidebarSettingsBaglantisi.isEnabled());
        logger.info("'Settings' bağlantısı görünür ve aktif.");

        // LOGOUT – scroll + kontrol
        logger.info("Sidebar scroll için 'Metting' bağlantısına tıklanıyor...");
        actions.moveToElement(keremPage.studentDashboardMeetingBaglantisi).click().perform();

        logger.info("Sidebar scroll için klavye ile aşağı iniliyor...");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);

        logger.info("Logout butonuna mouse ile yaklaşılıyor...");
        actions.moveToElement(keremPage.studentPanelLogoutButonu).perform();

        logger.info("Logout butonunun görünür ve aktifliği kontrol ediliyor...");
        assertTrue(keremPage.studentPanelLogoutButonu.isDisplayed());
        assertTrue(keremPage.studentPanelLogoutButonu.isEnabled());
        logger.info("'Logout' bağlantısı görünür ve aktif.");
    }

    // ****************** TC_40.3 farklı stepler ***************************

    @And("acilan sayfada {string} basligini gorur")
    public void acilanSayfadaBasliginiGorur(String title) {

        logger.info("Sayfada '" + title + "' başlığının görünür olduğu kontrol ediliyor...");

        assertTrue(keremPage.studentViewAllEventsTitle.isDisplayed());

        logger.info("'" + title + "' başlığı sayfada görünür durumda.");
    }



    // ****************** TC_40.4 farklı stepler ***************************


    @And("dashboard board bölümünde yer alan Account Balance, Charge Account, Purchased Courses, Support Messages, Meetings ve Comments bağlantılarının görünür ve aktif olduğunu test eder")
    public void dashboardBoardBölümündeYerAlanAccountBalanceChargeAccountPurchasedCoursesSupportMessagesMeetingsVeCommentsBağlantılarınınGörünürVeAktifOlduğunuTestEder() {

        logger.info("'Purchase a Course' başlığı kontrol ediliyor...");
        assertTrue(keremPage.studentDashboardPurchaseCourseTitle.isDisplayed());
        assertTrue(keremPage.studentDashboardPurchaseCourseTitle.isEnabled());
        logger.info("'Purchase a Course' başlığı görünür ve aktif.");

        logger.info("'Support Messages' başlığı kontrol ediliyor...");
        assertTrue(keremPage.studentDashboardSupportMessagesTitle.isDisplayed());
        assertTrue(keremPage.studentDashboardSupportMessagesTitle.isEnabled());
        logger.info("'Support Messages' başlığı görünür ve aktif.");

        logger.info("'Charge Account' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentDashboardChargeAccountBaglantisi.isDisplayed());
        assertTrue(keremPage.studentDashboardChargeAccountBaglantisi.isEnabled());
        logger.info("'Charge Account' bağlantısı görünür ve aktif.");

        logger.info("'Meetings' bağlantısı (body) kontrol ediliyor...");
        assertTrue(keremPage.studentDashboardBodyMeetingsBaglantisi.isDisplayed());
        assertTrue(keremPage.studentDashboardBodyMeetingsBaglantisi.isEnabled());
        logger.info("'Meetings' bağlantısı görünür ve aktif.");

        logger.info("'Comments' bağlantısı kontrol ediliyor...");
        assertTrue(keremPage.studentDashboardCommentsBaglantisi.isDisplayed());
        assertTrue(keremPage.studentDashboardCommentsBaglantisi.isEnabled());
        logger.info("'Comments' bağlantısı görünür ve aktif.");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        logger.info("'Account Balance' bağlantısının görünür ve aktif olduğu kontrol ediliyor...");
        assertTrue(keremPage.studentDashboardAccountBalanceBaglantisi.isDisplayed());
        assertTrue(keremPage.studentDashboardAccountBalanceBaglantisi.isEnabled());
        logger.info("'Account Balance' bağlantısı görünür ve aktif (ilk kontrol).");

        logger.info("'Account Balance' bağlantısının gerçekten tıklanabilir olduğu kontrol ediliyor...");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(keremPage.studentDashboardAccountBalanceBaglantisi));
            logger.info("'Account Balance' bağlantısı gerçekten tıklanabilir.");
        } catch (TimeoutException e) {
            logger.error("'Account Balance' bağlantısı tıklanabilir değil! Overlay, scroll ya da başka bir engel olabilir.");
            fail("'Account Balance' bağlantısı tıklanabilir değil.");
        }

    }
}
