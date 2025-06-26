package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.OmerPage;
import utils.ReusableMethods;

public class US_042 {

    WebDriver driver = DriverManager.getDriver();
    OmerPage omerPage = new OmerPage(driver);

    @Given("kullanıcı login sayfasına gider")
    public void kullanıcı_login_sayfasına_gider() {
        driver.get(ConfigReader.getProperty("loginUrl"));

    }

    @When("kullanıcı adı, şifreyi girer ve login butonuna basar")
    public void kullanıcı_adı_şifreyi_girer_ve_login_butonuna_basar() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("omeryagcii61@gmail.com", "123Test.");

        ReusableMethods.bekle(2);


    }

    @Then("Dasboard sideBarda Meetings linkine tıklar")
    public void dasboard_side_barda_meetings_linkine_tıklar() {

        omerPage.meetingsLink.click();
        ReusableMethods.bekle(2);
    }

    @Then("Açılan menüde My rezervations linkine tıklar ve linki doğrular")
    public void açılan_menüde_my_rezervations_linkine_tıklar_ve_linki_doğrular() {
        omerPage.MyRezarvationsLink.click();
        ReusableMethods.bekle(2);

        String expectedUrl = "https://qa.instulearn.com/panel/meetings/reservation";
        String actualUrl = driver.getCurrentUrl();

        ReusableMethods.bekle(2);

        Assert.assertEquals(actualUrl,expectedUrl);

    }



    @Then("Açılan menüde My rezervations linkine tıklar")
    public void açılan_menüde_my_rezervations_linkine_tıklar() {
        omerPage.MyRezarvationsLink.click();
        ReusableMethods.bekle(1);

    }

    @Then("sayfayı aşağıya çeker instructors detay butonuna tıklar")
    public void sayfayı_aşağıya_çeker_instructors_detay_butonuna_tıklar() {

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");

        ReusableMethods.bekle(2);
        omerPage.meetingDetayButton.click();
    }

    @Then("add to calendar butonunun görünürlüğünü doğrular")
    public void add_to_calendar_butonunun_görünürlüğünü_doğrular() {
      Assert.assertTrue(omerPage.addToCalendarButton.isDisplayed());
    }

    @Then("contact ınstructors butonunun görünürlüğünü doğrular")
    public void contact_ınstructors_butonunun_görünürlüğünü_doğrular() {
        Assert.assertTrue(omerPage.contactInstructorButton.isDisplayed());
    }

    @Then("finished butonunun görünürlüğünü doğrular")
    public void finished_butonunun_görünürlüğünü_doğrular() {
        Assert.assertTrue(omerPage.finishMeetingButton.isDisplayed());

    }


}
