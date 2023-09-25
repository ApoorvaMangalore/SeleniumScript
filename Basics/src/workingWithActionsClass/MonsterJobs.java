package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MonsterJobs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		driver.get("https://www.foundit.in/");

		WebElement skillTests = driver.findElement(By.xpath("//a[contains(text(),'Skill Tests')]"));

		actions.moveToElement(skillTests).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Java')]")).click();
		driver.quit();

	}

}
