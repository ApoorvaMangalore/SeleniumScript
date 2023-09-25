package Omayo.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ClickonAllradioButtopn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radioButton.size());
		for (WebElement element : radioButton) {
			element.click();
			Thread.sleep(2000);
		}
		driver.quit();

	}
}
