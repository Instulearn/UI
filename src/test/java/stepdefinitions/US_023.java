package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LoginPage;
import pages.OmerPage;
import utils.ReusableMethods;

public class US_023 {

    WebDriver driver = DriverManager.getDriver();
    OmerPage omerPage = new OmerPage(driver);
    JavascriptExecutor js =(JavascriptExecutor) driver;
    LoginPage loginPage = new LoginPage(driver);
    Actions actions = new Actions(driver);

    @Then("dashboard sideBar da course bundles butona tıklanır")
    public void dashboard_side_bar_da_course_bundles_butona_tıklanır() {
        omerPage.courseBundlesButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("açılan menüde new linkine tıklanır")
    public void açılan_menüde_new_linkine_tıklanır() {
        omerPage.coursesBundlesNewLinkButton.click();
       ReusableMethods.bekle(2);
    }
    @Then("ilgili sayfanın açıldığı doğrulanır")
    public void ilgili_sayfanın_açıldığı_doğrulanır() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.instulearn.com/panel/bundles/new");
    }

    @Then("basic info altındaki Title text box'ına ilgili data girilir")
    public void basic_info_altındaki_title_text_box_ına_ilgili_data_girilir() {
        omerPage.titleTextBox.sendKeys("Cucumber Lesson 1");
        ReusableMethods.bekle(1);
    }
    @Then("basic info altındaki SEO Meta Description text box'ına ilgili data girilir")
    public void basic_info_altındaki_seo_meta_description_text_box_ına_ilgili_data_girilir() {
        omerPage.seoMetaDescriptionTextBox.sendKeys("Software Development");
        ReusableMethods.bekle(1);

    }

    @Then("Basic info altındaki Description text box'ına tıklanır ve ilgili data girilir.")
    public void basic_info_altındaki_description_text_box_ına_tıklanır_ve_ilgili_data_girilir() {
        omerPage.descriptionTextBox.sendKeys("Yazılım Dünyasına Güçlü Bir Adım Atmak İsteyenler İçin Yepyeni Bir Fırsat!\n" +
                "\n" +
                "Teknoloji hızla gelişiyor ve bu gelişime ayak uydurabilmek, hatta öncüsü olabilmek artık bir ayrıcalıktan çok bir gereklilik haline geldi. Yeni açılan yazılım kursumuz, bu değişimin bir parçası olmak isteyen herkese kapılarını açıyor! " +
                "İster üniversite öğrencisi olun, ister kariyerine yeni bir yön vermek isteyen bir profesyonel, ister sıfırdan başlayıp yazılım alanında uzmanlaşmak isteyen bir girişimci; bu kurs tam size göre!\n" +
                "\n" +
                "Kursumuzda, yazılım dünyasına dair hem teorik hem de pratik bilgileri bir arada sunuyoruz. Temel algoritma ve programlama mantığından başlayarak, Python, JavaScript, HTML-CSS, React ve SQL gibi güncel teknolojilere kadar geniş bir yelpazede eğitim veriyoruz. " +
                "Proje tabanlı eğitim modelimiz sayesinde, katılımcılar öğrendiklerini gerçek dünya projeleri üzerinde uygulama fırsatı buluyor. Bu sayede yalnızca kod yazmayı değil, aynı zamanda problem çözmeyi, ekip çalışmasını ve yazılım geliştirme süreçlerini de öğrenmiş oluyorsunuz.");
    }

    @Then("thumbnail text box'a ilgili data girilir")
    public void thumbnail_text_box_a_ilgili_data_girilir() {
        omerPage.thumbnailTextBox.sendKeys("/store/1602/f3253bcd8fcb99e7ec69a9839451bb37.jpg");
        ReusableMethods.bekle(1);
    }

    @Then("cover image text box'ına ilgili data girilir")
    public void cover_image_text_box_ına_ilgili_data_girilir() {
        omerPage.coverImageTextBox.sendKeys("/store/1602/f3253bcd8fcb99e7ec69a9839451bb37.jpg");
        ReusableMethods.bekle(1);
    }

    @Then("previous butonu görüntülenir")
    public void previous_butonu_görüntülenir() {
        Assert.assertTrue(omerPage.previousButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Then("next butonu görüntülenir")
    public void next_butonu_görüntülenir() {
        Assert.assertTrue(omerPage.nextButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Then("send for review görüntülenir")
    public void send_for_review_görüntülenir() {
       Assert.assertTrue(omerPage.sendOfReviewButton.isDisplayed());
       ReusableMethods.bekle(1);
    }

    @Then("save as draft görüntülenir")
    public void save_as_draft_görüntülenir() {
        Assert.assertTrue(omerPage.saveAsDraftButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Then("extra information sayfasına gidilir")
    public void extra_information_sayfasına_gidilir() {
       driver.get("https://qa.instulearn.com/panel/bundles/99/step/2");
       ReusableMethods.bekle(1);
    }

    @Then("category text box'ına tıklanır")
    public void category_text_box_ına_tıklanır() {
        omerPage.categoryCheckBox.click();
        ReusableMethods.bekle(1);
    }

    @Then("dıgıtal marketing linkine tıklanır")
    public void dıgıtal_marketing_linkine_tıklanır() {
        omerPage.categoryCheckBox.sendKeys("Digital Marketing");
    }

    @Then("ilgili sayfaya gider")
    public void ilgili_sayfaya_gider() {
        driver.get("https://qa.instulearn.com/panel/bundles/99/step/3");
    }
    @Then("enable subscribe button'a tıklar")
    public void enable_subscribe_button_a_tıklar() {
        WebElement button = driver.findElement(By.xpath("//*[@Class='custom-control-input']"));

        actions.moveToElement(button).click().perform();
    }
    @Then("access period text box'a ilgili data girilir")
    public void access_period_text_box_a_ilgili_data_girilir() {
        omerPage.accessPeriodTextBox.sendKeys("10");
        ReusableMethods.bekle(1);
    }
    @Then("price text box'a ilgili data girilir")
    public void price_$_text_box_a_ilgili_data_girilir() {
        omerPage.priceTextBox.sendKeys("150");
        ReusableMethods.bekle(1);
    }

    @Then("add course butonuna tıklar")
    public void add_course_butonuna_tıklar() {
        omerPage.addCourseButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("açılan sayfada select a course text box'ına ilgili data girilir")
    public void açılan_sayfada_select_a_course_text_box_ına_ilgili_data_girilir() {
        omerPage.selectaCourseCheckBox.click();
        ReusableMethods.bekle(1);
        omerPage.yazılımOgreniyorumText.click();
        ReusableMethods.bekle(1);
    }
    @Then("save butonuna tıklar")
    public void save_butonuna_tıklar() {
        omerPage.contentBaslıgıSaveButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("ilgili sayfa content e gider")
    public void ilgili_sayfa_content_e_gider() {
       driver.get("https://qa.instulearn.com/panel/bundles/99/step/4");
       ReusableMethods.bekle(1);
    }

    @Then("FAQ sayfasına gider")
    public void faq_sayfasına_gider() {
        driver.get("https://qa.instulearn.com/panel/bundles/99/step/5");
        ReusableMethods.bekle(1);
    }
    @Then("new faq butonuna tıklanır")
    public void new_faq_butonuna_tıklanır() {
        omerPage.newFAQButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("title text box'a ilgili data girilir")
    public void title_text_box_a_ilgili_data_girilir() {
        omerPage.faqTitleTextBox.sendKeys("Kurs yakında başlıyor!");
        ReusableMethods.bekle(1);
    }
    @Then("answer text box'a ilgili data girilir")
    public void answer_text_box_a_ilgili_data_girilir() {
        omerPage.answerTextBox.sendKeys("10 gün içerisinde kurs başlıyor");
        ReusableMethods.bekle(1);
    }
    @Then("faq save butonuna tıklanır")
    public void faq_save_butonuna_tıklanır() {
        omerPage.faqSaveButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("message to reviewer sayfasına gidilir")
    public void message_to_reviewer_sayfasına_gidilir() {
        driver.get("https://qa.instulearn.com/panel/bundles/99/step/6");
        ReusableMethods.bekle(1);
    }
    @Then("message to reviewer text box'ına ilgili data girilir")
    public void message_to_reviewer_text_box_ına_ilgili_data_girilir() {
        omerPage.messageToReviewerTextBox.sendKeys("Merhaba ben Turgut");
        ReusableMethods.bekle(1);
    }
    @Then("I agree with terms & rules butona tıklanır")
    public void ı_agree_with_terms_rules_butona_tıklanır() {
        omerPage.ıAgreeButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("send for review butona tıklanır")
    public void send_for_review_butona_tıklanır() {
        omerPage.sendForReview.click();
        ReusableMethods.bekle(1);
    }

    @Then("course bundles başlığına tıklar")
    public void course_bundles_başlığına_tıklar() {
      omerPage.courseBundlesButton.click();
      ReusableMethods.bekle(1);
    }
    @Then("açılan menüde my bundles başlığına tıklar")
    public void açılan_menüde_my_bundles_başlığına_tıklar() {

        omerPage.myBundlesLink.click();
        ReusableMethods.bekle(2);
    }
    @Then("cucumber lesson {int} adlı paket görüntüler ve doğrular")
    public void cucumber_lesson_adlı_paket_görüntüler_ve_doğrular(Integer int1) {
        Assert.assertEquals(omerPage.kursBaşlığı.getText(),"Cucumber Lesson 1");
        ReusableMethods.bekle(1);
    }

    @Then("course bundles menü başlığına tıklar")
    public void course_bundles_menü_başlığına_tıklar() {
        omerPage.courseBundlesButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("açılan menüde ki my bundles link başlığının görünürlüğünü doğrular")
    public void açılan_menüde_ki_my_bundles_link_başlığının_görünürlüğünü_doğrular() {
        Assert.assertEquals(omerPage.myBundlesLink.getText(),"My Bundles");
        ReusableMethods.bekle(1);
    }


    @Then("course bölümünün sol üstteki {int} noktaya tıklar")
    public void course_bölümünün_sol_üstteki_noktaya_tıklar(Integer int1) {
        omerPage.myBundlesÜcNokta.click();
        ReusableMethods.bekle(1);
    }
    @Then("açılan sayfada edit linkinin görünürlüğünü test eder")
    public void açılan_sayfada_edit_linkinin_görünürlüğünü_test_eder() {
        Assert.assertTrue(omerPage.myBundlesEditButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("courses linkinin görünürlüğünü test eder")
    public void courses_linkinin_görünürlüğünü_test_eder() {
        Assert.assertTrue(omerPage.myBundlesCoursesButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("export students list linkinin görünürlüğünü test eder")
    public void export_students_list_linkinin_görünürlüğünü_test_eder() {
        Assert.assertTrue(omerPage.myBundlesExportStudentsListButton.isDisplayed());
        ReusableMethods.bekle(1);
    }
    @Then("delete linkinin görünürlüğünü test eder")
    public void delete_linkinin_görünürlüğünü_test_eder() {
        Assert.assertTrue(omerPage.myBundlesDeleteButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

}
