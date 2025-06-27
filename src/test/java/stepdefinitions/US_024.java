package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.KeremPage;
import utils.ReusableMethods;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class US_024 {

    WebDriver driver = DriverManager.getDriver();
    private static final Logger logger = LogManager.getLogger(US_039.class);
    KeremPage keremPage = new KeremPage(driver);

    @Then("instructor Dashboard sidebarında Meetings linkini görür ve tıklar")
    public void instructor_dashboard_sidebarında_meetings_linkini_görür_ve_tıklar() {
        logger.info("Meetings linkinin görünürlüğü ve aktifliği kontrol ediliyor.");
        assertTrue(keremPage.instructorMeetings.isDisplayed());
        assertTrue(keremPage.instructorMeetings.isEnabled());
        logger.info("Meetings linki görünür ve aktif durumda.");

        logger.info("Meetings linkine tıklanıyor.");
        keremPage.instructorMeetings.click();
        logger.info("Meetings linkine tıklama işlemi tamamlandı.");

        logger.info("Meetings linkine tıklanıyor.");
        keremPage.instructorMeetings.click();
        logger.info("Meetings linkine tıklama işlemi tamamlandı.");
    }

    @Then("instructor meetings linkinin altında yer alan My Reservations, Requests ve Settings linkleri görür ve aktif olduğunu test eder")
    public void instructor_meetings_linkinin_altında_yer_alan_my_reservations_requests_ve_settings_linkleri_görür_ve_aktif_olduğunu_test_eder() {
        logger.info("My Reservations linkinin görünürlüğü ve aktifliği kontrol ediliyor.");
        assertTrue(keremPage.instructorMyReservationsLinki.isDisplayed());
        assertTrue(keremPage.instructorMyReservationsLinki.isEnabled());
        logger.info("My Reservations linki görünür ve aktif durumda.");

        logger.info("Requests linkinin görünürlüğü ve aktifliği kontrol ediliyor.");
        assertTrue(keremPage.instructorRequestLinki.isDisplayed());
        assertTrue(keremPage.instructorRequestLinki.isEnabled());
        logger.info("Requests linki görünür ve aktif durumda.");

        logger.info("Settings linkinin görünürlüğü ve aktifliği kontrol ediliyor.");
        assertTrue(keremPage.instructorSettingsLinki.isDisplayed());
        assertTrue(keremPage.instructorSettingsLinki.isEnabled());
        logger.info("Settings linki görünür ve aktif durumda.");
    }

    @And("instructor Meetings linkinin altında yer alan My Reservations ikonuna tıklar ve Meeting statistics alanını görür")
    public void instructorMeetingsLinkininAltındaYerAlanMyReservationsIkonunaTıklarVeMeetingStatisticsAlanınıGörür() {
        logger.info("My Reservations ikonuna tıklanmadan önce görünür ve aktiflik kontrolü yapılıyor.");
        assertTrue(keremPage.instructorMyReservationsLinki.isDisplayed());
        assertTrue(keremPage.instructorMyReservationsLinki.isEnabled());
        logger.info("My Reservations ikonu görünür ve aktif.");

        keremPage.instructorMyReservationsLinki.click();
        logger.info("My Reservations ikonuna tıklandı.");

        ReusableMethods.bekle(2);
        logger.info("Sayfa yüklenmesi için 2 saniye beklendi.");

        String expectedUrl = "https://qa.instulearn.com/panel/meetings/reservation";
        String actualUrl = driver.getCurrentUrl();
        logger.info("Sayfa URL'si alındı. Gerçek URL: " + actualUrl);

        assertEquals(actualUrl, expectedUrl);
        logger.info("Sayfa URL doğrulaması yapıldı: Beklenen URL = " + expectedUrl);

        assertTrue(keremPage.instructorMeetingStaticsAlani.isDisplayed());
        logger.info("Meeting statistics alanı görüntülendi ve doğrulandı.");
    }


    @When("Meeting Statics bölümünün altında Filter Meetings başlığını görür ve 'Instructor : Seraphina Lawson’ seçer")
    public void meetingStaticsBölümününAltındaFilterMeetingsBaşlığınıGörürVeInstructorSeraphinaLawsonSeçer() {
        logger.info("Meeting Statics altındaki Filter Meetings başlığının görünür olduğu kontrol ediliyor.");
        assertTrue(keremPage.instructorFilterMeetingsTitle.isDisplayed());
        logger.info("'Filter Meetings' başlığı görünüyor.");

        Select select = new Select(keremPage.filterInstructorDDM);
        logger.info("Instructor dropdown menüsü bulundu, 'Seraphina Lawson' seçiliyor...");
        select.selectByValue("870");
        logger.info("'Instructor : Seraphina Lawson' seçildi.");
    }


    @And("Show Result butonuna tıklar ve ‘Meetings List’ başlığı atlınad {string}a ait bir toplantı listelendiğini görür")
    public void showResultButonunaTıklarVeMeetingsListBaşlığıAtlınadAAitBirToplantıListelendiğiniGörür(String instructorName) {
        logger.info("Show Result butonunun görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.instructorShowResultButton.isDisplayed());
        assertTrue(keremPage.instructorShowResultButton.isEnabled());
        logger.info("Show Result butonu görünür ve aktif.");

        logger.info("Show Result butonuna tıklanıyor.");
        keremPage.instructorShowResultButton.click();

        logger.info("'Seraphina Lawson' yazısının görünürlüğü kontrol ediliyor.");
        assertTrue(keremPage.seraphinaLawsonText.isDisplayed());

        String actualName = keremPage.seraphinaLawsonText.getText();
        logger.info("Sayfadaki isim alındı: " + actualName);

        assertEquals(actualName, instructorName);
        logger.info("Sayfadaki isim beklenen isimle eşleşiyor: " + instructorName);
    }


    @Then("seçili toplantının yanındaki üç nokta şeklinde olan bağlantıya tıkladığında, Edit ve Delete butonunun olduğunu görür ve sırası ile tıklar")
    public void seçiliToplantınınYanındakiÜçNoktaŞeklindeOlanBağlantıyaTıkladığındaEditVeDeleteButonununOlduğunuGörürVeSırasıIleTıklar() {
        logger.info("Meeting Action butonunun görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.meetingActionButton.isDisplayed());
        assertTrue(keremPage.meetingActionButton.isEnabled());
        logger.info("Meeting Action butonu görünür ve aktif.");

        logger.info("Meeting Action butonuna tıklanıyor.");
        keremPage.meetingActionButton.click();
    }


    @And("instructor Meetings linkinin altında yer alan My Reservations ikonuna tıklar")
    public void instructorMeetingsLinkininAltındaYerAlanMyReservationsIkonunaTıklar() {
        logger.info("My Reservations ikonuna tıklanmadan önce görünür ve aktiflik kontrolü yapılıyor.");
        assertTrue(keremPage.instructorMyReservationsLinki.isDisplayed());
        assertTrue(keremPage.instructorMyReservationsLinki.isEnabled());
        logger.info("My Reservations ikonu görünür ve aktif.");

        keremPage.instructorMyReservationsLinki.click();
        logger.info("My Reservations ikonuna tıklandı.");

        ReusableMethods.bekle(2);
        logger.info("Sayfa yüklenmesi için 2 saniye beklendi.");

        String expectedUrl = "https://qa.instulearn.com/panel/meetings/reservation";
        String actualUrl = driver.getCurrentUrl();
        logger.info("Sayfa URL'si alındı. Gerçek URL: " + actualUrl);

        assertEquals(actualUrl, expectedUrl);
        logger.info("Sayfa URL doğrulaması yapıldı: Beklenen URL = " + expectedUrl);
    }


    @Then("dashboard body bölümünde Show Only Open Meetings yazısını görür ve yanındaki switch’e tıklar")
    public void dashboardBodyBölümündeShowOnlyOpenMeetingsYazısınıGörürVeYanındakiSwitchETıklar() {
        logger.info("Show Only Meeting Switch'i görünür ve aktiflik kontrolü yapılıyor.");
        assertTrue(keremPage.showOnlyMeetingButonu.isDisplayed());
        assertTrue(keremPage.showOnlyMeetingButonu.isEnabled());
        logger.info("Show Only Meeting Switch'i görünür ve aktif.");

        keremPage.showOnlyMeetingButonu.click();
        logger.info("Show Only Meeting Switch'ine tıklandı.");
    }

    @Then("from, To, Day, Instructor, Status filtreleme seçenekleri görünür ve aktif olmalıdır")
    public void fromToDayInstructorStatusFiltrelemeSeçenekleriGörünürVeAktifOlmalıdır() {
        logger.info("Filtreleme alanları görünürlük ve aktiflik testi başlatıldı.");

        logger.info("From input alanı kontrol ediliyor.");
        assertTrue(keremPage.instructorMeetingFiltreFrom.isDisplayed());
        assertTrue(keremPage.instructorMeetingFiltreFrom.isEnabled());
        logger.info("From input alanı görünür ve aktif.");

        logger.info("To input alanı kontrol ediliyor.");
        assertTrue(keremPage.instructorMeetingFitlreTo.isDisplayed());
        assertTrue(keremPage.instructorMeetingFitlreTo.isEnabled());
        logger.info("To input alanı görünür ve aktif.");

        logger.info("Day dropdown menüsü kontrol ediliyor.");
        assertTrue(keremPage.instructorMeetingFitlreDayDDM.isDisplayed());
        assertTrue(keremPage.instructorMeetingFitlreDayDDM.isEnabled());
        logger.info("Day dropdown menüsü görünür ve aktif.");

        logger.info("Status dropdown menüsü kontrol ediliyor.");
        assertTrue(keremPage.instructorMeetingFitlreStatusDDM.isDisplayed());
        assertTrue(keremPage.instructorMeetingFitlreStatusDDM.isEnabled());
        logger.info("Status dropdown menüsü görünür ve aktif.");

        logger.info("Instructor dropdown menüsü kontrol ediliyor.");
        assertTrue(keremPage.filterInstructorDDM.isDisplayed());
        assertTrue(keremPage.filterInstructorDDM.isEnabled());
        logger.info("Instructor dropdown menüsü görünür ve aktif.");

        logger.info("Tüm filtreleme alanları başarıyla doğrulandı.");
    }

    @And("meetings linkinin altında yer alan Requests ikonuna tıklar ve ilgili sayfaya yönlendirilir ve Meeting istatistik bilgilerini görüntüler")
    public void meetingsLinkininAltındaYerAlanRequestsIkonunaTıklarVeIlgiliSayfayaYönlendirilirVeMeetingIstatistikBilgileriniGörüntüler() {
        logger.info("Requests linki görünürlük ve aktiflik kontrol ediliyor.");
        assertTrue(keremPage.instructorRequestsLinki.isDisplayed());
        assertTrue(keremPage.instructorRequestsLinki.isEnabled());
        logger.info("Requests linki görünür ve aktif.");

        logger.info("Requests linkine tıklanıyor.");
        keremPage.instructorRequestsLinki.click();
        ReusableMethods.bekle(2);
        logger.info("Requests linkine tıklandı ve 2 saniye beklendi.");

        String expectedUrl = "https://qa.instulearn.com/panel/meetings/requests";
        String actualUrl = driver.getCurrentUrl();
        logger.info("Sayfa yönlendirme kontrolü. Beklenen URL: " + expectedUrl + " Gerçek URL: " + actualUrl);
        assertEquals(actualUrl, expectedUrl);
        logger.info("URL doğrulandı.");

        logger.info("Request Meeting Statistics alanı görünürlük kontrolü yapılıyor.");
        assertTrue(keremPage.instructorRequestMeetingStatics.isDisplayed());
        logger.info("Request Meeting Statistics alanı görünür durumda.");
    }


    @And("meetings linkinin altında yer alan Requests linkine tiklar")
    public void meetingsLinkininAltındaYerAlanRequestsLinkineTiklar() {
        logger.info("Requests linki görünürlük ve aktiflik kontrol ediliyor.");
        assertTrue(keremPage.instructorRequestsLinki.isDisplayed());
        assertTrue(keremPage.instructorRequestsLinki.isEnabled());
        logger.info("Requests linki görünür ve aktif.");

        logger.info("Requests linkine tıklanıyor.");
        keremPage.instructorRequestsLinki.click();
        ReusableMethods.bekle(2);
        logger.info("Requests linkine tıklandı ve 2 saniye beklendi.");

        String expectedUrl = "https://qa.instulearn.com/panel/meetings/requests";
        String actualUrl = driver.getCurrentUrl();
        logger.info("Sayfa yönlendirme kontrolü. Beklenen URL: " + expectedUrl + " Gerçek URL: " + actualUrl);
        assertEquals(actualUrl, expectedUrl);
        logger.info("URL doğrulandı.");
    }

    @Then("meeting Statics bölümünün altında Filter Meetings başlığını görür ve Student : {string} seçer")
    public void meetingStaticsBölümününAltındaFilterMeetingsBaşlığınıGörürVeStudentSeçer(String studentName) {
        logger.info("Student filtreleme dropdown'ı görünürlük ve aktiflik kontrol ediliyor.");
        assertTrue(keremPage.requestFiltreStudentDDM.isDisplayed());
        assertTrue(keremPage.requestFiltreStudentDDM.isEnabled());
        logger.info("Student filtreleme dropdown'ı görünür ve aktif.");

        logger.info("Dropdown'dan student Kerem Ceylan 2 seçimi yapılıyor.");
        Select select = new Select(keremPage.requestFiltreStudentDDM);
        select.selectByValue("1608"); // Kerem Ceylan 2
        logger.info("Student başarıyla seçildi.");
    }

    @When("Show Result butonuna tıklar ve Meeting requests list başlığı atlınad {string}e ait bir toplantı listelendiğini görür")
    public void showResultButonunaTıklarVeMeetingRequestsListBaşlığıAtlınadEAitBirToplantıListelendiğiniGörür(String studentName) {
        logger.info("'Show Result' butonunun görünürlük kontrolü yapılıyor.");
        assertTrue(keremPage.instructorShowResultButton.isDisplayed());
        logger.info("'Show Result' butonu görünür.");

        logger.info("'Show Result' butonuna tıklanıyor.");
        keremPage.instructorShowResultButton.click();

        ReusableMethods.bekle(2);

        logger.info("Seçilen student'e ait isim bilgisinin görünür olup olmadığı kontrol ediliyor.");
        assertTrue(keremPage.keremCeylan2Text.isDisplayed());
        logger.info("İsim yazısı görünür durumda.");

        String actualName = keremPage.keremCeylan2Text.getText();
        logger.info("Sayfada görünen isim: " + actualName + " | Beklenen isim: " + studentName);

        assertEquals(actualName, studentName);
        logger.info("İsim doğrulaması başarılı.");
    }

    @Then("Seçili toplantının yanındaki üc nokta şeklinde olan butonda yer alan, Add to Calendar bağlantısına tıklar google calendar sayfasına yölendirilir")
    public void seçiliToplantınınYanındakiÜcNoktaŞeklindeOlanButondaYerAlanAddToCalendarBağlantısınaTıklarGoogleCalendarSayfasınaYölendirilir() {
        logger.info("Toplantı satırında bulunan üç nokta (action) butonuna tıklanıyor.");
        keremPage.meetingActionButton.click();
        ReusableMethods.bekle(1);

        logger.info("'Add to Calendar' bağlantısına tıklanıyor.");
        keremPage.addToCalendarButonu.click();
        ReusableMethods.bekle(2);

        logger.info("Google Calendar sayfasına yönlendirme kontrol ediliyor.");
        String expectedUrl = "https://calendar.google.com/calendar/u/0/r/eventedit?dates=20250630T173000Z/20250630T213000Z&ctz=UTC&text=Meeting";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Beklenen URL: " + expectedUrl);
        logger.info("Gerçek URL: " + actualUrl);

        assertEquals(actualUrl, expectedUrl);
        logger.info("Google Calendar yönlendirme doğrulandı.");
    }


    @And("kullanıcı mevcut sayfayı kapatır ve Contact Student bağlantısına tıklar")
    public void kullanıcıMevcutSayfayıKapatırVeContactStudentBağlantısınaTıklar() {
        logger.info("'Contact Student' butonunun görünür olduğu kontrol ediliyor.");
        assertTrue(keremPage.contactStudentButonu.isDisplayed());

        logger.info("'Contact Student' butonuna tıklanıyor.");
        keremPage.contactStudentButonu.click();
        ReusableMethods.bekle(2);
    }


    @Then("bağlantıya tıkladığında {string} bilgilendirme penceresi açılmalı ve kullanıcı ‘Close’ butonu ile bu pencereyi kapatmalıdır")
    public void bağlantıyaTıkladığındaBilgilendirmePenceresiAçılmalıVeKullanıcıCloseButonuIleBuPencereyiKapatmalıdır(String studentContactText) {
        logger.info("Öğrenci iletişim bilgileri penceresinin açıldığı kontrol ediliyor.");
        assertTrue(keremPage.studetContactInformationText.isDisplayed());
        logger.info("Öğrenci iletişim bilgileri penceresi başarıyla görüntülendi.");

        logger.info("'Close' butonuna tıklanarak bilgilendirme penceresi kapatılıyor.");
        keremPage.studentContactCloseButonu.click();
        logger.info("Bilgilendirme penceresi başarıyla kapatıldı.");
    }

    @And("‘Finish Meeting’ bağlantısına tıklar")
    public void finishMeetingBağlantısınaTıklar() {
        logger.info("'Finish Meeting' butonunun görünür olduğu kontrol ediliyor.");
        assertTrue(keremPage.finishMeetingButton.isDisplayed());
        logger.info("'Finish Meeting' butonu görünür durumda.");

        logger.info("'Finish Meeting' butonuna tıklanıyor.");
        keremPage.finishMeetingButton.click();

        logger.info("Finish Meeting sayfasının açıldığı kontrol ediliyor.");
        assertTrue(keremPage.finishMeetingPageText.isDisplayed());
        logger.info("Finish Meeting sayfa başlığı başarıyla görüntülendi.");

        logger.info("'Cancel' butonuna tıklanarak meeting işlemi iptal ediliyor.");
        keremPage.finishMeetingPageCancelButton.click();
        logger.info("Finish Meeting işlemi iptal edildi, kayıt open mod'da bırakıldı.");
    }
}
