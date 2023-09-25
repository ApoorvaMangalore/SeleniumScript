package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeysActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		driver.get("https://text-compare.com/ ");
		WebElement input1 = driver.findElement(By.id("inputText1"));
		WebElement input2 = driver.findElement(By.id("inputText2"));

		input1.sendKeys("HELLO EVERYONE");

		// CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		// Thread.sleep(2000);

		// CTRL+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		// Thread.sleep(2000);

		// TAB to shift to input 2
		act.sendKeys(Keys.TAB);
		act.perform();
		// Thread.sleep(2000);

		// CTRL+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		if (input1.getAttribute("value").equals(input2.getAttribute("value")));
		System.out.println("text is copied");
		
		driver.quit();

	}

}
