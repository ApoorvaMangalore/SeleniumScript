package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByPropertyAndValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		
		driver.findElement(By.xpath("//input[@value='F']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("apoorva");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("mangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("mangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("12345asdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("12345asdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Register'])")).click();

	}

}
