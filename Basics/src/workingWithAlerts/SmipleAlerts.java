package workingWithAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SmipleAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions actions = new Actions(driver);

		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		actions.doubleClick(doubleclick).build().perform();

		Alert ele = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = ele.getText();
		System.out.println(text);
		ele.accept();
		
		driver.quit();
	}

}
