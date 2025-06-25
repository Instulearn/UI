package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class profileIcon {


    @FindBy(css = ".user-profile-dropdown")  // örnek bir profil ikon locator
    public WebElement profileIcon;




}
