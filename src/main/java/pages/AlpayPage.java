package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlpayPage extends BasePage {

    // Constructor
    public AlpayPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Locators

    @FindBy(xpath ="//*[@class='col-6'][1]")
    public WebElement validateCard;

    @FindBy(xpath ="//*[@class='col-6'][2]")
    public WebElement reserveAMeetingCard;

    @FindBy(xpath ="//*[contains(text(), 'Testimonials')]")
    public WebElement testimonialsText;

    @FindBy(xpath ="(//*[contains(@class, 'testimonials')])[3]")
    public WebElement testimonialsSlider;

    @FindBy(xpath ="(//*[contains(@class, 'testimonials-card')])[3]")
    public WebElement testimonialsCard;

    @FindBy(xpath ="(//*[contains(@class, 'swiper-wrapper')])[12]")
    public WebElement testimonialWrapper;

    @FindBy(xpath ="(//*[@aria-label='Go to slide 1'])[12]")
    public WebElement testimonialBullet1;

    @FindBy(xpath ="(//*[@aria-label='Go to slide 2'])[8]")
    public WebElement testimonialBullet2;

    @FindBy(xpath ="(//*[@aria-label='Go to slide 3'])[7]")
    public WebElement testimonialBullet3;

    @FindBy(xpath ="(//*[contains(text(), 'Data Analyst at Microsoft')])[3]")
    public WebElement testimonialSirketAdi;

    @FindBy(xpath ="(//*[contains(@class, 'stars-card d-flex align-items-center  mt-15')])[42]")
    public WebElement testimonialStar;

    @FindBy(xpath ="(//*[@class = 'mt-25 text-gray font-14'])[3]")
    public WebElement testimonialYorum;

    @FindBy(xpath ="(//*[contains(text(), 'Financial')])[1]")
    public WebElement financialBaslik;

    @FindBy(xpath ="//*[contains(text(), 'Financial summary')]")
    public WebElement financialSummary;

    @FindBy(xpath ="//*[contains(text(), 'Payout')]")
    public WebElement payout;

    @FindBy(xpath ="//*[contains(text(), 'Financial documents')]")
    public WebElement financialDocuments;

    @FindBy(xpath ="//*[contains(text(), 'Account summary')]")
    public WebElement accountSummary;

    @FindBy(xpath ="//*[contains(text(), 'Your identity')]")
    public WebElement yourIdendity;

    @FindBy(xpath ="//*[contains(text(), 'settings')]")
    public WebElement settings;

    @FindBy(xpath ="//select[@name = 'bank_id']")
    public WebElement selectAccountType;

    @FindBy(xpath ="//*[@name = 'bank_specifications[10]']")
    public WebElement accountHolderField;

    @FindBy(xpath ="//*[@name = 'bank_specifications[11]']")
    public WebElement emailField;

    @FindBy(xpath ="//*[@name = 'address']")
    public WebElement addressField;

    @FindBy(xpath ="//*[@name = 'identity_scan']")
    public WebElement identityScanField;

    @FindBy(xpath ="//*[@name = 'certificate']")
    public WebElement certificateField;

    @FindBy(xpath ="//*[contains(text(), 'Save')]")
    public WebElement saveButton;

    @FindBy(xpath ="(//*[contains(text(), 'Request done successfully!')])[2]")
    public WebElement requestDone;

    @FindBy(xpath ="//*[contains(text(), 'Charge account')]")
    public WebElement chargeAccount;

    @FindBy(xpath ="//*[@class = 'col-6 col-lg-3 mb-40 charge-account-radio']")
    public WebElement stripeButton;

    @FindBy(xpath ="//*[@name = 'amount']")
    public WebElement amount;

    @FindBy(xpath ="//*[@id= 'submitChargeAccountForm']")
    public WebElement payButton;

    @FindBy(xpath ="//*[@id= 'email']")
    public WebElement emailStripe;

    @FindBy(xpath ="//*[@id= 'cardNumber']")
    public WebElement cardNumber;

    @FindBy(xpath ="//*[@id= 'cardExpiry']")
    public WebElement cardExpiry;

    @FindBy(xpath ="//*[@id= 'cardCvc']")
    public WebElement cardCvc;

    @FindBy(xpath ="//*[@id= 'billingName']")
    public WebElement billingName;

    @FindBy(xpath ="//*[@id= 'billingCountry']")
    public WebElement billingCountry;

    @FindBy(xpath ="//*[@id='billingPostalCode']")
    public WebElement billingPostalCode;

    @FindBy(xpath ="//*[@class='SubmitButton-IconContainer']")
    public WebElement submitButton;

    @FindBy(xpath ="//*[contains(text(), 'Subscribe')]")
    public WebElement subscribe;

    @FindBy(xpath ="(//*[contains(text(), 'Purchase')])[2]")
    public WebElement purchase;

    @FindBy(xpath ="(//*[@class ='col-6 col-lg-4 mb-40 charge-account-radio'])[2]")
    public WebElement accountCharge;

    @FindBy(xpath ="//*[@id='paymentSubmit']")
    public WebElement paymentSubmit;

    @FindBy(xpath ="//*[contains(text(), 'Active plan')]")
    public WebElement activePlan;

    @FindBy(xpath ="(//*[contains(text(), 'Support')])[1]")
    public WebElement supportBasligi;

    @FindBy(xpath ="//*[@id='supportCollapse']/ul/li[1]/a")
    public WebElement newBasligi;

    @FindBy(xpath ="//*[@id='supportCollapse']/ul/li[2]/a")
    public WebElement coursesSupportBasligi;

    @FindBy(xpath ="//*[@id='supportCollapse']/ul/li[3]/a")
    public WebElement ticketsBasligi;

    @FindBy(xpath ="(//*[@type='text'])[1]")
    public WebElement subjectTextArea;

    @FindBy(xpath ="//*[@id='supportType']")
    public WebElement typeDropdown;

    @FindBy(xpath ="//*[@id='departments']")
    public WebElement department;

    @FindBy(xpath ="//*[@name='message']")
    public WebElement messageTextArea;

    @FindBy(xpath ="//*[@id='attach']")
    public WebElement attachTextArea;

    @FindBy(xpath ="//*[@type='submit']")
    public WebElement sendMessage;

    @FindBy(xpath ="//*[contains(text(), 'Waiting')]")
    public WebElement waitingText;

    @FindBy(xpath ="//*[contains(text(), 'Log out')]")
    public WebElement logOut;


}
