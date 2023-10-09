package workingWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/demo.html");
		driver.manage().window().maximize();

		WebElement selector = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(selector);

		sel.selectByIndex(3);
		Thread.sleep(2000);

		sel.selectByIndex(1);
		Thread.sleep(2000);

		sel.selectByIndex(2);
		Thread.sleep(2000);

		sel.selectByValue("merc");
		Thread.sleep(2000);
		sel.selectByValue("vol");
		Thread.sleep(2000);

		sel.selectByVisibleText("Nissan");
		Thread.sleep(2000);

		sel.deselectByVisibleText("Toyota");//exception
		Thread.sleep(2000);

	}
}
