package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOnMaps {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame(0);

		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		driver.quit();
	}
}
