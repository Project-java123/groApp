package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement userName;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passWord;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement login;
	@FindBy(xpath = "//input[@id='remember_me']")
	WebElement rememberMe;
	@FindBy(xpath = "//span[text()='These credentials do not match our records.']")
	WebElement alert;

	public void login(String username, String password) {
		userName.sendKeys(username);
		passWord.sendKeys(password);
		rememberMe.click();
		login.click();
	}

	public boolean getErrorMessage() {
		return alert.isDisplayed();
	}
}
