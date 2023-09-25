package workingWithDynamicXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductToTheCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.meesho.com/");
		driver.findElement(By.xpath("//span[text()='Jewellery & Accessories']")).click();
		driver.findElement(By.xpath("(//p[text()='Bags'])[2]")).click();
		
		driver.findElement(By.xpath("(//p[contains(@class,'sc-eDvSVe gQDOBc ')])[1]//..//..//..//..//img[@alt='Ravishing Alluring Women Backpacks']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'sc-ftTHYK eHVGcU Pro')]//span[text()='Add to Cart']")).click();
		
		driver.quit();

	}

}
