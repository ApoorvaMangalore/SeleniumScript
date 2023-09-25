package workingWithWebdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().forward();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.guru99.com/selenium-tutorial.html");
	
		driver.navigate().to(new URL ("https://www.zinghr.com/"));
		//driver.close();
		//driver.quit();
	}
}
