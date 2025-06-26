package pages;

import lombok.extern.slf4j.Slf4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeremPage extends BasePage{

    LoginPage loginPage = new LoginPage(driver);


    // Constructor
    public KeremPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ************** Anasayfa Locators ******************
    @FindBy ( xpath = "//*[text()='Login']")
    public WebElement anasayfaLoginButonu;

    @FindBy(xpath = "//a[@class='d-none d-lg-flex btn btn-sm btn-primary nav-start-a-live-btn']")
    public WebElement becomeInstructorButonu;

    @FindBy(xpath = "//img[@class='rounded-circle']")
    public WebElement anasayfaProfilIsmi;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement anasayfaLogoutBaglantisi;

    @FindBy(xpath = "//a[@class='d-none d-lg-flex btn btn-sm btn-primary nav-start-a-live-btn']")
    public WebElement anasayfaCreateNewCourseButonu;

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement anasayfaDashboardBaglantisi;


    // ************* Login sayfa locators *****************
    @FindBy(xpath = "//*[@id='email']")
    public  WebElement loginPageEmailKutusu;

    @FindBy(xpath = "//*[@id='password']")
    public  WebElement loginPagePasswordKutusu;

    @FindBy(xpath = "//button[contains(text(), 'Login')]")
    public  WebElement loginPageLoginButonu;


    // ************* Student panel locators *****************
    @FindBy(xpath = "//*[text()='Home']")
    public WebElement studentHomeBaglantısı;

    @FindBy(xpath = "//*[text()='Log out']")
    public WebElement studentPanelLogoutButonu;

    @FindBy(xpath = "(//*[text()='Meetings'])[1]")
    public WebElement studentDashboardMeetingBaglantisi;

    @FindBy(xpath = "(//*[text()='Courses'])[3]")
    public WebElement studentSidebarCoursesBaglantisi;

    @FindBy(xpath = "//*[text()='Quizzes']")
    public WebElement studentSidebarQuizzesBaglantisi;

    @FindBy(xpath = "//*[text()='Certificates']")
    public WebElement studentSidebarSertifikaBaglantisi;

    @FindBy(xpath = "//*[text()='Financial']")
    public WebElement studentSidebarFinansBaglantisi;

    @FindBy(xpath = "//*[text()='Support']")
    public WebElement studentSidebarSupportBaglantisi;

    @FindBy(xpath = "//*[text()='Notifications']")
    public WebElement studentSidebarNotificationsBaglantisi;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement studentSidebarSettingsBaglantisi;

    @FindBy(xpath = "//*[text()='View all events']")
    public WebElement studentViewAllEventsTitle;

    @FindBy(xpath = "//*[text()='Purchased Courses']")
    public WebElement studentDashboardPurchaseCourseTitle;

    @FindBy(xpath = "//*[text()='Support Messages']")
    public WebElement studentDashboardSupportMessagesTitle;

    @FindBy(xpath = "(//*[text()='Charge account'])[2]")
    public WebElement studentDashboardChargeAccountBaglantisi;

    @FindBy(xpath = "(//*[text()='Meetings'])[2]")
    public WebElement studentDashboardBodyMeetingsBaglantisi;

    @FindBy(xpath = "//*[text()='Comments']")
    public WebElement studentDashboardCommentsBaglantisi;

    @FindBy(xpath = "//*[text()='Account Balance']")
    public WebElement studentDashboardAccountBalanceBaglantisi;


    // ************* Become Instructor Page locators *****************
    @FindBy(xpath = "(//*[text()='Occupations'])[1]")
    public WebElement becomeInstPageOccupationsTitle;

    @FindBy(xpath = "//*[@for='checkbox601']")
    public WebElement becomeInstructorPageMath;

    @FindBy(xpath = "//*[@name='role']")
    public WebElement becomeInstructorAccountTypeDDM;

    @FindBy(xpath = "//*[@name='bank_id']")
    public WebElement becomeInstructorPayoutDDM;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement becomeInstructorAccountHolder;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement becomeInstructorAccountID;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement becomeInstructorSendRequestButton;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement becomeInstructorIdentity;



}
