package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		driver.get("https://www.meesho.com/");
		
		WebElement womenEthnic = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
		action.moveToElement(womenEthnic).perform();
		Thread.sleep(2000);
		
		WebElement kids = driver.findElement(By.xpath("//span[text()='Kids']"));
		action.moveToElement(kids).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Soft Toys']")).click();
		
		driver.quit();
	}

}
