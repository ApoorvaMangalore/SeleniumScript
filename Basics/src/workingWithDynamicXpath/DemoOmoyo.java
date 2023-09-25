package workingWithDynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOmoyo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		WebElement name = driver.findElement(By.xpath("(//div[@class='widget-content'])[5]//td[text()='Delhi']"));

		System.out.println(name.getText());

		WebElement allthedetails = driver.findElement(By.xpath("(//td[text()='Kishore']//..//..)[2]"));

		System.out.println(allthedetails.getText());

		driver.quit();
	}
}
