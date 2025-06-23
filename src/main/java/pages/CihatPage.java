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
    public WebElement İnstructorText;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[1]/a")
    public WebElement AllİnstructorButon;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div")
    public WebElement İnstructorSlider;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[8]/div/div/div/div[2]/a[1]/h3")
    public WebElement İnstructorSliderisim;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[8]/div/div/div/div[2]/div")
    public WebElement İnstructorSliderBegeniPuanı;

    @FindBy(xpath ="//*[@id=\"app\"]/section[15]/div[2]/div/div[1]/div/div[16]/div/div/div/div[2]/a[2]")
    public WebElement ReserveaLifeMeeting;









}
