package Omayo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameIdAndNameAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		

		driver.findElement(By.name("sa")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("sa"));
		element.click();
		System.out.println(element.getAttribute("value"));
		Thread.sleep(3000);
		driver.quit();
	}

}
