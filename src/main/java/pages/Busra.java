package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Busra extends BasePage {


    // Constructor
    public Busra(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);


    }

     // Locators
   // US.10.1
    @FindBy(xpath = "//img[@alt='Home - Join as instructor']")
    public WebElement joinAsInstructorImage;

// US 10.2
    @FindBy(xpath = "//h1[contains(text(),'Log in to your account')]")
    public WebElement loginTitle;

// US 15.1
    @FindBy(xpath = "//h2[text()='Organizations']")
    public WebElement organizationsTitle;

// US 15.2
    @FindBy(xpath = "//a[@href='/organizations' and text()='All Organizations']")
    public WebElement allOrganizationsButton;


    // 15. us gelcek buraya


 // US 28.1

    @FindBy(xpath = "//a[@href='/panel/support/new' and text()='New']")
    public WebElement newSupportLink;

    @FindBy(xpath = "//a[@href='/panel/support' and text()='Courses support']")
    public WebElement coursesSupportLink;

    @FindBy(xpath = "//a[@href='/panel/support/tickets' and text()='Tickets']")
    public WebElement ticketsLink;

 // US 28.3

    @FindBy(xpath = "//span[text()='Open conversations']")
    public WebElement openConversationsText;

    @FindBy(xpath = "//span[text()='Closed conversations']")
    public WebElement closedConversationsText;

    @FindBy(xpath = "//span[text()='Total conversations']")
    public WebElement totalConversationsText;


 // US 28.4

    @FindBy(xpath = "//font[contains(text(),'Destek mesajınız yok')]")
    public WebElement noSupportMessageText;


 // US 37.1

    @FindBy(xpath = "//span[text()='Notifications']")
    public WebElement notificationsTitle;


    @FindBy(xpath = "//h2[text()='No notifications.']")
    public WebElement noNotificationsMessage;










}

