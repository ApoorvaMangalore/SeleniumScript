package via.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import workingWithWebdriverMethods.Navigate;

public class ClickOnAllMajorTabs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		System.out.println("Browser has maximized");

		// To luanch the via.com
		driver.get("https://in.via.com");
		System.out.println(driver.getTitle());
		/*
		 * String url=driver.getCurrentUrl(); System.out.println(url); String
		 * title=driver.getTitle(); System.out.println(title);
		 */
		driver.findElement(By.linkText("Via Corp")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Download App")).click();
		System.out.println(driver.getTitle());
		Set<String> allwindow = driver.getWindowHandles();
		for(String element:allwindow) {
			driver.switchTo().window(element);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Login")) {
				driver.close();
			}
		}
		
	}

}
