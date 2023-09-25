package workingWithDynamicXpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoOpenCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver.get("https://demo.opencart.com/admin/");
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		
		driver.findElement(By.id("input-password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		
	    driver.findElement(By.xpath("//a[contains(text(),' Sales')]")).click();
		Thread.sleep(4000);
	    driver.quit();
	}

}
