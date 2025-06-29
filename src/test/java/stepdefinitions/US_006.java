package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.FilizPage;

public class US_006 {

    WebDriver driver = DriverManager.getDriver();
    FilizPage filizPage = new FilizPage(driver);

    @Given("Kullanıcı anasayfaya gider")
    public void kullanıcı_anasayfaya_gider() {
        DriverManager.getDriver().get("https://qa.instulearn.com");
    }

    // -------- Featured Courses --------
    @Then("Featured Courses başlığı görünür olmalı")
    public void featured_courses_basligi_gorunur_olmali() {
        Assert.assertTrue(filizPage.featuredCourseLink.isDisplayed());
    }

    @And("Öne çıkan kurs linki görünür ve tıklanabilir olmalı")
    public void one_cikan_kurs_tiklanabilir_olmali() {
        Assert.assertTrue(filizPage.featuredCourseLink.isEnabled());
        filizPage.featuredCourseLink.click();
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains("/course/Java"));
    }

    // -------- Newest Courses --------
    @Then("Newest Courses başlığı görünür olmalı")
    public void newest_courses_basligi_gorunur_olmali() {
        Assert.assertTrue(filizPage.newestCourseImage.isDisplayed());
    }

    @And("Yeni kurs kartında fiyat, saat, tarih ve eğitmen bilgileri görünür olmalı")
    public void kurs_kartinda_bilgiler_gorunur_olmali() {
        Assert.assertTrue(filizPage.newestCoursePrice.isDisplayed());
        Assert.assertTrue(filizPage.newestCourseDuration.isDisplayed());
        Assert.assertTrue(filizPage.newestCourseDate.isDisplayed());
        Assert.assertTrue(filizPage.newestCourseInstructor.isDisplayed());
    }

    @And("Kurs kartına tıklanınca kurs detay sayfasına yönlendirilmelidir")
    public void kurs_kartina_tiklayinca_detay_sayfasina_gidilmeli() {
        filizPage.newestCourseImage.click();
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains("/course"));
    }

    @And("Newest Courses alanındaki View All butonu görünür ve aktif olmalı")
    public void newest_view_all_butonu() {
        Assert.assertTrue(filizPage.viewAllIcon.isDisplayed());
        Assert.assertTrue(filizPage.viewAllIcon.isEnabled());
    }
        WebElement webElement = filizPage.newestCoursePrice;
    @And("Go to card ikonları görünür ve tıklanabilir olmalı")
    public void go_to_card_ikonlari_gorunur_ve_aktif_olmali() {
        for (WebElement icon : filizPage.goToCardIcons) {
            Assert.assertTrue(icon.isDisplayed());
            Assert.assertTrue(icon.isEnabled());
        }
    }

    // -------- Latest Bundles --------
    @Then("Latest bundles başlığı görünür olmalı")
    public void latest_bundles_basligi() {
        Assert.assertTrue(filizPage.latestBundlesTitle.isDisplayed());
    }

    @And("İlk bundle kartında fiyat, saat, tarih ve eğitmen bilgileri görünür olmalı")
    public void bundle_karti_bilgileri() {
        Assert.assertTrue(filizPage.firstBundlePrice.isDisplayed());
        Assert.assertTrue(filizPage.firstBundleDuration.isDisplayed());
        Assert.assertTrue(filizPage.firstBundleDate.isDisplayed());
        Assert.assertTrue(filizPage.firstBundleInstructor.isDisplayed());
    }

    @And("İlk bundle kartı tıklanabilir olmalı")
    public void bundle_karti_tiklanabilir() {
        Assert.assertTrue(filizPage.firstBundleCard.isDisplayed());
        filizPage.firstBundleCard.click();
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains("/bundle"));
    }

    // -------- Upcoming Courses --------
    @Then("Upcoming Courses başlığı görünür olmalı")
    public void upcoming_courses_basligi() {
        Assert.assertTrue(filizPage.upcomingCoursesTitle.isDisplayed());
    }

    @And("İlk upcoming course kartında fiyat, saat, tarih ve eğitmen bilgileri görünür olmalı")
    public void upcoming_kurs_karti_bilgileri() {
        Assert.assertTrue(filizPage.firstUpcomingCoursePrice.isDisplayed());
        Assert.assertTrue(filizPage.firstUpcomingCourseDate.isDisplayed());
        // saat ve instructor bilgisi varsa burada kontrol edebilirsin
    }

    @And("İlk upcoming course kartı tıklanabilir olmalı")
    public void upcoming_karti_tiklanabilir() {
        Assert.assertTrue(filizPage.firstUpcomingCourseCard.isDisplayed());
        filizPage.firstUpcomingCourseCard.click();
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains("/course"));
    }

    @And("Upcoming Courses alanındaki View All butonu görünür ve aktif olmalı")
    public void upcomingCoursesAlanındakiViewAllButonuGörünürVeAktifOlmalı() {

    }

    @And("Latest Bundles alanındaki View All butonu görünür ve aktif olmalı")
    public void latestBundlesAlanındakiViewAllButonuGörünürVeAktifOlmalı() {

    }
}




