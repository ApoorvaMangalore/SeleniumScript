package workingWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassViewAs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();

		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		

		Select select = new Select(dropdown);

		select.selectByIndex(0);
		Thread.sleep(7000);
		select.selectByVisibleText("Price: High to Low");

	}

}
