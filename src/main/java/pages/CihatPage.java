package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CihatPage extends BasePage {

    // Constructor
    public CihatPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }


    // Locators

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[1]/div/h2")
    public WebElement instructorText;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[1]/a")
    public WebElement AllInstructorButon;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div")
    public WebElement instructorSlider;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[8]/div/div/div/div[2]/a[1]/h3")
    public WebElement instructorSliderisim;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[8]/div/div/div/div[2]/div")
    public WebElement instructorSliderBegeniPuan;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[16]/div/div/div/div[2]/a[2]")
    public WebElement ReserveaLiveMeeting;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[16]/div/div/div/div[2]/a[2]")
    public WebElement instructorsCard;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[3]/button[1]")
    public WebElement instructorsBullet1;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[3]/button[2]")
    public WebElement instructorsBullet2;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[3]/button[3]")
    public WebElement instructorsBullet3;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[3]/button[4]")
    public WebElement instructorsBullet4;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[3]/button[5]")
    public WebElement instructorsBullet5;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[3]/button[6]")
    public WebElement instructorsBullet6;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[3]/button[7]")
    public WebElement instructorsBullet7;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[3]/button[8]")
    public WebElement instructorsBullet8;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[8]/div/div/div/div[2]/a[2]")
    public WebElement reserveaLiveMeeting;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[8]/div/div/div/div[2]/div")
    public WebElement instructorstar;

    @FindBy(xpath ="//*[@id=\"plotId\"]/div[2]/div/div/table/tbody/tr[4]/td[7]\n")
    public WebElement liveMeetingDate;

    @FindBy(xpath ="//*[@id=\"availableTimes\"]/div")
    public WebElement availableTimes;

    @FindBy(xpath ="//*[@id=\"PickTimeBody\"]/div[4]/div/div/div[1]/label")
    public WebElement meetingType;

    @FindBy(xpath ="//*[@id=\"PickTimeBody\"]/div[6]/button")
    public WebElement meetingson;

    @FindBy(xpath ="//*[@id=\"navbarContent\"]/ul/li[3]/a")
    public WebElement CoursesDashbord;

    @FindBy(xpath ="//*[@id=\"app\"]/section/div/div/div/div/h1")
    public WebElement CoursesText;

    @FindBy(xpath ="//*[@id=\"app\"]/section/div/div/div/div/div/form/div/input")
    public WebElement CoursesSearchText;

    @FindBy(xpath ="//*[@id=\"app\"]/section/div/div/div/div/div/form/div/button")
    public WebElement CoursesSearchButon;

    @FindBy(xpath ="//*[@id=\"filtersForm\"]/div[2]/div[2]/div/button")
    public WebElement FilterItemsButon;

    @FindBy(xpath ="//label[contains(text(),'Course Bundle')]/preceding-sibling::input[@type='checkbox']")
    public WebElement FilterCheckBox1;

    @FindBy(xpath ="//*[@id=\"filterLanguagesubscribe\"]")
    public WebElement FilterCheckBox2;


























}
