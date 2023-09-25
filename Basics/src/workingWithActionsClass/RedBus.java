package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();//dont change the line
		//options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Bus Tickets']")).click();

	}

}
