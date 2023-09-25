package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Mobiles");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();

	}

}
