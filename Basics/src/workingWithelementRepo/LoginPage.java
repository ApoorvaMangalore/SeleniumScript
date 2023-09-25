package workingWithelementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getEmailtextBox() {
		return emailtextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id = "Email")
	private WebElement emailtextBox;

	@FindBy(id = "Password")
	private WebElement passwordTextBox;

	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
}
