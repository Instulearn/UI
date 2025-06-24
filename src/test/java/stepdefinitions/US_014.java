package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AlpayPage;
import utils.JSUtilities;
import utils.ReusableMethods;
import java.util.Arrays;
import java.util.List;

public class US_014 {

    WebDriver driver = DriverManager.getDriver();// fetch current thread's driver

    @Given("Sayfa asagi kaydirilarak Testimonials basligina ulasilir")
    public void sayfa_asagi_kaydirilarak_basligina_ulasilir() {
        WebElement testimonialsText = new AlpayPage(driver).testimonialsText;
        JSUtilities.scrollToVisibleElement(driver, testimonialsText);

        if (!testimonialsText.isDisplayed()) {
            throw new AssertionError("Testimonials Basligi görünür değil: ");
        }

        ReusableMethods.bekle(2);

    }
    @Given("Slider kontrol edilir")
    public void slider_kontrol_edilir() {
        WebElement testimonialsSlider = new AlpayPage(driver).testimonialsSlider;
        JSUtilities.scrollToVisibleElement(driver, testimonialsSlider);

        if (!testimonialsSlider.isDisplayed()) {
            throw new AssertionError("Testimonials Slider görünür değil: ");
        }
        ReusableMethods.bekle(2);

    }
    @Given("Slider ileri ve geri oklari ya da swipe fonksiyonu test edilerek kart gecisleri denenir")
    public void slider_ileri_ve_geri_oklari_ya_da_swipe_fonksiyonu_test_edilerek_kart_gecisleri_denenir() {
        WebElement testimonialsCard = new AlpayPage(driver).testimonialsCard;
        JSUtilities.scrollToVisibleElement(driver, testimonialsCard);

        if (!testimonialsCard.isDisplayed()) {
            throw new AssertionError("Testimonials Card görünür değil: ");
        }

        try {
            List<WebElement> testimonialBullets = Arrays.asList(
                    new AlpayPage(driver).testimonialBullet3,
                    new AlpayPage(driver).testimonialBullet2,
                    new AlpayPage(driver).testimonialBullet1
            );

            for (WebElement bullet : testimonialBullets) {
                JSUtilities.clickWithJS(driver, bullet);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            throw new AssertionError("Failed to click on a testimonial bullet", e);
        }
        ReusableMethods.bekle(1);

    }
    @Given("İlk gorunen yorum karti incelenir ve kartin uzerinde sirket adinin yer alip almadigi kontrol edilir")
    public void i̇lk_gorunen_yorum_karti_incelenir_ve_kartin_uzerinde_sirket_adinin_yer_alip_almadigi_kontrol_edilir() {
        WebElement testimonialSirketadi = new AlpayPage(driver).testimonialSirketAdi;

        if (!testimonialSirketadi.isDisplayed()) {
            throw new AssertionError("Testimonials Sirket Adi görünür değil: ");
        }
        Assert.assertEquals(testimonialSirketadi.getText(), "Data Analyst at Microsoft");
        ReusableMethods.bekle(2);

    }
    @Given("Puanlama gorselinin bulunup bulunmadigi kontrol edilir")
    public void puanlama_gorselinin_bulunup_bulunmadigi_kontrol_edilir() {
        WebElement testimonialStar = new AlpayPage(driver).testimonialStar;

        if (!testimonialStar.isDisplayed()) {
            throw new AssertionError("Testimonials Stars görünür değil: ");
        }
    }
    @Given("Kartin yorum metnini icerip icermedigi kontrol edilir")
    public void kartin_yorum_metnini_icerip_icermedigi_kontrol_edilir() {
        WebElement testimonialYorum = new AlpayPage(driver).testimonialYorum;

        if (!testimonialYorum.isDisplayed()) {
            throw new AssertionError("Testimonials Yorum görünür değil: ");
        }
    }

}