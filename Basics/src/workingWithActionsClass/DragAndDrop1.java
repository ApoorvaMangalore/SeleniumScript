package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.id("droppable"));

		act.dragAndDrop(drag, drop).perform();

	}

}
