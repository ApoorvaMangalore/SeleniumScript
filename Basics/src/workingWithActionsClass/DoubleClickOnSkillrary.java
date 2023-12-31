package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// open (https://demoapp.skillrary.com/product.php?product=selenium-training) 4 time click on + button and capture how many time you have clicked on button.
public class DoubleClickOnSkillrary {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		Actions actions = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.id("add"));
		actions.doubleClick(doubleclick).build().perform();
		actions.doubleClick(doubleclick).build().perform();
		WebElement countOfClick = driver.findElement(By.name("quantity"));
		//String count = countOfClick.getText();
		//System.out.println(count);
		String count = countOfClick.getAttribute("value");
		System.out.println(count);
		driver.quit();
	}
}
