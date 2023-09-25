package workingwithJavaScriptExcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("http://omayo.blogspot.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//div[@class='post-footer-line post-footer-line-1']"));
		Thread.sleep(3000);
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		jse.executeScript("arguments[0].value='selenium'",element);
		//jse.executeScript("arguments[1].value='apoorva'",element);
		Thread.sleep(3000);
		//driver.quit();
				
	}
}
