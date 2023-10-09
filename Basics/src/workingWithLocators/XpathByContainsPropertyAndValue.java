package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsPropertyAndValue {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("(//label[contains(@for, 'gender')])[1]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'First')]")).sendKeys("apoorva");
		driver.findElement(By.xpath("//input[contains(@id,'Last')]")).sendKeys("acm");
		driver.findElement(By.xpath("//input[contains(@data-val-required,'Email is r')]")).sendKeys("acm@123");
	}

}
