package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    public Header(WebDriver driver) {
        super(driver);
    }

    // Header Locators
    @FindBy( xpath = "//*[text()='Login']")
    public WebElement anasayfaHeaderLoginButonu;

}
