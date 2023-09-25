package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeInW3School {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

		driver.switchTo().frame("iframeResult");
		WebElement firstname = driver.findElement(By.id("fname"));// webelemt of the iframe,index,name
		firstname.clear();
		firstname.sendKeys("apoorva");

		WebElement lname = driver.findElement(By.id("lname"));
		lname.clear();
		lname.sendKeys("mangalore");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(2000);
		driver.switchTo().defaultContent();// driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//a[text()='Home']")).click();

		driver.quit();
	}

}
