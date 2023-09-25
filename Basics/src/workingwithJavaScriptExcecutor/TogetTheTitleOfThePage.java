package workingwithJavaScriptExcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetTheTitleOfThePage {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String title = (String)jse.executeScript(" return document.title");
		System.out.println(title);
	
		
	}
}
