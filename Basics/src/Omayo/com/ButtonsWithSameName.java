package Omayo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsWithSameName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
