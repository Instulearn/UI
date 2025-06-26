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

        //US18

        @FindBy(xpath = "//footer")
        public WebElement footerBolumu;

        @FindBy(xpath= "//footer//a[contains(@href,'/about')]")
        public WebElement aboutUsLink;

        @FindBy(xpath= "//footer//a[contains(@href,'/contact')]")
        public WebElement contactUsLink;

        @FindBy(xpath= "//footer//a[contains(@href,'certificate')]" )
        public WebElement certificateValidationLink;

        @FindBy(xpath = "//footer//a[contains(@href,'terms')]")
        public WebElement termsAndRulesLink;

        @FindBy(xpath= "//footer/div[3]//div[2]/div[1]")
        public WebElement footerTelefon;

        @FindBy(xpath = "//*[@id='app']/footer/div[3]/div/div[2]/div[3]")
        public WebElement footerEmail;

        @FindBy(xpath = "/html/body/div[2]/footer/div[1]/div/div/div/div[2]/form/div/div/input")
        public WebElement subscriberEmailInput;

        @FindBy(xpath = "//footer//form//button[text()='Join']")
        public WebElement subscribeButon;

        @FindBy(xpath = "//h2[@class='jq-toast-heading' and text()='Request done successfully!']")
        public WebElement requestDoneMesajiC;


        @FindBy(xpath = "//footer//a[contains(@href,'instagram.com')]")
        public WebElement instagramIkon;

        @FindBy(xpath = "//footer//a[contains(@href,'whatsapp.com')]")
        public WebElement whatsappIkon;

        @FindBy(xpath = "//footer//a[contains(@href,'twitter.com')]")
        public WebElement twitterIkon;

        @FindBy(xpath = "//footer//a[contains(@href,'facebook.com')]")
        public WebElement facebookIkon;

        @FindBy(xpath = "//footer//*[contains(text(),'All rights are reserved for learning management system platform')]")
        public WebElement footerRightsMetni;

        @FindBy(xpath = "//footer//div[contains(@class,'footer-logo')]")
        public WebElement footerLogoLink;



}
