package workingwithJavaScriptExcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysToSearchBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement searchTextBox = driver.findElement(By.name("search"));
		
		/*
		 * WebElement searchTextBox = driver.findElement(By.name("search"));
		 * searchTextBox.sendKeys("mobiles"); Thread.sleep(4000);
		 */
		
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("arguments[0].value='motorola'", searchTextBox);
		  jse.executeScript("arguments[0].value='apoorva'", searchTextBox);
		  Thread.sleep(4000);
		 
		driver.quit();
	}
}
