package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NotificationsPage extends BasePage {

    public NotificationsPage(WebDriver driver) {
       super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Notifications')]")
    public WebElement notificationsLink;

    @FindBy(xpath = "//h1[text()='Notifications']")
    public WebElement notificationsTitle;

    @FindBy(xpath = "(//a[contains(@class,'view-icon')])[1]")
    public WebElement firstViewIcon;

    @FindBy(css = ".notification-modal-content")
    public WebElement notificationDetailModal;

    @FindBy(xpath = "//ul[contains(@class,'pagination')]//a[contains(text(),'›')]")
    public WebElement nextPageButton;

    @FindBy(css = ".notifications-list")
    public WebElement notificationsList;

    @FindBy(id = "markAllAsRead")
    public WebElement markAllAsReadIcon;
}












