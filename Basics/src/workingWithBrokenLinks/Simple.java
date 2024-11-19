package workingWithBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
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
			try {
				HttpURLConnection huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.connect();// req sent to server
				if (huc.getResponseCode() >= 400) {
					System.out.println(url + " Broken URL");
				} else {
					System.out.println(url + " Its is not broken URL");
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
