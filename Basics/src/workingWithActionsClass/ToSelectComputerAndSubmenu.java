package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSelectComputerAndSubmenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Actions actions = new Actions(driver);

		WebElement computers = driver.findElement(By.partialLinkText("COMPUTERS"));// As in the web page documents for
																					// link text

		actions.moveToElement(computers).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Notebooks")).click();
		Thread.sleep(2000);

	}

}
