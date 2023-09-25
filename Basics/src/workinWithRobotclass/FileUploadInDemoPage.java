package workinWithRobotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadInDemoPage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/demo.html");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.click(driver.findElement(By.id("resume"))).perform();
		Robot robot= new Robot();
		
		robot.keyPress(KeyEvent.VK_A);
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
