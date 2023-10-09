package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchitemCss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		/*
		 * WebElement searchtextbox = driver.findElement(By.cssSelector(
		 * "input.search-box-text.ui-autocomplete-input"));
		 * 
		 * searchtextbox.sendKeys("Mobile"); Thread.sleep(3000);
		 * driver.findElement(By.cssSelector("input.button-1.search-box-button")).click(
		 * );
		 */

		driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']")).click();

		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		
		
	}
}
