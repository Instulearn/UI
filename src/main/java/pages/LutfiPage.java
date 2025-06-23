package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LutfiPage {
    @FindBy(xpath = "//a[span[text()='Certificates']]")
    public WebElement certificatesButton;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[@href='/panel/certificates']")
    public WebElement certificatesListLink;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[@href='/panel/certificates/achievements']")
    public WebElement certificatesAchievementsLink;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[@href='/certificate_validation']")
    public WebElement certificateValidationLink;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[@href='/panel/certificates/webinars']")
    public WebElement completionCertificatesLink;

    @FindBy(xpath = "//h2[text()='Certificates statistics']")
    public WebElement certificateStatisticsTitle;

    @FindBy(xpath = "//span[text()='Active certificates']/preceding-sibling::strong")
    public WebElement activeCertificatesValue;

    @FindBy(xpath = "//span[text()='Student achievements']/preceding-sibling::strong")
    public WebElement studentAchievementsValue;

    @FindBy(xpath = "//span[text()='Failed students']/preceding-sibling::strong")
    public WebElement failedStudentsValue;

    @FindBy(xpath = "//span[text()='Average Grade']/preceding-sibling::strong")
    public WebElement averageGradeValue;



}
