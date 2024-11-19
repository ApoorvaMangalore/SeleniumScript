package workingWithBrokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Apoorva
 */
public class Demo {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.tagName("img"));
		System.out.println(links.size());

		for (WebElement link : links) {
			String url = link.getAttribute("src");
			System.out.println("=======================");
			System.out.println(url);
			if (url == null || url.isEmpty()) {
				System.out.println("URL is empty");// isblank
				continue;
			}
		}
	}
}
