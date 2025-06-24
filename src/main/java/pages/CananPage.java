package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CananPage extends BasePage {

    // Constructor
    public CananPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
        //US17

        @FindBy(xpath = "//a[text()='Forgot your password?']")
        public WebElement forgotPasswordLink;

        @FindBy(xpath = "//h1[text()='Password Recovery']")
        public WebElement passwordRecoveryBasligi;

        @FindBy(xpath = "//input[@id='email']")
        public WebElement emailTextbox;

        @FindBy(xpath = "//div[contains(@class,'jq-toast-single')]")
        public WebElement successMessageC;

        @FindBy(xpath = "//button[text()='Reset Password']")
        public WebElement resetPasswordButonu;

        @FindBy(xpath = "//div[@id='app']//a[text()='Login']")
        public WebElement loginLinkOnForgotPasswordPage;


    }
