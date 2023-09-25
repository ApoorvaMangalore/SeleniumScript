package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextAndValue {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}
}
