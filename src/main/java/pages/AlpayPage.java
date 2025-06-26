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

    @FindBy(xpath ="//*[contains(text(), 'Request done successfully!')]")
    public WebElement requestDone;







}
