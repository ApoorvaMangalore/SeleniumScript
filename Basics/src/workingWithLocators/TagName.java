package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.tagName("img")).click();// icon
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("mobiles");// search text box
		Thread.sleep(2000);
		driver.findElement(By.tagName("li")).click();//register

	}
}
