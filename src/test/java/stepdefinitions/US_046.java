package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.AlpayPage;
import utils.ReusableMethods;

import static org.testng.Assert.*;

public class US_046 {

    WebDriver driver = DriverManager.getDriver(); // fetch current thread's driver
    AlpayPage alpayPage = new AlpayPage(driver);

    @Given("Dashboard menu sidebar da support menusu oldugunu kontrol eder")
    public void dashboard_menu_sidebar_da_support_menusu_oldugunu_kontrol_eder() {

        assertTrue(alpayPage.supportBasligi.isDisplayed());

        ReusableMethods.bekle(2);
    }
    @Given("Support basligina tiklanir")
    public void support_basligina_tiklanir() {

        alpayPage.supportBasligi.click();
        ReusableMethods.bekle(2);

        assertTrue(alpayPage.newBasligi.isDisplayed());
    }
    @Given("Support basliginin altindaki her bir baglantiya tiklanir")
    public void support_basliginin_altindaki_her_bir_baglantiya_tiklanir() {

        alpayPage.newBasligi.click();
        ReusableMethods.bekle(2);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support/new");

        alpayPage.coursesSupportBasligi.click();
        ReusableMethods.bekle(2);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support");

        alpayPage.ticketsBasligi.click();
        ReusableMethods.bekle(2);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support/tickets");
    }

    @Given("New alt basligina tiklanir")
    public void new_alt_basligina_tiklanir() {

        alpayPage.newBasligi.click();
        ReusableMethods.bekle(2);
        assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/support/new");

    }
    @Given("Subject alanına bilgi girilir")
    public void alanına_bilgi_girilir(String string) {

    }
    @Given("Type secimi yapilir")
    public void secimi_yapilir(String string) {

    }
    @Given("Course secimi yapilir")
    public void course_secimi_yapilir() {

    }
    @Given("Gonder butonuna tiklanir")
    public void butonuna_tiklanir(String string) {

    }



}
