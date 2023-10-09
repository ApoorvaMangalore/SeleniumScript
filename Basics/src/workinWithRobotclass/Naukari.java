package workinWithRobotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Robot robot = new Robot();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);

		/*
		 * robot.keyPress(KeyEvent.VK_A);
		 * 
		 * robot.keyPress(KeyEvent.VK_TAB);
		 * 
		 * robot.keyPress(KeyEvent.VK_TAB);
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * 
		 * robot.keyRelease(KeyEvent.VK_A); robot.keyRelease(KeyEvent.VK_TAB);
		 * robot.keyRelease(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_ENTER);
		 */

	}
}
