package pages;

import drivers.DriverManager;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class InstructorsPage extends BasePage {
    public InstructorsPage(WebDriver driver) {
        super(driver);
    }

    // Locators

    @Getter
    @FindBy(xpath = "//ul/li[4]//a[@class='nav-link']")
    private WebElement InstructorButton;

    @Getter
    @FindBy(xpath = "//h1[@class='text-white font-30 mb-15']")
    private WebElement InstructorYazisi;

    @Getter
    @FindBy(xpath = "//input[@placeholder='Search Instructors']")
    private WebElement searchBox;

    @Getter
    @FindBy(xpath = "//button[@class='btn btn-primary rounded-pill']")
    private WebElement searchButton;

    @Getter
    @FindBy(xpath = "//h3[@class='mt-20 font-16 font-weight-bold text-dark-blue text-center']")
    private List<WebElement> searchResult;

    @Getter
    @FindBy(xpath = "//li[@class='cursor-pointer user-select-none d-flex xs-categories-toggle']")
    private WebElement categories;

    @Getter
    @FindBy(xpath = "//a[@class='js-has-subcategory']")
    private WebElement webDesign;






    ReusableMethods reusableMethods = new ReusableMethods();

    public String getElementText(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.getText().trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean searchResultTest(String instructorName){

        boolean result = false;
        for (WebElement element : searchResult){
            String name = getElementText(element);
            if (name.contains(instructorName)){
                result = true;
            }
        }
        return result;
    }















}
