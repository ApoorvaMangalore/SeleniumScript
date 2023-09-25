package workingWithWebdriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/progress-bar");
		WebElement restButton = driver.findElement(By.id("startStopButton"));
		restButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("restButton")));

		restButton.click();

	}

}
