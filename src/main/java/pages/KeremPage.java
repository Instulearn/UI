package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeremPage extends BasePage{


    // Constructor
    public KeremPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Kerem Page Locators
    @FindBy ( xpath = "//*[text()='Login']")
    public WebElement AnasayfaLoginButonu;

}
