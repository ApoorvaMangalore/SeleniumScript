package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//register for the shopperssatck.
public class Shoppersstack {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 25);
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.id("First Name")).sendKeys("apoorva");
		driver.findElement(By.id("Last Name")).sendKeys("Mangalore");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("7259679520");
		driver.findElement(By.id("Email Address")).sendKeys("apoorvamangalore40@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("appu!APPU@123");
		driver.findElement(By.id("Confirm Password")).sendKeys("appu!APPU@123");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg' and @ aria-hidden='true'])[1]")));
		//driver.findElement(By.xpath("(//*[name()='svg' and @ aria-hidden='true'])[1]")).click();
		
		//driver.quit();
	}
}
