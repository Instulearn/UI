package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}

    // Login Page Locators

	@FindBy(xpath = "//*[@id='email']")
	public  WebElement emailKutusu;

	@FindBy(xpath = "//*[@id='password']")
	public  WebElement passwordKutusu;

	@FindBy(xpath = "//button[contains(text(), 'Login')]")
	public  WebElement loginButonu;



	// Login işlemi
	public void login(String email, String password) {
		try {
			type(emailKutusu, email);
			type(passwordKutusu, password);
			click(loginButonu);
			System.out.println("Login attempted with email: " + email);
		} catch (Exception e) {
			System.err.println("Login failed: " + e.getMessage());
		}
	}



}
