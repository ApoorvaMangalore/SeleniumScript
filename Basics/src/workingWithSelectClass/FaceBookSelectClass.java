package workingWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelectClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		WebElement selector = driver.findElement(By.id("day"));
		Select sel = new Select(selector);
		sel.selectByIndex(5);
		Thread.sleep(2000);

		WebElement selector1 = driver.findElement(By.id("month"));
		Select sel1 = new Select(selector1);
		sel1.selectByIndex(5);
		Thread.sleep(2000);

		WebElement selector2 = driver.findElement(By.id("year"));
		Select sel2 = new Select(selector2);
		sel2.selectByValue("1998");
		Thread.sleep(2000);

	}
}
