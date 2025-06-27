package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OmerPage extends BasePage {

    public OmerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "(//*[@Class='d-flex align-items-center'])[219]")
    public WebElement meetingsLink;

    @FindBy(xpath = "(//*[@Class='sidenav-item-collapse'])[2]")
    public WebElement MyRezarvationsLink;

    @FindBy(xpath = "(//*[@Class='align-middle text-right'])[1]")
    public WebElement meetingDetayButton;

    @FindBy(xpath = "(//*[@Class='webinar-actions d-block mt-10 font-weight-normal'])[1]")
    public WebElement addToCalendarButton;

    @FindBy(xpath = "(//*[@Class='webinar-actions js-finish-meeting-reserve d-block btn-transparent mt-10 font-weight-normal'])[1]")
    public WebElement finishMeetingButton;

    @FindBy(xpath = "(//*[@Class='contact-info btn-transparent webinar-actions d-block mt-10'])[1]")
    public WebElement contactInstructorButton;

    @FindBy(xpath = "(//*[@Class='d-flex align-items-center'])[229]")
    public WebElement dashboardSettingsButton;

    @FindBy(id = "getNextStep")
    public WebElement nextButton;

    @FindBy(id = "saveData")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement accountPasswordTextBox;

    @FindBy(xpath = "//*[@name='mobile']")
    public WebElement accountPhoneTextBox;

    @FindBy(xpath = "(//*[@Class='progress-icon p-10 d-flex align-items-center justify-content-center rounded-circle '])[1]")
    public WebElement settingsİmageLinkButton;

    @FindBy(xpath = "(//*[@Class='progress-item d-flex align-items-center'])[3]")
    public WebElement settingsAboutsLinkButton;

    @FindBy(xpath = "//*[@name='about']")
    public WebElement aboutBiographyTextBox;

    @FindBy(xpath = "//*[@name='bio']")
    public WebElement aboutJobTitleTextBox;

    @FindBy(xpath = "(//*[@Class='progress-item d-flex align-items-center'])[4]")
    public WebElement educationLinkButton;

    @FindBy(id = "userAddEducations")
    public WebElement addEducationButton;

    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement newEducationTextBox;

    @FindBy(xpath = "(//*[@type='button'])[11]")
    public WebElement educationSaveButton;

    @FindBy(xpath = "(//*[@Class='progress-item d-flex align-items-center'])[5]")
    public WebElement experienceLinkButton;

    @FindBy(xpath = "(//*[@Class='btn btn-primary btn-sm'])")
    public WebElement addExperienceButton;

    @FindBy(xpath = "(//*[@Class='progress-item d-flex align-items-center'])[6]")
    public WebElement skillTopicsLinkButton;

    @FindBy(xpath = "(//*[@Class='checkbox-button mr-15 mt-10'])[17]")
    public WebElement sdetButton;

    @FindBy(xpath = "//*[@Class='js-user-bank-input form-control ']")
    public WebElement selectAccountTypeButton;

    @FindBy(xpath = "//*[@name='bank_specifications[10]']")
    public WebElement accountHolderTextBox;

    @FindBy(xpath = "//*[@name='bank_specifications[11]']")
    public WebElement identityEmailBox;

    @FindBy(xpath = "//*[@name='address']")
    public WebElement addressTextBox;

    @FindBy(xpath = "(//*[@Class='progress-item d-flex align-items-center'])[7]")
    public WebElement identityFinancialButtonLink;

    @FindBy(xpath = "//*[@name='zoom_api_key']")
    public WebElement zoomClientIdTextBox;

    @FindBy(xpath = "//*[@name='zoom_api_secret']")
    public WebElement zoomClientSecretTextBox;

    @FindBy(xpath = "//*[@name='zoom_account_id']")
    public WebElement zoomAccountIdTextBox;

    @FindBy(xpath = "(//*[@Class='progress-item d-flex align-items-center'])[8]")
    public WebElement zoomApıLinkButton;

    @FindBy(xpath = "(//*[@Class='custom-control custom-radio'])[1]")
    public WebElement genderMaleButton;

    @FindBy(xpath = "//*[@name='age']")
    public WebElement extraInformationAgeTextBox;

    @FindBy(xpath = "(//*[@Class='custom-control custom-radio ml-10'])[2]")
    public WebElement meetingTypeAllButton;

    @FindBy(xpath = "(//*[@Class='custom-control custom-checkbox ml-10'])[2]")
    public WebElement trainingLevelAdvancedButton;

    @FindBy(xpath = "//*[@name='country_id']")
    public WebElement regionCountryCheckBox;

    @FindBy(xpath = "(//*[@Class='progress-item d-flex align-items-center'])[9]")
    public WebElement extraInformationLinkButton;

    @FindBy(xpath = "//*[@Class='btn btn-sm btn-primary']")
    public WebElement yesIConfirmButton;

    @FindBy(xpath = "//*[@Class='delete-action btn btn-sm btn-danger']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "(//*[@Class='font-14 text-dark-blue font-weight-500'])[3]")
    public WebElement courseBundlesButton;

    @FindBy(xpath = "//a[@href='/panel/bundles/new']")
    public WebElement coursesBundlesNewLinkButton;

    @FindBy(xpath = "//*[@name='title']")
    public WebElement titleTextBox;

    @FindBy(xpath = "//*[@name='seo_description']")
    public WebElement seoMetaDescriptionTextBox;

    @FindBy(xpath = "//*[@class='note-editable card-block']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//*[@Class='btn btn-sm btn-primary '] ")
    public WebElement previousButton;

    @FindBy(xpath = "//*[@Class='btn btn-sm btn-primary'] ")
    public WebElement sendOfReviewButton;

    @FindBy(xpath = "//*[@Class=' btn btn-sm btn-primary'] ")
    public WebElement saveAsDraftButton;

    @FindBy(xpath = "//*[@Class='delete-action bundle-actions btn btn-sm btn-danger mt-20 mt-md-0'] ")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@name='thumbnail']")
    public WebElement thumbnailTextBox;

    @FindBy(xpath = "//*[@name='image_cover']")
    public WebElement coverImageTextBox;

    @FindBy(xpath = "//*[@Class='custom-select ']")
    public WebElement categoryCheckBox;

    @FindBy(xpath = "//*[@Class='custom-control-input']")
    public WebElement enableSubscribeButton;

    @FindBy(xpath = "//*[@name='access_days']")
    public WebElement accessPeriodTextBox;

    @FindBy(xpath = "//*[@name='price']")
    public WebElement priceTextBox;

    @FindBy(xpath = "//*[@Class='btn btn-primary btn-sm mt-15']")
    public WebElement addCourseButton;

    @FindBy(xpath = "(//*[@Class='select2-selection__rendered'])[1]")
    public WebElement selectaCourseCheckBox;

    @FindBy(xpath = "//*[@Class='js-save-bundleWebinar btn btn-sm btn-primary']")
    public WebElement contentBaslıgıSaveButton;

    @FindBy(xpath = "//*[@Class='select2-results__option select2-results__option--selectable select2-results__option--selected select2-results__option--highlighted']")
    public WebElement yazılımOgreniyorumText;

    @FindBy(xpath = "//*[@Class='btn btn-primary btn-sm mt-15']")
    public WebElement newFAQButton;

    @FindBy(xpath = "(//*[@Class='js-ajax-title form-control'])[1]")
    public WebElement faqTitleTextBox;

    @FindBy(xpath = "(//*[@Class='js-ajax-answer form-control'])[1]")
    public WebElement answerTextBox;

    @FindBy(xpath = "(//*[@Class='js-save-faq btn btn-sm btn-primary'])[1]")
    public WebElement faqSaveButton;

    @FindBy(xpath = "//*[@Class='custom-control custom-switch']")
    public WebElement ıAgreeButton;

    @FindBy(xpath = "//*[@Class='btn btn-sm btn-primary']")
    public WebElement sendForReview;

    @FindBy(xpath = "//*[@name='message_for_reviewer']")
    public WebElement messageToReviewerTextBox;

    @FindBy(xpath = "//a[@href='/panel/bundles']")
    public WebElement myBundlesLink;

    @FindBy(xpath = "//*[@Class='font-16 text-dark-blue font-weight-bold']")
    public WebElement kursBaşlığı;

    @FindBy(xpath = "(//*[@Class='webinar-actions d-block mt-10'])[1]")
    public WebElement myBundlesEditButton;

    @FindBy(xpath = "(//*[@Class='webinar-actions d-block mt-10'])[2]")
    public WebElement myBundlesCoursesButton;

    @FindBy(xpath = "(//*[@Class='webinar-actions d-block mt-10'])[3]")
    public WebElement myBundlesExportStudentsListButton;

    @FindBy(xpath = "//*[@Class='webinar-actions d-block mt-10 text-danger delete-action']")
    public WebElement myBundlesDeleteButton;

    @FindBy(xpath = "//*[@Class='btn-transparent dropdown-toggle']")
    public WebElement myBundlesÜcNokta;






































}
