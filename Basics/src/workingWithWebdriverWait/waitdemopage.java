package workingWithWebdriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitdemopage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/demo.html");
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("apoorva");
		jse.executeScript("arguments[0].value='Selenium'",firstName);
		driver.findElement(By.id("last_name")).sendKeys("mangalore");
		System.out.println("able to enter last name");
		driver.findElement(By.id("signin")).click();
		System.out.println("able to click on signin");
		driver.quit();
	}

}
