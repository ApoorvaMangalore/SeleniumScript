package workingWithWebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;



public class NaviagetoSwiggyAndThenToZomato {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		driver.get("https://www.zomato.com/");
		Navigation navigate = driver.navigate();
		
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		navigate.refresh();
	}

}
