package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilizPage extends BasePage{

    // Constructor
    public FilizPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    // Locators

    @FindBy(xpath = "//h1[contains(text(),'Transform Your Future with InstuLearn')]")
    public WebElement transformYourFutureTitle;

    @FindBy(xpath = "//input[@type='text' and @name='search' and contains(@placeholder,'Search courses and instructors')]")
    public WebElement searchInputBox;

    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'btn-primary') and normalize-space()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@href='/login' and normalize-space()='Login']")
    public WebElement loginLink;

    @FindBy(xpath = "//img[@src='/store/1/default_images/front_login.jpg' and @alt='Login']")
    public WebElement loginLeftImage;

    @FindBy(xpath = "//h1[normalize-space()='Log in to your account']")
    public WebElement loginFormTitle;

    @FindBy(xpath = "//input[@type='email' and @name='email' and @id='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='password' and @name='password' and @id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit' and normalize-space()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='/forget-password' and normalize-space()='Forgot your password?']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[@href='/register' and normalize-space()='Register']")
    public WebElement registerLink;

    @FindBy(xpath = "//div[contains(@class, 'invalid-feedback') and contains(text(), 'The selected email is invalid')]")
    public WebElement invalidEmailErrorMessage;

    @FindBy(xpath = "//span[contains(@class, 'd-block') and contains(text(), 'Hi')]")
    public WebElement loginSuccessGreeting;

    @FindBy(xpath = "//a[@href='https://qa.instulearn.com/course/Java']")
    public WebElement featuredCourseLink;

    @FindBy(xpath = "//a[@id='information-tab' and contains(text(),'Information')]")
    public WebElement informationTab;

    @FindBy(xpath = "//img[@alt='How To Create Node.js Website' and contains(@src, 'NodeJs-Debug-min.png')]")
    public WebElement newestCourseImage;

    @FindBy(xpath = "//div[contains(@class,'course-card')]//a[contains(@href,'/users') and contains(@class,'user-name')]")
    public WebElement newestCourseInstructor;


    @FindBy(xpath = "//div[contains(@class,'course-card')]//span[contains(@class,'date-published')]")
    public WebElement newestCourseDate;


    @FindBy(xpath = "//div[contains(@class,'course-card')]//span[contains(@class,'duration') and contains(text(),'Hours')]")
    public WebElement newestCourseDuration;

    @FindBy(xpath = "//div[contains(@class,'course-card')]//div[contains(@class,'feature-price-box') or contains(text(), '$')]")
    public WebElement newestCoursePrice;

    @FindBy(xpath = "//a[contains(@href, '/categories/Cyber-Security') and contains(text(),'Cyber Security Training')]")
    public WebElement cyberSecurityTrainingLink;

    // Latest bundles başlığı
    @FindBy(xpath = "//h2[contains(text(),'Latest bundles')]")
    public WebElement latestBundlesTitle;

    // İlk paket kartı (bundle card)
    @FindBy(xpath = "(//div[contains(@class,'latest-bundles')]//div[contains(@class,'bundle-card')])[1]")
    public WebElement firstBundleCard;

    // İlk paket kartındaki fiyat bilgisi
    @FindBy(xpath = "(//div[contains(@class,'latest-bundles')]//div[contains(@class,'bundle-card')])[1]//div[contains(@class,'feature-price-box')]")
    public WebElement firstBundlePrice;

    // İlk paket kartındaki süre (saat) bilgisi
    @FindBy(xpath = "(//div[contains(@class,'latest-bundles')]//div[contains(@class,'bundle-card')])[1]//span[contains(@class,'duration')]")
    public WebElement firstBundleDuration;

    // İlk paket kartındaki tarih bilgisi
    @FindBy(xpath = "(//div[contains(@class,'latest-bundles')]//div[contains(@class,'bundle-card')])[1]//span[contains(@class,'date-published')]")
    public WebElement firstBundleDate;

    // İlk paket kartındaki eğitmen bilgisi
    @FindBy(xpath = "(//div[contains(@class,'latest-bundles')]//div[contains(@class,'bundle-card')])[1]//a[contains(@href,'/users/') and contains(@class,'user-name')]")
    public WebElement firstBundleInstructor;

    // Sayfadaki View All ikonu
    @FindBy(xpath = "//a[contains(text(),'View All')]")
    public WebElement viewAllIcon;

    // Go to card ikonları (tümü)
    @FindBy(xpath = "//button[contains(@class,'go-to-card')]")
    public List<WebElement> goToCardIcons;

    // Upcoming Courses başlığı
    @FindBy(xpath = "//h2[contains(text(),'Upcoming Courses')]")
    public WebElement upcomingCoursesTitle;

    // İlk upcoming course kartı
    @FindBy(xpath = "(//div[contains(@class,'upcoming-courses')]//div[contains(@class,'course-card')])[1]")
    public WebElement firstUpcomingCourseCard;

    // İlk kurs kartındaki fiyat bilgisi
    @FindBy(xpath = "(//div[contains(@class,'upcoming-courses')]//div[contains(@class,'course-card')])[1]//div[contains(@class,'feature-price-box')]")
    public WebElement firstUpcomingCoursePrice;

    // İlk kurs kartındaki süre (saat) bilgisi
    @FindBy(xpath = "(//div[contains(@class,'upcoming-courses')]//div[contains(@class,'course-card')])[1]//span[contains(@class,'duration')]")
    public WebElement firstUpcomingCourseDuration;

    // İlk kurs kartındaki tarih bilgisi
    @FindBy(xpath = "(//div[contains(@class,'upcoming-courses')]//div[contains(@class,'course-card')])[1]//span[contains(@class,'date-published')]")
    public WebElement firstUpcomingCourseDate;

    // İlk kurs kartındaki eğitmen bilgisi
    @FindBy(xpath = "(//div[contains(@class,'upcoming-courses')]//div[contains(@class,'course-card')])[1]//a[contains(@href,'/users/') and contains(@class,'user-name')]")
    public WebElement firstUpcomingCourseInstructor;

    // Sayfadaki View All ikonu (Upcoming Courses bölümü için)
    @FindBy(xpath = "//div[contains(@class,'upcoming-courses')]//a[contains(text(),'View All')]")
    public WebElement upcomingCoursesViewAllIcon;

    // Go to card ikonları (Upcoming Courses bölümü)
    @FindBy(xpath = "//div[contains(@class,'upcoming-courses')]//button[contains(@class,'go-to-card')]")
    public List<WebElement> upcomingCoursesGoToCardIcons;

    // Trending Categories başlığı
    @FindBy(xpath = "//h2[contains(text(),'Trending Categories')]")
    public WebElement trendingCategoriesTitle;

    // İlk trend kategori kartı
    @FindBy(xpath = "(//div[contains(@class,'trending-categories')]//div[contains(@class,'category-card')])[1]")
    public WebElement firstTrendingCategoryCard;

    // İlk kategori kartındaki kategori ismi (örnek: Fitness Masterclass)
    @FindBy(xpath = "(//div[contains(@class,'trending-categories')]//div[contains(@class,'category-card')])[1]//img[contains(@alt,'Fitness Masterclass')]")
    public WebElement firstTrendingCategoryImage;

    // Sayfadaki View All ikonu (Trending Categories bölümü için)
    @FindBy(xpath = "//div[contains(@class,'trending-categories')]//a[contains(text(),'View All')]")
    public WebElement trendingCategoriesViewAllIcon;

    // Go to card ikonları (Trending Categories bölümü)
    @FindBy(xpath = "//div[contains(@class,'trending-categories')]//button[contains(@class,'go-to-card')]")
    public List<WebElement> trendingCategoriesGoToCardIcons;




}



