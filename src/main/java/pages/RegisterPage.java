package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.LoggerHelper;

import java.util.List;

// ******* SAYFA ILE ILGILI SORU / SORUN OLURSA MüRACAAT : Tugba

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

//************************************* LOCATORS**********************************************

    @Getter
    @FindBy(xpath = "//a[@class='py-5 px-10 text-dark-blue font-14']")
    private WebElement registerButton;

    @Getter
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailBox;

    @Getter
    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fullName;

    @Getter
    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @Getter
    @FindBy(xpath = "//input[@id='confirm_password']")
    private WebElement retypePassword;

    @Getter
    @FindBy(xpath = "//input[@id='term']")
    private WebElement termsRulesConfirm;

    @Getter
    @FindBy(xpath = "//*[@class='btn btn-primary btn-block mt-20']")
    private WebElement signupButton;

    @Getter
    @FindBy(xpath = "//*[@class='font-16 user-name ml-10 text-dark-blue font-14']")
    private WebElement userName;

    @Getter
    @FindBy(xpath = "//img[@alt='Login']")
    private WebElement photo;

    @Getter
    @FindBy(xpath = "//form[@class='mt-35']")
    private WebElement signupForm;

    @Getter
    @FindBy(xpath = "//label[@for='role_user']")
    private WebElement studentButton;

    @Getter
    @FindBy(xpath = "//label[@for='role_teacher']")
    private WebElement instructorButton;

    @Getter
    @FindBy(xpath = "//label[@for='role_organization']")
    private WebElement organizationButton;

    @Getter
    @FindBy(xpath = "//div[@class='wizard-custom-radio-item flex-grow-1']")
    private List<WebElement> accountType; // studentButton - instructorButton - organizationButton


//******************************************* MY OBJECTS AND VARIABLES **************************************
    BasePage basePage= new BasePage(driver);

//************************************************METHODS****************************************************

    public void RegisterForm(){
        LoggerHelper.info("Email bilgisi giriliyor");
        basePage.type(emailBox,"tugba00@tugba.com");
        LoggerHelper.info("Fullname bilgisi giriliyor");
        basePage.type(fullName, "Tugba");
        LoggerHelper.info("Password bilgisi giriliyor");
        basePage.type(password, "abc.12345");
        LoggerHelper.info("Retype Password bilgisi giriliyor");
        basePage.type(retypePassword, "abc.12345");
    }

    public boolean isWebElementDisplayed(WebElement element) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (Exception e) {
            LoggerHelper.error("Web element bulunamadi veya hata alindi: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public String getElementText(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.getText().trim();
        } catch (Exception e) {
            LoggerHelper.error("Web element bulunamadi veya hata alindi: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

}



