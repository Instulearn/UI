package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.Header;
import pages.LoginPage;
import pages.LutfiPage;
import utils.ReusableMethods;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class US_044 {

    WebDriver driver = DriverManager.getDriver();
    private static final Logger logger = LogManager.getLogger(US_044.class);

    LutfiPage lutfiPage = new LutfiPage(driver);
    Header header = new Header(driver);
    LoginPage loginPage = new LoginPage(driver);


    // ******************** TC_44.1 **********************

    @Given("kullanıcı anasayfaya gider")
    public void kullanıcı_anasayfaya_gider() {
        logger.info("Kullanıcı anasayfaya gidiyor - test başlangıcı");
        driver.get(ConfigReader.getProperty("url"));
        assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("url"));
        logger.info("Kullanıcı Anasayfaya Başarılı Şekilde Ulaştı");
    }
    @Given("Kullanıcı login butonuna tıklar")
    public void kullanıcı_login_butonuna_tıklar() {
        logger.info("Kullanıcı login butonuna tıklar ve loginUrl sayfasına yönlendirilir.");

        driver.get(ConfigReader.getProperty("url"));
        assertTrue(header.anasayfaHeaderLoginButonu.isDisplayed());
        assertTrue(header.anasayfaHeaderLoginButonu.isEnabled());
        logger.info("Kullanıcı login butonu görünür ve aktif");

        logger.info("Kullanıcı Login butonuna tıklar");
        header.anasayfaHeaderLoginButonu.click();
        logger.info("Login sayfası açılma kontrolü yapılıyor");
        assertEquals(driver.getCurrentUrl(),ConfigReader.getProperty("loginUrl"));
        logger.info("Login sayfası açıldı.");


    }
    @Given("Kullanıcı {string} ve {string} ile login olur")
    public void kullanıcı_ve_ile_login_olur(String email, String password) {
        logger.info("E-mail kutusunun görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(loginPage.emailKutusu.isDisplayed());
        assertTrue(loginPage.emailKutusu.isEnabled());

        logger.info("E-mail kutusuna değer giriliyor: {}", email);
        loginPage.emailKutusu.sendKeys(email);

        logger.info("Password kutusunun görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(loginPage.passwordKutusu.isDisplayed());
        assertTrue(loginPage.passwordKutusu.isEnabled());

        logger.info("Password kutusuna değer giriliyor: {}", password);
        loginPage.passwordKutusu.sendKeys(password);

        logger.info("Login butonu görünür ve aktif olup olmadığı kontrol ediliyor.");
        assertTrue(loginPage.loginButonu.isDisplayed());
        assertTrue(loginPage.loginButonu.isEnabled());

        logger.info("Login butonuna basılıyor.");
        loginPage.loginButonu.click();

    }
    @Given("Student Dashboard sidebar'da Certificates başlığı olduğunu doğrular")
    public void student_dashboard_sidebar_da_certificates_başlığı_olduğunu_doğrular() {
        logger.info("Student Dashboard sidebar'da Certificates başlığı olduğunu doğrular.");
        assertTrue(lutfiPage.certificatesButton.isDisplayed());
        assertTrue(lutfiPage.certificatesButton.isEnabled());

    }
    @Given("Student Certificate başlığına tıklar")
    public void student_certificate_başlığına_tıklar() {
        logger.info("Certificate butonuna basılıyor.");
        lutfiPage.certificatesButton.click();
        ReusableMethods.bekle(2);

    }

    @Given("Student - Achivements, Certificate Validation, Completion Certificates linklerinin görünür olduğunu doğrular.")
    public void student_achivements_certificate_validation_completion_certificates_linklerinin_görünür_olduğunu_doğrular() {
        logger.info("Achievements butonu olduğunu doğrular");
        assertTrue(lutfiPage.achievementsButton.isDisplayed());
        assertTrue(lutfiPage.achievementsButton.isEnabled());
        logger.info("Achievements butonu aktif.");

        logger.info("Certificate Validation butonu olduğunu doğrular");
        assertTrue(lutfiPage.certificateValidationButton.isDisplayed());
        assertTrue(lutfiPage.certificateValidationButton.isEnabled());
        logger.info("Certificate Validation butonu aktif.");

        logger.info("Completion Certificates butonu olduğunu doğrular");
        assertTrue(lutfiPage.completionCertificatesButton.isDisplayed());
        assertTrue(lutfiPage.completionCertificatesButton.isEnabled());
        logger.info("Completion Certificates butonu aktif.");

    }

    // TC 44.3 Faerklı stepler

    @Given("Student Achievements başlığına tıklandığında My Certificates statistics, filter certificates & my certificates kısımları görünür olmalıdır")
    public void student_achievements_başlığına_tıklandığında_my_certificates_statistics_filter_certificates_my_certificates_kısımları_görünür_olmalıdır() {
        logger.info("Student Achievements butonuna tıklar");
        lutfiPage.achievementsButton.click();
        String expectedURL = "https://qa.instulearn.com/panel/certificates/achievements";
        assertEquals(driver.getCurrentUrl(), expectedURL);
        logger.info("Achievements ekranına ulaşır.");
        assertTrue(lutfiPage.myCertificatesStatisticsTitle.isDisplayed());
        logger.info("My Certificate Statistics kısmı görünmektedir.");
        assertTrue(lutfiPage.filterCertificatesTitle.isDisplayed());
        logger.info("Filter Certificates kısmı görünmektedir.");
        assertTrue(lutfiPage.myCertificatesTitle.isDisplayed());
        logger.info("My Certificates kısmı görünmektedir.");

    }
    @Given("From textbox'ı seçilebilir olmalıdır")
    public void from_textbox_ı_seçilebilir_olmalıdır() {
        assertTrue(lutfiPage.achievementsFromDateInput.isEnabled());
        logger.info("From kısmı görünmektedir.");

    }
    @Given("To textbox'ı seçilebilir olmalıdır")
    public void to_textbox_ı_seçilebilir_olmalıdır() {

        assertTrue(lutfiPage.achievementsToDateInput.isEnabled());
        logger.info("To kısmı görünmektedir.");

    }
    @Given("Course dropdown menüsüne tıklanabilmeli ve Chocolate Technology seçilebilir olmalıdır")
    public void course_dropdown_menüsüne_tıklanabilmeli_ve_chocolate_technology_seçilebilir_olmalıdır() {
        lutfiPage.achievementsCourseDropdown.isEnabled();
        logger.info("Course dropdown menüsü erişilebilmektedir.");
        lutfiPage.achievementsCourseDropdown.click();
        logger.info("Course dropdown menüsü tıklanabilmektedir.");
        lutfiPage.achievementsCourseChocolateTechnology.isEnabled();
        logger.info("Course dropdown menüsünde Chocolate Technology erişilebilmektedir.");
        lutfiPage.achievementsCourseChocolateTechnology.click();
        logger.info("Course dropdown menüsünde Chocolate Technology tıklanmıştır.");
    }
    @Given("Quiz dropdown menüsüne tıklanabilmeli ve Chocolate Technology seçilebilir olmalıdır")
    public void quiz_dropdown_menüsüne_tıklanabilmeli_ve_chocolate_technology_seçilebilir_olmalıdır() {
        lutfiPage.achievementsQuizDropdown.isEnabled();
        logger.info("Quiz dropdown menüsü erişilebilmektedir.");
        ReusableMethods.bekle(2);
        lutfiPage.achievementsQuizDropdown.click();
        logger.info("Quiz dropdown menüsü tıklanabilmektedir.");
        ReusableMethods.bekle(10);
        lutfiPage.achievementsQuizChocolateTechnology.isEnabled();
        logger.info("Quiz dropdown menüsünde Chocolate Technology erişilebilmektedir.");
        lutfiPage.achievementsQuizChocolateTechnology.click();
        logger.info("Quiz dropdown menüsünde Chocolate Technology tıklanmıştır.");
    }
    @Given("Kullanıcı Show result butonuna tıkladığında My Certificate kısmında Chocolate Technology seçilmiş olmalıdır.")
    public void kullanıcı_show_result_butonuna_tıkladığında_my_certificate_kısmında_chocolate_technology_seçilmiş_olmalıdır() {
        ReusableMethods.bekle(2);
        lutfiPage.achievementsShowResultsButton.click();
        logger.info("Achievements Show Results Button tıklanmıştır.");
        ReusableMethods.bekle(2);
        lutfiPage.myCertificateChocolateTechnology.isDisplayed();
        logger.info("Filtreleme işlemi başarılı olmuştur");

    }

    // TC 44.4

    @Given("Student certificate validation başlığına tıklar")
    public void student_certificate_validation_başlığına_tıklar() {
        lutfiPage.certificateValidationLink.click();
        assertTrue(lutfiPage.certificateValidationTitle.isDisplayed());
        logger.info("Certificate Validation sayfasına erişilmiştir.");



    }

    // TC 44.5

    @Given("Student certificate ID textboxına {int} değerini girer")
    public void student_certificate_ıd_textboxına_değerini_girer(Integer certificateID) {

        lutfiPage.certificateValidationCertificateIDTextbox.sendKeys(String.valueOf(certificateID));
        logger.info("CertificateID girilmiştir.");




    }

    @Given("Kullanıcı captcha değerini girer")
    public void kullanıcı_captcha_değerini_girer() {
        ReusableMethods.bekle(10);
        logger.info("Captcha girilmesi için bekleme yapılmıştır.");

    }
    @Given("Kullanıcı validate butonuna tıklar")
    public void kullanıcı_validate_butonuna_tıklar() {
        lutfiPage.validateButton.click();
        lutfiPage.certificateIsValidScreen.isDisplayed();
        logger.info("Sertifikaya erişilmiştir.");


    }
    @Given("Kullanıcı ekranı kapatır.")
    public void kullanıcı_ekranı_kapatır() {

        lutfiPage.certificateIsValidScreenCloseButton.isDisplayed();
        logger.info("Sertifika sonuç sayfası kapatma butonu mevcut");
        lutfiPage.certificateIsValidScreenCloseButton.click();



    }
    //TC 44.6

    @Given("Student completion certificates başlığını tıklar")
    public void student_completion_certificates_başlığını_tıklar() {

        logger.info("Completion Certificate butonuna tıklar");
        lutfiPage.completionCertificatesLink.click();
        String expectedURL = "https://qa.instulearn.com/panel/certificates/webinars";
        assertEquals(driver.getCurrentUrl(), expectedURL);
        logger.info("Completion Certificates ekranına ulaşır.");
        assertTrue(lutfiPage.filterCertificatesTitle.isDisplayed());
        logger.info("Filter Certificates kısmı görünmektedir.");
        assertTrue(lutfiPage.myCertificatesTitle.isDisplayed());
        logger.info("My Certificates kısmı görünmektedir.");

    }



}
