package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class skillery {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		Actions act=new Actions(driver);
		WebElement addButton = driver.findElement(By.id("add"));
		act.doubleClick(addButton).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		Alert Alert = driver.switchTo().alert();
		Thread.sleep(3000);
		Alert.accept();
		
		
	}

}
