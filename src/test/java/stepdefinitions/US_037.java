package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AlpayPage;
import pages.NotificationsPage;
import utils.JSUtilities;
import utils.ReusableMethods;

import org.openqa.selenium.WebDriver;


public class US_037 {

    WebDriver driver = DriverManager.getDriver();
    NotificationsPage notificationsPage = new NotificationsPage(driver);

    @Then("Dashboard sayfasinda Notifications linki görünür ve aktif olmalıdır")
    public void dashboard_sayfasinda_notifications_linki_gorunur_ve_aktif_olmali() {
        Assert.assertTrue(notificationsPage.notificationsLink.isDisplayed());
        Assert.assertTrue(notificationsPage.notificationsLink.isEnabled());
    }

    @When("Kullanici Notifications linkine tiklar")
    public void kullanici_notifications_linkine_tiklar() {
        notificationsPage.notificationsLink.click();
        ReusableMethods.bekle(2);
    }

    @Then("Notifications sayfasinda {string} başlığı görünür olmalıdır")
    public void notifications_sayfasinda_baslik_gorunur_olmalidir(String expectedTitle) {
        String actualText = notificationsPage.notificationsTitle.getText();
        Assert.assertEquals(expectedTitle, actualText);
    }

    @When("Kullanici bildirim listesinden bir View ikonuna tiklar")
    public void kullanici_bildirim_listesinden_bir_view_ikonuna_tiklar() {
        notificationsPage.firstViewIcon.click();
        ReusableMethods.bekle(2);
    }

    @Then("Bildirimin detaylari görünür olmalıdır")
    public void bildirimin_detaylari_gorunur_olmalidir() {
        Assert.assertTrue(notificationsPage.notificationDetailModal.isDisplayed());
    }

    @When("Kullanici Notifications sayfasinda ileri sayfa butonuna tiklar")
    public void kullanici_notifications_sayfasinda_ileri_sayfa_butonuna_tiklar() {
        notificationsPage.nextPageButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("Yeni bildirim sayfasi görünür olmalıdır")
    public void yeni_bildirim_sayfasi_gorunur_olmalidir() {
        Assert.assertTrue(notificationsPage.notificationsList.isDisplayed());
    }

    @When("Kullanici \"Mark all notifications as read\" ikonuna tiklar")
    public void kullanici_mark_all_notifications_as_read_ikonuna_tiklar() {
        notificationsPage.markAllAsReadIcon.click();
        ReusableMethods.bekle(2);
    }


}







