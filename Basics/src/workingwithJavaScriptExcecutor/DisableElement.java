package workingwithJavaScriptExcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/#");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(3000);
		jse.executeScript("arguments[0].value='Selenium'",element);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].value='apoorva'",element);
	}

}
