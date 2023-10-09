package via.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BooksFlight {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		Robot robot=new Robot();
		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		System.out.println("Browser has maximized");

		// To luanch the via.com
		driver.get("https://in.via.com");
		
		driver.findElement(By.id("source")).sendKeys("Bangalore,Bangalore - India");
		driver.findElement(By.name("destination")).sendKeys("Mangalore,Mangalore - India");
		driver.findElement(By.id("departure")).click();
	}
}
