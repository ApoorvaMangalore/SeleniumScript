package workingWithWebdriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitStataements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		WebDriverWait wait = new WebDriverWait(driver,25);

		driver.get("http://omayo.blogspot.com/");
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Dropdown']")));
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
		driver.findElement(By.linkText("Facebook")).click();
		

	}

}
