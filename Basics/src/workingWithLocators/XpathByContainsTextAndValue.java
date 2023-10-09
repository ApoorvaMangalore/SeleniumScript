package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsTextAndValue {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Boo')])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Compu')])[1]")).click();
		driver.quit();
	}
}
