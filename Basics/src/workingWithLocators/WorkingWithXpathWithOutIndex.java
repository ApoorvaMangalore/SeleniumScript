package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithXpathWithOutIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//li[@class='answer' and position()=1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='answer' and position()=2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='answer' and position()=3]/input")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
