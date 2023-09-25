package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathDemo1 {



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/Selenium/xpath1.html");
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Apoorva");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Mangalore");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("TestYantra");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Bangalore");
	}

}
