package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		 WebElement firstname = driver.findElement(By.id("gender-female"));
		firstname.click();
		
		Thread.sleep(2000);
		
		WebElement Name = driver.findElement(By.id("FirstName"));
		Name.sendKeys("acm");
		System.out.println(Name.getAttribute("value"));
		
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Sirsi");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("bhomia.y@testyantra.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).submit();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
	}

}
