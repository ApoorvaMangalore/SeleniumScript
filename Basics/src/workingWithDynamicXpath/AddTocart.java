package workingWithDynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocart {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");

		driver.get("https://demowebshop.tricentis.com/books");
		driver.findElement(
				By.xpath("(//img[@alt='Picture of Computing and Internet'])[2]/../../..//input[@value='Add to cart']"))
				.click();
	}
}
