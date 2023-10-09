package via.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AgentLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		System.out.println("Browser has maximized");

		// To luanch the via.com
		
		driver.get("https://www.viaworld.in/agent");
		driver.findElement(By.name("userId")).sendKeys("122334445");
		driver.findElement(By.id("password")).sendKeys("123455");
		driver.findElement(By.xpath("//button[text()='PROCEED']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.quit();
	}
}
