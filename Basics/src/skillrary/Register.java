package skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Do register for this https://demoapp.skillrary.com/
public class Register {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("apoorva");
		driver.findElement(By.name("lastname")).sendKeys("mangalore");

		driver.findElement(By.xpath("(//input[@placeholder='Email'])[2]")).sendKeys("acm@40gmail.com");

		driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]")).sendKeys("acm123");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("acm123");
		driver.quit();

	}
}
