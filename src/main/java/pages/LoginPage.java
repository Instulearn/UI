package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// Login işlemi
	public void login(String username, String password) {
		type(usernameInput, username);
		type(passwordInput, password);
		click(loginButton);
	}

    // Login Page Locators

	@FindBy(id = "username")
	private WebElement usernameInput;

	@FindBy(id = "password")
	private WebElement passwordInput;

	@FindBy(id = "loginButton")
	private WebElement loginButton;


}
