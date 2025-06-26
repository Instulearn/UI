package stepdefinitions;

import context.ScenarioContext;
import drivers.DriverManager;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.CihatPage;
import utils.JSUtilities;
import utils.ReusableMethods;

import static org.testng.Assert.assertTrue;


public class US_033 {

    WebDriver driver = DriverManager.getDriver();// fetch current thread's driver

    private SoftAssert softAssert() {
        return ScenarioContext.softAssert.get();
    }


    @Given("Dashboard menu header da Courses basligi goruntulenir ve tiklanir")
    public void dashboard_menu_header_da_courses_basligi_goruntulenir() {

        WebElement Courses = new CihatPage(driver).CoursesDashbord;
        assertTrue(Courses.isDisplayed());
        Courses.click();

        ReusableMethods.bekle(2);
    }

    @Given("courses sayfasına gidip text \\(Courses) görüntülenir")
    public void courses_sayfasına_gidip_text_courses_görüntülenir() {

        WebElement coursesText = new CihatPage(driver).CoursesText;

        if (!coursesText.isDisplayed()) {
            throw new AssertionError("Courses Text  görünür değil: ");
        }

    }

    @Given("Courses sayfasında search textBox ve search buton görüntülenir")
    public void courses_sayfasında_search_text_box_ve_search_buton_görüntülenir() {

        WebElement coursesSearchText = new CihatPage(driver).CoursesSearchText;

        if (!coursesSearchText.isDisplayed()) {
            throw new AssertionError("Courses Search Text  görünür değil: ");

        }
        ReusableMethods.bekle(2);

    }

    @Given("Courses sayfasında {string} butonu  görüntülenir")
    public void courses_sayfasında_butonu_görüntülenir(String string) {
        WebElement FilterItemsButon = new CihatPage(driver).FilterItemsButon;
        JSUtilities.scrollToVisibleElement(driver, FilterItemsButon);

        if (!FilterItemsButon.isDisplayed()) {
            throw new AssertionError("FilterItemsButon  görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }

    @Given("Filtreleme seçenekleri işaretlenir")
    public void filtreleme_seçenekleri_işaretlenir() {

        WebElement FilterCheckBox1 = new CihatPage(driver).FilterCheckBox1;
        assertTrue(FilterCheckBox1.isDisplayed());
        FilterCheckBox1.click();


        WebElement FilterCheckBox2 = new CihatPage(driver).FilterCheckBox2;
        assertTrue(FilterCheckBox2.isDisplayed());
        FilterCheckBox2.click();


        ReusableMethods.bekle(2);
        throw new PendingException();
    }


    @Given("Courses sayfasında {string} butonu  tıklanır")
        public void courses_sayfasında_butonu_tıklanır(String string) {

        WebElement FilterItemsButon = new CihatPage(driver).FilterItemsButon;

        assertTrue(FilterItemsButon.isDisplayed());
        FilterItemsButon.click();
        throw new io.cucumber.java.PendingException();

    }

    @Given("Secilen kursların fiyatı görüntülenir")
    public void secilen_kursların_fiyatı_görüntülenir() {

        WebElement KursFiyati = new CihatPage(driver).KursFiyati;

        if (!KursFiyati.isDisplayed()) {
            throw new AssertionError("Kurs Fiyati  görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }

    @Given("Secilen kursların tarih  bilgileri goruntulenir")
    public void secilen_kursların_tarih_bilgileri_goruntulenir() {

        WebElement KursTarihi = new CihatPage(driver).KursTarihi;

        if (!KursTarihi.isDisplayed()) {
            throw new AssertionError("Kurs Tarihi görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }

    @Given("Secilen kursların ders adı bilgileri goruntulenir")
    public void secilen_kursların_ders_adı_bilgileri_goruntulenir() {

        WebElement KursAdi = new CihatPage(driver).KursAdi;

        if (!KursAdi.isDisplayed()) {
            throw new AssertionError("Kurs Adi  görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }

    @Given("Secilen kursların ınstructor bilgileri goruntulenir")
    public void secilen_kursların_ınstructor_bilgileri_goruntulenir() {
        WebElement KursInstructorsBilgileri = new CihatPage(driver).KursInstructorsBilgileri;

        if (!KursInstructorsBilgileri.isDisplayed()) {
            throw new AssertionError("Kurs Instructors Bilgileri  görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }




    @Given("istenen kurs secildiginde kurs sayfası görüntülenir")
    public void istenen_kurs_secildiginde_kurs_sayfası_görüntülenir() {

        WebElement SecilenKurs =new CihatPage(driver).SecilenKurs;
        SecilenKurs.click();

        ReusableMethods.bekle(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/bundles/Solar-Energy-Design-Course-From-Zero-To-Hero");
        throw new io.cucumber.java.PendingException();

    }

    @Given("kurs sayfasında add to card  görüntülenir")
    public void kurs_sayfasında_add_to_card_görüntülenir() {

        WebElement AddToCard = new CihatPage(driver).AddToCard;

        if (!AddToCard.isDisplayed()) {
            throw new AssertionError("Kurs sayfasında add to card  görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();


    }
    @Given("kurs sayfasında buy now butonu görüntülenir")
    public void kurs_sayfasında_buy_now_butonu_görüntülenir() {

        WebElement BuyButon = new CihatPage(driver).BuyButon;

        if (!BuyButon.isDisplayed()) {
            throw new AssertionError("Kurs Buy Now Buton görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();

    }

    @Given("Kursla ilgili detaylı bilgiler görüntülenir")
    public void kursla_ilgili_detaylı_bilgiler_görüntülenir() {
        WebElement KursDetay = new CihatPage(driver).KursDetay;

        if (!KursDetay.isDisplayed()) {
            throw new AssertionError("Kurs Detay görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }

    @Given("kursun puanlaması görüntülenir")
    public void kursun_puanlaması_görüntülenir() {
        WebElement KursPuan = new CihatPage(driver).KursPuan;

        if (!KursPuan.isDisplayed()) {
            throw new AssertionError("Kurs Puani görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }

    @Given("kurs ıle ilgili yorum sayfası görüntülenir")
    public void kurs_ıle_ilgili_yorum_sayfası_görüntülenir() {
        WebElement KursYorum = new CihatPage(driver).KursYorum;

        if (!KursYorum.isDisplayed()) {
            throw new AssertionError("Kurs yorum görünür değil: ");

        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }

    @Given("instructor'a ait profil sayfası görüntülenir")
    public void instructor_a_ait_profil_sayfası_görüntülenir() {

        WebElement InstructorsProfile =new CihatPage(driver).InstructorsProfile;
        InstructorsProfile.click();

        ReusableMethods.bekle(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/users/929/profile");

        ReusableMethods.bekle(2);
    }





    @Given("Buy now butonu tıklanır")
    public void buy_now_butonu_tıklanır() {
        WebElement BuyButon =new CihatPage(driver).BuyButon;
        BuyButon.click();

        ReusableMethods.bekle(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/bundles/direct-payment");
        ReusableMethods.bekle(2);

    }



    @Given("Account charge butonu tıklanır")
    public void account_charge_butonu_tıklanır() {

        WebElement AccountCharged = new CihatPage(driver).AccountCharged;

        assertTrue(AccountCharged.isDisplayed());
        AccountCharged.click();
        throw new io.cucumber.java.PendingException();

    }

    @Given("start payment butonu tıklanır")
    public void start_payment_butonu_tıklanır() {

        WebElement StartPayment = new CihatPage(driver).StartPayment;

        assertTrue(StartPayment.isDisplayed());
        StartPayment.click();
        throw new io.cucumber.java.PendingException();


    }


    @Given("Ödeme sonuç sayfası açılır")
    public void ödeme_sonuc_sayfası_görüntülenir() {
        WebElement Congratulations =new CihatPage(driver).Congratulations;

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/payments/status");
        throw new io.cucumber.java.PendingException();
    }


    @Given("Your payment successfully done... mesajı görüntülenir")
    public void your_payment_successfully_done_mesajı_görüntülenir() {
        WebElement Congratulations = new CihatPage(driver).Congratulations;

        if (!Congratulations.isDisplayed()) {
            throw new AssertionError("Congratulations görünür değil: ");


        }
        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }




}




















