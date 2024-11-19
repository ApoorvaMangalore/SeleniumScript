package workingWithWebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		WebElement firstname = driver.findElement(By.id("txtUsername"));
		firstname.sendKeys("apoorva");// sendkeys
		firstname.clear();// clear
		firstname.sendKeys("mangalore");
		String tagname = firstname.getTagName();// gettagname
		String attributeOfText = firstname.getAttribute("id");// getattribute
		System.out.println(firstname.getAttribute("value"));

		System.out.println(firstname.getCssValue("color"));// get css value
		Point getloc = firstname.getLocation();// getlocation
		System.out.println(getloc.getX());
		System.out.println(getloc.getY());

		System.out.println(tagname);
		System.out.println(attributeOfText);

		driver.findElement(By.id("txtPassword")).sendKeys("apoorva!@#");
		driver.findElement(By.id("btnLogin")).submit();// click& submit
		WebElement spanmsg = driver.findElement(By.id("spanMessage"));
		System.out.println(spanmsg.getText());// gettext

		System.out.println(firstname.getClass().getSimpleName());

		WebElement loginbutton = driver.findElement(By.id("openIdLogin"));
		loginbutton.click();
		System.out.println(loginbutton.isEnabled());// f
		System.out.println(loginbutton.isDisplayed());// t
		System.out.println(loginbutton.isSelected());// f

	}

}
