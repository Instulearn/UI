package stepdefinitions;

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

public class US_026 {

    WebDriver driver = DriverManager.getDriver();
    private static final Logger logger = LogManager.getLogger(US_044.class);

    LutfiPage lutfiPage = new LutfiPage(driver);
    Header header = new Header(driver);
    LoginPage loginPage = new LoginPage(driver);

    // ******************* TC_26.1 *************************

    @Given("Instructor Dashboard sidebar'da Certificates başlığı olduğunu doğrular")
    public void ınstructor_dashboard_sidebar_da_certificates_başlığı_olduğunu_doğrular() {
        logger.info("Student Dashboard sidebar'da Certificates başlığı olduğunu doğrular.");
        assertTrue(lutfiPage.certificatesButton.isDisplayed());
        assertTrue(lutfiPage.certificatesButton.isEnabled());
    }
    @Given("Instructor Certificate başlığına tıklar")
    public void ınstructor_certificate_başlığına_tıklar() {
        logger.info("Certificate butonuna basılıyor.");
        lutfiPage.certificatesButton.click();
        ReusableMethods.bekle(2);
    }
    @Given("Instreuctor - List, Achivements, Certificate Validation, Completion Certificates linklerinin görünür olduğunu doğrular.")
    public void ınstreuctor_list_achivements_certificate_validation_completion_certificates_linklerinin_görünür_olduğunu_doğrular() {

        logger.info("Achievements butonu olduğunu doğrular");
        assertTrue(lutfiPage.listLink.isDisplayed());
        assertTrue(lutfiPage.listLink.isEnabled());
        logger.info("List butonu aktif.");

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

    // ******************* TC_26.2 *************************

    @Given("Instructor - List'e tıklar.")
    public void ınstructor_list_e_tıklar() {
        logger.info("Instructor List butonuna tıklar");
        lutfiPage.listLink.click();
        String expectedURL = "https://qa.instulearn.com/panel/certificates";
        assertEquals(driver.getCurrentUrl(), expectedURL);
        logger.info("List ekranına ulaşır.");
        assertTrue(lutfiPage.filterCertificatesTitle.isDisplayed());
        logger.info("Filter Certificates kısmı görünmektedir.");
        assertTrue(lutfiPage.activeCertificatesTitle.isDisplayed());
        logger.info("My Certificates kısmı görünmektedir.");
    }

    @Given("Course dropdown menüsüne tıklanabilmeli ve Dairy Technology seçilebilir olmalıdır")
    public void course_dropdown_menüsüne_tıklanabilmeli_ve_dairy_technology_seçilebilir_olmalıdır() {
        lutfiPage.listCourseDropdown.isEnabled();
        logger.info("Course dropdown menüsü erişilebilmektedir.");
        lutfiPage.listCourseDropdown.click();
        logger.info("Course dropdown menüsü tıklanabilmektedir.");
        lutfiPage.listCourseDairyTechnology.isEnabled();
        logger.info("Course dropdown menüsünde Dairy Technology erişilebilmektedir.");
        lutfiPage.listCourseDairyTechnology.click();
        logger.info("Course dropdown menüsünde Dairy Technology tıklanmıştır.");
    }

    @Given("Quiz dropdown menüsüne tıklanabilmeli ve Dairy Tech Quiz seçilebilir olmalıdır")
    public void quiz_dropdown_menüsüne_tıklanabilmeli_ve_dairy_tech_quiz_seçilebilir_olmalıdır() {
        lutfiPage.listQuizDropdown.isEnabled();
        logger.info("Quiz dropdown menüsü erişilebilmektedir.");
        ReusableMethods.bekle(2);
        lutfiPage.listQuizDropdown.click();
        logger.info("Quiz dropdown menüsü tıklanabilmektedir.");
        ReusableMethods.bekle(10);
        lutfiPage.listQuizDairyTechQuiz.isEnabled();
        logger.info("Quiz dropdown menüsünde Dairy Tech Quiz erişilebilmektedir.");
        lutfiPage.listQuizDairyTechQuiz.click();
        logger.info("Quiz dropdown menüsünde Dairy Tech Quiz tıklanmıştır.");
    }

    @Given("Kullanıcı Show result butonuna tıkladığında Active Certificate kısmında Dairy Tech Quiz seçilmiş olmalıdır.")
    public void kullanıcı_show_result_butonuna_tıkladığında_active_certificate_kısmında_dairy_tech_quiz_seçilmiş_olmalıdır() {
        ReusableMethods.bekle(2);
        lutfiPage.listShowResultsButton.click();
        logger.info("List Show Results Button tıklanmıştır.");
        ReusableMethods.bekle(2);
        lutfiPage.activeCertificateDairyTechnology.isDisplayed();
        logger.info("Filtreleme işlemi başarılı olmuştur");


    }

    // **************** TC_26.3 ***********************

    @Given("Grade textbox'ı seçilebilir olmalıdır.")
    public void grade_textbox_ı_seçilebilir_olmalıdır() {
        lutfiPage.gradeGeneralLabel.isDisplayed();
        logger.info("Grade label'ı görülmektedir.");


        lutfiPage.gradeGeneralInput.isEnabled();
        logger.info("Grade textbox'ı erişilebilmektedir.");



    }

    // **************** TC_26.4 ***********************

    @Given("Instructor - Achievements'a tıklar.")
    public void ınstructor_achievements_a_tıklar() {
        logger.info("Instructor Achievements butonuna tıklar");
        lutfiPage.achievementsButton.click();

    }
    @Given("Instructor Achievements başlığına tıklandığında My Certificates statistics, filter certificates & my certificates kısımları görünür olmalıdır")
    public void ınstructor_achievements_başlığına_tıklandığında_my_certificates_statistics_filter_certificates_my_certificates_kısımları_görünür_olmalıdır() {
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

// **************** TC_26.5 ***********************

    @Given("Instructor certificate validation başlığına tıklar")
    public void ınstructor_certificate_validation_başlığına_tıklar() {
        lutfiPage.certificateValidationLink.click();
        assertTrue(lutfiPage.certificateValidationTitle.isDisplayed());
        logger.info("Certificate Validation sayfasına erişilmiştir.");
    }


    // **************** TC_26.6 ***********************

    @Given("Instructor certificate ID textboxına {int} değerini girer")
    public void ınstructor_certificate_ıd_textboxına_değerini_girer(Integer certificateID) {
        lutfiPage.certificateValidationCertificateIDTextbox.sendKeys(String.valueOf(certificateID));
        logger.info("CertificateID girilmiştir.");
    }

    // **************** TC_26.6 ***********************

    @Given("Instructor completion certificates başlığını tıklar")
    public void ınstructor_completion_certificates_başlığını_tıklar() {
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
