package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CananPage extends BasePage {

    // Constructor
    public CananPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
        //US17

        @FindBy(xpath = "//a[text()='Forgot your password?']")
        public WebElement forgotPasswordLink;

        @FindBy(xpath = "//h1[text()='Password Recovery']")
        public WebElement passwordRecoveryBasligi;

        @FindBy(xpath = "//input[@id='email']")
        public WebElement emailTextbox;

        @FindBy(xpath = "//div[contains(@class,'jq-toast-single')]")
        public WebElement successMessageC;

        @FindBy(xpath = "//button[text()='Reset Password']")
        public WebElement resetPasswordButonu;

        @FindBy(xpath = "//div[@id='app']//a[text()='Login']")
        public WebElement loginLinkOnForgotPasswordPage;

        //US18

        @FindBy(xpath = "//footer")
        public WebElement footerBolumu;

        @FindBy(xpath= "//footer//a[contains(@href,'/about')]")
        public WebElement aboutUsLink;

        @FindBy(xpath= "//footer//a[contains(@href,'/contact')]")
        public WebElement contactUsLink;

        @FindBy(xpath= "//footer//a[contains(@href,'certificate')]" )
        public WebElement certificateValidationLink;

        @FindBy(xpath = "//footer//a[contains(@href,'terms')]")
        public WebElement termsAndRulesLink;

        @FindBy(xpath= "//footer/div[3]//div[2]/div[1]")
        public WebElement footerTelefon;

        @FindBy(xpath = "//*[@id='app']/footer/div[3]/div/div[2]/div[3]")
        public WebElement footerEmail;

        @FindBy(xpath = "/html/body/div[2]/footer/div[1]/div/div/div/div[2]/form/div/div/input")
        public WebElement subscriberEmailInput;

        @FindBy(xpath = "//footer//form//button[text()='Join']")
        public WebElement subscribeButon;

        @FindBy(xpath = "//h2[@class='jq-toast-heading' and text()='Request done successfully!']")
        public WebElement requestDoneMesajiC;


        @FindBy(xpath = "//footer//a[contains(@href,'instagram.com')]")
        public WebElement instagramIkon;

        @FindBy(xpath = "//footer//a[contains(@href,'whatsapp.com')]")
        public WebElement whatsappIkon;

        @FindBy(xpath = "//footer//a[contains(@href,'twitter.com')]")
        public WebElement twitterIkon;

        @FindBy(xpath = "//footer//a[contains(@href,'facebook.com')]")
        public WebElement facebookIkon;

        @FindBy(xpath = "//footer//*[contains(text(),'All rights are reserved for learning management system platform')]")
        public WebElement footerRightsMetni;

        @FindBy(xpath = "//footer//div[contains(@class,'footer-logo')]")
        public WebElement footerLogoLink;

        //US41
        @FindBy(xpath = "//a[normalize-space()='My Courses']")
        public WebElement myCoursesLink;

        @FindBy(xpath = "//a[contains(text(),'My purchases')]")
        public WebElement myPurchasesLinkC;

        @FindBy(xpath = "//div[contains(@class,'webinar-card webinar-list')]")
        public List<WebElement> myPurchasesList;

        @FindBy(xpath = "(//div[contains(@class,'btn-group')]/button)[1]")
        public WebElement satinAlinandersActionButonu;

        @FindBy(xpath = "//div[contains(@class,'dropdown')]/a[contains(text(),'Invoice')]")
        public WebElement invoiceButonuC;

        @FindBy(xpath = "/html/body/div[2]/section[2]/div/div[1]/div/div[2]/ul/li[2]/a")
        public WebElement videoIcerikLinkiC;

        @FindBy(xpath = "//a[contains(text(),'Favorites')]")
        public WebElement favoritesLinkiC;

        @FindBy(xpath = "//div[@class='row mt-30']/div[contains(@class,'col-')]")
        public List<WebElement> favoritesList;

        @FindBy(xpath = "(//button[@class='btn-transparent dropdown-toggle'])[1]")
        public WebElement ilkFavoriActionButonuC;

        @FindBy(xpath = "(//a[normalize-space()='Remove'])[1]")
        public WebElement ilkFavoriRemoveButonu;

        @FindBy(xpath = "//input[@type='password']")
        public WebElement passwordInputC;

        @FindBy(xpath = "//button[normalize-space()='Login']")
        public WebElement loginButtonC;

        @FindBy(xpath = "//span[text()='Courses']/parent::a")
        public WebElement coursesLinkiC;

        @FindBy(xpath = "//h3[contains(text(),'Dairy Technology')]")
        public WebElement dairyTechnologyLinkiC;

        //US 29 xpathleri
        @FindBy(xpath = "//span[contains(text(),'canan')]")
        public WebElement cananProfileButon;

        @FindBy(xpath = "//a[normalize-space()='Dashboard']")
        public WebElement cDashboardLink;

        @FindBy(xpath = "//a[@href='#marketingCollapse']")
        public WebElement marketingMenu;

        @FindBy(xpath = "//a[@href='/panel/marketing/special_offers']")
        public WebElement discountsLinkC;

        @FindBy(xpath = "//a[@href='/panel/marketing/promotions']")
        public WebElement promotionsLinkC;

        @FindBy(xpath = "//input[@name='name']")
        public WebElement discountTitleInputC;

        @FindBy(name = "webinar_id")
        public WebElement courseDropdownC;

        @FindBy(name = "percent")
        public WebElement discountAmountInputC;

        @FindBy(xpath = "//input[@name='from_date']")
        public WebElement fromDateInputC;

        @FindBy(xpath = "//input[@name='to_date']")
        public WebElement toDateInputC;

        @FindBy(xpath = "//button[@id='formSubmit']")
        public WebElement createButonuC;

        @FindBy(xpath = "//div[contains(@class,'toast') and contains(text(),'Item added successfully')]")
        public WebElement successToastMessage;

        @FindBy(xpath = "//div[contains(@class,'subscribe-plan')]")
        public List<WebElement> promotionPlanListesi;

        @FindBy(xpath = "(//button[contains(text(),'Purchase')])[1]")
        public WebElement ilkPromosyonPurchaseButonu;

        @FindBy(xpath = "//*[@id='payPromotionModal']/form/div[1]/div/div[3]/select")
        public WebElement promotionCourseDropdown;

        @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary js-submit-promotion' and text()='Pay'])[2]")
        public WebElement payButonuC;

        @FindBy(xpath = "//h1[normalize-space()='Checkout']")
        public WebElement checkoutBasligiC;

        @FindBy(xpath = "//label[@for='offline']")
        public WebElement accountChargeEtiketiC;

        @FindBy(xpath = "//button[contains(@class, 'btn-primary') and text()='Start Payment']")
        public WebElement startPaymentButonuC;

        @FindBy(xpath = "//h2[contains(text(),'Congratulations')]")
        public WebElement congratulationsMesajiC;



}
