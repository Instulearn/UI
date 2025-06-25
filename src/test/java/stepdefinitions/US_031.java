package stepdefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LoginPage;
import pages.OmerPage;
import io.cucumber.java.en.Then;
import utils.ReusableMethods;

import static java.awt.SystemColor.menu;

public class US_031 {

    WebDriver driver = DriverManager.getDriver();
    OmerPage omerPage = new OmerPage(driver);
    JavascriptExecutor js =(JavascriptExecutor) driver;
    LoginPage loginPage = new LoginPage(driver);
    Actions actions = new Actions(driver);


    @When("instructor kullanıcı adı, şifreyi girer ve login butonuna basar")
    public void instructor_kullanıcı_adı_şifreyi_girer_ve_login_butonuna_basar() {
      loginPage.login("omercan@instulearn.com","123Test.");
        ReusableMethods.bekle(1);


    }

    @Then("Dashboard sideBar aşağıya çekilir")
    public void dashboadr_side_bar_aşağıya_çekilir() {

        WebElement link = driver.findElement(By.xpath("(//*[@Class='d-flex align-items-center'])[229]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
    }

    @Then("Settings linkine tıklanır")
    public void settings_linkine_tıklanır() {
        omerPage.dashboardSettingsButton.click();
    }

    @Then("İlgili sayfanın açıldığını doğrular")
    public void ilgili_sayfanın_açıldığını_doğrular() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa.instulearn.com/panel/setting");

    }

    @Then("account başlığı altındaki password text box'ına tıklar ve şifre girilir")
    public void account_başlığı_altındaki_password_text_box_ına_tıklar_ve_şifre_girilir() {
        omerPage.accountPasswordTextBox.sendKeys("123Test.");
        ReusableMethods.bekle(1);
    }

    @Then("account başlığı altındaki phone text box'ına tıklar ve şifre girilir")
    public void account_başlığı_altındaki_phone_text_box_ına_tıklar_ve_şifre_girilir() {
        omerPage.accountPhoneTextBox.sendKeys("05424424242");
        ReusableMethods.bekle(2);
    }

    @Then("sayfa aşağıya kaydırılır ve next butonuna tıklanır")
    public void sayfa_aşağıya_kaydırılır_ve_next_butonuna_tıklanır() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        omerPage.nextButton.click();
    }

    @Then("images link butona tıklanır")
    public void images_link_butona_tıklanır() {
        omerPage.settingsİmageLinkButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("about link butona tıklanır")
    public void about_link_butona_tıklanır() {
        omerPage.settingsAboutsLinkButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("biography text box'a biyografi girilir")
    public void biography_text_box_a_biyografi_girilir() {
        omerPage.aboutBiographyTextBox.sendKeys("Turgut Uyar, 4 Ağustos 1987’de " +
                "Ankara’da dünyaya geldim. Halen Ankara’da ikamet etmekteyim.");
        ReusableMethods.bekle(1);
    }

    @Then("job title text box'a meslek girilir")
    public void job_title_text_box_a_meslek_girilir() {
        omerPage.aboutJobTitleTextBox.sendKeys("QA Engineer");
        ReusableMethods.bekle(1);
    }

    @Then("next butonuna tıklanır")
    public void next_butonuna_tıklanır() {
        omerPage.nextButton.click();
    }

    @Then("education link butona tıklar")
    public void education_link_butona_tıklar() {
        omerPage.educationLinkButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("add education butona tıklar")
    public void add_education_butona_tıklar() {
       omerPage.addEducationButton.click();
       ReusableMethods.bekle(1);
    }

    @Then("new education tex box'ına ilgili veriyi girer")
    public void new_education_tex_box_ına_ilgili_veriyi_girer() {
        omerPage.newEducationTextBox.sendKeys("Software Development");
        ReusableMethods.bekle(2);
    }

    @Then("new education sayfasındaki save butonuna basar")
    public void new_education_sayfasındaki_save_butonuna_basar() {
        omerPage.educationSaveButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("experience link butona tıklanır")
    public void experience_link_butona_tıklanır() {
        omerPage.experienceLinkButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("add experience butonunun görünür olduğunu doğrular")
    public void add_experience_butonunun_görünür_olduğunu_doğrular() {
       Assert.assertTrue(omerPage.addExperienceButton.isDisplayed());
    }

    @Then("skill topics link butona tıklanır")
    public void skill_topics_link_butona_tıklanır() {
        omerPage.skillTopicsLinkButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("SDET\\(Software Development Engineer in Test) butona tıklanır")
    public void sdet_software_development_engineer_in_test_butona_tıklanır() {
        omerPage.sdetButton.click();
        ReusableMethods.bekle(1);
    }

    @Then("Identity & Financial link butona tıklanır")
    public void ıdentity_financial_link_butona_tıklanır() {
        omerPage.identityFinancialButtonLink.click();
        ReusableMethods.bekle(1);
    }
    @Then("Select account type check box'ından paypal seçilir")
    public void select_account_type_check_box_ından_paypal_seçilir() {
        omerPage.selectAccountTypeButton.sendKeys("Paypal");
        ReusableMethods.bekle(1);
    }
    @Then("account holder text box'ına ilgili data girilir")
    public void account_holder_text_box_ına_ilgili_data_girilir() {
        omerPage.accountHolderTextBox.sendKeys("Turgut Uyar");
        ReusableMethods.bekle(1);
    }
    @Then("email text box'ına ilgili data girilir")
    public void email_text_box_ına_ilgili_data_girilir() {
        omerPage.identityEmailBox.sendKeys("turgut@inst.com");
        ReusableMethods.bekle(1);
    }
    @Then("sayfa aşağıya çekilir")
    public void sayfa_aşağıya_çekilir() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ReusableMethods.bekle(1);
    }
    @Then("adress text box'ına ilgili data girilir")
    public void adress_text_box_ına_ilgili_data_girilir() {
        omerPage.addressTextBox.sendKeys("Ankara");
    }

    @Then("Zoom API link butona tıklanır")
    public void zoom_apı_link_butona_tıklanır() {
       omerPage.zoomApıLinkButton.click();
       ReusableMethods.bekle(1);
    }

    @Then("Zoom Client ID ye ilgili data girilir")
    public void zoom_client_ıd_ye_ilgili_data_girilir() {
        omerPage.zoomClientIdTextBox.sendKeys("6161616161");
        ReusableMethods.bekle(1);
    }

    @Then("Zoom Client Secret ilgili data girilir")
    public void zoom_client_secret_ilgili_data_girilir() {
        omerPage.zoomClientSecretTextBox.sendKeys("6161616161");
        ReusableMethods.bekle(1);
    }

    @Then("Zoom Account ID ye ilgili data girilir")
    public void zoom_account_ıd_ye_ilgili_data_girilir() {
        omerPage.zoomAccountIdTextBox.sendKeys("6161616161");
        ReusableMethods.bekle(1);
    }

    @Then("Extra Information link butona tıklanır")
    public void extra_ınformation_link_butona_tıklanır() {
      omerPage.extraInformationLinkButton.click();
      ReusableMethods.bekle(1);
    }
    @Then("Gender başlığı altında male butonu seçilir")
    public void gender_başlığı_altında_male_butonu_seçilir() {
        omerPage.genderMaleButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("Age text box'ına ilgili data girilir")
    public void age_text_box_ına_ilgili_data_girilir() {
        omerPage.extraInformationAgeTextBox.sendKeys("30");
        ReusableMethods.bekle(2);
    }
    @Then("Meeting Type başlığı altındaki All butonu seçilir")
    public void meeting_type_başlığı_altındaki_all_butonu_seçilir() {
        omerPage.meetingTypeAllButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("Training level başlığı altında ki Advanced butonu seçilir")
    public void training_level_başlığı_altında_ki_advanced_butonu_seçilir() {
        omerPage.trainingLevelAdvancedButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("Region başlığı altında ki Country United States seçilir")
    public void region_başlığı_altında_ki_country_united_states_seçilir() {
        omerPage.regionCountryCheckBox.sendKeys("United States");
        ReusableMethods.bekle(2);
    }
    @Then("sayfa aşağıya kaydırılır ve save butonuna tıklanır")
    public void sayfa_aşağıya_kaydırılır_ve_save_butonuna_tıklanır() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ReusableMethods.bekle(2);
        omerPage.saveButton.click();
    }

    @Then("sayfanın sağ alt köşesindeki Delete Account butonuna tıklanır")
    public void sayfanın_sağ_alt_köşesindeki_delete_account_butonuna_tıklanır() {
        omerPage.deleteAccountButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("çıkan uyarı sayfasında ki Yes, I Confirm butonuna tıklanır")
    public void çıkan_uyarı_sayfasında_ki_yes_ı_confirm_butonuna_tıklanır() {
        omerPage.yesIConfirmButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("Hesabın silindiğini doğrulayan bilgilendirme sayfasından, sayfanın herhangi bir yere tıklanarak çıkılır")
    public void hesabın_silindiğini_doğrulayan_bilgilendirme_sayfasından_sayfanın_herhangi_bir_yere_tıklanarak_çıkılır() {
        js.executeScript("document.body.click();");
    }




}
