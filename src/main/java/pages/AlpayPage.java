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

    @FindBy(xpath ="(//*[@class = 'swiper-pagination-bullet'])[19]")
    public WebElement testimonialBullet1;

    @FindBy(xpath ="(//*[@class = 'swiper-pagination-bullet'])[20]")
    public WebElement testimonialBullet2;

    @FindBy(xpath ="(//*[@class = 'd-block font-14 text-gray'])[1]")
    public WebElement testimonialSirketAdi;

    @FindBy(xpath ="(//*[contains(@class, 'stars-card d-flex align-items-center  mt-15')])[42]")
    public WebElement testimonialStar;

    @FindBy(xpath ="(//*[@class = 'mt-25 text-gray font-14'])[3]")
    public WebElement testimonialYorum;


}
