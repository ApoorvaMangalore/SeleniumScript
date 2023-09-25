package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoOmayoConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.id("alert2")).click();// input[@id='alert2']
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
		driver.findElement(By.id("confirm")).click();
		Alert alert1 = driver.switchTo().alert();
		
		
		Thread.sleep(5000);
		
		alert1.dismiss();
		Thread.sleep(5000);
		driver.quit();

		
	}

}
