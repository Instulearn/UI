package pages;

import config.ConfigReader;
import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CreateTestDataExcel;

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

//******************************************* MY OBJECTS AND VARIABLES *********************************************

    Workbook workbook = new XSSFWorkbook();
    Logger logger = LogManager.getLogger(RegisterPage.class);
    ConfigReader configReader = new ConfigReader();
    CreateTestDataExcel dataExcel = new CreateTestDataExcel();

    Sheet sheet3 = workbook.createSheet("Sheet3");
    Object[][] registerData = {
            {"E-Mail", "Full Name", "Password", "Retype Password"},
            {"tugba@tugba.com", "Tugba", "abc.12345", "abc.12345"}
    };

    //***************************************** MY METHODS ******************************************************


    public void registerFormDoldur(String email, String full_name, String password1, String retypePassword1 ){
        click(registerButton);
        type(emailBox,email);
        type(fullName, full_name);
        type(password, password1);
        type(retypePassword, retypePassword1);


    }






}



