package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.InstructorsPage;
import utils.JSUtilities;
import utils.ReusableMethods;

public class US_034 {

    WebDriver driver = DriverManager.getDriver();
    BasePage basePage = new BasePage(driver);
    ReusableMethods reusableMethods = new ReusableMethods();
    InstructorsPage instructorsPage = new InstructorsPage(driver);


    @Then("Instructors yazisi görünür oldugu dogrulanir")
    public void instructors_yazisi_görünür_oldugu_dogrulanir() {
        reusableMethods.isWebElementDisplayed(instructorsPage.getInstructorButton());


    }
    @Then("Instructors yazisina tiklanir")
    public void instructors_yazisina_tiklanir() {
        basePage.click(instructorsPage.getInstructorButton());
    }


    @Then("Acilan sayfada Instructors yazisinin yer aldigi dogrulanir")
    public void acilan_sayfada_instructors_yazisinin_yer_aldigi_dogrulanir() {
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getInstructorYazisi()));
    }

    @Then("Search textbox görünürlügü dogrulanir")
    public void search_textbox_görünürlügü_dogrulanir() {
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getSearchBox()));
    }
    @Then("search butonunun görünürlügü dogrulanir")
    public void search_butonunun_görünürlügü_dogrulanir() {
        Assert.assertTrue(reusableMethods.isWebElementDisplayed(instructorsPage.getSearchButton()));
    }

    @Then("Search box'a {string} yazilip aratilir")
    public void search_box_a_yazilip_aratilir(String instractorName) {
        basePage.type(instructorsPage.getSearchBox(), instractorName);
    }

    @Then("Gelen sonucun {string} icerdigi dogrulanir")
    public void gelen_sonucun_icerdigi_dogrulanir(String instractorName) {
        Assert.assertTrue(instructorsPage.searchResultTest(instractorName));
    }

    @Then("Search box'a tiklanir")
    public void search_box_a_tiklanir() {
        JSUtilities.clickWithJS(driver,instructorsPage.getSearchButton());
    }

    @When("Categories'e tiklanir")
    public void categories_e_tiklanir() {
       basePage.click(instructorsPage.getCategories());
    }
    @When("Categories'in icinde 'Web Design'a tiklanir")
    public void categories_in_icinde_web_design_a_tiklanir() {
        basePage.click(instructorsPage.getWebDesign());
    }
    @Then("Acilan URL'in {string} kelimesini icerdigi dogrulanir")
    public void acilan_url_in_kelimesini_icerdigi_dogrulanir(String word) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(word));
    }


}
