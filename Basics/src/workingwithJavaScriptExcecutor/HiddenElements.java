package workingwithJavaScriptExcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.id("hide-textbox")).click();
		// driver.findElement(By.id("displayed-text")).sendKeys("apoorva");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('displayed-text').value='apoorva';");

	}

}
