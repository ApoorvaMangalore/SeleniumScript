package skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnSocialMediaLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-social-icon btn-facebook']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-social-icon btn-facebook']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-social-icon btn-instagram']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='btn btn-social-icon btn-linkedin']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='btn btn-social-icon btn-google']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
	}

}
