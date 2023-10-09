package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement c = driver.findElement(By.name("C"));

		action.clickAndHold(c).moveToElement(c).perform();
	}
}
