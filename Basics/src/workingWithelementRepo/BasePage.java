package workingWithelementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
//all common webelements for ex homepage,navbar
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;

	@FindBy(partialLinkText = "Computers")
	private WebElement computersLink;

	@FindBy(partialLinkText = "Electronics")
	private WebElement electonicsLink;

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelShoes;

	@FindBy(xpath = "(//img)[1]")
	private WebElement LogoOfThepage;

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectonicsLink() {
		return electonicsLink;
	}

	public WebElement getApparelShoes() {
		return apparelShoes;
	}

	public WebElement getLogoOfThepage() {
		return LogoOfThepage;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	@FindBy(linkText = "Shopping cart")
	WebElement shoppingcartLink;

	@FindBy(linkText = "Wishlist")
	WebElement wishlistLink;

}
