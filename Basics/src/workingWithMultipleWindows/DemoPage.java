package workingWithMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.xpath("//a[text()='SeleniumTutorial']")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(parentwindow);
		System.out.println(allwindow);
		System.out.println(driver.getTitle());

		for (String window : allwindow) {

			driver.switchTo().window(window);
			Thread.sleep(4000);
			
		}
		driver.close();
	}

}
