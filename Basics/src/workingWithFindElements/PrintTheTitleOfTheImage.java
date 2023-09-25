package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheTitleOfTheImage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> linkText = driver.findElements(By.tagName("img"));
		System.out.println(linkText.size());
		for (WebElement e : linkText) {

			String text = e.getAttribute("alt");
			System.out.println(text);
		}

		driver.quit();
	}
}
