package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumOfLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> title = driver.findElements(By.tagName("a"));//a
		System.out.println(title.size());
		for (WebElement e : title) {

			String text = e.getAttribute("href");//herf//
			System.out.println(text);
		}

		driver.quit();
	}

}
