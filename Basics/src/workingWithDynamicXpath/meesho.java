package workingWithDynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.meesho.com/");

		driver.findElement(By.xpath("//div[contains(@class,'S_NavBarDesktop')]//span[text()='Home & Kitchen']"))
				.click();
		System.out.println("able to click on home and kitchen");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[contains(@class,'nav-sub-list-cont')]//p[text()='Kitchen Storage']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Fancy Jars & Containers']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		//driver.quit();
	}
}
