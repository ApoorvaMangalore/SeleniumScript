package workingWithMultipleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFacebookWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.partialLinkText("Facebook")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();

		System.out.println(parentWindow);
		System.out.println(allwindow);

		allwindow.remove(parentWindow);
		System.out.println(driver.getTitle());

		for (String i : allwindow) {
			driver.switchTo().window(i);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
}
