package workingWithelementRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebElement getNewsletterEmail() {
		return NewsletterEmail;
	}

	public List<WebElement> getRadioButtons() {
		return radioButtons;
	}

	public WebElement getVoteButton() {
		return voteButton;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "NewsletterEmail")
	private WebElement NewsletterEmail;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> radioButtons;

	@FindBy(xpath = "//input[@value='Vote']")
	private WebElement voteButton;
}
