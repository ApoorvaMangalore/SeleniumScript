package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.setExperimentalOption("debuggerAddress", "Localhost:9222");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
	
		driver.get("https://accounts.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("apoorva.c@testyantra.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.name("Passwd")).sendKeys("User@987!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}

}
