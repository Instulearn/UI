package pages;

import lombok.extern.slf4j.Slf4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeremPage extends BasePage{

    LoginPage loginPage = new LoginPage(driver);


    // Constructor
    public KeremPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // ************** Anasayfa Locators ******************
    @FindBy ( xpath = "//*[text()='Login']")
    public WebElement anasayfaLoginButonu;

    @FindBy(xpath = "//a[@class='d-none d-lg-flex btn btn-sm btn-primary nav-start-a-live-btn']")
    public WebElement becomeInstructorButonu;

    @FindBy(xpath = "//img[@class='rounded-circle']")
    public WebElement anasayfaProfilIsmi;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement anasayfaLogoutBaglantisi;


    // ************* Login sayfa locators *****************
    @FindBy(xpath = "//*[@id='email']")
    public  WebElement loginPageEmailKutusu;

    @FindBy(xpath = "//*[@id='password']")
    public  WebElement loginPagePasswordKutusu;

    @FindBy(xpath = "//button[contains(text(), 'Login')]")
    public  WebElement loginPageLoginButonu;


    // ************* Student panel locators *****************
    @FindBy(xpath = "//*[text()='Home']")
    public WebElement studentHomeBaglantısı;



    // ************* Become Instructor Page locators *****************
    @FindBy(xpath = "(//*[text()='Occupations'])[1]")
    public WebElement becomeInstPageOccupationsTitle;

    @FindBy(xpath = "//*[@for='checkbox601']")
    public WebElement becomeInstructorPageMath;


}
