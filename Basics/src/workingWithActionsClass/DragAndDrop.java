package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//select proper capital "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"
public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions actions = new Actions(driver);
		
		WebElement washington = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		WebElement unitedStates = driver.findElement(By.xpath("(//div[text()='United States'])"));
		actions.dragAndDrop(washington,unitedStates).perform();
		
		WebElement oslo = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		WebElement norway = driver.findElement(By.xpath("(//div[text()='Norway'])"));
		actions.dragAndDrop(oslo, norway).perform();
		
		WebElement copenhagen = driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
		WebElement denmark = driver.findElement(By.xpath("(//div[text()='Denmark'])"));
		actions.dragAndDrop(copenhagen, denmark).perform();

		WebElement madrid = driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		WebElement Spain= driver.findElement(By.xpath("(//div[text()='Spain'])"));
		actions.dragAndDrop(madrid,Spain).perform();
		
		WebElement rome = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement italy= driver.findElement(By.xpath("(//div[text()='Italy'])"));
		actions.dragAndDrop(rome,italy).perform();


		WebElement seoul = driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
		WebElement southKorea= driver.findElement(By.xpath("(//div[text()='South Korea'])"));
		actions.dragAndDrop(seoul,southKorea).perform();
		
		
		WebElement stockholm = driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		WebElement sweden= driver.findElement(By.xpath("(//div[text()='Sweden'])"));
		actions.dragAndDrop(stockholm,sweden).perform();
		
		driver.quit();
		
		

	}
}
