package workingWithDynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");

		driver.get("https://demo.guru99.com/test/web-table-element.php");

		WebElement guj = driver.findElement(
				By.xpath("(//table[@class='dataTable']//a[contains(text(),'Gujarat Narmada Vall')]//../..)[1]"));

		System.out.println(guj.getText());
	}

}
