package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegRepo {

	public RegRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerlink;

	@FindBy(id = "gender-female")
	private WebElement femaleradioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTb;

	
	@FindBy(id = "LastName")
	private WebElement lastname;
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getFemaleradioButton() {
		return femaleradioButton;
	}

	public WebElement getFirstNameTb() {
		return firstNameTb;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailTextBox() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
