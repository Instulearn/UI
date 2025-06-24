package stepdefinitions;

import config.ConfigReader;
import config.UserConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.KeremPage;
import utils.ReusableMethods;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class US_039 {

    WebDriver driver = DriverManager.getDriver();
    private static final Logger logger = LogManager.getLogger(US_039.class);
    KeremPage keremPage = new KeremPage(driver);


    // ****************** TC_39.1 ***************************

    @Given("student anasayfaya gider")
    public void student_anasayfaya_gider() {
        logger.info("Student anasayfaya gidiyor - test başlıyor");
        driver.get(ConfigReader.getProperty("url"));
        assertEquals(driver.getCurrentUrl(),ConfigReader.getProperty("url"));
        logger.info("Student olarak anasayfaya başarılı bir şekilde gidildi. URL doğrulandı");
    }

    @Then("login butonuna tıklar ve loginUrl sayfasına yönlendirilir")
    public void loginButonunaTıklarVeLoginUrlSayfasınaYönlendirilir() {
        logger.info("Login butonunun görünür ve aktif olup olmadığı kontrol ediliyor.");
        assertTrue(keremPage.anasayfaLoginButonu.isDisplayed());
        assertTrue(keremPage.anasayfaLoginButonu.isEnabled());

        logger.info("Login butonuna tıklanıyor.");
        keremPage.anasayfaLoginButonu.click();

        logger.info("Yönlendirilme kontrolü yapılıyor");
        assertEquals(driver.getCurrentUrl(),ConfigReader.getProperty("loginUrl"));
        logger.info("Yönlendirilme başarılı.");


    }

    @Then("e-mail ve password kutusuna geçerli bilgileri girer")
    public void eMailVePasswordKutusunaGeçerliBilgileriGirer() {
        logger.info("E-mail kutusunun görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.loginPageEmailKutusu.isDisplayed());
        assertTrue(keremPage.loginPageEmailKutusu.isEnabled());

        String email = UserConfigReader.getProperty("keremMailTeacher");
        logger.info("E-mail kutusuna değer giriliyor: {}", email);
        keremPage.loginPageEmailKutusu.sendKeys(email);

        logger.info("Password kutusunun görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.loginPagePasswordKutusu.isDisplayed());
        assertTrue(keremPage.loginPagePasswordKutusu.isEnabled());

        String password = UserConfigReader.getProperty("keremPassword");
        logger.info("Password kutusuna değer giriliyor.");
        keremPage.loginPagePasswordKutusu.sendKeys(password);


    }

    @And("login butonuna basar ve ‘Student Panel' {string} sayfasına yönlendirilir")
    public void loginButonunaBasarVeStudentPanelSayfasınaYönlendirilir(String panelUrl) {

        logger.info("Login butonu görünür ve aktif olup olmadığı kontrol ediliyor.");
        assertTrue(keremPage.loginPageLoginButonu.isDisplayed());
        assertTrue(keremPage.loginPageLoginButonu.isEnabled());

        logger.info("Login butonuna basılıyor.");
        keremPage.loginPageLoginButonu.click();

        String actualUrl = driver.getCurrentUrl();
        logger.info("Yönlendirme kontrolü yapılıyor. Beklenen URL: {}, Güncel URL: {}", panelUrl, actualUrl);
        assertEquals(actualUrl, panelUrl);
        
        logger.info("Yönlendirme başarılı şekilde gerçekleşti.");
        
        
    }

    @Then("kullanıcı header bölümündeki ‘Home’ butonuna tıklar. url ' e gider.")
    public void kullanıcıHeaderBölümündekiHomeButonunaTıklarUrlEGider() {
        logger.info("Home butonunun görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.studentHomeBaglantısı.isDisplayed());
        assertTrue(keremPage.studentHomeBaglantısı.isEnabled());

        logger.info("Home butonuna tıklanıyor.");
        keremPage.studentHomeBaglantısı.click();

        String expectedUrl = ConfigReader.getProperty("url");
        String actualUrl = driver.getCurrentUrl();

        logger.info("Yönlendirme kontrolü yapılıyor. Beklenen URL: {}, Güncel URL: {}", expectedUrl, actualUrl);
        assertEquals(actualUrl, expectedUrl);

        logger.info("Kullanıcı başarılı şekilde anasayfaya yönlendirildi.");
    }

    @And("‘Become instructor’  butonunun olduğunu test eder")
    public void becomeInstructorButonununOlduğunuTestEder() {
        logger.info("'Become Instructor' butonunun görünür ve aktif olduğu kontrol ediliyor.");

        assertTrue(keremPage.becomeInstructorButonu.isDisplayed());
        assertTrue(keremPage.becomeInstructorButonu.isEnabled());

        logger.info("'Become Instructor' butonu başarıyla bulundu ve aktif durumda.");
    }

    @And("header bölümündeki profil ismine tıklar, açılan menüde logout'a tıklar")
    public void headerBölümündekiProfilIsmineTıklarAçılanMenüdeLogoutATıklar() {
        logger.info("Profil isminin görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.anasayfaProfilIsmi.isDisplayed());
        assertTrue(keremPage.anasayfaProfilIsmi.isEnabled());

        logger.info("Profil ismine tıklanıyor.");
        keremPage.anasayfaProfilIsmi.click();
        ReusableMethods.bekle(1);

        logger.info("Logout bağlantısının görünür ve aktif olduğu kontrol ediliyor.");
        assertTrue(keremPage.anasayfaLogoutBaglantisi.isDisplayed());
        assertTrue(keremPage.anasayfaLogoutBaglantisi.isEnabled());

        logger.info("Logout bağlantısına tıklanıyor.");
        keremPage.anasayfaLogoutBaglantisi.click();
    }

    // ********************* TC_39.2 farklı stepler ************************

    @Then("‘Become instructor’  butonuna tıklar ve {string} adresine yönlendirilir")
    public void becomeInstructorButonunaTıklarVeAdresineYönlendirilir(String becomeInstUrl) {
        logger.info("'Become Instructor' butonuna tıklanıyor.");
        keremPage.becomeInstructorButonu.click();

        String actualUrl = driver.getCurrentUrl();
        logger.info("Güncel URL: " + actualUrl);

        assertEquals(actualUrl,becomeInstUrl);
        logger.info("Yönlendirme başarıyla gerçekleşti.");

    }

    @And("açılan sayfada {string} başlığını görür ve meslek olarak 'Math’i seçer")
    public void açılanSayfadaBaşlığınıGörürVeMeslekOlarakMathISeçer(String title) {


        logger.info("İlgili başlığın '" + title + "' olduğunu doğrulama yapılıyor");
        String actualTitle = keremPage.becomeInstPageOccupationsTitle.getText();
        assertEquals(actualTitle,title);
        logger.info("Sayfa başlığı doğrulandı: " + actualTitle);

        logger.info("'Math' mesleğinin görünür olduğu doğrulanıyor.");
        assertTrue(keremPage.becomeInstructorPageMath.isDisplayed());

        logger.info("'Math' mesleği seçiliyor.");
        keremPage.becomeInstructorPageMath.click();

        logger.info("'Math' mesleği seçildi mi kontrol ediliyor.");
        assertTrue(keremPage.becomeInstructorPageMath.isSelected());
        logger.info("'Math' mesleği başarıyla seçildi.");



    }

    @Then("{string} select menü{string}ı seçer")
    public void selectMenüDenInstructorISeçer(String arg0) {
    }
}

