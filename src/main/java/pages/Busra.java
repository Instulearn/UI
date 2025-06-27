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


    // 15.3

    @FindBy(xpath = "//h3[text()='irfan ulus']")
    public WebElement profileName;


    @FindBy(xpath = "//h1[text()='irfan ulus']")
    public WebElement userName;


    @FindBy(xpath = "//h3[text()='Light Moon']")
    public WebElement organizationTitle;



    @FindBy(xpath = "//h3[text()='Kaan Oz']")
    public WebElement kaanOzCardTitle;

    @FindBy(xpath = "//h1[text()='Kaan Oz']")
    public WebElement profileUserName;

    @FindBy(xpath = "//h3[@class='home-organizations-title' and text()='alice']")
    public WebElement aliceOrganizationTitle;




    @FindBy(xpath = "//a[@href='/users/1257/profile']")
    public WebElement aliceCardLink;

    @FindBy(xpath = "//a[@href='/users/1352/profile']")
    public WebElement sumeyraCardLink;




    @FindBy(css = "span.swiper-pagination-bullet.swiper-pagination-bullet-active")
    public WebElement activeSliderBullet;

    @FindBy(xpath = "//span[contains(@class,'swiper-pagination-bullet-active') and @aria-label='Go to slide 2']")
    public WebElement activeSlide2Bullet;

    @FindBy(xpath = "//span[contains(@class,'swiper-pagination-bullet-active') and @aria-label='Go to slide 3']")
    public WebElement activeSlide3Bullet;



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


//37.2

    @FindBy(xpath = "//h2[text()='Notifications']")
    public WebElement notificationsSectionTitle;

//37.3

    @FindBy(xpath = "//h2[text()='No notifications.']")
    public WebElement noNotificationsText;

//37.4






// 37.5

    @FindBy(xpath = "//span[text()='Mark all notifications as read']")
    public WebElement markAllAsReadButton;

//38.1

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[@href='/login' and text()='Login']")
    public WebElement loginLink;

    @FindBy(xpath = "//a[@href='/logout' and span[text()='Logout']]")
    public WebElement logoutLink;














}

