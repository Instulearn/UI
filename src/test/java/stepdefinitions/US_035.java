package stepdefinitions;

import config.ConfigReader;
import drivers.DriverManager;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Header;
import pages.LoginPage;
import pages.LutfiPage;
import utils.ReusableMethods;

import static org.testng.Assert.*;

public class US_035 {

    WebDriver driver = DriverManager.getDriver();
    private static final Logger logger = LogManager.getLogger(US_035.class);

    LutfiPage lutfiPage = new LutfiPage(driver);
    Header header = new Header(driver);
    LoginPage loginPage = new LoginPage(driver);

    // ********************* TC_35.1 **********************

    @Given("Kullanıcı headerdaki Home butonuna tıklar ve ana sayfaya gider")
    public void kullanıcı_headerdaki_home_butonuna_tıklar_ve_ana_sayfaya_gider() {

        assertTrue(lutfiPage.dashboardHomeButton.isDisplayed());
        assertTrue(lutfiPage.dashboardHomeButton.isEnabled());
        logger.info("Kullanıcı home butonu görünür ve aktif");

        lutfiPage.dashboardHomeButton.click();
        driver.get(ConfigReader.getProperty("url"));
        assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("url"));
        logger.info("Kullanıcı Anasayfaya Başarılı Şekilde Ulaştı");

    }

    @Given("Kullanıcı anasayfadaki store butonunun görünür olduğunu doğrular.")
    public void kullanıcı_anasayfadaki_store_butonunun_görünür_olduğunu_doğrular() {

        assertTrue(lutfiPage.homePageStoreButton.isDisplayed());
        assertTrue(lutfiPage.homePageStoreButton.isEnabled());
        logger.info("Anasayfadaki Store butonu görünür ve aktif");

    }

    // ********************* TC_35.2 **********************

    @Given("Kullanıcı anasayfadaki store butonuna tıklar")
    public void kullanıcı_anasayfadaki_store_butonuna_tıklar() {
        lutfiPage.homePageStoreButton.click();
        logger.info("Anasayfadaki Store butonuna tıklar");


    }
    @Given("Kullanıcı products sayfasına eriştiğini doğrular")
    public void kullanıcı_products_sayfasına_eriştiğini_doğrular() {
        assertTrue(lutfiPage.productsPageTitle.isDisplayed());
        logger.info("Kullanıcı Store sayfasına erişir");
    }

// ********************* TC_35.3 **********************

    @Given("Kullanıcı Search textBox ve search butonunun görünür ve aktif olduğunu doğrular")
    public void kullanıcı_search_text_box_ve_search_butonunun_görünür_ve_aktif_olduğunu_doğrular() {

        assertTrue(lutfiPage.productSearchInput.isDisplayed());
        assertTrue(lutfiPage.productSearchInput.isEnabled());
        logger.info("Search textBox görünür ve aktif");

        assertTrue(lutfiPage.productSearchButton.isDisplayed());
        assertTrue(lutfiPage.productSearchButton.isEnabled());
        logger.info("Search butonu görünür ve aktif");

    }

    // ********************* TC_35.4 **********************

    @Given("Kullanıcı options filtreleme bölümünden only avaliable products ile filtreleme işlemi gerçekleştirir.")
    public void kullanıcı_options_filtreleme_bölümünden_only_avaliable_products_ile_filtreleme_işlemi_gerçekleştirir() {

        String totalNumberOfProducts = lutfiPage.productsCountBadge.getText();

        Actions actions = new Actions(driver);
        actions.scrollToElement(lutfiPage.productsFilterOptionsSide).perform();

        ReusableMethods.bekle(3);


        assertTrue(lutfiPage.productsFilterOptionsSide.isDisplayed());
        logger.info("Filtreleme alanında options kısmı görünür");

        actions.scrollToElement(lutfiPage.onlyAvailableCheckbox).perform();

        ReusableMethods.bekle(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", lutfiPage.onlyAvailableCheckbox);

        logger.info("Only Available Products tıklandı");

        // lutfiPage.onlyAvailableCB.click();

        actions.scrollToElement(lutfiPage.optionsFilterButton).perform();

        ReusableMethods.bekle(3);

        lutfiPage.optionsFilterButton.click();

        String filteredNumberOfProducts = lutfiPage.productsCountBadge.getText();

        assertNotEquals(filteredNumberOfProducts, totalNumberOfProducts);
        logger.info("Filtreleme işlemi başarıyla gerçekleştirilmiştir");


    }

    // ********************* TC_35.5 **********************

    @Given("Filtrelenen ilk ürünün fiyat , satıcı, ürün adı, description bilgilerinin olması")
    public void filtrelenen_ilk_ürünün_fiyat_satıcı_ürün_adı_description_bilgilerinin_olması() {

        Actions actions = new Actions(driver);
        actions.scrollToElement(lutfiPage.firstFilteredProduct).perform();

        ReusableMethods.bekle(3);

        //lutfiPage.firstFilteredProduct.click();
        //logger.info("İlk filtrelenen ürün tıklandı");

        assertTrue(lutfiPage.firstFilteredProductProdName.isDisplayed());
        logger.info("İlk filtrelenen üründe ürün adı bulunmaktadır");

        assertTrue(lutfiPage.firstFilteredProductSellerName.isDisplayed());
        logger.info("İlk filtrelenen üründe satıcı adı bulunmaktadır");

        assertTrue(lutfiPage.firstFilteredProductCategoryName.isDisplayed());
        logger.info("İlk filtrelenen üründe kategori adı bulunmaktadır");




    }

    // ********************* TC_35.6 **********************

    @Given("Filtrelenen ilk ürüne tıklar.")
    public void filtrelenen_ilk_ürüne_tıklar() {

        lutfiPage.firstFilteredProduct.click();
        logger.info("İlk filtrelenen ürün tıklandı");

        ReusableMethods.bekle(3);

        //İstenen urun seçildiginde kurs sayfasına yönlendirme yapmalı,
        // add to card ve buy now butonları görünür ve aktif olmalı,


        assertTrue(lutfiPage.addToCartButton.isDisplayed());
        assertTrue(lutfiPage.addToCartButton.isEnabled());
        logger.info("Add to Cart butonu görünür ve aktiftir");

        assertTrue(lutfiPage.buyNowButton.isDisplayed());
        assertTrue(lutfiPage.buyNowButton.isEnabled());
        logger.info("Buy now butonu görünür ve aktiftir");

        // urunle ilgili detaylı bilgiler görüntülenmeli,urunun puanlaması görüntülenmeli.

        assertTrue(lutfiPage.descriptionPart.isDisplayed());
        assertTrue(lutfiPage.descriptionPart.isEnabled());
        logger.info("Ürünle ilgili description kısmı bulunmaktadır");

        assertTrue(lutfiPage.productPoint.isDisplayed());
        assertTrue(lutfiPage.productPoint.isEnabled());
        logger.info("Ürünle ilgili puan kısmı bulunmaktadır");



    }
    @Given("Comments linki tıklanmalı, yorum yazılmalı ve post comment butonuna tıklanmalıdır.")
    public void comments_linki_tıklanmalı_yorum_yazılmalı_ve_post_comment_butonuna_tıklanmalıdır() {


        //comments yazılı olmalı
        assertTrue(lutfiPage.productCommentsTitle.isDisplayed());
        logger.info("Ürünle ilgili comments title bulunmaktadır");

        //comments textArea tıklanmalı

        assertTrue(lutfiPage.productCommentsTextArea.isEnabled());
        logger.info("Ürünle ilgili comments textarea bulunmaktadır");


        //comments area'ya test ile veri girişi yazılmalı
        lutfiPage.productCommentsTextArea.sendKeys("test ile veri girişi");

        //post butonuna tıklanmalı

        assertTrue(lutfiPage.productPostCommentButton.isDisplayed());
        assertTrue(lutfiPage.productPostCommentButton.isEnabled());
        logger.info("Ürünle ilgili post comment butonu bulunmaktadır ve aktiftir");


        //Comments sent successfully yazısı olmalı.
        lutfiPage.productPostCommentButton.click();

        assertTrue(lutfiPage.productSuccessSend.isDisplayed());

        logger.info("Ürünle ilgili post başarıyla gönderilmiştir");


    }

    @Given("Buy now butonuna tıklar")
    public void buy_now_butonuna_tıklar() {

        lutfiPage.buyNowButton.click();
        //Shopping cart sayfasına erişilmeli ve ürün bu sayfada olmalı

        assertTrue(lutfiPage.shoppingCartTitle.isDisplayed());
        logger.info("Kullanıcı shopping cart sayfasına ulaşmıştır");

        assertTrue(lutfiPage.shoppingCartTitle.isDisplayed());
        logger.info("Kullanıcı shopping cart sayfasına ulaşmıştır");

        assertTrue(lutfiPage.cartPaintingTitle.isDisplayed());
        logger.info("Seçilen ürün cart sayfasına eklenmiştir");

    }



}
