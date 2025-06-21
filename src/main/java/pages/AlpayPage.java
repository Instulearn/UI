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




}
