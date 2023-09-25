package workingwithJavaScriptExcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInJs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/#");
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("alert('hello')");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		jse.executeScript("prompt('please enter your name')");
		driver.switchTo().alert().sendKeys("apoorva");
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		jse.executeScript("confirm('are you sure')");
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.quit();

	}
}
