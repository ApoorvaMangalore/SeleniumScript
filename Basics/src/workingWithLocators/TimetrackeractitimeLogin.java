package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimetrackeractitimeLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://timetracker.ctepl.com/actitime/login.do");

		driver.findElement(By.name("username")).sendKeys("acm");
		driver.findElement(By.name("pwd")).sendKeys("acm");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
	}

}
