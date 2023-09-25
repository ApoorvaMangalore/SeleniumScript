package demopage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleNames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/demo.html");
		List<WebElement> nameTextBox = driver.findElements(By.name("fname"));
		for (WebElement element : nameTextBox)
			element.sendKeys("apoorva");
		Thread.sleep(1000);
	}
}
