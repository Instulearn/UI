package stepdefinitions;

import context.ScenarioContext;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        //WebElement FilterCheckBox1 = new CihatPage(driver).FilterCheckBox1;
      //  assertTrue(FilterCheckBox1.isDisplayed());
       // FilterCheckBox1.click();
       // WebElement FilterCheckBox2 = new CihatPage(driver).FilterCheckBox2;
        //assertTrue(FilterCheckBox2.isDisplayed());
        //FilterCheckBox2.click();

        WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'Course Bundle')]/preceding-sibling::input[@type='checkbox']"));

        // Eğer checkbox işaretli değilse, işaretle
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        // Checkbox elementini bul
       // WebElement FilterCheckBox2 = new CihatPage(driver).FilterCheckBox1;

        // Eğer checkbox işaretli değilse, işaretle
       // if (!FilterCheckBox2.isSelected()) {
//            FilterCheckBox2.click();



        ReusableMethods.bekle(2);
        throw new io.cucumber.java.PendingException();
    }
   // @Given("Courses sayfasında {string} butonu  tıklanır")
    //public void courses_sayfasında_butonu_tıklanır(String string) {
      //  WebElement FilterItemsButon = new CihatPage(driver).FilterItemsButon;
        //assertTrue(FilterItemsButon.isDisplayed());
        //FilterItemsButon.click();
       // throw new io.cucumber.java.PendingException();
    }



















