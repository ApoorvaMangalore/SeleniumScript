package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameByName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/user/Downloads/Selenium/iframe.html");

		driver.switchTo().frame(0);// frame1----name, id----FR1

		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.quit();

	}

}
