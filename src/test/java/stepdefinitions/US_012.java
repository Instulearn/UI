package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.CihatPage;
import utils.JSUtilities;
import utils.ReusableMethods;

import java.util.Arrays;
import java.util.List;


public class US_012 {

    WebDriver driver = DriverManager.getDriver();// fetch current thread's driver



    @Then("Kullanici sayfanin altindaki {string} metninin gorunur oldugunu dogrular")
    public void kullanici_sayfanin_altindaki_metninin_gorunur_oldugunu_dogrular(String string) {


        WebElement instructorText = new CihatPage(driver).instructorText;
        JSUtilities.scrollToVisibleElement(driver, instructorText);

        if (!instructorText.isDisplayed()) {

            throw new AssertionError("instructor Basligi görünür değil: ");
        }

        ReusableMethods.bekle(2);
    }


    @Then("Anasayfa body bölümünde All Instructors butonu görüntülene kadar sayfa aşağı indirilir")
    public void anasayfa_body_bolumunde_all_instructors_butonu_goruntulene_kadar_sayfa_asagi_indirilir() {

        WebElement allinstructorButon = new CihatPage(driver).AllInstructorButon;
        JSUtilities.scrollToVisibleElement(driver, allinstructorButon);

        if (!allinstructorButon.isDisplayed()) {

             throw new AssertionError("instructor Butonu görünür değil: ");
        }

        ReusableMethods.bekle(4);
        throw new io.cucumber.java.PendingException();
    }


    @When("All Instructors butonu tıklanır")
    public void all_instructors_butonu_tiklanir() {

        WebElement allInstructorButon =new CihatPage(driver).AllInstructorButon;
        allInstructorButon.click();

        ReusableMethods.bekle(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/instructors");
        }



    @When("Instructors baslığı altında slider  kontrol edilir")
    public void ınstructors_baslığı_altında_slider_kontrol_edilir() {
        WebElement instructorSlider = new CihatPage(driver).instructorSlider;
        JSUtilities.scrollToVisibleElement(driver, instructorSlider);

        if (!instructorSlider.isDisplayed()) {
            throw new AssertionError("İnstructor Slider görünür değil: ");
        }
        ReusableMethods.bekle(2);
    }




    @Then("Slider ileri ve geri okları ya da swipe fonksiyonu test edilerek kart geçişleri denenir")
    public void slider_ileri_ve_geri_okları_ya_da_swipe_fonksiyonu_test_edilerek_kart_geçişleri_denenir() {
        WebElement instructorSlider = new CihatPage(driver).instructorSlider;
        JSUtilities.scrollToVisibleElement(driver, instructorSlider);

        if (!instructorSlider.isDisplayed()) {
            throw new AssertionError("İnstructors Slider görünür değil: ");
        }

        try {
            List<WebElement> instructorsBullets = Arrays.asList(
                    new CihatPage(driver).instructorsBullet8,
                    new CihatPage(driver).instructorsBullet7,
                    new CihatPage(driver).instructorsBullet6,
                    new CihatPage(driver).instructorsBullet5,
                    new CihatPage(driver).instructorsBullet4,
                    new CihatPage(driver).instructorsBullet3,
                    new CihatPage(driver).instructorsBullet2,
                    new CihatPage(driver).instructorsBullet1
                    );

            for (WebElement bullet : instructorsBullets) {
                JSUtilities.clickWithJS(driver, bullet);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            throw new AssertionError("Failed to click on a instructors bullet", e);
        }
        ReusableMethods.bekle(1);
        throw new io.cucumber.java.PendingException();
    }


    @When("Beğeni yıldızlarının bulunup bulunmadigi kontrol edilir")
    public void beğeni_yıldızlarının_bulunup_bulunmadigi_kontrol_edilir() {

        WebElement  instructorstar= new CihatPage(driver).instructorstar;

        if (!instructorstar.isDisplayed()) {
            throw new AssertionError("Instructorstar Stars görünür değil: ");
        }
    }

    @When("Instructor kartları içinde  {string} butonu görüntülenir")
    public void ınstructor_kartları_içinde_butonu_görüntülenir(String string) {

        WebElement reserveaLiveMeeting = new CihatPage(driver).reserveaLiveMeeting;
        JSUtilities.scrollToVisibleElement(driver, reserveaLiveMeeting);

        if (!reserveaLiveMeeting.isDisplayed()) {

            throw new AssertionError("Reserve aLiveMeeting butonu görünür değil: ");
        }

        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }

    @When("Instructor kartları içinden birine ait   {string} butonu tıklanır")
    public void ınstructor_kartları_içinden_birine_ait_butonu_tıklanır(String string) {

        WebElement reserveaLiveMeeting =new CihatPage(driver).reserveaLiveMeeting;
        reserveaLiveMeeting.click();

        ReusableMethods.bekle(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/users/929/profile?tab=appointments");
        throw new io.cucumber.java.PendingException();
    }

    @Then("Instructor a ait sayfada {string} başlığı altında  rezervasyon için takvim görüntülenir ve tarih seçilir")
    public void ınstructor_a_ait_sayfada_başlığı_altında_rezervasyon_için_takvim_görüntülenir_ve_tarih_seçilir(String string) {
        WebElement liveMeetingDate =new CihatPage(driver).liveMeetingDate;
        liveMeetingDate.click();

        ReusableMethods.bekle(4);
        throw new io.cucumber.java.PendingException();
    }

    @When("Tarih şeçimi sonrasında {string} başlığı altında saat seçenekleri görülür.")
    public void tarih_şeçimi_sonrasında_başlığı_altında_saat_seçenekleri_görülür(String string) {
        WebElement availableTimes =new CihatPage(driver).availableTimes;
        availableTimes.click();

        ReusableMethods.bekle(4);
        throw new io.cucumber.java.PendingException();
    }

    @Then("Meeting Type seçiminden sonra {string} butonu görüntülenir")
    public void meeting_type_seçiminden_sonra_butonu_görüntülenir(String string) {

        WebElement meetingType =new CihatPage(driver).meetingType;
        meetingType.click();

        ReusableMethods.bekle(4);
        throw new io.cucumber.java.PendingException();

    }



    @Then("Rezervasyonun onaylandığına dair mesaj alınır")
    public void rezervasyonun_onaylandığına_dair_mesaj_alınır() {


       ///// ???????????????

        throw new io.cucumber.java.PendingException();
    }

}











