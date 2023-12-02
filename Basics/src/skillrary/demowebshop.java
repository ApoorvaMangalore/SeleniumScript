package skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demowebshop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/jewelry");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();

		driver.findElement(By.id("Email")).sendKeys("apoorva.z@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("9880001279");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();

		WebElement dropdown = driver.findElement(By.id("BillingNewAddress_CountryId"));
		dropdown.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("AAA");
		driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("aaa");
	
		driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys("123445");
		driver.findElement(By.name("BillingNewAddress.PhoneNumber")).sendKeys("xdxdtcf");
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();

	}
}
