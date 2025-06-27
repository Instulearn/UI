package pages;

import lombok.Getter;
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
    public WebElement studentSideBarMeetingBaglantisi;

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

    @FindBy(xpath = "//*[text()='Noticeboard']")
    public WebElement studentDashboardNoticeboardTitle;

    @FindBy(xpath = "//*[text()='New Year Sales Festival']")
    public WebElement studentNewYearSales;

    @FindBy(xpath = "//*[@data-id='12']")
    public WebElement studentMoreInfoButtonNewYear;

    @FindBy(xpath = "(//*[text()='Due to the New Year Festival, users who buy more than $ 200 will be given a 20% discount code.'])[2]")
    public WebElement studentIlanDetay;

    @FindBy(xpath = "//*[text()='Learning Statistics']")
    public WebElement studentLearningStatics;


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



    // ************* Register Page locators *****************
    @FindBy(xpath = "//a[@class='py-5 px-10 text-dark-blue font-14']")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='confirm_password']")
    public WebElement retypePassword;

    @FindBy(xpath = "//*[@name='term']")
    public WebElement termsRulesConfirmButton;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-block mt-20']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[@for='term']")
    public WebElement termsRulesConfirmYazisi;


    // ************* Instructor Panel locators *****************
    @FindBy(xpath = "(//a[@role='button'])[3]")
    public WebElement instructorMeetings;

    @FindBy(xpath = "//*[text()='My reservations']")
    public WebElement instructorMyReservationsLinki;

    @FindBy(xpath = "//*[text()='Requests']")
    public WebElement instructorRequestLinki;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement instructorSettingsLinki;

    @FindBy(xpath = "//*[@class='activities-container mt-25 p-20 p-lg-35']")
    public WebElement instructorMeetingStaticsAlani;

    @FindBy(xpath = "//*[text()='Filter meetings']")
    public WebElement instructorFilterMeetingsTitle;

    @FindBy(xpath = "//*[@name='instructor_id']")
    public WebElement filterInstructorDDM;

    @FindBy(xpath = "//*[text()='Show Results']")
    public WebElement instructorShowResultButton;

    @FindBy(xpath = "(//*[text()='Seraphina Lawson'])[2]")
    public WebElement seraphinaLawsonText;

    @FindBy(xpath = "//*[@class='btn-group dropdown table-actions']")
    public WebElement meetingActionButton;

    @FindBy(xpath = "//*[@name='open_meetings']")
    public WebElement showOnlyMeetingButonu;

    @FindBy(xpath = "//*[@name='from']")
    public WebElement instructorMeetingFiltreFrom;

    @FindBy(xpath = "//*[@name='to']")
    public WebElement instructorMeetingFitlreTo;

    @FindBy(xpath = "//*[@name='day']")
    public WebElement instructorMeetingFitlreDayDDM;

    @FindBy(xpath = "//*[@name='status']")
    public WebElement instructorMeetingFitlreStatusDDM;

    @FindBy(xpath = "//*[text()='Requests']")
    public WebElement instructorRequestsLinki;

    @FindBy(xpath = "//*[@class='activities-container mt-25 p-20 p-lg-35']")
    public WebElement instructorRequestMeetingStatics;

    @FindBy(xpath = "//*[@name='student_id']")
    public WebElement requestFiltreStudentDDM;

    @FindBy(xpath = "//*[@class='d-block font-weight-500']")
    public WebElement keremCeylan2Text;

    @FindBy(xpath = "//*[text()='Add to Calendar']")
    public WebElement addToCalendarButonu;

    @FindBy(xpath = "//*[text()='Contact student']")
    public WebElement contactStudentButonu;

    @FindBy(xpath = "(//*[text()='Close'])[4]")
    public WebElement studentContactCloseButonu;

    @FindBy(xpath = "//*[text()='Student contact information']")
    public WebElement studetContactInformationText;

    @FindBy(xpath = "//*[text()='Finish meeting']")
    public WebElement finishMeetingButton;

    @FindBy(xpath = "//*[@class='swal2-title']")
    public WebElement finishMeetingPageText;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement finishMeetingPageCancelButton;




}
